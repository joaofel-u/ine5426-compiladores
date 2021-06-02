/**
 * Developed by:
 *      @João_Fellipe_Uller
 *      @Leonardo_Kreuch
 *      @Uriel_Kindermann_Caminha
 */

package main.java.symbol_table;

import java.util.Collection;
import java.util.HashMap;

public class Scope {

    /* Defines the existent types of enum in our compiler. */
    public enum ScopeType {
        PROGRAM, STATELIST, FOR, IF, ELSE, FUNCTION;

        public static ScopeType fromString(String s) {
            switch (s) {
                case "PROGRAM":
                    return (PROGRAM);
                case "STATELIST":
                    return (STATELIST);
                case "FOR":
                    return (FOR);
                case "IF":
                    return (IF);
                case "ELSE":
                    return (ELSE);
                case "FUNCTION":
                    return (FUNCTION);
                default:
                    System.out.println("Unexpected Scope Type");
                    return (null);
            }
        }
    }

    /* Scope attributes. */
    private HashMap<String, Symbol> variables;
    private ScopeType type;
    private int line;

    public Scope(ScopeType type, int line) {
        this.type = type;
        this.line = line;
        this.variables = new HashMap<String, Symbol>();
    }

    /* Scope methods. */
    public ScopeType getType() {
        return (this.type);
    }

    public int getLine() {
        return (this.line);
    }

    public Symbol getSymbol(String key) {
        return (variables.get(key));
    }

    public Collection<Symbol> getVariables() {
        return (this.variables.values());
    }

    /* Adds a new symbol to the current scope. */
    public void addSymbol(String key, Symbol token) {
        this.variables.put(key, token);
    }

    public boolean containsSymbol(String symbol) {
        return (this.variables.containsKey(symbol));
    }
}
