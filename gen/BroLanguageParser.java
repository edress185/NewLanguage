// Generated from E:/NewProgLang/src\BroLanguage.g4 by ANTLR 4.6
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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, INT=24, ID=25, 
		BOOL=26, STRING=27, WS=28, COMMENT=29;
	public static final int
		RULE_prog = 0, RULE_statment = 1, RULE_mathExpr = 2, RULE_logicalExpr = 3, 
		RULE_print = 4, RULE_initialize = 5, RULE_logicalOperation = 6, RULE_loop = 7, 
		RULE_ifStatment = 8;
	public static final String[] ruleNames = {
		"prog", "statment", "mathExpr", "logicalExpr", "print", "initialize", 
		"logicalOperation", "loop", "ifStatment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "')'", "'-'", "'*'", "'/'", "'%'", "'+'", "'&&'", 
		"'|'", "'print'", "'var'", "'='", "'=='", "'!='", "'>='", "'<='", "'<'", 
		"'>'", "'while{'", "'){'", "'}'", "'if('"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"INT", "ID", "BOOL", "STRING", "WS", "COMMENT"
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
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				statment();
				setState(19);
				match(T__0);
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__10) | (1L << T__11) | (1L << T__19) | (1L << T__22) | (1L << INT) | (1L << ID))) != 0) );
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
		public InitializeContext initialize() {
			return getRuleContext(InitializeContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public IfStatmentContext ifStatment() {
			return getRuleContext(IfStatmentContext.class,0);
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
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__3:
			case INT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				mathExpr(0);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				initialize();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(27);
				print();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 4);
				{
				setState(28);
				loop();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 5);
				{
				setState(29);
				ifStatment();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(33);
				match(T__1);
				setState(34);
				mathExpr(0);
				setState(35);
				match(T__2);
				}
				break;
			case T__3:
				{
				setState(37);
				match(T__3);
				setState(38);
				mathExpr(5);
				}
				break;
			case INT:
				{
				setState(39);
				match(INT);
				}
				break;
			case ID:
				{
				setState(40);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(51);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(49);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MathExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpr);
						setState(43);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(44);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(45);
						mathExpr(5);
						}
						break;
					case 2:
						{
						_localctx = new MathExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpr);
						setState(46);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(47);
						_la = _input.LA(1);
						if ( !(_la==T__3 || _la==T__7) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(48);
						mathExpr(4);
						}
						break;
					}
					} 
				}
				setState(53);
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
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(55);
				mathExpr(0);
				setState(56);
				logicalOperation();
				setState(57);
				mathExpr(0);
				}
				break;
			case 2:
				{
				setState(59);
				match(STRING);
				setState(60);
				logicalOperation();
				setState(61);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(63);
				match(BOOL);
				setState(64);
				logicalOperation();
				setState(65);
				match(BOOL);
				}
				break;
			case 4:
				{
				setState(67);
				match(BOOL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(75);
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
					setState(70);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(71);
					_la = _input.LA(1);
					if ( !(_la==T__8 || _la==T__9) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(72);
					logicalExpr(6);
					}
					} 
				}
				setState(77);
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
			setState(78);
			match(T__10);
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__3:
			case INT:
			case ID:
				{
				setState(79);
				mathExpr(0);
				}
				break;
			case STRING:
				{
				setState(80);
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

	public static class InitializeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BroLanguageParser.ID, 0); }
		public TerminalNode BOOL() { return getToken(BroLanguageParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(BroLanguageParser.STRING, 0); }
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public InitializeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BroLanguageListener ) ((BroLanguageListener)listener).enterInitialize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BroLanguageListener ) ((BroLanguageListener)listener).exitInitialize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BroLanguageVisitor ) return ((BroLanguageVisitor<? extends T>)visitor).visitInitialize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializeContext initialize() throws RecognitionException {
		InitializeContext _localctx = new InitializeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_initialize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__11);
			setState(84);
			match(ID);
			setState(85);
			match(T__12);
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
				{
				setState(86);
				match(BOOL);
				}
				break;
			case STRING:
				{
				setState(87);
				match(STRING);
				}
				break;
			case T__1:
			case T__3:
			case INT:
			case ID:
				{
				setState(88);
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
		enterRule(_localctx, 12, RULE_logicalOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
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
		enterRule(_localctx, 14, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__19);
			setState(94);
			logicalExpr(0);
			setState(95);
			match(T__20);
			setState(96);
			prog();
			setState(97);
			match(T__21);
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
		enterRule(_localctx, 16, RULE_ifStatment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__22);
			setState(100);
			logicalExpr(0);
			setState(101);
			match(T__20);
			setState(102);
			prog();
			setState(103);
			match(T__21);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\37l\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\6\2\30\n\2\r\2\16\2\31\3\3\3\3\3\3\3\3\3\3\5\3!\n\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4,\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\64\n\4\f\4\16"+
		"\4\67\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"G\n\5\3\5\3\5\3\5\7\5L\n\5\f\5\16\5O\13\5\3\6\3\6\3\6\5\6T\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7\\\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\2\4\6\b\13\2\4\6\b\n\f\16\20\22\2\6\3\2\7\t\4\2\6\6\n"+
		"\n\3\2\13\f\3\2\20\25s\2\27\3\2\2\2\4 \3\2\2\2\6+\3\2\2\2\bF\3\2\2\2\n"+
		"P\3\2\2\2\fU\3\2\2\2\16]\3\2\2\2\20_\3\2\2\2\22e\3\2\2\2\24\25\5\4\3\2"+
		"\25\26\7\3\2\2\26\30\3\2\2\2\27\24\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2"+
		"\31\32\3\2\2\2\32\3\3\2\2\2\33!\5\6\4\2\34!\5\f\7\2\35!\5\n\6\2\36!\5"+
		"\20\t\2\37!\5\22\n\2 \33\3\2\2\2 \34\3\2\2\2 \35\3\2\2\2 \36\3\2\2\2 "+
		"\37\3\2\2\2!\5\3\2\2\2\"#\b\4\1\2#$\7\4\2\2$%\5\6\4\2%&\7\5\2\2&,\3\2"+
		"\2\2\'(\7\6\2\2(,\5\6\4\7),\7\32\2\2*,\7\33\2\2+\"\3\2\2\2+\'\3\2\2\2"+
		"+)\3\2\2\2+*\3\2\2\2,\65\3\2\2\2-.\f\6\2\2./\t\2\2\2/\64\5\6\4\7\60\61"+
		"\f\5\2\2\61\62\t\3\2\2\62\64\5\6\4\6\63-\3\2\2\2\63\60\3\2\2\2\64\67\3"+
		"\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\7\3\2\2\2\67\65\3\2\2\289\b\5\1"+
		"\29:\5\6\4\2:;\5\16\b\2;<\5\6\4\2<G\3\2\2\2=>\7\35\2\2>?\5\16\b\2?@\7"+
		"\35\2\2@G\3\2\2\2AB\7\34\2\2BC\5\16\b\2CD\7\34\2\2DG\3\2\2\2EG\7\34\2"+
		"\2F8\3\2\2\2F=\3\2\2\2FA\3\2\2\2FE\3\2\2\2GM\3\2\2\2HI\f\7\2\2IJ\t\4\2"+
		"\2JL\5\b\5\bKH\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\t\3\2\2\2OM\3\2"+
		"\2\2PS\7\r\2\2QT\5\6\4\2RT\7\35\2\2SQ\3\2\2\2SR\3\2\2\2T\13\3\2\2\2UV"+
		"\7\16\2\2VW\7\33\2\2W[\7\17\2\2X\\\7\34\2\2Y\\\7\35\2\2Z\\\5\6\4\2[X\3"+
		"\2\2\2[Y\3\2\2\2[Z\3\2\2\2\\\r\3\2\2\2]^\t\5\2\2^\17\3\2\2\2_`\7\26\2"+
		"\2`a\5\b\5\2ab\7\27\2\2bc\5\2\2\2cd\7\30\2\2d\21\3\2\2\2ef\7\31\2\2fg"+
		"\5\b\5\2gh\7\27\2\2hi\5\2\2\2ij\7\30\2\2j\23\3\2\2\2\13\31 +\63\65FMS"+
		"[";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}