/**
 * Developed by:
 *      @João_Fellipe_Uller
 *      @Leonardo_Kreuch
 *      @Uriel_Kindermann_Caminha
 *
 * This project was developed under the orientation of Prof. Álvaro Franco
 * to be presented in the discipline Construção de Compiladores (INE5426),
 * from the Departamento de Informática e Estatística (INE), course of
 * Bacharelado em Ciências da Computação from Universidade Federal de Santa
 * Catarina (UFSC), in the second semester of 2020 (2020-2) accordingly with
 * Calendário Acadêmico Suplementar Excepcional, which establishes this as
 * a special period, lectured in remote way in the beginning of 2021, due
 * to pandemic situation.
 *
 * For more information about Copyrights, refer to the LICENSE file provided
 * with the project sources.
 */

package main.java;

import java.nio.file.Paths;

// Generated Grammar
import main.antlr.MyGrammarLexer;

// ANTLR Elements Imports
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
            MyGrammarLexer myLexer;
            SymbolTable symbolTable;
            Vocabulary vocabulary;
            String listOfTokens;
            int lastLine;

            /* Instantiates the ANTLR4 generated lexer. */
            myLexer = new MyGrammarLexer(CharStreams.fromFileName(dir+filename));
            vocabulary = myLexer.getVocabulary();

            /* Configures error handling. */
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

            // BEGINNING OF THE LEXICAL ANALYSIS

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

                /* Inserts the read token in the list of tokens. */
                listOfTokens += tokenTypeName + " ";
            } while (true);

            // ENDING OF THE LEXICAL ANALYSIS

            /* Starts printing the program output. */
            System.out.println("-------------LIST OF TOKENS-------------");

            System.out.print(listOfTokens);

            System.out.println("\n---------------------------");

            System.out.println("-------------SYMBOL TABLE-------------");

            System.out.print(symbolTable.toString());

            System.out.println("---------------------------");
        } catch(RuntimeException ex) {
            System.out.println("----------------\nException Caught!");
            System.out.println(ex.getMessage());
        } catch(Exception ex) {
            System.out.println("Exception Caught!");
            ex.printStackTrace();
        }
    }
}
