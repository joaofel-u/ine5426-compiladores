grammar MyGrammar;

@header {
    package main.antlr;
}

program  : (Ident | T_num) (relop (Ident | T_num))+ T_EOF;

relop : T_mais | T_menos | T_vezes | T_divi; 

T_EOF : ';';

T_mais : '+';

T_vezes : '*';

T_menos : '-';

T_divi : '/';

T_num : ('0'..'9')+;

Ident : (('a'..'z') | ('A'..'Z')) (('a'..'z') | ('A'..'Z') | ('0'..'9'))*;

T_space : (' ' | '\t' | '\n' | '\r') -> skip ;
