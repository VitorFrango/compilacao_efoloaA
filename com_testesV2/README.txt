# Criar a classe MontPyLexer
antlr4 MontPy.g4
# Comando compilar
javac -cp antlr-4.13.1-complete.jar *.java
# Comando executar
java -cp .:antlr-4.13.1-complete.jar MontPyLexerTest teste1.txt





Comandos V2 (Ajuda a separar os ficheiros gerados noutra pasta):

java -jar antlr-4.13.1-complete.jar -o gen -package gen MontPy.g4 -visitor -no-listener
javac -cp .:antlr-4.13.1-complete.jar gen/*.java
javac -cp .:antlr-4.13.1-complete.jar TestMontPy.java
java -cp .:antlr-4.13.1-complete.jar TestMontPy testes/teste_erro1.txt

