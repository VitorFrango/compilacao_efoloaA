// Generated from MontPy.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MontPyParser}.
 */
public interface MontPyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MontPyParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(MontPyParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontPyParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(MontPyParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontPyParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(MontPyParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontPyParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(MontPyParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontPyParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(MontPyParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontPyParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(MontPyParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontPyParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(MontPyParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontPyParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(MontPyParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontPyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MontPyParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontPyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MontPyParser.ExpressionContext ctx);
}