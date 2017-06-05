// Generated from E:/gitHub/NewLanguage/src\BroLanguage.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BroLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		INT=25, ID=26, BOOL=27, STRING=28, WS=29, VAR=30, COMMENT=31, PARAM=32;
	public static final int
		RULE_prog = 0, RULE_statment = 1, RULE_mathExpr = 2, RULE_logicalExpr = 3, 
		RULE_print = 4, RULE_initializeVar = 5, RULE_assignVar = 6, RULE_initializeMethod = 7, 
		RULE_callMethod = 8, RULE_logicalOperation = 9, RULE_loop = 10, RULE_ifStatment = 11;
	public static final String[] ruleNames = {
		"prog", "statment", "mathExpr", "logicalExpr", "print", "initializeVar", 
		"assignVar", "initializeMethod", "callMethod", "logicalOperation", "loop", 
		"ifStatment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "')'", "'-'", "'*'", "'/'", "'%'", "'+'", "'&&'", 
		"'|'", "'broSay'", "'='", "'BroVoid'", "'){'", "'}'", "');'", "'=='", 
		"'!='", "'>='", "'<='", "'<'", "'>'", "'whileBro{'", "'if('"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "INT", "ID", "BOOL", "STRING", "WS", "VAR", "COMMENT", "PARAM"
	};
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
	public String getGrammarFileName() { return "BroLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BroLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BroLanguageListener ) ((BroLanguageListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BroLanguageListener ) ((BroLanguageListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BroLanguageVisitor ) return ((BroLanguageVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				statment();
				setState(25);
				match(T__0);
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__10) | (1L << T__12) | (1L << T__22) | (1L << T__23) | (1L << INT) | (1L << ID) | (1L << VAR))) != 0) );
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

	public static class StatmentContext extends ParserRuleContext {
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public InitializeVarContext initializeVar() {
			return getRuleContext(InitializeVarContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public AssignVarContext assignVar() {
			return getRuleContext(AssignVarContext.class,0);
		}
		public IfStatmentContext ifStatment() {
			return getRuleContext(IfStatmentContext.class,0);
		}
		public CallMethodContext callMethod() {
			return getRuleContext(CallMethodContext.class,0);
		}
		public InitializeMethodContext initializeMethod() {
			return getRuleContext(InitializeMethodContext.class,0);
		}
		public StatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BroLanguageListener ) ((BroLanguageListener)listener).enterStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BroLanguageListener ) ((BroLanguageListener)listener).exitStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BroLanguageVisitor ) return ((BroLanguageVisitor<? extends T>)visitor).visitStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatmentContext statment() throws RecognitionException {
		StatmentContext _localctx = new StatmentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statment);
		try {
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				mathExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				initializeVar();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				print();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(34);
				loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(35);
				assignVar();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(36);
				ifStatment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(37);
				callMethod();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(38);
				initializeMethod();
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

	public static class MathExprContext extends ParserRuleContext {
		public List<MathExprContext> mathExpr() {
			return getRuleContexts(MathExprContext.class);
		}
		public MathExprContext mathExpr(int i) {
			return getRuleContext(MathExprContext.class,i);
		}
		public TerminalNode INT() { return getToken(BroLanguageParser.INT, 0); }
		public TerminalNode ID() { return getToken(BroLanguageParser.ID, 0); }
		public MathExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BroLanguageListener ) ((BroLanguageListener)listener).enterMathExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BroLanguageListener ) ((BroLanguageListener)listener).exitMathExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BroLanguageVisitor ) return ((BroLanguageVisitor<? extends T>)visitor).visitMathExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathExprContext mathExpr() throws RecognitionException {
		return mathExpr(0);
	}

	private MathExprContext mathExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MathExprContext _localctx = new MathExprContext(_ctx, _parentState);
		MathExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_mathExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(42);
				match(T__1);
				setState(43);
				mathExpr(0);
				setState(44);
				match(T__2);
				}
				break;
			case T__3:
				{
				setState(46);
				match(T__3);
				setState(47);
				mathExpr(5);
				}
				break;
			case INT:
				{
				setState(48);
				match(INT);
				}
				break;
			case ID:
				{
				setState(49);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(58);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MathExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpr);
						setState(52);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(53);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(54);
						mathExpr(5);
						}
						break;
					case 2:
						{
						_localctx = new MathExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpr);
						setState(55);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(56);
						_la = _input.LA(1);
						if ( !(_la==T__3 || _la==T__7) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(57);
						mathExpr(4);
						}
						break;
					}
					} 
				}
				setState(62);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class LogicalExprContext extends ParserRuleContext {
		public List<MathExprContext> mathExpr() {
			return getRuleContexts(MathExprContext.class);
		}
		public MathExprContext mathExpr(int i) {
			return getRuleContext(MathExprContext.class,i);
		}
		public LogicalOperationContext logicalOperation() {
			return getRuleContext(LogicalOperationContext.class,0);
		}
		public List<TerminalNode> STRING() { return getTokens(BroLanguageParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(BroLanguageParser.STRING, i);
		}
		public List<TerminalNode> BOOL() { return getTokens(BroLanguageParser.BOOL); }
		public TerminalNode BOOL(int i) {
			return getToken(BroLanguageParser.BOOL, i);
		}
		public List<LogicalExprContext> logicalExpr() {
			return getRuleContexts(LogicalExprContext.class);
		}
		public LogicalExprContext logicalExpr(int i) {
			return getRuleContext(LogicalExprContext.class,i);
		}
		public LogicalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BroLanguageListener ) ((BroLanguageListener)listener).enterLogicalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BroLanguageListener ) ((BroLanguageListener)listener).exitLogicalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BroLanguageVisitor ) return ((BroLanguageVisitor<? extends T>)visitor).visitLogicalExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalExprContext logicalExpr() throws RecognitionException {
		return logicalExpr(0);
	}

	private LogicalExprContext logicalExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalExprContext _localctx = new LogicalExprContext(_ctx, _parentState);
		LogicalExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_logicalExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(64);
				mathExpr(0);
				setState(65);
				logicalOperation();
				setState(66);
				mathExpr(0);
				}
				break;
			case 2:
				{
				setState(68);
				match(STRING);
				setState(69);
				logicalOperation();
				setState(70);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(72);
				match(BOOL);
				setState(73);
				logicalOperation();
				setState(74);
				match(BOOL);
				}
				break;
			case 4:
				{
				setState(76);
				match(BOOL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalExpr);
					setState(79);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(80);
					_la = _input.LA(1);
					if ( !(_la==T__8 || _la==T__9) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(81);
					logicalExpr(6);
					}
					} 
				}
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class PrintContext extends ParserRuleContext {
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(BroLanguageParser.STRING, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BroLanguageListener ) ((BroLanguageListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BroLanguageListener ) ((BroLanguageListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BroLanguageVisitor ) return ((BroLanguageVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__10);
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__3:
			case INT:
			case ID:
				{
				setState(88);
				mathExpr(0);
				}
				break;
			case STRING:
				{
				setState(89);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class InitializeVarContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(BroLanguageParser.VAR, 0); }
		public TerminalNode ID() { return getToken(BroLanguageParser.ID, 0); }
		public TerminalNode BOOL() { return getToken(BroLanguageParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(BroLanguageParser.STRING, 0); }
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public InitializeVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializeVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BroLanguageListener ) ((BroLanguageListener)listener).enterInitializeVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BroLanguageListener ) ((BroLanguageListener)listener).exitInitializeVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BroLanguageVisitor ) return ((BroLanguageVisitor<? extends T>)visitor).visitInitializeVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializeVarContext initializeVar() throws RecognitionException {
		InitializeVarContext _localctx = new InitializeVarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_initializeVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(VAR);
			setState(93);
			match(ID);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(94);
				match(T__11);
				setState(98);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOL:
					{
					setState(95);
					match(BOOL);
					}
					break;
				case STRING:
					{
					setState(96);
					match(STRING);
					}
					break;
				case T__1:
				case T__3:
				case INT:
				case ID:
					{
					setState(97);
					mathExpr(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
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

	public static class AssignVarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BroLanguageParser.ID, 0); }
		public TerminalNode BOOL() { return getToken(BroLanguageParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(BroLanguageParser.STRING, 0); }
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public AssignVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BroLanguageListener ) ((BroLanguageListener)listener).enterAssignVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BroLanguageListener ) ((BroLanguageListener)listener).exitAssignVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BroLanguageVisitor ) return ((BroLanguageVisitor<? extends T>)visitor).visitAssignVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignVarContext assignVar() throws RecognitionException {
		AssignVarContext _localctx = new AssignVarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(ID);
			setState(103);
			match(T__11);
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
				{
				setState(104);
				match(BOOL);
				}
				break;
			case STRING:
				{
				setState(105);
				match(STRING);
				}
				break;
			case T__1:
			case T__3:
			case INT:
			case ID:
				{
				setState(106);
				mathExpr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class InitializeMethodContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BroLanguageParser.ID, 0); }
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public TerminalNode VAR() { return getToken(BroLanguageParser.VAR, 0); }
		public TerminalNode PARAM() { return getToken(BroLanguageParser.PARAM, 0); }
		public InitializeMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializeMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BroLanguageListener ) ((BroLanguageListener)listener).enterInitializeMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BroLanguageListener ) ((BroLanguageListener)listener).exitInitializeMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BroLanguageVisitor ) return ((BroLanguageVisitor<? extends T>)visitor).visitInitializeMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializeMethodContext initializeMethod() throws RecognitionException {
		InitializeMethodContext _localctx = new InitializeMethodContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_initializeMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_la = _input.LA(1);
			if ( !(_la==T__12 || _la==VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(110);
			match(ID);
			setState(111);
			match(T__1);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARAM) {
				{
				setState(112);
				match(PARAM);
				}
			}

			setState(115);
			match(T__13);
			setState(116);
			prog();
			setState(117);
			match(T__14);
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

	public static class CallMethodContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BroLanguageParser.ID, 0); }
		public TerminalNode PARAM() { return getToken(BroLanguageParser.PARAM, 0); }
		public CallMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BroLanguageListener ) ((BroLanguageListener)listener).enterCallMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BroLanguageListener ) ((BroLanguageListener)listener).exitCallMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BroLanguageVisitor ) return ((BroLanguageVisitor<? extends T>)visitor).visitCallMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallMethodContext callMethod() throws RecognitionException {
		CallMethodContext _localctx = new CallMethodContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_callMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(ID);
			setState(120);
			match(T__1);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARAM) {
				{
				setState(121);
				match(PARAM);
				}
			}

			setState(124);
			match(T__15);
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

	public static class LogicalOperationContext extends ParserRuleContext {
		public LogicalOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BroLanguageListener ) ((BroLanguageListener)listener).enterLogicalOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BroLanguageListener ) ((BroLanguageListener)listener).exitLogicalOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BroLanguageVisitor ) return ((BroLanguageVisitor<? extends T>)visitor).visitLogicalOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOperationContext logicalOperation() throws RecognitionException {
		LogicalOperationContext _localctx = new LogicalOperationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_logicalOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class LoopContext extends ParserRuleContext {
		public LogicalExprContext logicalExpr() {
			return getRuleContext(LogicalExprContext.class,0);
		}
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BroLanguageListener ) ((BroLanguageListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BroLanguageListener ) ((BroLanguageListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BroLanguageVisitor ) return ((BroLanguageVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__22);
			setState(129);
			logicalExpr(0);
			setState(130);
			match(T__13);
			setState(131);
			prog();
			setState(132);
			match(T__14);
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

	public static class IfStatmentContext extends ParserRuleContext {
		public LogicalExprContext logicalExpr() {
			return getRuleContext(LogicalExprContext.class,0);
		}
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public IfStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BroLanguageListener ) ((BroLanguageListener)listener).enterIfStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BroLanguageListener ) ((BroLanguageListener)listener).exitIfStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BroLanguageVisitor ) return ((BroLanguageVisitor<? extends T>)visitor).visitIfStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatmentContext ifStatment() throws RecognitionException {
		IfStatmentContext _localctx = new IfStatmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifStatment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__23);
			setState(135);
			logicalExpr(0);
			setState(136);
			match(T__13);
			setState(137);
			prog();
			setState(138);
			match(T__14);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return mathExpr_sempred((MathExprContext)_localctx, predIndex);
		case 3:
			return logicalExpr_sempred((LogicalExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean mathExpr_sempred(MathExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean logicalExpr_sempred(LogicalExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\"\u008f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\6\2\36\n\2\r\2\16\2\37\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3*\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\65\n"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4=\n\4\f\4\16\4@\13\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5P\n\5\3\5\3\5\3\5\7\5U\n\5\f\5"+
		"\16\5X\13\5\3\6\3\6\3\6\5\6]\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7e\n\7\5\7"+
		"g\n\7\3\b\3\b\3\b\3\b\3\b\5\bn\n\b\3\t\3\t\3\t\3\t\5\tt\n\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\5\n}\n\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\2\4\6\b\16\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\2\7\3\2\7\t\4\2\6\6\n\n\3\2\13\f\4\2\17\17  \3\2\23\30\u009b\2\35\3\2"+
		"\2\2\4)\3\2\2\2\6\64\3\2\2\2\bO\3\2\2\2\nY\3\2\2\2\f^\3\2\2\2\16h\3\2"+
		"\2\2\20o\3\2\2\2\22y\3\2\2\2\24\u0080\3\2\2\2\26\u0082\3\2\2\2\30\u0088"+
		"\3\2\2\2\32\33\5\4\3\2\33\34\7\3\2\2\34\36\3\2\2\2\35\32\3\2\2\2\36\37"+
		"\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \3\3\2\2\2!*\5\6\4\2\"*\5\f\7\2#*\5"+
		"\n\6\2$*\5\26\f\2%*\5\16\b\2&*\5\30\r\2\'*\5\22\n\2(*\5\20\t\2)!\3\2\2"+
		"\2)\"\3\2\2\2)#\3\2\2\2)$\3\2\2\2)%\3\2\2\2)&\3\2\2\2)\'\3\2\2\2)(\3\2"+
		"\2\2*\5\3\2\2\2+,\b\4\1\2,-\7\4\2\2-.\5\6\4\2./\7\5\2\2/\65\3\2\2\2\60"+
		"\61\7\6\2\2\61\65\5\6\4\7\62\65\7\33\2\2\63\65\7\34\2\2\64+\3\2\2\2\64"+
		"\60\3\2\2\2\64\62\3\2\2\2\64\63\3\2\2\2\65>\3\2\2\2\66\67\f\6\2\2\678"+
		"\t\2\2\28=\5\6\4\79:\f\5\2\2:;\t\3\2\2;=\5\6\4\6<\66\3\2\2\2<9\3\2\2\2"+
		"=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\7\3\2\2\2@>\3\2\2\2AB\b\5\1\2BC\5\6\4"+
		"\2CD\5\24\13\2DE\5\6\4\2EP\3\2\2\2FG\7\36\2\2GH\5\24\13\2HI\7\36\2\2I"+
		"P\3\2\2\2JK\7\35\2\2KL\5\24\13\2LM\7\35\2\2MP\3\2\2\2NP\7\35\2\2OA\3\2"+
		"\2\2OF\3\2\2\2OJ\3\2\2\2ON\3\2\2\2PV\3\2\2\2QR\f\7\2\2RS\t\4\2\2SU\5\b"+
		"\5\bTQ\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\t\3\2\2\2XV\3\2\2\2Y\\\7"+
		"\r\2\2Z]\5\6\4\2[]\7\36\2\2\\Z\3\2\2\2\\[\3\2\2\2]\13\3\2\2\2^_\7 \2\2"+
		"_f\7\34\2\2`d\7\16\2\2ae\7\35\2\2be\7\36\2\2ce\5\6\4\2da\3\2\2\2db\3\2"+
		"\2\2dc\3\2\2\2eg\3\2\2\2f`\3\2\2\2fg\3\2\2\2g\r\3\2\2\2hi\7\34\2\2im\7"+
		"\16\2\2jn\7\35\2\2kn\7\36\2\2ln\5\6\4\2mj\3\2\2\2mk\3\2\2\2ml\3\2\2\2"+
		"n\17\3\2\2\2op\t\5\2\2pq\7\34\2\2qs\7\4\2\2rt\7\"\2\2sr\3\2\2\2st\3\2"+
		"\2\2tu\3\2\2\2uv\7\20\2\2vw\5\2\2\2wx\7\21\2\2x\21\3\2\2\2yz\7\34\2\2"+
		"z|\7\4\2\2{}\7\"\2\2|{\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\7\22\2\2\177\23"+
		"\3\2\2\2\u0080\u0081\t\6\2\2\u0081\25\3\2\2\2\u0082\u0083\7\31\2\2\u0083"+
		"\u0084\5\b\5\2\u0084\u0085\7\20\2\2\u0085\u0086\5\2\2\2\u0086\u0087\7"+
		"\21\2\2\u0087\27\3\2\2\2\u0088\u0089\7\32\2\2\u0089\u008a\5\b\5\2\u008a"+
		"\u008b\7\20\2\2\u008b\u008c\5\2\2\2\u008c\u008d\7\21\2\2\u008d\31\3\2"+
		"\2\2\17\37)\64<>OV\\dfms|";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}