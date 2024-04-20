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

// Lidar com erros
ERROR: .  -> channel(HIDDEN);
error: . ;

// Regra de entrada
//programa: (DEF | FLOAT_TYPE | INT_TYPE | FOR | IN | RANGE | WHILE | IF | ELIF | ELSE | SIZE | ADD | REMOVE | AND | OR | RETURN | PRINT | INPUT | ID | FLOAT | INT | STRING | PLUS | MINUS | MULTIPLY | DIVIDE | EXPONENT | FLOOR_DIVIDE | POWER | MODULO | OPEN_BRACKET | CLOSE_BRACKET | OPEN_PAREN | CLOSE_PAREN | EQUALS | EQUALITY | INEQUALITY | GREATER_THAN | LESS_THAN | GREATER_THAN_OR_EQUAL | LESS_THAN_OR_EQUAL | COMMA | COLON | DOT | TAB | COMMENT | WS)+;

// Define a estrutura de um programa na linguagem, que deve conter uma ou mais declarações de variáveis, definições de funções, ou instruções, e terminar com um símbolo EOF (end of file, ou fim de arquivo).
program : (statement | function_declaration)+ EOF;

// Define os tipos básicos de dados disponíveis na linguagem, como inteiros (INT_TYPE) e flutuantes (FLOAT_TYPE).
type : INT_TYPE | FLOAT_TYPE;

// Define tipos de lista que podem armazenar valores de um certo tipo, como uma lista de inteiros (int[]) ou uma lista de flutuantes (float[]).
list_type : type OPEN_BRACKET CLOSE_BRACKET;

// Define o que pode ser considerado uma expressão na linguagem, incluindo operações matemáticas, lógicas, chamadas de função, entre outros.
expression :
 literal
 | ID
 | expression (PLUS | MINUS | MULTIPLY | DIVIDE | EXPONENT | FLOOR_DIVIDE | MODULO) expression
 | OPEN_PAREN expression CLOSE_PAREN
 | ID OPEN_BRACKET expression CLOSE_BRACKET // Acesso a um elemento de uma lista pelo índice
 | function_call
 | list_function_call
 | expression (EQUALITY | INEQUALITY | GREATER_THAN | LESS_THAN | GREATER_THAN_OR_EQUAL | LESS_THAN_OR_EQUAL) expression
 | expression AND expression
 | expression OR expression
 | NOT expression;

// Define literais como números inteiros, flutuantes ou strings, que são valores diretamente escritos no código.
literal : INT | FLOAT | STRING;

// Define chamadas de funções específicas para manipulação de listas, como obter tamanho (SIZE), adicionar elementos (ADD), ou remover elementos (REMOVE).
list_function_call : (SIZE | ADD | REMOVE) OPEN_PAREN ID (COMMA expression)* CLOSE_PAREN;

// Define como variáveis são declaradas na linguagem, permitindo declaração de variáveis de tipo básico, listas, ou atribuição direta de valores.
variable_declaration :
 type ID (EQUALS expression)?
 | list_type ID (EQUALS OPEN_BRACKET (literal (COMMA literal)*)? CLOSE_BRACKET)?
 | ID EQUALS expression;

// Define como funções são declaradas na linguagem, incluindo a possibilidade de definir o tipo de retorno, o nome da função, parâmetros aceitos, e o bloco de código que compõe o corpo da função.
function_declaration : DEF type? ID OPEN_PAREN params? CLOSE_PAREN statement_block;

// Define os parâmetros que uma função pode receber, permitindo múltiplos parâmetros separados por vírgula.
params : param (COMMA param)*;
param : type ID | list_type ID;

// Define o bloco de instruções de uma função ou de uma estrutura de controle, que pode conter múltiplas instruções.
statement_block : OPEN_BRACKET statement* CLOSE_BRACKET;
statement :
 variable_declaration
 | assignment
 | if_statement
 | for_statement
 | while_statement
 | expression
 | RETURN expression?
 | PRINT OPEN_PAREN expression (COMMA expression)* CLOSE_PAREN
 | INPUT OPEN_PAREN expression CLOSE_PAREN;

// Define como a atribuição de valores a variáveis ou elementos de lista é feita na linguagem.
assignment :
 ID EQUALS expression
 | ID OPEN_BRACKET expression CLOSE_BRACKET EQUALS expression;

// Define estruturas de controle condicional (if, else if, else) e de repetição (for, while), permitindo a execução condicional ou repetida de blocos de código.
if_statement : IF expression statement_block (ELIF expression statement_block)* (ELSE statement_block)?;
for_statement : FOR ID IN (ID | range_expression) statement_block;
range_expression : RANGE OPEN_PAREN expression (COMMA expression (COMMA expression)?)? CLOSE_PAREN;
while_statement : WHILE expression statement_block;

// Define como funções são chamadas na linguagem, especificando o nome da função e os argumentos passados.
function_call : ID OPEN_PAREN (expression (COMMA expression)*)? CLOSE_PAREN;


