lexer grammar lcc;

@header {
    package main.antlr;
}

// mesmo se bota isso como fragment, não está gerando todos os arquivos
Program: (Statement | Funclist)?;

Funclist: Funcdef Funclist | Funcdef;

Funcdef: 'def' Ident '(' Paramlist? ')' '{' Statelist '}';

Paramlist:
	(
		('int' | 'float' | 'string') Ident ',' Paramlist?
		| ( 'int' | 'float' | 'string') Ident
	);

Statement:
	(
		Vardecl ';'
		| Atribstat ';'
		| Printstat ';'
		| Readstat ';'
		| Returnstat ';'
		| Ifstat
		| Forstat
		| '{' Statelist '}'
		| 'break' ';'
		| ';'
	);

Vardecl: ('int' | 'float' | 'string') Ident ('[' Intconstant ']')*;

Atribstat: Lvalue '=' ( Expression | Allocexpression | Funcall);

Funcall: Ident '(' Paramlistcall? ')';

Paramlistcall: ( Ident ',' Paramlistcall? | Ident);

Printstat: 'print' Expression;

Readstat: 'read' Lvalue;

fragment Returnstat: 'return';

Ifstat: 'if' '(' Expression ')' Statement ('else' Statement)?;

Forstat:
	'for' '(' Atribstat ';' Expression ';' Atribstat ')' Statement;

Statelist: Statement (Statement)?;

Allocexpression:
	'new' ('int' | 'float' | 'string') ('[' Numexpression ']')+;

Expression:
	Numexpression (
		('<' | '>' | '<=' | '>=' | '==' | '!=') Numexpression
	)?;

Numexpression: Term (('+' | '-') Term)*;

// TODO: TIVE QUE BOTAR UM \\, SE NAO BUGAVA, TEM QUE VER COMO VAI FICAR ISSO DEPOIS DE PASSAR PELO ANTLR
Term: Unaryexpr (( '*' | '\\' | '%') Unaryexpr)*;

Unaryexpr: ('+' | '-')? Factor;

Factor: (
		Intconstant
		| Floatconstant
		| Stringconstant
		| 'null'
		| Lvalue
		| '(' Numexpression ')'
	);

Lvalue: Ident ('[' Numexpression ']')*;

fragment Ident: ([a-z] | [A-Z]) ([a-z] | [A-Z] | [0-9])*;

fragment Intconstant: ([0-9])+;

fragment Floatconstant: ([0-9])+ ('.' ([0-9])*)?;

fragment Stringconstant: ([a-z] | [A-Z] | [0-9] | ' ' | ':' | ' !', ',', '.', '-')*;