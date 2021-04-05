/**
 * Developed by:
 *      @João_Fellipe_Uller
 *      @Leonardo_Kreuch
 *      @Uriel_Kindermann_Caminha
 */

package main.java;

import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

public class SyntaxErrorListener extends BaseErrorListener {
    private final List<SyntaxError> errorsList = new LinkedList<SyntaxError>();

    public List<SyntaxError> getSyntaxErrors() {
        return (errorsList);
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        Token token = (Token) offendingSymbol;
        this.errorsList.add(new SyntaxError(recognizer, token, line, charPositionInLine, msg, e));
    }
}
