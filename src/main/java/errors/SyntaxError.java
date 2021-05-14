/**
 * Developed by:
 *      @João_Fellipe_Uller
 *      @Leonardo_Kreuch
 *      @Uriel_Kindermann_Caminha
 */

package main.java.errors;

import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

public class SyntaxError {
    private final Token token;
    private final int line;
    private final String msg;

    public SyntaxError(Recognizer<?, ?> recognizer, Token offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        this.token = offendingSymbol;
        this.line = line;
        this.msg = msg;
    }

    public Token getToken() {
        return (this.token);
    }

    public int getLine() {
        return (this.line);
    }

    public int getCharPositionInLine() {
        return (this.line);
    }

    public String getMessage() {
        return (this.msg);
    }
    
}
