import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class SimpleExpressionListener extends MontPyBaseListener {
    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        System.out.println(ctx.getClass().getSimpleName() + ": " + ctx.getText());
    }

    @Override
    public void exitAdditiveExpression(MontPyParser.AdditiveExpressionContext ctx) {
        if (ctx.getChildCount() == 3) {  // Basic form of expr op expr
            String left = ctx.getChild(0).getText();
            String op = ctx.getChild(1).getText();
            String right = ctx.getChild(2).getText();
            System.out.println("Processed addExpr: " + left + " " + op + " " + right);
        }
    }

    @Override
    public void exitMultiplicativeExpression(MontPyParser.MultiplicativeExpressionContext ctx) {
        if (ctx.getChildCount() == 3) {
            String left = ctx.getChild(0).getText();
            String op = ctx.getChild(1).getText();
            String right = ctx.getChild(2).getText();
            System.out.println("Processed multExpr: " + left + " " + op + " " + right);
        }
    }
}