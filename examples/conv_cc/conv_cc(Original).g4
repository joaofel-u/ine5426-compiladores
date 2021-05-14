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

program: (statement | funclist)?;

funclist: funcdef funclist | funcdef;

funcdef: Def Ident Lparen paramlist Rparen Lbrace statelist Rbrace;

paramlist:	((Int | Float | String) Ident Comma paramlist) |
		    ((Int | Float | String) Ident)?;

statement:
	(
		vardecl Semicolon       |
		atribstat Semicolon     |
		printstat Semicolon     |
		readstat Semicolon      |
		returnstat Semicolon    |
		ifstat                  |
		forstat                 |
		Lbrace statelist Rbrace |
		Break Semicolon         |
		Semicolon
	);

vardecl: (Int | Float | String) Ident (Lbracket Int_constant Rbracket)*;

atribstat: lvalue Assign ( expression | allocexpression | funccall);

funccall: Ident Lparen paramlistcall Rparen;

paramlistcall: ( Ident Comma paramlistcall | Ident)?;

printstat: Print expression;

readstat: Read lvalue;

returnstat: Return;

ifstat: If Lparen expression Rparen statement (Else statement)?;

forstat: For Lparen atribstat Semicolon expression Semicolon atribstat Rparen statement;

statelist: statement (statelist)?;

allocexpression: New (Int | Float | String) (Lbracket numexpression Rbracket)+;

expression:
	numexpression (
		(Lesser | Greater | Lesserequal | Greaterequal | Equal | Different) numexpression
	)?;

numexpression: term ((Plus | Minus) term)*;

term: unaryexpr (( Multiply | Divide | Module) unaryexpr)*;

unaryexpr: (Plus | Minus)? factor;

factor: (
		Int_constant |
		Float_constant |
		String_constant |
		Null |
		lvalue |
		Lparen numexpression Rparen
	);

lvalue: Ident (Lbracket numexpression Rbracket)*;

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
