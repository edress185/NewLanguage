// Generated from E:/gitHub/NewLanguage/src\BroLanguage.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BroLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BroLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BroLanguageParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(BroLanguageParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statmentInititalizeVar}
	 * labeled alternative in {@link BroLanguageParser#statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatmentInititalizeVar(BroLanguageParser.StatmentInititalizeVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statmentAssignVar}
	 * labeled alternative in {@link BroLanguageParser#statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatmentAssignVar(BroLanguageParser.StatmentAssignVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statmentPrint}
	 * labeled alternative in {@link BroLanguageParser#statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatmentPrint(BroLanguageParser.StatmentPrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statmentLoop}
	 * labeled alternative in {@link BroLanguageParser#statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatmentLoop(BroLanguageParser.StatmentLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statmentIf}
	 * labeled alternative in {@link BroLanguageParser#statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatmentIf(BroLanguageParser.StatmentIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statmentInitializeMethod}
	 * labeled alternative in {@link BroLanguageParser#statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatmentInitializeMethod(BroLanguageParser.StatmentInitializeMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statmentCallMethod}
	 * labeled alternative in {@link BroLanguageParser#statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatmentCallMethod(BroLanguageParser.StatmentCallMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathExprBrackets}
	 * labeled alternative in {@link BroLanguageParser#mathExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExprBrackets(BroLanguageParser.MathExprBracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathExprNumber}
	 * labeled alternative in {@link BroLanguageParser#mathExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExprNumber(BroLanguageParser.MathExprNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathExprOperators}
	 * labeled alternative in {@link BroLanguageParser#mathExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExprOperators(BroLanguageParser.MathExprOperatorsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathExprNegative}
	 * labeled alternative in {@link BroLanguageParser#mathExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExprNegative(BroLanguageParser.MathExprNegativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathExprIntVar}
	 * labeled alternative in {@link BroLanguageParser#mathExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExprIntVar(BroLanguageParser.MathExprIntVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExprStringVar}
	 * labeled alternative in {@link BroLanguageParser#stringExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExprStringVar(BroLanguageParser.StringExprStringVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExprString}
	 * labeled alternative in {@link BroLanguageParser#stringExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExprString(BroLanguageParser.StringExprStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalExpressionBooleanVar}
	 * labeled alternative in {@link BroLanguageParser#logicalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpressionBooleanVar(BroLanguageParser.LogicalExpressionBooleanVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalExpressionMathExpr}
	 * labeled alternative in {@link BroLanguageParser#logicalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpressionMathExpr(BroLanguageParser.LogicalExpressionMathExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalExpressionMultiple}
	 * labeled alternative in {@link BroLanguageParser#logicalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpressionMultiple(BroLanguageParser.LogicalExpressionMultipleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalExpressionBoolean}
	 * labeled alternative in {@link BroLanguageParser#logicalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpressionBoolean(BroLanguageParser.LogicalExpressionBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueVar}
	 * labeled alternative in {@link BroLanguageParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueVar(BroLanguageParser.ValueVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueLogicalExp}
	 * labeled alternative in {@link BroLanguageParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueLogicalExp(BroLanguageParser.ValueLogicalExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueMathExp}
	 * labeled alternative in {@link BroLanguageParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueMathExp(BroLanguageParser.ValueMathExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueStringExp}
	 * labeled alternative in {@link BroLanguageParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueStringExp(BroLanguageParser.ValueStringExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link BroLanguageParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(BroLanguageParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link BroLanguageParser#initializeVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializeVar(BroLanguageParser.InitializeVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link BroLanguageParser#assignVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignVar(BroLanguageParser.AssignVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link BroLanguageParser#initializeMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializeMethod(BroLanguageParser.InitializeMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link BroLanguageParser#callMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallMethod(BroLanguageParser.CallMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link BroLanguageParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(BroLanguageParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link BroLanguageParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(BroLanguageParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link BroLanguageParser#ifStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatment(BroLanguageParser.IfStatmentContext ctx);
}