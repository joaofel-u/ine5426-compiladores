/**
 * Developed by:
 *      @João_Fellipe_Uller
 *      @Leonardo_Kreuch
 *      @Uriel_Kindermann_Caminha
 */

package main.java.symbol_table;

import java.util.Optional;
import java.util.Stack;
import java.util.Collection;

import org.antlr.v4.runtime.Token;

import main.java.symbol_table.Symbol.TokenType;
import main.java.symbol_table.Scope.ScopeType;

/**
 * @brief Defines a basic Symbol Table.
 */
public class SymbolTable {
    // ATTRIBUTES.
    private Stack<Scope> scopes;

    private int longestTokenName;

    // CLASS CONSTRUCTOR.
    public SymbolTable() {
        this.scopes = new Stack<>();

        this.longestTokenName = 0;
    }

    // METHODS.
    public void enterScope(ScopeType type, int line) {
        scopes.push(new Scope(type, line));
    }

    public void exitScope() {
        Scope scope = scopes.pop();
        try {
            if (scope.getVariables().size() > 0) {
                System.out.println("------------\nTabela de símbolos (Escopo " + scope.getType().toString() + " da linha " + scope.getLine() + ")");
                System.out.println("LEXEMA     |     TIPO     |  LOCAL. DECLARAÇÃO");
                
                for (Symbol symbol : scope.getVariables())
                    System.out.println(symbol.toString());

                System.out.println("--------------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @brief Inserts a symbol in the SymbolTable.
     *
     * @param token Base token to be inserted.
     */
    public void addSymbol(Token token, TokenType type) {
        String key = token.getText();
        int tokenNameLength = token.getText().length();

        /* Updates symbol table statistics. */
        if (tokenNameLength > this.longestTokenName)
            this.longestTokenName = tokenNameLength;

        /* Inserts the new symbol in the scope map. */
        scopes.lastElement().addSymbol(key, new Symbol(token, type));
    }

    public boolean isInside(ScopeType type) {
        return scopes.stream().filter(scope -> scope.getType() == type).findAny().isPresent();
    }

    public Optional<Symbol> findSymbol(String s) {
        return scopes.stream().map(scope -> scope.getVariables()).flatMap(Collection::stream)
                .filter(symbol -> symbol.getLexeme().equals(s)).findAny();
    }

    /**
     * @brief Elaborate a textual representation of the SymbolTable state.
     *
     * @return A String representing the actual state of the SymbolTable.
     */
    // public String toString() {
    //     String tokenName, tokenType, location;
    //     String result = "";
    //     Collection<Symbol> list = table.values();
    //     Iterator<Symbol> it = list.iterator();
    //     boolean firstLine = false;

    //     tokenName = "TOKEN NAME";
    //     tokenType = "TOKEN TYPE";
    //     location = "LOCATION";

    //     /* Check if the headers are the longest strings in the table. */
    //     if (tokenName.length() > this.longestTokenName)
    //         this.longestTokenName = tokenName.length();

    //     if (tokenType.length() > this.longestTokenType)
    //         this.longestTokenType = tokenType.length();

    //     /* Traverses the collection of entries. */
    //     do {
    //         Symbol entry;
    //         Token token;

    //         /* Prints the first line in the first iteration. */
    //         if (firstLine) {
    //             entry = it.next();

    //             token = entry.getToken();

    //             tokenName = token.getText();
    //             tokenType = this.vocabulary.getSymbolicName(token.getType());
    //             location = token.getLine() + ":" + token.getCharPositionInLine();
    //         } else {
    //             firstLine = true;
    //         }

    //         /* Fills the attributes with whitespaces to achieve a tabular representation. */
    //         for (int i = tokenName.length(); i < this.longestTokenName; ++i)
    //             tokenName += " ";

    //         for (int i = tokenType.length(); i < this.longestTokenType; ++i)
    //             tokenType += " ";

    //         /* Concatenates the new line in the result string. */
    //         result += tokenName + " | " + tokenType + " | " + location + "\n";

    //     } while (it.hasNext());

    //     return (result);
    // }
}
