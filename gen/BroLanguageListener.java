// Generated from E:/gitHub/NewLanguage/src\BroLanguage.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BroLanguageParser}.
 */
public interface BroLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BroLanguageParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(BroLanguageParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link BroLanguageParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(BroLanguageParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statmentInititalizeVar}
	 * labeled alternative in {@link BroLanguageParser#statment}.
	 * @param ctx the parse tree
	 */
	void enterStatmentInititalizeVar(BroLanguageParser.StatmentInititalizeVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statmentInititalizeVar}
	 * labeled alternative in {@link BroLanguageParser#statment}.
	 * @param ctx the parse tree
	 */
	void exitStatmentInititalizeVar(BroLanguageParser.StatmentInititalizeVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statmentAssignVar}
	 * labeled alternative in {@link BroLanguageParser#statment}.
	 * @param ctx the parse tree
	 */
	void enterStatmentAssignVar(BroLanguageParser.StatmentAssignVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statmentAssignVar}
	 * labeled alternative in {@link BroLanguageParser#statment}.
	 * @param ctx the parse tree
	 */
	void exitStatmentAssignVar(BroLanguageParser.StatmentAssignVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statmentPrint}
	 * labeled alternative in {@link BroLanguageParser#statment}.
	 * @param ctx the parse tree
	 */
	void enterStatmentPrint(BroLanguageParser.StatmentPrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statmentPrint}
	 * labeled alternative in {@link BroLanguageParser#statment}.
	 * @param ctx the parse tree
	 */
	void exitStatmentPrint(BroLanguageParser.StatmentPrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statmentLoop}
	 * labeled alternative in {@link BroLanguageParser#statment}.
	 * @param ctx the parse tree
	 */
	void enterStatmentLoop(BroLanguageParser.StatmentLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statmentLoop}
	 * labeled alternative in {@link BroLanguageParser#statment}.
	 * @param ctx the parse tree
	 */
	void exitStatmentLoop(BroLanguageParser.StatmentLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statmentIf}
	 * labeled alternative in {@link BroLanguageParser#statment}.
	 * @param ctx the parse tree
	 */
	void enterStatmentIf(BroLanguageParser.StatmentIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statmentIf}
	 * labeled alternative in {@link BroLanguageParser#statment}.
	 * @param ctx the parse tree
	 */
	void exitStatmentIf(BroLanguageParser.StatmentIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statmentInitializeMethod}
	 * labeled alternative in {@link BroLanguageParser#statment}.
	 * @param ctx the parse tree
	 */
	void enterStatmentInitializeMethod(BroLanguageParser.StatmentInitializeMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statmentInitializeMethod}
	 * labeled alternative in {@link BroLanguageParser#statment}.
	 * @param ctx the parse tree
	 */
	void exitStatmentInitializeMethod(BroLanguageParser.StatmentInitializeMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statmentCallMethod}
	 * labeled alternative in {@link BroLanguageParser#statment}.
	 * @param ctx the parse tree
	 */
	void enterStatmentCallMethod(BroLanguageParser.StatmentCallMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statmentCallMethod}
	 * labeled alternative in {@link BroLanguageParser#statment}.
	 * @param ctx the parse tree
	 */
	void exitStatmentCallMethod(BroLanguageParser.StatmentCallMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathExprBrackets}
	 * labeled alternative in {@link BroLanguageParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void enterMathExprBrackets(BroLanguageParser.MathExprBracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathExprBrackets}
	 * labeled alternative in {@link BroLanguageParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void exitMathExprBrackets(BroLanguageParser.MathExprBracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathExprNumber}
	 * labeled alternative in {@link BroLanguageParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void enterMathExprNumber(BroLanguageParser.MathExprNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathExprNumber}
	 * labeled alternative in {@link BroLanguageParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void exitMathExprNumber(BroLanguageParser.MathExprNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathExprOperators}
	 * labeled alternative in {@link BroLanguageParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void enterMathExprOperators(BroLanguageParser.MathExprOperatorsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathExprOperators}
	 * labeled alternative in {@link BroLanguageParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void exitMathExprOperators(BroLanguageParser.MathExprOperatorsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathExprNegative}
	 * labeled alternative in {@link BroLanguageParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void enterMathExprNegative(BroLanguageParser.MathExprNegativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathExprNegative}
	 * labeled alternative in {@link BroLanguageParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void exitMathExprNegative(BroLanguageParser.MathExprNegativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathExprIntVar}
	 * labeled alternative in {@link BroLanguageParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void enterMathExprIntVar(BroLanguageParser.MathExprIntVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathExprIntVar}
	 * labeled alternative in {@link BroLanguageParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void exitMathExprIntVar(BroLanguageParser.MathExprIntVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExprStringVar}
	 * labeled alternative in {@link BroLanguageParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void enterStringExprStringVar(BroLanguageParser.StringExprStringVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExprStringVar}
	 * labeled alternative in {@link BroLanguageParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void exitStringExprStringVar(BroLanguageParser.StringExprStringVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExprString}
	 * labeled alternative in {@link BroLanguageParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void enterStringExprString(BroLanguageParser.StringExprStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExprString}
	 * labeled alternative in {@link BroLanguageParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void exitStringExprString(BroLanguageParser.StringExprStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalExpressionBooleanVar}
	 * labeled alternative in {@link BroLanguageParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpressionBooleanVar(BroLanguageParser.LogicalExpressionBooleanVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalExpressionBooleanVar}
	 * labeled alternative in {@link BroLanguageParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpressionBooleanVar(BroLanguageParser.LogicalExpressionBooleanVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalExpressionMathExpr}
	 * labeled alternative in {@link BroLanguageParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpressionMathExpr(BroLanguageParser.LogicalExpressionMathExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalExpressionMathExpr}
	 * labeled alternative in {@link BroLanguageParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpressionMathExpr(BroLanguageParser.LogicalExpressionMathExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalExpressionMultiple}
	 * labeled alternative in {@link BroLanguageParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpressionMultiple(BroLanguageParser.LogicalExpressionMultipleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalExpressionMultiple}
	 * labeled alternative in {@link BroLanguageParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpressionMultiple(BroLanguageParser.LogicalExpressionMultipleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalExpressionBoolean}
	 * labeled alternative in {@link BroLanguageParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpressionBoolean(BroLanguageParser.LogicalExpressionBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalExpressionBoolean}
	 * labeled alternative in {@link BroLanguageParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpressionBoolean(BroLanguageParser.LogicalExpressionBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueVar}
	 * labeled alternative in {@link BroLanguageParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueVar(BroLanguageParser.ValueVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueVar}
	 * labeled alternative in {@link BroLanguageParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueVar(BroLanguageParser.ValueVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueLogicalExp}
	 * labeled alternative in {@link BroLanguageParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueLogicalExp(BroLanguageParser.ValueLogicalExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueLogicalExp}
	 * labeled alternative in {@link BroLanguageParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueLogicalExp(BroLanguageParser.ValueLogicalExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueMathExp}
	 * labeled alternative in {@link BroLanguageParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueMathExp(BroLanguageParser.ValueMathExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueMathExp}
	 * labeled alternative in {@link BroLanguageParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueMathExp(BroLanguageParser.ValueMathExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueStringExp}
	 * labeled alternative in {@link BroLanguageParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueStringExp(BroLanguageParser.ValueStringExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueStringExp}
	 * labeled alternative in {@link BroLanguageParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueStringExp(BroLanguageParser.ValueStringExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link BroLanguageParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(BroLanguageParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link BroLanguageParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(BroLanguageParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link BroLanguageParser#initializeVar}.
	 * @param ctx the parse tree
	 */
	void enterInitializeVar(BroLanguageParser.InitializeVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link BroLanguageParser#initializeVar}.
	 * @param ctx the parse tree
	 */
	void exitInitializeVar(BroLanguageParser.InitializeVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link BroLanguageParser#assignVar}.
	 * @param ctx the parse tree
	 */
	void enterAssignVar(BroLanguageParser.AssignVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link BroLanguageParser#assignVar}.
	 * @param ctx the parse tree
	 */
	void exitAssignVar(BroLanguageParser.AssignVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link BroLanguageParser#initializeMethod}.
	 * @param ctx the parse tree
	 */
	void enterInitializeMethod(BroLanguageParser.InitializeMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link BroLanguageParser#initializeMethod}.
	 * @param ctx the parse tree
	 */
	void exitInitializeMethod(BroLanguageParser.InitializeMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link BroLanguageParser#callMethod}.
	 * @param ctx the parse tree
	 */
	void enterCallMethod(BroLanguageParser.CallMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link BroLanguageParser#callMethod}.
	 * @param ctx the parse tree
	 */
	void exitCallMethod(BroLanguageParser.CallMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link BroLanguageParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(BroLanguageParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link BroLanguageParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(BroLanguageParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link BroLanguageParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(BroLanguageParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link BroLanguageParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(BroLanguageParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link BroLanguageParser#ifStatment}.
	 * @param ctx the parse tree
	 */
	void enterIfStatment(BroLanguageParser.IfStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BroLanguageParser#ifStatment}.
	 * @param ctx the parse tree
	 */
	void exitIfStatment(BroLanguageParser.IfStatmentContext ctx);
}