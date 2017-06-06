/**
 * Created by Maks on 06.06.2017.
 */
public class Checker extends BroLanguageBaseVisitor {


    @Override
    public Object visitProg(BroLanguageParser.ProgContext ctx) {
        return super.visitProg(ctx);
    }

    @Override
    public Object visitStatment(BroLanguageParser.StatmentContext ctx) {
        return super.visitStatment(ctx);
    }

    @Override
    public Object visitMathExpr(BroLanguageParser.MathExprContext ctx) {
        return super.visitMathExpr(ctx);
    }

    @Override
    public Object visitLogicalExpr(BroLanguageParser.LogicalExprContext ctx) {
        return super.visitLogicalExpr(ctx);
    }

    @Override
    public Object visitPrint(BroLanguageParser.PrintContext ctx) {
        return super.visitPrint(ctx);
    }

    @Override
    public Object visitInitialize(BroLanguageParser.InitializeContext ctx) {
        return super.visitInitialize(ctx);
    }

    @Override
    public Object visitLogicalOperation(BroLanguageParser.LogicalOperationContext ctx) {
        return super.visitLogicalOperation(ctx);
    }

    @Override
    public Object visitLoop(BroLanguageParser.LoopContext ctx) {
        return super.visitLoop(ctx);
    }

    @Override
    public Object visitIfStatment(BroLanguageParser.IfStatmentContext ctx) {
        return super.visitIfStatment(ctx);
    }
}
