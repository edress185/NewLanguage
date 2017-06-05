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
	 * Visit a parse tree produced by {@link BroLanguageParser#statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatment(BroLanguageParser.StatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link BroLanguageParser#mathExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpr(BroLanguageParser.MathExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BroLanguageParser#logicalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpr(BroLanguageParser.LogicalExprContext ctx);
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
	 * Visit a parse tree produced by {@link BroLanguageParser#logicalOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperation(BroLanguageParser.LogicalOperationContext ctx);
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