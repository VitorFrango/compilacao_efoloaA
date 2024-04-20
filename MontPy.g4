grammar MontPy;

// Definindo tokens
FLOAT: ('+'|'-')? DIGIT* '.' DIGIT+ (('e' | 'E') ('+'|'-')? DIGIT+)?;
INT: ('+'|'-')? DIGIT+;
DIGIT: [0-9];
STRING: '"' ~["\r\n]* '"';

// Palavras reservadas
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

// Operadores e símbolos
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
TAB: '\t';

// Ignorar comentários
COMMENT: '#' ~[\r\n]* -> skip;

// Ignorar espaços em branco
WS: [ \t\r\n]+ -> skip;

// Identificar nomes de variáveis e funções
ID: [a-zA-Z_] [a-zA-Z_0-9]*;

// Regra de entrada
programa : (stat)+ EOF;

// Estatutos permitidos no programa
stat: declaration
    | command
    | expression;

// Exemplos de declarações
declaration : (FLOAT_TYPE | INT_TYPE) ID ('=' expression)?;

// Exemplos de comandos
command: PRINT '(' expression ')';

// Expressões permitidas
expression : '(' expression ')'
           | expression (PLUS | MINUS | MULTIPLY | DIVIDE) expression
           | INT
           | FLOAT
           | ID;
