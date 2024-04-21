grammar MontPy;

// Tokens
FLOAT: ('+'|'-')? DIGIT* '.' DIGIT+ (('e' | 'E') ('+'|'-')? DIGIT+)?;
INT: ('+'|'-')? DIGIT+;
DIGIT: [0-9];
STRING: '"' ~["\r\n]* '"';
NUMBER: [0-9]+;

// def float ID ( OPEN_PAREN (type ID (COMMA type ID)*)? CLOSE_PAREN ) statement_block
type : FLOAT_TYPE | INT_TYPE;

DEF: 'def';
FLOAT_TYPE: 'float';
INT_TYPE: 'int';
FOR: 'for';
IN: 'in';
RANGE: 'range';
WHILE: 'while';
IF: 'if';
ELIF: 'elif';
ELSE: 'else';
SIZE: 'size';
ADD: 'add';
REMOVE: 'remove';
AND: 'and';
OR: 'or';
RETURN: 'return';
PRINT: 'print';
INPUT: 'input';

// Operators and Symbols
PLUS: '+';
MINUS: '-';
MULTIPLY: '*';
DIVIDE: '/';
EXPONENT: '^';
FLOOR_DIVIDE: '//';
POWER: '**';
MODULO: '%';
OPEN_BRACKET: '[';
CLOSE_BRACKET: ']';
OPEN_PAREN: '(';
CLOSE_PAREN: ')';
EQUALS: '=';
EQUALITY: '==';
INEQUALITY: '!=';
GREATER_THAN: '>';
LESS_THAN: '<';
GREATER_THAN_OR_EQUAL: '>=';
LESS_THAN_OR_EQUAL: '<=';
COMMA: ',';
COLON: ':';
DOT: '.';
SEMICOLON: ';';

COMMENT: '#' ~[\r\n]* -> skip;
WS: [ \t\r\n]+ -> skip;

ID: [a-zA-Z_] [a-zA-Z_0-9]*;

// Handling Errors
ERROR: .;

// Operator precedence
expression
 : <assoc=right> expression POWER expression  // Power operator is right-associative
 | expression (PLUS | MINUS) expression
 | expression (MULTIPLY | DIVIDE | FLOOR_DIVIDE | MODULO) expression
 | OPEN_PAREN expression CLOSE_PAREN
 | ID
 | literal
 | function_call
 | list_function_call
 | ID OPEN_BRACKET expression CLOSE_BRACKET  // List index
 | expression (EQUALITY | INEQUALITY | GREATER_THAN | LESS_THAN | GREATER_THAN_OR_EQUAL | LESS_THAN_OR_EQUAL) expression
 | expression AND expression
 | expression OR expression
 ;

literal : INT | FLOAT | STRING;

list_function_call : (SIZE | ADD | REMOVE) OPEN_PAREN ID (COMMA expression)* CLOSE_PAREN;

variable_declaration
 : type ID (EQUALS expression)?
 | list_type ID (EQUALS OPEN_BRACKET (literal (COMMA literal)*)? CLOSE_BRACKET)?
 | ID EQUALS expression
 ;

function_declaration
 : DEF type? ID OPEN_PAREN params? CLOSE_PAREN statement_block
 ;

params : param (COMMA param)*;
param : type ID | list_type ID;

statement_block : OPEN_BRACKET statement* CLOSE_BRACKET;

statement
 : variable_declaration
 | assignment
 | if_statement
 | for_statement
 | while_statement
 | expression
 | RETURN expression?
 | PRINT OPEN_PAREN expression (COMMA expression)* CLOSE_PAREN
 | INPUT OPEN_PAREN expression CLOSE_PAREN
 ;

assignment
 : ID EQUALS expression
 | ID OPEN_BRACKET expression CLOSE_BRACKET EQUALS expression
 ;

if_statement
 : IF expression statement_block (ELIF expression statement_block)* (ELSE statement_block)?
 ;

for_statement
 : FOR ID IN (ID | range_expression) statement_block
 ;

range_expression
 : RANGE OPEN_PAREN expression (COMMA expression (COMMA expression)?)? CLOSE_PAREN
 ;

while_statement
 : WHILE expression statement_block
 ;

function_call
 : ID OPEN_PAREN (expression (COMMA expression)*)? CLOSE_PAREN
 ;

list_type : type OPEN_BRACKET CLOSE_BRACKET;

program : (statement | function_declaration)+ EOF;
