package main.java;

import java.nio.file.Paths;

import main.antlr.MyGrammar;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Vocabulary;

class Main {
    public static void main(String args[]) {
        String filename, dir;

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
            MyGrammar myLexer;
            SymbolTable symbolTable;
            Vocabulary vocabulary;
            int lastLine;

            myLexer = new MyGrammar(CharStreams.fromFileName(dir+filename));
            vocabulary = myLexer.getVocabulary();

            symbolTable = new SymbolTable(vocabulary);

            System.out.println("-------------LIST OF TOKENS-------------");

            lastLine = 1;

            /* Reads all tokens from the input file. */
            do {
                Token token;
                String tokenTypeName;
                int presentLine;

                /* Get the next token. */
                token = myLexer.nextToken();
                tokenTypeName = vocabulary.getSymbolicName(token.getType());
                presentLine = token.getLine();

                /* EOF? */
                if (token.getType() == Token.EOF)
                    break;

                /**
                 * Is an identificator?
                 *
                 * @todo Textual compare?
                 **/
                if (tokenTypeName == "Ident")
                    symbolTable.addLexeme(token);

                /* Breaks line? */
                if (presentLine != lastLine) {
                    System.out.println("");
                    lastLine = presentLine;
                }

                System.out.print(tokenTypeName + " ");
            } while (true);

            System.out.println("\n---------------------------");

            System.out.println("-------------SYMBOL TABLE-------------");

            System.out.print(symbolTable.toString());

            System.out.println("---------------------------");
        } catch(Exception ex) {
            System.out.println("Exception Caught!");
            ex.printStackTrace();
        }
    }
}
