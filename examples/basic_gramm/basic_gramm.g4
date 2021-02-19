lexer grammar MyGrammar;

@header {
    package main.antlr;
}

T_EOF
        : ';'
        ;

T_mais
        : '+'
        ;

T_vezes
        : '*'
        ;

T_menos
        : '-'
        ;

T_divi
        : '/'
        ;

T_num
        : ('0'..'9')+
        ;

T_id
        : (('a'..'z') | ('A'..'Z')) (('a'..'z') | ('A'..'Z') | ('0'..'9'))*
        ;

T_space
        : (' ' | '\t' | '\n' | '\r') -> skip ;
