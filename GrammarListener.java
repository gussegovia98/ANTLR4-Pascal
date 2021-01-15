// Generated from Grammar.g4 by ANTLR 4.8

    import java.util.HashMap;
    import java.util.Map;
    import java.util.*;
    import java.lang.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(GrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(GrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(GrammarParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(GrammarParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(GrammarParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(GrammarParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ifStatements}.
	 * @param ctx the parse tree
	 */
	void enterIfStatements(GrammarParser.IfStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ifStatements}.
	 * @param ctx the parse tree
	 */
	void exitIfStatements(GrammarParser.IfStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(GrammarParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(GrammarParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#caseFinder}.
	 * @param ctx the parse tree
	 */
	void enterCaseFinder(GrammarParser.CaseFinderContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#caseFinder}.
	 * @param ctx the parse tree
	 */
	void exitCaseFinder(GrammarParser.CaseFinderContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#boolDef1}.
	 * @param ctx the parse tree
	 */
	void enterBoolDef1(GrammarParser.BoolDef1Context ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#boolDef1}.
	 * @param ctx the parse tree
	 */
	void exitBoolDef1(GrammarParser.BoolDef1Context ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#boolDef2}.
	 * @param ctx the parse tree
	 */
	void enterBoolDef2(GrammarParser.BoolDef2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#boolDef2}.
	 * @param ctx the parse tree
	 */
	void exitBoolDef2(GrammarParser.BoolDef2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#equalDef}.
	 * @param ctx the parse tree
	 */
	void enterEqualDef(GrammarParser.EqualDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#equalDef}.
	 * @param ctx the parse tree
	 */
	void exitEqualDef(GrammarParser.EqualDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(GrammarParser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(GrammarParser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#sExpr}.
	 * @param ctx the parse tree
	 */
	void enterSExpr(GrammarParser.SExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#sExpr}.
	 * @param ctx the parse tree
	 */
	void exitSExpr(GrammarParser.SExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#inLine}.
	 * @param ctx the parse tree
	 */
	void enterInLine(GrammarParser.InLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#inLine}.
	 * @param ctx the parse tree
	 */
	void exitInLine(GrammarParser.InLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(GrammarParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(GrammarParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#programName}.
	 * @param ctx the parse tree
	 */
	void enterProgramName(GrammarParser.ProgramNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#programName}.
	 * @param ctx the parse tree
	 */
	void exitProgramName(GrammarParser.ProgramNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(GrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(GrammarParser.ExprContext ctx);
}