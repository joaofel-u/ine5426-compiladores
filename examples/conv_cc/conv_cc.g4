/**
 * Developed by:
 *      @João_Fellipe_Uller
 *      @Leonardo_Kreuch
 *      @Uriel_Kindermann_Caminha
 */

grammar MyGrammar;

@header {
    package main.antlr;
}

/*channels {
	ERROR
}*/

/*options {
	superClass = T1Lexer;
}*/

program: statement | funclist | ;

funclist: funcdef funclistaux;

funclistaux: funclist | ;

funcdef: Def Ident Lparen paramlist Rparen Lbrace statelist Rbrace;

paramlist:	vartype Ident paramlistaux | ;

paramlistaux: Comma paramlist | ;

statement:
		vardecl Semicolon       |
		atribstat Semicolon     |
		printstat Semicolon     |
		readstat Semicolon      |
		returnstat Semicolon    |
		ifstat                  |
		forstat                 |
		Lbrace statelist Rbrace |
		breakstat               |
		Semicolon;

vardecl: vartype Ident vardeclaux;

vardeclaux: Lbracket Int_constant Rbracket vardeclaux | ;

vartype: Int | Float | String;

atribstat: lvalue Assign atribstataux;

atribstataux: expression | allocexpression | funccall;

funccall: Ident Lparen paramlistcall Rparen;

paramlistcall: Ident paramlistcallaux | ;

paramlistcallaux: Comma paramlistcall | ;

printstat: Print expression;

readstat: Read lvalue;

returnstat: Return;

breakstat: Break Semicolon;

ifstat: If Lparen expression Rparen statement elsestat;

elsestat: Else statement | ;

forstat: For Lparen atribstat Semicolon expression Semicolon atribstat Rparen statement;

statelist: statement statelistaux;

statelistaux: statelist | ;

allocexpression: New vartype Lbracket numexpression Rbracket allocexpressionaux;

allocexpressionaux: Lbracket numexpression Rbracket allocexpressionaux2 | ;

allocexpressionaux2: Lbracket numexpression Rbracket allocexpressionaux | ;

expression: numexpression expressionaux;

expressionaux: comparator numexpression | ;

comparator: 
    Lesser       |
    Greater      |
    Lesserequal  |
    Greaterequal |
    Equal        |
    Different    ;

numexpression: term numexpressionaux;

numexpressionaux: minusplus numexpression | ;

term: unaryexpr termaux;

termaux: operators unaryexpr termaux | ;

minusplus: Plus | Minus;

operators: Multiply | Divide | Module;

unaryexpr: minusplus factor | factor;

factor:
    Int_constant                 |
    Float_constant               |
    String_constant              |
    Null                         |
    lvalue                       |
    Lparen numexpression Rparen  ;

lvalue: Ident allocexpressionaux;

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
Float_constant	: DIGIT+ '.' DIGIT+;
String_constant	: '"' ('\\' | ALPHABET)*? '"';
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
fragment ALPHABET       : (DIGIT | LETTER | PUNCTUATION | GRAPHICS | RELOPS | ' ');
