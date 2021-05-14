/**
 * Developed by:
 *      @João_Fellipe_Uller
 *      @Leonardo_Kreuch
 *      @Uriel_Kindermann_Caminha
 */

package main.java.analysers;

import java.io.IOException;
import java.util.HashMap;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;
import org.javatuples.Pair;

import main.antlr.MyGrammarLexer;
import main.antlr.MyGrammarParser;

import main.java.errors.*;
import main.java.listeners.ScopeListener;
import main.java.listeners.SymbolListener;
import main.java.symbol_table.SymbolTable;

public class SyntaticAnalysis {
    private final MyGrammarParser myParser;
    private HashMap<Integer, Pair<Integer, Integer>> lineDelimiters;

    public SyntaticAnalysis(String filepath) throws IOException {
        CommonTokenStream tokenStream = new CommonTokenStream(new MyGrammarLexer(CharStreams.fromFileName(filepath)));
        myParser = new MyGrammarParser(tokenStream);
        this.lineDelimiters = null;
    }

    public void setLineDelimiters(HashMap<Integer, Pair<Integer, Integer>> map) {
        this.lineDelimiters = map;
    }

    public void analyse() {
        SyntaxErrorListener listener = new SyntaxErrorListener();
        myParser.removeErrorListeners();
        myParser.addErrorListener(listener);
        SymbolTable table = new SymbolTable();
        myParser.addParseListener(new ScopeListener(table));
        myParser.addParseListener(new SymbolListener(table));
        
        try {
            myParser.program();

            for (SyntaxError error : listener.getSyntaxErrors()) {
                Pair<Integer, Integer> lineLimits;
                CharStream stream = myParser.getTokenStream().getTokenSource().getInputStream();
                String message = "";
                Token token = error.getToken();

                /* Gets first and last token of the problematic error. */
                lineLimits = lineDelimiters.get(error.getLine());

                message += "Syntax error found at line " + error.getLine() + ":\n";
                if (lineLimits != null)
                    message += "    " + stream.getText(new Interval(lineLimits.getValue0(), lineLimits.getValue1())) + "\n";
                message += "Token: (" + myParser.getVocabulary().getSymbolicName(token.getType()) + ", " + token.getText() + ", " + token.getLine() + ":" + token.getCharPositionInLine() + ")\n";
                message += error.getMessage();
                
                System.out.println(message);
            }

            if (myParser.getNumberOfSyntaxErrors() > 0)
                throw new RuntimeException("Parsing errors were found!");
            else
            {
                System.out.println("All expressions are valid!");
                System.out.println("All declarations are valid!");
                System.out.println("Every Break statement is inside a For Loop!");
                System.out.println("Parsing Completed with success!");
            }

        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
