package main.java;

import org.antlr.v4.runtime.Token;

public class Symbol {
    private Token token;

    public Symbol(Token token) {
        this.token = token;
    }

    public Token getToken() {
        return (this.token);
    }
}
