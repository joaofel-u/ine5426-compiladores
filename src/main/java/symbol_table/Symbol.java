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
    // ATRIBUTES
    private Token token;

    // CLASS CONSTRUCTOR
    public Symbol(Token token) {
        this.token = token;
    }

    // METHODS
    public Token getToken() {
        return (this.token);
    }
}
