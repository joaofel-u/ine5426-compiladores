lexer grammar MyGrammar;

@header {
    package main.antlr;
}

/**
 * Reserved words.
 */
Def     : 'def';
Int     : 'int';
Float   : 'float';
String	: 'string';
Print	: 'print';
Read	: 'read';
Return	: 'return';
Break	: 'break';
If  	: 'if';
Else	: 'else';
For 	: 'for';
New 	: 'new';
Null	: 'null';

/**
 * Language elements.
 */
Ident          	: LETTER (LETTER | DIGIT)*;
Int_constant	: DIGIT+;
Float_constant	: DIGIT+ ('.' DIGIT*)?;
String_constant	: '"' ALPHABET* '"';
Commentary  	: ('/*' ALPHABET* '*/') -> skip;
Whitespace  	: WHITESPACE -> skip;

/**
 * Graphic signals.
 */
Lparen          : '(';
Rparen          : ')';
Lbrace          : '{';
Rbrace          : '}';
Lbracket    	: '[';
Rbracket    	: ']';
Semicolon   	: ';';
Comma           : ',';
Assign          : '=';
Lesser          : '<';
Greater         : '>';
Lesserequal 	: '<=';
Greaterequal    : '>=';
Equal           : '==';
Different       : '!=';
Plus            : '+';
Minus           : '-';
Multiply    	: '*';
Divide          : '/';
Module          : '%';

/**
 * Fragments.
 */
fragment DIGIT          : [0-9];
fragment LETTER         : ([a-z] | [A-Z]);
fragment PUNCTUATION    : ('.' | ',' | ':' | ';' | '!' | '?');
fragment GRAPHICS       : ('$' | '&' | '@' | '#' | '%' | '{' | '}' | '[' | ']' | '(' | ')' | '|' | '_');
fragment RELOPS         : ('+' | '-' | '*' | '/' | '>' | '<' | '=');
fragment WHITESPACE     : (' ' | '\t' | '\n' | '\r')+;
fragment ALPHABET       : (DIGIT | LETTER | PUNCTUATION | GRAPHICS | RELOPS | WHITESPACE);
