# Criar a classe MontPyLexer
antlr4 MontPy.g4
# Comando compilar
javac -cp antlr-4.13.1-complete.jar *.java
# Comando executar
java -cp .:antlr-4.13.1-complete.jar MontPyLexerTest teste1.txt
