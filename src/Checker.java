import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * Created by Maks on 06.06.2017.
 */
public class Checker extends BroLanguageBaseVisitor {

    private Scope scope;
    private ParseTreeProperty<Var> symb = new ParseTreeProperty<>();
    private int invVarNum =0;


    public Checker(){
        this.scope = new Scope(null);//original/root scope
    }

    @Override
    public Object visitProg(BroLanguageParser.ProgContext ctx) {
        return super.visitProg(ctx);
    }

    @Override
    public Object visitStatmentInititalizeVar(BroLanguageParser.StatmentInititalizeVarContext ctx) {
        return super.visitStatmentInititalizeVar(ctx);
    }

    @Override
    public Object visitStatmentAssignVar(BroLanguageParser.StatmentAssignVarContext ctx) {
        return super.visitStatmentAssignVar(ctx);
    }


    @Override
    public Object visitStatmentPrint(BroLanguageParser.StatmentPrintContext ctx) {
        return super.visitStatmentPrint(ctx);
    }

    @Override
    public Object visitStatmentLoop(BroLanguageParser.StatmentLoopContext ctx) {
        return super.visitStatmentLoop(ctx);
    }

    @Override
    public Object visitStatmentIf(BroLanguageParser.StatmentIfContext ctx) {
        return super.visitStatmentIf(ctx);
    }

    @Override
    public Object visitStatmentInitializeMethod(BroLanguageParser.StatmentInitializeMethodContext ctx) {
        return super.visitStatmentInitializeMethod(ctx);
    }

    @Override
    public Object visitStatmentCallMethod(BroLanguageParser.StatmentCallMethodContext ctx) {
        return super.visitStatmentCallMethod(ctx);
    }

    @Override
    public Object visitMathExpr(BroLanguageParser.MathExprContext ctx) {
        return super.visitMathExpr(ctx);
    }

    @Override
    public Object visitLogicalExpressionMathExpr(BroLanguageParser.LogicalExpressionMathExprContext ctx) {
        return super.visitLogicalExpressionMathExpr(ctx);
    }

    @Override
    public Object visitLogicalExpressionMultiple(BroLanguageParser.LogicalExpressionMultipleContext ctx) {
        return super.visitLogicalExpressionMultiple(ctx);
    }

    @Override
    public Object visitValue(BroLanguageParser.ValueContext ctx) {
        return super.visitValue(ctx);
    }

    @Override
    public Object visitPrint(BroLanguageParser.PrintContext ctx) {
        return super.visitPrint(ctx);
    }

    @Override
    public Object visitVarInitializing(BroLanguageParser.VarInitializingContext ctx) {
        return super.visitVarInitializing(ctx);

        ctx.varType(




    }



    @Override
    public Object visitVarInitializingAndAssigning(BroLanguageParser.VarInitializingAndAssigningContext ctx) {
        return super.visitVarInitializingAndAssigning(ctx);
    }

    @Override
    public Object visitVarAssigning(BroLanguageParser.VarAssigningContext ctx) {
        super.visitVarAssigning(ctx);


        return 0;
    }

    @Override
    public Object visitInitializeMethod(BroLanguageParser.InitializeMethodContext ctx) {
        return super.visitInitializeMethod(ctx);
    }

    @Override
    public Object visitCallMethod(BroLanguageParser.CallMethodContext ctx) {
        return super.visitCallMethod(ctx);
    }

    @Override
    public Object visitParam(BroLanguageParser.ParamContext ctx) {
        return super.visitParam(ctx);
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
