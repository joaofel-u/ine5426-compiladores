/**
 * Developed by:
 *      @João_Fellipe_Uller
 *      @Leonardo_Kreuch
 *      @Uriel_Kindermann_Caminha
 */

package main.java.listeners;

import java.util.HashMap;
import java.util.Optional;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

import main.antlr.MyGrammarBaseListener;
import main.antlr.MyGrammarLexer;
import main.antlr.MyGrammarParser.AllocexpressionContext;
import main.antlr.MyGrammarParser.AtribstatContext;
import main.antlr.MyGrammarParser.ExpressionContext;
import main.antlr.MyGrammarParser.LvalueContext;
import main.antlr.MyGrammarParser.NumexpressionContext;
import main.antlr.MyGrammarParser.ParamlistContext;
import main.antlr.MyGrammarParser.VardeclContext;
import main.java.symbol_table.Symbol;
import main.java.symbol_table.SymbolTable;
import main.java.symbol_table.Symbol.TokenType;;

public class SymbolListener extends MyGrammarBaseListener {
    
    private SymbolTable table;
    private HashMap<ParserRuleContext, String> types;

    public SymbolListener(SymbolTable table) {
        this.table = table;
        this.types = new HashMap<>();
    }

    @Override
    public void exitParamlist(ParamlistContext ctx) {
        if (ctx.children != null) {
            String type = ctx.children.get(0).getText();
            String name = ctx.children.get(1).getText();
            //table.addSymbol(name, TokenType.fromString(type));
            table.addSymbol(name, TokenType.fromString(type));
        }
    }

    @Override
    public void exitVardecl(VardeclContext ctx) {
        String varType = ctx.children.get(0).getText();
        String varName = ctx.children.get(1).getText();
        int line = ctx.getStart().getLine();

        if (table.checkScope(varName)){
            throw new RuntimeException("Declaration error in line " + line + ": \"" + varName + "\" already declared.");
        } else {
            table.addSymbol(varName, TokenType.fromString(varType));
        }
    }

    @Override
    public void exitAtribstat(AtribstatContext ctx) {
        String varName = ctx.lvalue().Ident().getText();
        Optional<Symbol> optional = table.findSymbol(varName);
        Optional<Symbol> opt2;
        TokenType t1, t2;
        Token lastT;

        if (optional.isEmpty()) {
            throw new RuntimeException("Error: Undeclared variable \"" + varName + "\" in line " + ctx.start.getLine());
        } else {
            Symbol token = optional.get();
            t1 = token.getType();

            /* Is it a regular atrib? */
            if (ctx.atribstataux().expression() == null) {
                lastT = ctx.atribstataux().allocexpression().vartype().start;
                t2 = getFromWord(lastT.getText());
            } else {
                lastT = ctx.atribstataux().expression().start;

                if (lastT != null) {
                    /* Is it an identifier? */
                    if (lastT.getType() == MyGrammarLexer.Ident) {
                        opt2 = table.findSymbol(lastT.getText());

                        t2 = opt2.get().getType();
                    } else {
                        t2 = getFromTokenType(lastT.getType());
                    }
                }
                else
                    throw new RuntimeException("Error: Unknown error in line " + ctx.start.getLine());
            }

            /* Incompatible types? */
            if (t1 != t2) {
                throw new RuntimeException("Error: Incompatible types in expression in line " + ctx.start.getLine() +
                    ":\nTrying to attrib " + t2 + " to " + t1 + "(" + token.getLexeme() + ")");
            }
        }
    }

    @Override
    public void exitLvalue(LvalueContext ctx) {
        Optional<Symbol> optional = table.findSymbol(ctx.Ident().getText());
        if(optional.isEmpty())
            throw new RuntimeException("Error: Undeclared identifier \"" + ctx.Ident().getText() + "\" in line " + ctx.start.getLine());
    }

    @Override
    public void exitAllocexpression(AllocexpressionContext ctx) {
        types.put(ctx, ctx.children.get(1).getText());
    }

    @Override
    public void exitExpression(ExpressionContext ctx) { }

    @Override
    public void exitNumexpression(NumexpressionContext ctx) {
        Token firstTerm, secondTerm;
        TokenType ftType, stType;

        /* Is this the last term of the expression? */
        if (ctx.numexpressionaux().getChildCount() == 0)
            return;

        firstTerm = ctx.term().start;
        secondTerm = ctx.numexpressionaux().numexpression().term().start;

        ftType = getTermType(firstTerm, ctx);
        stType = getTermType(secondTerm, ctx);

        /* Same type? */
        if (ftType != stType)
            throw new RuntimeException("Error: Incompatible types in expression in line " + ctx.start.getLine() +
                ":\nTrying to operate " + ftType + "(" + firstTerm.getText() + ")" + " with " + stType + "(" + secondTerm.getText() + ")");
    }

    public TokenType getTermType(Token token, NumexpressionContext ctx) {
        Optional<Symbol> symbol;

        if (token.getType() == MyGrammarLexer.Ident) {
            symbol = table.findSymbol(token.getText());

            if (symbol.isEmpty())
                throw new RuntimeException("Error: Undeclared identifier \"" + token.getText() + "\" in line " + ctx.start.getLine());

            return (symbol.get().getType());
        }
        else {
            return (getFromTokenType(token.getType()));
        }
    }

    public TokenType getFromTokenType(int type) {
        switch (type) {
            case MyGrammarLexer.Int_constant:
                return (TokenType.INT);
            case MyGrammarLexer.Float_constant:
                return (TokenType.FLOAT);
            case MyGrammarLexer.String_constant:
                return (TokenType.STRING);
            default:
                return (null);
        }
    }

    public TokenType getFromWord(String type) {
        switch (type) {
            case "int":
                return (TokenType.INT);
            case "float":
                return (TokenType.FLOAT);
            case "string":
                return (TokenType.STRING);
            default:
                return (null);
        }
    }
}
