/**
 * Developed by:
 *      @João_Fellipe_Uller
 *      @Leonardo_Kreuch
 *      @Uriel_Kindermann_Caminha
 */

package main.java.symbol_table;

import org.antlr.v4.runtime.Token;

/**
 * @brief Defines a basic symbol entry for a SymbolTable specification.
 */
public class Symbol {

    public enum TokenType {
        INT, FLOAT, STRING, FUNCTION;

        public static TokenType fromString(String s) {
            switch (s) {
                case "int":
                    return (INT);
                case "float":
                    return (FLOAT);
                case "string":
                    return (STRING);
                case "function":
                    return (FUNCTION);
                default:
                    System.out.println("Unexpected token type.");
                    return (null);
            }
        }
    }

    // ATRIBUTES
    private Token token;
    private String lexeme;
    private TokenType type;

    // CLASS CONSTRUCTOR
    public Symbol(Token token) {
        this.token = token;
        this.lexeme = token.getText();
        this.type = null;
    }

    public Symbol(Token token, TokenType type) {
        this.token = token;
        this.type = type;
        this.lexeme = token.getText();
    }

    public Symbol(String lexeme, TokenType type) {
        this.token = null;
        this.type = type;
        this.lexeme = lexeme;
    }

    // METHODS
    public Token getToken() {
        return (this.token);
    }

    public String getLexeme() {
        return (this.lexeme);
    }

    public TokenType getType() {
        return (this.type);
    }

    public void setTokenType(TokenType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        String type = "";
        String location;
        String name = this.lexeme;

        if (this.getType() != null)
            type = this.getType().toString();

        if (this.token == null)
        {
            return (name + " | " + type);
        }

        location = token.getLine() + ":" + token.getCharPositionInLine();

        return (name + " | " + type + " | " + location);
    }
}
