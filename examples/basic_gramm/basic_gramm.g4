grammar basic_gramm;

@header {
    package main.antlr;
}

expr
        : expr_c T_EOF
        ;

expr_c
        : termo ((T_mais | T_menos) termo)*
        ;

termo
        : fator ((T_vezes | T_divi) fator)*
        ;

fator
        : (T_num | T_id)
        ;


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
        : ' ' | '\t' | '\n' | '\r'
        ;
