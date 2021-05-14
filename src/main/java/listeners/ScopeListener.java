/**
 * Developed by:
 *      @João_Fellipe_Uller
 *      @Leonardo_Kreuch
 *      @Uriel_Kindermann_Caminha
 */

package main.java.listeners;

import main.antlr.MyGrammarBaseListener;
import main.antlr.MyGrammarParser;
import main.java.symbol_table.SymbolTable;
import main.java.symbol_table.Scope.ScopeType;

public class ScopeListener extends MyGrammarBaseListener {
    
    private SymbolTable table;

    public ScopeListener(SymbolTable table) {
        this.table = table;
    }

    @Override public void enterProgram(MyGrammarParser.ProgramContext ctx) {
        table.enterScope(ScopeType.PROGRAM, ctx.start.getLine());
    }
    
    @Override public void exitProgram(MyGrammarParser.ProgramContext ctx) {
        table.exitScope();
    }
    
    // @Override public void enterStatelist(MyGrammarParser.StatelistContext ctx) {
    //     table.enterScope(ScopeType.STATELIST, ctx.start.getLine());
    // }

    // @Override public void exitStatelist(MyGrammarParser.StatelistContext ctx) {
    //     table.exitScope();
    // }
    
    @Override public void enterForstat(MyGrammarParser.ForstatContext ctx) {
        table.enterScope(ScopeType.FOR, ctx.start.getLine());
    }

    @Override public void exitForstat(MyGrammarParser.ForstatContext ctx) {
        table.exitScope();
    }

    @Override public void exitBreakstat(MyGrammarParser.BreakstatContext ctx) {
        if (!table.isInside(ScopeType.FOR)) {
            throw new RuntimeException("Error: BREAK outside FOR loop in line: " + ctx.start.getLine());
        }
    }
    
    @Override public void enterIfstat(MyGrammarParser.IfstatContext ctx) {
        table.enterScope(ScopeType.IF, ctx.start.getLine());
    }
    
    @Override public void enterElsestat(MyGrammarParser.ElsestatContext ctx) {
        /* Exits IF scope. */
        table.exitScope();

        table.enterScope(ScopeType.ELSE, ctx.start.getLine());
    }

    @Override public void exitElsestat(MyGrammarParser.ElsestatContext ctx) {
        table.exitScope();
    }
    
    @Override public void enterFuncdef(MyGrammarParser.FuncdefContext ctx) {
        table.enterScope(ScopeType.FUNCTION, ctx.start.getLine());
    }

	@Override public void exitFuncdef(MyGrammarParser.FuncdefContext ctx) {
        table.exitScope();
    }
}
