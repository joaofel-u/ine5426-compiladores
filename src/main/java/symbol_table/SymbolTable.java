/**
 * Developed by:
 *      @João_Fellipe_Uller
 *      @Leonardo_Kreuch
 *      @Uriel_Kindermann_Caminha
 */

package main.java.symbol_table;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Collection;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Vocabulary;

/**
 * @brief Defines a basic Symbol Table.
 */
public class SymbolTable {
    // ATTRIBUTES.
    private HashMap<String, Symbol> table;
    private Vocabulary vocabulary;
    private int longestTokenName;
    private int longestTokenType;

    // CLASS CONSTRUCTOR.
    public SymbolTable(Vocabulary vocabulary) {
        this.table = new HashMap<String, Symbol>();
        this.vocabulary = vocabulary;
        this.longestTokenName = 0;
        this.longestTokenType = 0;
    }

    // METHODS.
    /**
     * @brief Inserts a lexeme in the SymbolTable.
     *
     * @param token Base token to be inserted.
     */
    public void addLexeme(Token token) {
        String key = token.getText();
        int tokenNameLength = token.getText().length();
        int tokenTypeLength = this.vocabulary.getSymbolicName(token.getType()).length();

        /* Skips already present entries. */
        if (table.containsKey(key))
            return;

        /* Updates symbol table statistics. */
        if (tokenNameLength > this.longestTokenName)
            this.longestTokenName = tokenNameLength;

        if (tokenTypeLength > this.longestTokenType)
            this.longestTokenType = tokenTypeLength;

        /* Inserts the new symbol in the table map. */
        table.put(key, new Symbol(token));
    }

    /**
     * @brief Gets a specific entry of the SymbolTable based on its key.
     *
     * @param key Key of the target entry.
     *
     * @return The Symbol associated with @p key.
     */
    public Symbol getEntry(String key) {
        return (table.get(key));
    }

    /**
     * @brief Elaborate a textual representation of the SymbolTable state.
     *
     * @return A String representing the actual state of the SymbolTable.
     */
    public String toString() {
        String tokenName, tokenType, location;
        String result = "";
        Collection<Symbol> list = table.values();
        Iterator<Symbol> it = list.iterator();
        boolean firstLine = false;

        tokenName = "TOKEN NAME";
        tokenType = "TOKEN TYPE";
        location = "LOCATION";

        /* Check if the headers are the longest strings in the table. */
        if (tokenName.length() > this.longestTokenName)
            this.longestTokenName = tokenName.length();

        if (tokenType.length() > this.longestTokenType)
            this.longestTokenType = tokenType.length();

        /* Traverses the collection of entries. */
        do {
            Symbol entry;
            Token token;

            /* Prints the first line in the first iteration. */
            if (firstLine) {
                entry = it.next();

                token = entry.getToken();

                tokenName = token.getText();
                tokenType = this.vocabulary.getSymbolicName(token.getType());
                location = token.getLine() + ":" + token.getCharPositionInLine();
            } else {
                firstLine = true;
            }

            /* Fills the attributes with whitespaces to achieve a tabular representation. */
            for (int i = tokenName.length(); i < this.longestTokenName; ++i)
                tokenName += " ";

            for (int i = tokenType.length(); i < this.longestTokenType; ++i)
                tokenType += " ";

            /* Concatenates the new line in the result string. */
            result += tokenName + " | " + tokenType + " | " + location + "\n";

        } while (it.hasNext());

        return (result);
    }
}