package main.java;

import java.nio.file.Paths;

import main.antlr.MyGrammar;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

class Main {
    public static void main(String args[]) {
        String filename, dir;
        MyGrammar myLexer;
        Token token;
        String ruleNames[];

        /* Checks input parameters. */
        if (args.length < 1) {
            System.out.println("Nenhum nome de arquivo inserido como parâmetro\n" +
                                "Encerrando o programa");
            return;
        }

        /* Constructs filename based in PATHS relative to the project's root. */
        filename = args[0];
        dir = Paths.get("").toAbsolutePath().toString()+"/";

        /* Compiler main code. */
        try {
            myLexer = new MyGrammar(CharStreams.fromFileName(dir+filename));

            ruleNames = myLexer.getRuleNames();

            System.out.println("List of Tokens");
            System.out.println("---------------------------");

            /* Reads all tokens from the input file. */
            do {
                /* Get the next token. */
                token = myLexer.nextToken();

                /* EOF? */
                if (token.getType() == Token.EOF)
                    break;

                System.out.print(ruleNames[token.getType()-1] + " ");
            } while (true);

            System.out.println("\n---------------------------");
        } catch(Exception ex) {
            System.out.println("Exception Caught!");
            ex.printStackTrace();
        }
    }
}
