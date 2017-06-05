// Generated from E:/NewProgLang/src\BroLanguage.g4 by ANTLR 4.6
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
	 * Enter a parse tree produced by {@link BroLanguageParser#statment}.
	 * @param ctx the parse tree
	 */
	void enterStatment(BroLanguageParser.StatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BroLanguageParser#statment}.
	 * @param ctx the parse tree
	 */
	void exitStatment(BroLanguageParser.StatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BroLanguageParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void enterMathExpr(BroLanguageParser.MathExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BroLanguageParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void exitMathExpr(BroLanguageParser.MathExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BroLanguageParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpr(BroLanguageParser.LogicalExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BroLanguageParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpr(BroLanguageParser.LogicalExprContext ctx);
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
	 * Enter a parse tree produced by {@link BroLanguageParser#initialize}.
	 * @param ctx the parse tree
	 */
	void enterInitialize(BroLanguageParser.InitializeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BroLanguageParser#initialize}.
	 * @param ctx the parse tree
	 */
	void exitInitialize(BroLanguageParser.InitializeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BroLanguageParser#logicalOperation}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperation(BroLanguageParser.LogicalOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BroLanguageParser#logicalOperation}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperation(BroLanguageParser.LogicalOperationContext ctx);
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