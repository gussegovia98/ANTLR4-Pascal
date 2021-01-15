// Generated from Grammar.g4 by ANTLR 4.8

    import java.util.HashMap;
    import java.util.Map;
    import java.util.*;
    import java.lang.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		BEGIN=18, END=19, IF=20, THEN=21, ELSE=22, CASE=23, OF=24, TRUE=25, FALSE=26, 
		AND=27, OR=28, NOT=29, SIN=30, PNAME=31, COS=32, EXP=33, LN=34, READ=35, 
		WRITE=36, DOUBLE=37, ANYTHING=38, INLinee=39, ID=40, INT=41, WS=42;
	public static final int
		RULE_start = 0, RULE_statements = 1, RULE_main = 2, RULE_statement = 3, 
		RULE_ifStatements = 4, RULE_caseStatement = 5, RULE_caseFinder = 6, RULE_boolDef1 = 7, 
		RULE_boolDef2 = 8, RULE_equalDef = 9, RULE_varDef = 10, RULE_sExpr = 11, 
		RULE_inLine = 12, RULE_comment = 13, RULE_programName = 14, RULE_expr = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "statements", "main", "statement", "ifStatements", "caseStatement", 
			"caseFinder", "boolDef1", "boolDef2", "equalDef", "varDef", "sExpr", 
			"inLine", "comment", "programName", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "':'", "':='", "';'", "'*'", "'/'", "'%'", "'+'", 
			"'-'", "'>'", "'<'", "'>='", "'<='", "'<>'", "'='", "'''", "'begin'", 
			"'end.'", "'if'", "'then'", "'else'", "'case'", "'of'", "'true'", "'false'", 
			"'AND'", "'OR'", "'not'", "'Sin('", "'program '", "'Cos('", "'Exp('", 
			"'Ln('", "'ReadLn('", "'WriteLn('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "BEGIN", "END", "IF", "THEN", "ELSE", 
			"CASE", "OF", "TRUE", "FALSE", "AND", "OR", "NOT", "SIN", "PNAME", "COS", 
			"EXP", "LN", "READ", "WRITE", "DOUBLE", "ANYTHING", "INLinee", "ID", 
			"INT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    HashMap<String, Double > map = new HashMap<String, Double>();
	    HashMap<String, Boolean> map2 = new HashMap<String, Boolean>();
	    String Pname;
	    Scanner scnr = new Scanner(System.in);
	    boolean truth = false;
	    public boolean test() {
	        if (truth) {
	            truth = false;
	            return true;
	        }
	        return false;
	    }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			statements();
			setState(33);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		try {
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				main();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				statement();
				setState(37);
				statements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(GrammarParser.BEGIN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(GrammarParser.END, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(BEGIN);
			setState(44);
			statements();
			setState(45);
			match(END);
			setState(46);
			start();

			    

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public IfStatementsContext ifStatements() {
			return getRuleContext(IfStatementsContext.class,0);
		}
		public ProgramNameContext programName() {
			return getRuleContext(ProgramNameContext.class,0);
		}
		public CaseStatementContext caseStatement() {
			return getRuleContext(CaseStatementContext.class,0);
		}
		public EqualDefContext equalDef() {
			return getRuleContext(EqualDefContext.class,0);
		}
		public InLineContext inLine() {
			return getRuleContext(InLineContext.class,0);
		}
		public SExprContext sExpr() {
			return getRuleContext(SExprContext.class,0);
		}
		public BoolDef1Context boolDef1() {
			return getRuleContext(BoolDef1Context.class,0);
		}
		public BoolDef2Context boolDef2() {
			return getRuleContext(BoolDef2Context.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				ifStatements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				programName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				caseStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				equalDef();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(53);
				inLine();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(54);
				sExpr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(55);
				boolDef1();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(56);
				boolDef2();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(57);
				comment();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(58);
				varDef();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementsContext extends ParserRuleContext {
		public ExprContext expr;
		public TerminalNode IF() { return getToken(GrammarParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(GrammarParser.THEN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(GrammarParser.ELSE, 0); }
		public IfStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIfStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIfStatements(this);
		}
	}

	public final IfStatementsContext ifStatements() throws RecognitionException {
		IfStatementsContext _localctx = new IfStatementsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStatements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(IF);
			setState(62);
			match(T__0);
			setState(63);
			((IfStatementsContext)_localctx).expr = expr(0);
			setState(64);
			match(T__1);
			setState(65);
			match(THEN);

			        if(((IfStatementsContext)_localctx).expr.a){
			            truth = true;
			        }
			    
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(67);
				statement();
				}
				break;
			case 2:
				{
				}
				break;
			}
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(71);
				match(ELSE);

				        if(!((IfStatementsContext)_localctx).expr.a){
				            truth=true;
				        }
				    
				setState(75);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(73);
					statement();
					}
					break;
				case 2:
					{
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseStatementContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(GrammarParser.CASE, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode OF() { return getToken(GrammarParser.OF, 0); }
		public List<CaseFinderContext> caseFinder() {
			return getRuleContexts(CaseFinderContext.class);
		}
		public CaseFinderContext caseFinder(int i) {
			return getRuleContext(CaseFinderContext.class,i);
		}
		public CaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCaseStatement(this);
		}
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_caseStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(CASE);
			setState(80);
			match(ID);
			setState(81);
			match(OF);
			setState(83); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(82);
					caseFinder();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(85); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseFinderContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public CaseFinderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseFinder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCaseFinder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCaseFinder(this);
		}
	}

	public final CaseFinderContext caseFinder() throws RecognitionException {
		CaseFinderContext _localctx = new CaseFinderContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_caseFinder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			expr(0);
			setState(88);
			match(T__2);
			setState(89);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolDef1Context extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode TRUE() { return getToken(GrammarParser.TRUE, 0); }
		public BoolDef1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolDef1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBoolDef1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBoolDef1(this);
		}
	}

	public final BoolDef1Context boolDef1() throws RecognitionException {
		BoolDef1Context _localctx = new BoolDef1Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_boolDef1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			((BoolDef1Context)_localctx).ID = match(ID);
			setState(92);
			match(T__3);
			setState(93);
			match(TRUE);
			setState(94);
			match(T__4);

			    map2.put((((BoolDef1Context)_localctx).ID!=null?((BoolDef1Context)_localctx).ID.getText():null),true);

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolDef2Context extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode FALSE() { return getToken(GrammarParser.FALSE, 0); }
		public BoolDef2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolDef2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBoolDef2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBoolDef2(this);
		}
	}

	public final BoolDef2Context boolDef2() throws RecognitionException {
		BoolDef2Context _localctx = new BoolDef2Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_boolDef2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			((BoolDef2Context)_localctx).ID = match(ID);
			setState(98);
			match(T__3);
			setState(99);
			match(FALSE);
			setState(100);
			match(T__4);

			    map2.put((((BoolDef2Context)_localctx).ID!=null?((BoolDef2Context)_localctx).ID.getText():null),false);

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualDefContext extends ParserRuleContext {
		public Token e1;
		public Token e2;
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public EqualDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterEqualDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitEqualDef(this);
		}
	}

	public final EqualDefContext equalDef() throws RecognitionException {
		EqualDefContext _localctx = new EqualDefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_equalDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			((EqualDefContext)_localctx).e1 = match(ID);
			setState(104);
			match(T__3);
			setState(105);
			((EqualDefContext)_localctx).e2 = match(ID);
			setState(106);
			match(T__4);

			    map.put((((EqualDefContext)_localctx).e1!=null?((EqualDefContext)_localctx).e1.getText():null),(map.get((((EqualDefContext)_localctx).e2!=null?((EqualDefContext)_localctx).e2.getText():null))));
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDefContext extends ParserRuleContext {
		public Token ID;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVarDef(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			((VarDefContext)_localctx).ID = match(ID);
			setState(110);
			match(T__3);
			setState(111);
			((VarDefContext)_localctx).expr = expr(0);
			setState(112);
			match(T__4);
			 
			    if(((VarDefContext)_localctx).expr.a){
			        map2.put((((VarDefContext)_localctx).ID!=null?((VarDefContext)_localctx).ID.getText():null),((VarDefContext)_localctx).expr.a);
			    }
			    else if(((VarDefContext)_localctx).expr.i !=0){
			        map.put((((VarDefContext)_localctx).ID!=null?((VarDefContext)_localctx).ID.getText():null),((VarDefContext)_localctx).expr.i);
			    }
			    else{
			        map2.put((((VarDefContext)_localctx).ID!=null?((VarDefContext)_localctx).ID.getText():null),((VarDefContext)_localctx).expr.a);
			        map.put((((VarDefContext)_localctx).ID!=null?((VarDefContext)_localctx).ID.getText():null), ((VarDefContext)_localctx).expr.i); 
			    }
			    //System.out.println((((VarDefContext)_localctx).ID!=null?((VarDefContext)_localctx).ID.getText():null));
			    //System.out.println(((VarDefContext)_localctx).expr.i);

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSExpr(this);
		}
	}

	public final SExprContext sExpr() throws RecognitionException {
		SExprContext _localctx = new SExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			expr(0);
			setState(116);
			match(T__4);
			 
			    

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InLineContext extends ParserRuleContext {
		public TerminalNode INLinee() { return getToken(GrammarParser.INLinee, 0); }
		public InLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterInLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitInLine(this);
		}
	}

	public final InLineContext inLine() throws RecognitionException {
		InLineContext _localctx = new InLineContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_inLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(INLinee);



			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode ANYTHING() { return getToken(GrammarParser.ANYTHING, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(ANYTHING);



			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramNameContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode PNAME() { return getToken(GrammarParser.PNAME, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public ProgramNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProgramName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProgramName(this);
		}
	}

	public final ProgramNameContext programName() throws RecognitionException {
		ProgramNameContext _localctx = new ProgramNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_programName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(PNAME);
			setState(126);
			((ProgramNameContext)_localctx).ID = match(ID);
			setState(127);
			match(T__4);

			    Pname = (((ProgramNameContext)_localctx).ID!=null?((ProgramNameContext)_localctx).ID.getText():null);

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public double i;
		public boolean a;
		public ExprContext el;
		public ExprContext e;
		public ExprContext expr;
		public Token ID;
		public Token e3;
		public Token e4;
		public Token DOUBLE;
		public ExprContext er;
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public TerminalNode AND() { return getToken(GrammarParser.AND, 0); }
		public TerminalNode TRUE() { return getToken(GrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(GrammarParser.FALSE, 0); }
		public TerminalNode OR() { return getToken(GrammarParser.OR, 0); }
		public TerminalNode SIN() { return getToken(GrammarParser.SIN, 0); }
		public TerminalNode COS() { return getToken(GrammarParser.COS, 0); }
		public TerminalNode EXP() { return getToken(GrammarParser.EXP, 0); }
		public TerminalNode LN() { return getToken(GrammarParser.LN, 0); }
		public TerminalNode WRITE() { return getToken(GrammarParser.WRITE, 0); }
		public TerminalNode READ() { return getToken(GrammarParser.READ, 0); }
		public TerminalNode DOUBLE() { return getToken(GrammarParser.DOUBLE, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(131);
				match(T__0);
				setState(132);
				((ExprContext)_localctx).e = ((ExprContext)_localctx).expr = expr(0);
				setState(133);
				match(T__1);
				 ((ExprContext)_localctx).i =  ((ExprContext)_localctx).e.i; 
				}
				break;
			case 2:
				{
				setState(136);
				((ExprContext)_localctx).ID = match(ID);
				((ExprContext)_localctx).i =  map.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)); 
				}
				break;
			case 3:
				{
				setState(138);
				((ExprContext)_localctx).ID = match(ID);
				setState(139);
				match(T__5);
				setState(140);
				((ExprContext)_localctx).expr = expr(52);
				((ExprContext)_localctx).i =  map.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)) * ((ExprContext)_localctx).expr.i;
				}
				break;
			case 4:
				{
				setState(143);
				((ExprContext)_localctx).ID = match(ID);
				setState(144);
				match(T__6);
				setState(145);
				((ExprContext)_localctx).expr = expr(49);
				((ExprContext)_localctx).i =  map.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)) / ((ExprContext)_localctx).expr.i;
				}
				break;
			case 5:
				{
				setState(148);
				((ExprContext)_localctx).ID = match(ID);
				setState(149);
				match(T__7);
				setState(150);
				((ExprContext)_localctx).expr = expr(46);
				((ExprContext)_localctx).i =  map.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)) % ((ExprContext)_localctx).expr.i;
				}
				break;
			case 6:
				{
				setState(153);
				((ExprContext)_localctx).ID = match(ID);
				setState(154);
				match(T__8);
				setState(155);
				((ExprContext)_localctx).expr = expr(43);
				((ExprContext)_localctx).i =  map.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)) + ((ExprContext)_localctx).expr.i;
				}
				break;
			case 7:
				{
				setState(158);
				((ExprContext)_localctx).ID = match(ID);
				setState(159);
				match(T__9);
				setState(160);
				((ExprContext)_localctx).expr = expr(40);
				((ExprContext)_localctx).i =  map.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)) - ((ExprContext)_localctx).expr.i;
				}
				break;
			case 8:
				{
				setState(163);
				((ExprContext)_localctx).ID = match(ID);
				setState(164);
				match(T__10);
				setState(165);
				((ExprContext)_localctx).expr = expr(37);
				if(map.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null))>((ExprContext)_localctx).expr.i){((ExprContext)_localctx).a = true;}else{((ExprContext)_localctx).a = false;}
				}
				break;
			case 9:
				{
				setState(168);
				((ExprContext)_localctx).ID = match(ID);
				setState(169);
				match(T__11);
				setState(170);
				((ExprContext)_localctx).expr = expr(36);
				if(map.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null))<((ExprContext)_localctx).expr.i){((ExprContext)_localctx).a = true;}else{((ExprContext)_localctx).a = false;}
				}
				break;
			case 10:
				{
				setState(173);
				((ExprContext)_localctx).ID = match(ID);
				setState(174);
				match(T__12);
				setState(175);
				((ExprContext)_localctx).expr = expr(35);
				if(map.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null))>=((ExprContext)_localctx).expr.i){((ExprContext)_localctx).a = true;}else{((ExprContext)_localctx).a = false;}
				}
				break;
			case 11:
				{
				setState(178);
				((ExprContext)_localctx).ID = match(ID);
				setState(179);
				match(T__13);
				setState(180);
				((ExprContext)_localctx).expr = expr(34);
				if(map.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null))<=((ExprContext)_localctx).expr.i){((ExprContext)_localctx).a = true;}else{((ExprContext)_localctx).a = false;}
				}
				break;
			case 12:
				{
				setState(183);
				((ExprContext)_localctx).ID = match(ID);
				setState(184);
				match(T__14);
				setState(185);
				((ExprContext)_localctx).expr = expr(33);
				if(map.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null))!=((ExprContext)_localctx).expr.i){((ExprContext)_localctx).a = true;}else{((ExprContext)_localctx).a = false;}
				}
				break;
			case 13:
				{
				setState(188);
				((ExprContext)_localctx).ID = match(ID);
				setState(189);
				match(T__15);
				setState(190);
				((ExprContext)_localctx).expr = expr(32);
				if(map.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null))==((ExprContext)_localctx).expr.i){((ExprContext)_localctx).a = true;}else{((ExprContext)_localctx).a = false;}
				}
				break;
			case 14:
				{
				setState(193);
				((ExprContext)_localctx).ID = match(ID);
				setState(194);
				match(AND);
				setState(195);
				match(TRUE);
				if(map2.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)) && true){((ExprContext)_localctx).a = true;}else{((ExprContext)_localctx).a = false;}
				}
				break;
			case 15:
				{
				setState(197);
				match(TRUE);
				setState(198);
				match(AND);
				setState(199);
				((ExprContext)_localctx).ID = match(ID);
				if(map2.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)) && true){((ExprContext)_localctx).a = true;}else{((ExprContext)_localctx).a = false;}
				}
				break;
			case 16:
				{
				setState(201);
				((ExprContext)_localctx).ID = match(ID);
				setState(202);
				match(AND);
				setState(203);
				match(FALSE);
				if(map2.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)) && false){((ExprContext)_localctx).a = false;}else{((ExprContext)_localctx).a = true;}
				}
				break;
			case 17:
				{
				setState(205);
				match(FALSE);
				setState(206);
				match(AND);
				setState(207);
				((ExprContext)_localctx).ID = match(ID);
				if(map2.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)) && false){((ExprContext)_localctx).a = false;}else{((ExprContext)_localctx).a = true;}
				}
				break;
			case 18:
				{
				setState(209);
				((ExprContext)_localctx).ID = match(ID);
				setState(210);
				match(OR);
				setState(211);
				match(TRUE);
				if(map2.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)) || true){((ExprContext)_localctx).a = true;}else{((ExprContext)_localctx).a = false;}
				}
				break;
			case 19:
				{
				setState(213);
				match(TRUE);
				setState(214);
				match(OR);
				setState(215);
				((ExprContext)_localctx).ID = match(ID);
				if(map2.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)) || true){((ExprContext)_localctx).a = true;}else{((ExprContext)_localctx).a = false;}
				}
				break;
			case 20:
				{
				setState(217);
				((ExprContext)_localctx).ID = match(ID);
				setState(218);
				match(OR);
				setState(219);
				match(FALSE);
				if(map2.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)) || false){((ExprContext)_localctx).a = true;}else{((ExprContext)_localctx).a = false;}
				}
				break;
			case 21:
				{
				setState(221);
				match(FALSE);
				setState(222);
				match(OR);
				setState(223);
				((ExprContext)_localctx).ID = match(ID);
				if(map2.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)) || false){((ExprContext)_localctx).a = true;}else{((ExprContext)_localctx).a = false;}
				}
				break;
			case 22:
				{
				setState(225);
				((ExprContext)_localctx).e3 = match(ID);
				setState(226);
				match(AND);
				setState(227);
				((ExprContext)_localctx).e4 = match(ID);
				if(map2.get((((ExprContext)_localctx).e3!=null?((ExprContext)_localctx).e3.getText():null)) && map2.get((((ExprContext)_localctx).e4!=null?((ExprContext)_localctx).e4.getText():null))){((ExprContext)_localctx).a = true;}else{((ExprContext)_localctx).a = false;}
				}
				break;
			case 23:
				{
				setState(229);
				((ExprContext)_localctx).e3 = match(ID);
				setState(230);
				match(OR);
				setState(231);
				((ExprContext)_localctx).e4 = match(ID);
				if(map2.get((((ExprContext)_localctx).e3!=null?((ExprContext)_localctx).e3.getText():null)) || map2.get((((ExprContext)_localctx).e4!=null?((ExprContext)_localctx).e4.getText():null))){((ExprContext)_localctx).a = true;}else{((ExprContext)_localctx).a = false;}
				}
				break;
			case 24:
				{
				setState(233);
				match(SIN);
				setState(234);
				((ExprContext)_localctx).ID = match(ID);
				setState(235);
				match(T__1);
				((ExprContext)_localctx).i =  Math.sin(map.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)));
				}
				break;
			case 25:
				{
				setState(237);
				match(COS);
				setState(238);
				((ExprContext)_localctx).ID = match(ID);
				setState(239);
				match(T__1);
				((ExprContext)_localctx).i =  Math.cos(map.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)));
				}
				break;
			case 26:
				{
				setState(241);
				match(EXP);
				setState(242);
				((ExprContext)_localctx).ID = match(ID);
				setState(243);
				match(T__1);
				((ExprContext)_localctx).i =  Math.exp(map.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)));
				}
				break;
			case 27:
				{
				setState(245);
				match(LN);
				setState(246);
				((ExprContext)_localctx).ID = match(ID);
				setState(247);
				match(T__1);
				((ExprContext)_localctx).i =  Math.log(map.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)));
				}
				break;
			case 28:
				{
				setState(249);
				match(SIN);
				setState(250);
				((ExprContext)_localctx).expr = expr(0);
				setState(251);
				match(T__1);
				((ExprContext)_localctx).i =  Math.sin(((ExprContext)_localctx).expr.i);
				}
				break;
			case 29:
				{
				setState(254);
				match(COS);
				setState(255);
				((ExprContext)_localctx).expr = expr(0);
				setState(256);
				match(T__1);
				((ExprContext)_localctx).i =  Math.cos(((ExprContext)_localctx).expr.i);
				}
				break;
			case 30:
				{
				setState(259);
				match(EXP);
				setState(260);
				((ExprContext)_localctx).expr = expr(0);
				setState(261);
				match(T__1);
				((ExprContext)_localctx).i =  Math.exp(((ExprContext)_localctx).expr.i);
				}
				break;
			case 31:
				{
				setState(264);
				match(LN);
				setState(265);
				((ExprContext)_localctx).expr = expr(0);
				setState(266);
				match(T__1);
				((ExprContext)_localctx).i =  Math.log(((ExprContext)_localctx).expr.i);
				}
				break;
			case 32:
				{
				setState(269);
				match(WRITE);
				setState(270);
				((ExprContext)_localctx).ID = match(ID);
				setState(271);
				match(T__1);

				        if(map.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null))!=null && map2.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null))==null ){
				             System.out.println(map.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)));
				        }
				        else if(map2.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null))!=null && map.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null))==null ){ 
				            System.out.println(map2.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)));
				        }
				        else{
				             System.out.println(map.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)));
				        }
				    
				}
				break;
			case 33:
				{
				setState(273);
				match(WRITE);
				setState(274);
				((ExprContext)_localctx).expr = expr(0);
				setState(275);
				match(T__1);

				        if(((ExprContext)_localctx).expr.a){
				            System.out.println(((ExprContext)_localctx).expr.a);
				        }
				        else{
				            System.out.println(((ExprContext)_localctx).expr.i);
				        }
				        
				}
				break;
			case 34:
				{
				setState(278);
				match(WRITE);
				setState(279);
				match(T__16);
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(280);
					((ExprContext)_localctx).ID = match(ID);
					}
					}
					setState(285);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(286);
				match(T__16);
				setState(287);
				match(T__1);

				        System.out.println((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null));
				        
				}
				break;
			case 35:
				{
				setState(289);
				match(READ);
				setState(290);
				((ExprContext)_localctx).ID = match(ID);
				setState(291);
				match(T__1);
				((ExprContext)_localctx).i =  scnr.nextDouble(); map.put((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null),_localctx.i);
				}
				break;
			case 36:
				{
				setState(293);
				((ExprContext)_localctx).DOUBLE = match(DOUBLE);
				 ((ExprContext)_localctx).i =  Double.parseDouble((((ExprContext)_localctx).DOUBLE!=null?((ExprContext)_localctx).DOUBLE.getText():null)); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(384);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(382);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(297);
						if (!(precpred(_ctx, 51))) throw new FailedPredicateException(this, "precpred(_ctx, 51)");
						setState(298);
						match(T__5);
						setState(299);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(52);
						 ((ExprContext)_localctx).i =  ((ExprContext)_localctx).el.i * ((ExprContext)_localctx).er.i;
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(302);
						if (!(precpred(_ctx, 47))) throw new FailedPredicateException(this, "precpred(_ctx, 47)");
						setState(303);
						match(T__6);
						setState(304);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(48);
						 ((ExprContext)_localctx).i =  ((ExprContext)_localctx).el.i / ((ExprContext)_localctx).er.i; 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(307);
						if (!(precpred(_ctx, 44))) throw new FailedPredicateException(this, "precpred(_ctx, 44)");
						setState(308);
						match(T__7);
						setState(309);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(45);
						 ((ExprContext)_localctx).i =  ((ExprContext)_localctx).el.i % ((ExprContext)_localctx).er.i; 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(312);
						if (!(precpred(_ctx, 41))) throw new FailedPredicateException(this, "precpred(_ctx, 41)");
						setState(313);
						match(T__8);
						setState(314);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(42);
						 ((ExprContext)_localctx).i =  ((ExprContext)_localctx).el.i + ((ExprContext)_localctx).er.i; 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(317);
						if (!(precpred(_ctx, 38))) throw new FailedPredicateException(this, "precpred(_ctx, 38)");
						setState(318);
						match(T__9);
						setState(319);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(39);
						 ((ExprContext)_localctx).i =  ((ExprContext)_localctx).el.i - ((ExprContext)_localctx).er.i; 
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(322);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(323);
						((ExprContext)_localctx).op = match(T__10);
						setState(324);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(32);
						if(((ExprContext)_localctx).el.i > ((ExprContext)_localctx).er.i){((ExprContext)_localctx).a = true;}else{((ExprContext)_localctx).a = false;}
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(327);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(328);
						((ExprContext)_localctx).op = match(T__11);
						setState(329);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(31);
						if(((ExprContext)_localctx).el.i < ((ExprContext)_localctx).er.i){((ExprContext)_localctx).a = true;}else{((ExprContext)_localctx).a = false;}
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(332);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(333);
						((ExprContext)_localctx).op = match(T__12);
						setState(334);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(30);
						if(((ExprContext)_localctx).el.i >= ((ExprContext)_localctx).er.i){((ExprContext)_localctx).a = true;}else{((ExprContext)_localctx).a = false;}
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(337);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(338);
						((ExprContext)_localctx).op = match(T__13);
						setState(339);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(29);
						if(((ExprContext)_localctx).el.i <= ((ExprContext)_localctx).er.i){((ExprContext)_localctx).a = true;}else{((ExprContext)_localctx).a = false;}
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(342);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(343);
						((ExprContext)_localctx).op = match(T__14);
						setState(344);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(28);
						if(((ExprContext)_localctx).el.i != ((ExprContext)_localctx).er.i){((ExprContext)_localctx).a = true;}else{((ExprContext)_localctx).a = false;}
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(347);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(348);
						((ExprContext)_localctx).op = match(T__15);
						setState(349);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(27);
						if(((ExprContext)_localctx).el.i == ((ExprContext)_localctx).er.i){((ExprContext)_localctx).a = true;}else{((ExprContext)_localctx).a = false;}
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(352);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(353);
						((ExprContext)_localctx).op = match(AND);
						setState(354);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(16);
						if(((ExprContext)_localctx).el.a && ((ExprContext)_localctx).er.a){((ExprContext)_localctx).a = true;}else{((ExprContext)_localctx).a = false;}
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(357);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(358);
						((ExprContext)_localctx).op = match(OR);
						setState(359);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(15);
						if(((ExprContext)_localctx).el.a || ((ExprContext)_localctx).er.a){((ExprContext)_localctx).a = true;}else{((ExprContext)_localctx).a = false;}
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(362);
						if (!(precpred(_ctx, 50))) throw new FailedPredicateException(this, "precpred(_ctx, 50)");
						setState(363);
						match(T__5);
						setState(364);
						((ExprContext)_localctx).ID = match(ID);
						((ExprContext)_localctx).i =  map.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)) * ((ExprContext)_localctx).expr.i;
						}
						break;
					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(366);
						if (!(precpred(_ctx, 48))) throw new FailedPredicateException(this, "precpred(_ctx, 48)");
						setState(367);
						match(T__6);
						setState(368);
						((ExprContext)_localctx).ID = match(ID);
						((ExprContext)_localctx).i =  ((ExprContext)_localctx).expr.i / map.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null));
						}
						break;
					case 16:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(370);
						if (!(precpred(_ctx, 45))) throw new FailedPredicateException(this, "precpred(_ctx, 45)");
						setState(371);
						match(T__7);
						setState(372);
						((ExprContext)_localctx).ID = match(ID);
						((ExprContext)_localctx).i =  ((ExprContext)_localctx).expr.i % map.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null));
						}
						break;
					case 17:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(374);
						if (!(precpred(_ctx, 42))) throw new FailedPredicateException(this, "precpred(_ctx, 42)");
						setState(375);
						match(T__8);
						setState(376);
						((ExprContext)_localctx).ID = match(ID);
						((ExprContext)_localctx).i =  map.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)) + ((ExprContext)_localctx).expr.i;
						}
						break;
					case 18:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(378);
						if (!(precpred(_ctx, 39))) throw new FailedPredicateException(this, "precpred(_ctx, 39)");
						setState(379);
						match(T__9);
						setState(380);
						((ExprContext)_localctx).ID = match(ID);
						((ExprContext)_localctx).i =  ((ExprContext)_localctx).expr.i  - map.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null));
						}
						break;
					}
					} 
				}
				setState(386);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 51);
		case 1:
			return precpred(_ctx, 47);
		case 2:
			return precpred(_ctx, 44);
		case 3:
			return precpred(_ctx, 41);
		case 4:
			return precpred(_ctx, 38);
		case 5:
			return precpred(_ctx, 31);
		case 6:
			return precpred(_ctx, 30);
		case 7:
			return precpred(_ctx, 29);
		case 8:
			return precpred(_ctx, 28);
		case 9:
			return precpred(_ctx, 27);
		case 10:
			return precpred(_ctx, 26);
		case 11:
			return precpred(_ctx, 15);
		case 12:
			return precpred(_ctx, 14);
		case 13:
			return precpred(_ctx, 50);
		case 14:
			return precpred(_ctx, 48);
		case 15:
			return precpred(_ctx, 45);
		case 16:
			return precpred(_ctx, 42);
		case 17:
			return precpred(_ctx, 39);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0186\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3,\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5>\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6H\n\6\3\6\3\6\3\6\3\6\5\6N\n\6\5\6P\n\6\3\7\3\7\3\7\3\7\6\7V\n\7"+
		"\r\7\16\7W\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u011c\n\21\f\21\16"+
		"\21\u011f\13\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u012a"+
		"\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\7\21\u0181\n\21\f\21\16\21\u0184\13\21\3\21\2\3 \22\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \2\2\2\u01bb\2\"\3\2\2\2\4+\3\2\2\2\6"+
		"-\3\2\2\2\b=\3\2\2\2\n?\3\2\2\2\fQ\3\2\2\2\16Y\3\2\2\2\20]\3\2\2\2\22"+
		"c\3\2\2\2\24i\3\2\2\2\26o\3\2\2\2\30u\3\2\2\2\32y\3\2\2\2\34|\3\2\2\2"+
		"\36\177\3\2\2\2 \u0129\3\2\2\2\"#\5\4\3\2#$\7\2\2\3$\3\3\2\2\2%,\5\6\4"+
		"\2&\'\5\b\5\2\'(\5\4\3\2(,\3\2\2\2),\5\b\5\2*,\3\2\2\2+%\3\2\2\2+&\3\2"+
		"\2\2+)\3\2\2\2+*\3\2\2\2,\5\3\2\2\2-.\7\24\2\2./\5\4\3\2/\60\7\25\2\2"+
		"\60\61\5\2\2\2\61\62\b\4\1\2\62\7\3\2\2\2\63>\5\n\6\2\64>\5\36\20\2\65"+
		">\5\f\7\2\66>\5\24\13\2\67>\5\32\16\28>\5\30\r\29>\5\20\t\2:>\5\22\n\2"+
		";>\5\34\17\2<>\5\26\f\2=\63\3\2\2\2=\64\3\2\2\2=\65\3\2\2\2=\66\3\2\2"+
		"\2=\67\3\2\2\2=8\3\2\2\2=9\3\2\2\2=:\3\2\2\2=;\3\2\2\2=<\3\2\2\2>\t\3"+
		"\2\2\2?@\7\26\2\2@A\7\3\2\2AB\5 \21\2BC\7\4\2\2CD\7\27\2\2DG\b\6\1\2E"+
		"H\5\b\5\2FH\3\2\2\2GE\3\2\2\2GF\3\2\2\2HO\3\2\2\2IJ\7\30\2\2JM\b\6\1\2"+
		"KN\5\b\5\2LN\3\2\2\2MK\3\2\2\2ML\3\2\2\2NP\3\2\2\2OI\3\2\2\2OP\3\2\2\2"+
		"P\13\3\2\2\2QR\7\31\2\2RS\7*\2\2SU\7\32\2\2TV\5\16\b\2UT\3\2\2\2VW\3\2"+
		"\2\2WU\3\2\2\2WX\3\2\2\2X\r\3\2\2\2YZ\5 \21\2Z[\7\5\2\2[\\\5\b\5\2\\\17"+
		"\3\2\2\2]^\7*\2\2^_\7\6\2\2_`\7\33\2\2`a\7\7\2\2ab\b\t\1\2b\21\3\2\2\2"+
		"cd\7*\2\2de\7\6\2\2ef\7\34\2\2fg\7\7\2\2gh\b\n\1\2h\23\3\2\2\2ij\7*\2"+
		"\2jk\7\6\2\2kl\7*\2\2lm\7\7\2\2mn\b\13\1\2n\25\3\2\2\2op\7*\2\2pq\7\6"+
		"\2\2qr\5 \21\2rs\7\7\2\2st\b\f\1\2t\27\3\2\2\2uv\5 \21\2vw\7\7\2\2wx\b"+
		"\r\1\2x\31\3\2\2\2yz\7)\2\2z{\b\16\1\2{\33\3\2\2\2|}\7(\2\2}~\b\17\1\2"+
		"~\35\3\2\2\2\177\u0080\7!\2\2\u0080\u0081\7*\2\2\u0081\u0082\7\7\2\2\u0082"+
		"\u0083\b\20\1\2\u0083\37\3\2\2\2\u0084\u0085\b\21\1\2\u0085\u0086\7\3"+
		"\2\2\u0086\u0087\5 \21\2\u0087\u0088\7\4\2\2\u0088\u0089\b\21\1\2\u0089"+
		"\u012a\3\2\2\2\u008a\u008b\7*\2\2\u008b\u012a\b\21\1\2\u008c\u008d\7*"+
		"\2\2\u008d\u008e\7\b\2\2\u008e\u008f\5 \21\66\u008f\u0090\b\21\1\2\u0090"+
		"\u012a\3\2\2\2\u0091\u0092\7*\2\2\u0092\u0093\7\t\2\2\u0093\u0094\5 \21"+
		"\63\u0094\u0095\b\21\1\2\u0095\u012a\3\2\2\2\u0096\u0097\7*\2\2\u0097"+
		"\u0098\7\n\2\2\u0098\u0099\5 \21\60\u0099\u009a\b\21\1\2\u009a\u012a\3"+
		"\2\2\2\u009b\u009c\7*\2\2\u009c\u009d\7\13\2\2\u009d\u009e\5 \21-\u009e"+
		"\u009f\b\21\1\2\u009f\u012a\3\2\2\2\u00a0\u00a1\7*\2\2\u00a1\u00a2\7\f"+
		"\2\2\u00a2\u00a3\5 \21*\u00a3\u00a4\b\21\1\2\u00a4\u012a\3\2\2\2\u00a5"+
		"\u00a6\7*\2\2\u00a6\u00a7\7\r\2\2\u00a7\u00a8\5 \21\'\u00a8\u00a9\b\21"+
		"\1\2\u00a9\u012a\3\2\2\2\u00aa\u00ab\7*\2\2\u00ab\u00ac\7\16\2\2\u00ac"+
		"\u00ad\5 \21&\u00ad\u00ae\b\21\1\2\u00ae\u012a\3\2\2\2\u00af\u00b0\7*"+
		"\2\2\u00b0\u00b1\7\17\2\2\u00b1\u00b2\5 \21%\u00b2\u00b3\b\21\1\2\u00b3"+
		"\u012a\3\2\2\2\u00b4\u00b5\7*\2\2\u00b5\u00b6\7\20\2\2\u00b6\u00b7\5 "+
		"\21$\u00b7\u00b8\b\21\1\2\u00b8\u012a\3\2\2\2\u00b9\u00ba\7*\2\2\u00ba"+
		"\u00bb\7\21\2\2\u00bb\u00bc\5 \21#\u00bc\u00bd\b\21\1\2\u00bd\u012a\3"+
		"\2\2\2\u00be\u00bf\7*\2\2\u00bf\u00c0\7\22\2\2\u00c0\u00c1\5 \21\"\u00c1"+
		"\u00c2\b\21\1\2\u00c2\u012a\3\2\2\2\u00c3\u00c4\7*\2\2\u00c4\u00c5\7\35"+
		"\2\2\u00c5\u00c6\7\33\2\2\u00c6\u012a\b\21\1\2\u00c7\u00c8\7\33\2\2\u00c8"+
		"\u00c9\7\35\2\2\u00c9\u00ca\7*\2\2\u00ca\u012a\b\21\1\2\u00cb\u00cc\7"+
		"*\2\2\u00cc\u00cd\7\35\2\2\u00cd\u00ce\7\34\2\2\u00ce\u012a\b\21\1\2\u00cf"+
		"\u00d0\7\34\2\2\u00d0\u00d1\7\35\2\2\u00d1\u00d2\7*\2\2\u00d2\u012a\b"+
		"\21\1\2\u00d3\u00d4\7*\2\2\u00d4\u00d5\7\36\2\2\u00d5\u00d6\7\33\2\2\u00d6"+
		"\u012a\b\21\1\2\u00d7\u00d8\7\33\2\2\u00d8\u00d9\7\36\2\2\u00d9\u00da"+
		"\7*\2\2\u00da\u012a\b\21\1\2\u00db\u00dc\7*\2\2\u00dc\u00dd\7\36\2\2\u00dd"+
		"\u00de\7\34\2\2\u00de\u012a\b\21\1\2\u00df\u00e0\7\34\2\2\u00e0\u00e1"+
		"\7\36\2\2\u00e1\u00e2\7*\2\2\u00e2\u012a\b\21\1\2\u00e3\u00e4\7*\2\2\u00e4"+
		"\u00e5\7\35\2\2\u00e5\u00e6\7*\2\2\u00e6\u012a\b\21\1\2\u00e7\u00e8\7"+
		"*\2\2\u00e8\u00e9\7\36\2\2\u00e9\u00ea\7*\2\2\u00ea\u012a\b\21\1\2\u00eb"+
		"\u00ec\7 \2\2\u00ec\u00ed\7*\2\2\u00ed\u00ee\7\4\2\2\u00ee\u012a\b\21"+
		"\1\2\u00ef\u00f0\7\"\2\2\u00f0\u00f1\7*\2\2\u00f1\u00f2\7\4\2\2\u00f2"+
		"\u012a\b\21\1\2\u00f3\u00f4\7#\2\2\u00f4\u00f5\7*\2\2\u00f5\u00f6\7\4"+
		"\2\2\u00f6\u012a\b\21\1\2\u00f7\u00f8\7$\2\2\u00f8\u00f9\7*\2\2\u00f9"+
		"\u00fa\7\4\2\2\u00fa\u012a\b\21\1\2\u00fb\u00fc\7 \2\2\u00fc\u00fd\5 "+
		"\21\2\u00fd\u00fe\7\4\2\2\u00fe\u00ff\b\21\1\2\u00ff\u012a\3\2\2\2\u0100"+
		"\u0101\7\"\2\2\u0101\u0102\5 \21\2\u0102\u0103\7\4\2\2\u0103\u0104\b\21"+
		"\1\2\u0104\u012a\3\2\2\2\u0105\u0106\7#\2\2\u0106\u0107\5 \21\2\u0107"+
		"\u0108\7\4\2\2\u0108\u0109\b\21\1\2\u0109\u012a\3\2\2\2\u010a\u010b\7"+
		"$\2\2\u010b\u010c\5 \21\2\u010c\u010d\7\4\2\2\u010d\u010e\b\21\1\2\u010e"+
		"\u012a\3\2\2\2\u010f\u0110\7&\2\2\u0110\u0111\7*\2\2\u0111\u0112\7\4\2"+
		"\2\u0112\u012a\b\21\1\2\u0113\u0114\7&\2\2\u0114\u0115\5 \21\2\u0115\u0116"+
		"\7\4\2\2\u0116\u0117\b\21\1\2\u0117\u012a\3\2\2\2\u0118\u0119\7&\2\2\u0119"+
		"\u011d\7\23\2\2\u011a\u011c\7*\2\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2"+
		"\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f"+
		"\u011d\3\2\2\2\u0120\u0121\7\23\2\2\u0121\u0122\7\4\2\2\u0122\u012a\b"+
		"\21\1\2\u0123\u0124\7%\2\2\u0124\u0125\7*\2\2\u0125\u0126\7\4\2\2\u0126"+
		"\u012a\b\21\1\2\u0127\u0128\7\'\2\2\u0128\u012a\b\21\1\2\u0129\u0084\3"+
		"\2\2\2\u0129\u008a\3\2\2\2\u0129\u008c\3\2\2\2\u0129\u0091\3\2\2\2\u0129"+
		"\u0096\3\2\2\2\u0129\u009b\3\2\2\2\u0129\u00a0\3\2\2\2\u0129\u00a5\3\2"+
		"\2\2\u0129\u00aa\3\2\2\2\u0129\u00af\3\2\2\2\u0129\u00b4\3\2\2\2\u0129"+
		"\u00b9\3\2\2\2\u0129\u00be\3\2\2\2\u0129\u00c3\3\2\2\2\u0129\u00c7\3\2"+
		"\2\2\u0129\u00cb\3\2\2\2\u0129\u00cf\3\2\2\2\u0129\u00d3\3\2\2\2\u0129"+
		"\u00d7\3\2\2\2\u0129\u00db\3\2\2\2\u0129\u00df\3\2\2\2\u0129\u00e3\3\2"+
		"\2\2\u0129\u00e7\3\2\2\2\u0129\u00eb\3\2\2\2\u0129\u00ef\3\2\2\2\u0129"+
		"\u00f3\3\2\2\2\u0129\u00f7\3\2\2\2\u0129\u00fb\3\2\2\2\u0129\u0100\3\2"+
		"\2\2\u0129\u0105\3\2\2\2\u0129\u010a\3\2\2\2\u0129\u010f\3\2\2\2\u0129"+
		"\u0113\3\2\2\2\u0129\u0118\3\2\2\2\u0129\u0123\3\2\2\2\u0129\u0127\3\2"+
		"\2\2\u012a\u0182\3\2\2\2\u012b\u012c\f\65\2\2\u012c\u012d\7\b\2\2\u012d"+
		"\u012e\5 \21\66\u012e\u012f\b\21\1\2\u012f\u0181\3\2\2\2\u0130\u0131\f"+
		"\61\2\2\u0131\u0132\7\t\2\2\u0132\u0133\5 \21\62\u0133\u0134\b\21\1\2"+
		"\u0134\u0181\3\2\2\2\u0135\u0136\f.\2\2\u0136\u0137\7\n\2\2\u0137\u0138"+
		"\5 \21/\u0138\u0139\b\21\1\2\u0139\u0181\3\2\2\2\u013a\u013b\f+\2\2\u013b"+
		"\u013c\7\13\2\2\u013c\u013d\5 \21,\u013d\u013e\b\21\1\2\u013e\u0181\3"+
		"\2\2\2\u013f\u0140\f(\2\2\u0140\u0141\7\f\2\2\u0141\u0142\5 \21)\u0142"+
		"\u0143\b\21\1\2\u0143\u0181\3\2\2\2\u0144\u0145\f!\2\2\u0145\u0146\7\r"+
		"\2\2\u0146\u0147\5 \21\"\u0147\u0148\b\21\1\2\u0148\u0181\3\2\2\2\u0149"+
		"\u014a\f \2\2\u014a\u014b\7\16\2\2\u014b\u014c\5 \21!\u014c\u014d\b\21"+
		"\1\2\u014d\u0181\3\2\2\2\u014e\u014f\f\37\2\2\u014f\u0150\7\17\2\2\u0150"+
		"\u0151\5 \21 \u0151\u0152\b\21\1\2\u0152\u0181\3\2\2\2\u0153\u0154\f\36"+
		"\2\2\u0154\u0155\7\20\2\2\u0155\u0156\5 \21\37\u0156\u0157\b\21\1\2\u0157"+
		"\u0181\3\2\2\2\u0158\u0159\f\35\2\2\u0159\u015a\7\21\2\2\u015a\u015b\5"+
		" \21\36\u015b\u015c\b\21\1\2\u015c\u0181\3\2\2\2\u015d\u015e\f\34\2\2"+
		"\u015e\u015f\7\22\2\2\u015f\u0160\5 \21\35\u0160\u0161\b\21\1\2\u0161"+
		"\u0181\3\2\2\2\u0162\u0163\f\21\2\2\u0163\u0164\7\35\2\2\u0164\u0165\5"+
		" \21\22\u0165\u0166\b\21\1\2\u0166\u0181\3\2\2\2\u0167\u0168\f\20\2\2"+
		"\u0168\u0169\7\36\2\2\u0169\u016a\5 \21\21\u016a\u016b\b\21\1\2\u016b"+
		"\u0181\3\2\2\2\u016c\u016d\f\64\2\2\u016d\u016e\7\b\2\2\u016e\u016f\7"+
		"*\2\2\u016f\u0181\b\21\1\2\u0170\u0171\f\62\2\2\u0171\u0172\7\t\2\2\u0172"+
		"\u0173\7*\2\2\u0173\u0181\b\21\1\2\u0174\u0175\f/\2\2\u0175\u0176\7\n"+
		"\2\2\u0176\u0177\7*\2\2\u0177\u0181\b\21\1\2\u0178\u0179\f,\2\2\u0179"+
		"\u017a\7\13\2\2\u017a\u017b\7*\2\2\u017b\u0181\b\21\1\2\u017c\u017d\f"+
		")\2\2\u017d\u017e\7\f\2\2\u017e\u017f\7*\2\2\u017f\u0181\b\21\1\2\u0180"+
		"\u012b\3\2\2\2\u0180\u0130\3\2\2\2\u0180\u0135\3\2\2\2\u0180\u013a\3\2"+
		"\2\2\u0180\u013f\3\2\2\2\u0180\u0144\3\2\2\2\u0180\u0149\3\2\2\2\u0180"+
		"\u014e\3\2\2\2\u0180\u0153\3\2\2\2\u0180\u0158\3\2\2\2\u0180\u015d\3\2"+
		"\2\2\u0180\u0162\3\2\2\2\u0180\u0167\3\2\2\2\u0180\u016c\3\2\2\2\u0180"+
		"\u0170\3\2\2\2\u0180\u0174\3\2\2\2\u0180\u0178\3\2\2\2\u0180\u017c\3\2"+
		"\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183"+
		"!\3\2\2\2\u0184\u0182\3\2\2\2\f+=GMOW\u011d\u0129\u0180\u0182";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}