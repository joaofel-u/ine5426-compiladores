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
            LexicalAnalysis lexer = new LexicalAnalysis(dir+filename);
            SyntaticAnalysis parser = new SyntaticAnalysis(dir+filename);

            // BEGINNING OF LEXICAL ANALYSIS
            lexer.analyse();
            // ENDING OF THE LEXICAL ANALYSIS

            // PARSING VERIFICATION
            parser.setLineDelimiters(lexer.getLineDelimiters());
            parser.analyse();
            // ENDING OF PARSING

        } catch(RuntimeException ex) {
            System.out.println("----------------\nException Caught!");
            System.out.println(ex.getMessage());
        } catch(Exception ex) {
            System.out.println("Exception Caught!");
            ex.printStackTrace();
        }
    }
}
