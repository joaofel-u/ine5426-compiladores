/**
 * Developed by:
 *      @João_Fellipe_Uller
 *      @Leonardo_Kreuch
 *      @Uriel_Kindermann_Caminha
 */

package main.java.analysers;

import java.io.IOException;
import java.util.HashMap;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Vocabulary;
import org.javatuples.Pair;

import main.antlr.MyGrammarLexer;

import main.java.symbol_table.*;

public class LexicalAnalysis {
    private final MyGrammarLexer myLexer;
    private final SymbolTable symbolTable;
    private final Vocabulary vocabulary;
    private final HashMap<Integer, Pair<Integer, Integer>> lineDelimiters;

    public LexicalAnalysis(String filepath) throws IOException {
        this.myLexer = new MyGrammarLexer(CharStreams.fromFileName(filepath));
        vocabulary = myLexer.getVocabulary();
        this.symbolTable = new SymbolTable(vocabulary);

        /* Configures error handling. */
        myLexer.removeErrorListeners();
        myLexer.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                System.out.println("An error was found during lexical analysis");
                throw new RuntimeException(msg + " found in " + line + ":" + charPositionInLine);
            }
        });

        this.lineDelimiters = new HashMap<Integer, Pair<Integer, Integer>>();
    }

    public SymbolTable getSymbolTable() {
        return (this.symbolTable);
    }
    
    public HashMap<Integer, Pair<Integer, Integer>> getLineDelimiters() {
        return (this.lineDelimiters);
    }

    public void analyse() throws RuntimeException {
        // BEGINNING OF THE LEXICAL ANALYSIS
        int lastLine = 1;
        Token lineFirstToken = null, lastToken = null;

        /* Reads all tokens from the input file. */
        do {
            Token token;
            String tokenTypeName;

            /* Get the next token. */
            token = myLexer.nextToken();
            tokenTypeName = vocabulary.getSymbolicName(token.getType());

            if (lineFirstToken == null)
                lineFirstToken = token;

            /* EOF? */
            if (token.getType() == Token.EOF)
            {
                lineDelimiters.put(token.getLine(), new Pair<Integer, Integer>(lineFirstToken.getStartIndex(), token.getStopIndex()));
                break;
            }

            /* First token of a given line? */
            if (token.getLine() != lastLine)
            {
                lineDelimiters.put(lastLine, new Pair<Integer, Integer>(lineFirstToken.getStartIndex(), lastToken.getStopIndex()));
                lineFirstToken = token;
            }

            lastLine = token.getLine();
            lastToken = token;

            /**
             * Is an identificator?
             *
             * @todo Textual compare?
             **/
            if (tokenTypeName == "Ident")
                symbolTable.addLexeme(token);
        } while (true);
    }
}
