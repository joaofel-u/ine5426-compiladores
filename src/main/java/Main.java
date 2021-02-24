package main.java;

import java.nio.file.Paths;

import main.antlr.MyGrammar;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
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
            String listOfTokens;
            int lastLine;

            myLexer = new MyGrammar(CharStreams.fromFileName(dir+filename));
            vocabulary = myLexer.getVocabulary();

            /* Configurates error handling. */
            myLexer.removeErrorListeners();
            myLexer.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                    throw new RuntimeException(msg + " found in " + line + ":" + charPositionInLine);
                }
            });

            /* Initializes symbol table. */
            symbolTable = new SymbolTable(vocabulary);

            lastLine = 1;
            listOfTokens = "";

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
                    listOfTokens += "\n";
                    lastLine = presentLine;
                }

                listOfTokens += tokenTypeName + " ";
            } while (true);

            /* Starts printing the program output. */
            System.out.println("-------------LIST OF TOKENS-------------");

            System.out.print(listOfTokens);

            System.out.println("\n---------------------------");

            System.out.println("-------------SYMBOL TABLE-------------");

            System.out.print(symbolTable.toString());

            System.out.println("---------------------------");
        } catch(RuntimeException ex) {
            System.out.println("\n----------------\nException Caught!");
            System.out.println(ex.getMessage());
        } catch(Exception ex) {
            System.out.println("\nException Caught!");
            ex.printStackTrace();
        }
    }
}
