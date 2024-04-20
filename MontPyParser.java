// Generated from MontPy.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MontPyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FLOAT=1, INT=2, DIGIT=3, STRING=4, DEF=5, FLOAT_TYPE=6, INT_TYPE=7, FOR=8, 
		IN=9, RANGE=10, WHILE=11, IF=12, ELIF=13, ELSE=14, SIZE=15, ADD=16, REMOVE=17, 
		AND=18, OR=19, RETURN=20, PRINT=21, INPUT=22, PLUS=23, MINUS=24, MULTIPLY=25, 
		DIVIDE=26, EXPONENT=27, FLOOR_DIVIDE=28, POWER=29, MODULO=30, OPEN_BRACKET=31, 
		CLOSE_BRACKET=32, OPEN_PAREN=33, CLOSE_PAREN=34, EQUALS=35, EQUALITY=36, 
		INEQUALITY=37, GREATER_THAN=38, LESS_THAN=39, GREATER_THAN_OR_EQUAL=40, 
		LESS_THAN_OR_EQUAL=41, COMMA=42, COLON=43, DOT=44, TAB=45, COMMENT=46, 
		WS=47, ID=48;
	public static final int
		RULE_programa = 0, RULE_stat = 1, RULE_declaration = 2, RULE_command = 3, 
		RULE_expression = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "stat", "declaration", "command", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'def'", "'float'", "'int'", "'for'", "'in'", 
			"'range'", "'while'", "'if'", "'elif'", "'else'", "'size'", "'add'", 
			"'remove'", "'and'", "'or'", "'return'", "'print'", "'input'", "'+'", 
			"'-'", "'*'", "'/'", "'^'", "'//'", "'**'", "'%'", "'['", "']'", "'('", 
			"')'", "'='", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "','", "':'", 
			"'.'", "'\\t'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FLOAT", "INT", "DIGIT", "STRING", "DEF", "FLOAT_TYPE", "INT_TYPE", 
			"FOR", "IN", "RANGE", "WHILE", "IF", "ELIF", "ELSE", "SIZE", "ADD", "REMOVE", 
			"AND", "OR", "RETURN", "PRINT", "INPUT", "PLUS", "MINUS", "MULTIPLY", 
			"DIVIDE", "EXPONENT", "FLOOR_DIVIDE", "POWER", "MODULO", "OPEN_BRACKET", 
			"CLOSE_BRACKET", "OPEN_PAREN", "CLOSE_PAREN", "EQUALS", "EQUALITY", "INEQUALITY", 
			"GREATER_THAN", "LESS_THAN", "GREATER_THAN_OR_EQUAL", "LESS_THAN_OR_EQUAL", 
			"COMMA", "COLON", "DOT", "TAB", "COMMENT", "WS", "ID"
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
	public String getGrammarFileName() { return "MontPy.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MontPyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MontPyParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MontPyListener ) ((MontPyListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MontPyListener ) ((MontPyListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				stat();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 281483568742598L) != 0) );
			setState(15);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MontPyListener ) ((MontPyListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MontPyListener ) ((MontPyListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(20);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT_TYPE:
			case INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				declaration();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(18);
				command();
				}
				break;
			case FLOAT:
			case INT:
			case OPEN_PAREN:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(19);
				expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MontPyParser.ID, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(MontPyParser.FLOAT_TYPE, 0); }
		public TerminalNode INT_TYPE() { return getToken(MontPyParser.INT_TYPE, 0); }
		public TerminalNode EQUALS() { return getToken(MontPyParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MontPyListener ) ((MontPyListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MontPyListener ) ((MontPyListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			_la = _input.LA(1);
			if ( !(_la==FLOAT_TYPE || _la==INT_TYPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(23);
			match(ID);
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(24);
				match(EQUALS);
				setState(25);
				expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CommandContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(MontPyParser.PRINT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(MontPyParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(MontPyParser.CLOSE_PAREN, 0); }
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MontPyListener ) ((MontPyListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MontPyListener ) ((MontPyListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(PRINT);
			setState(29);
			match(OPEN_PAREN);
			setState(30);
			expression(0);
			setState(31);
			match(CLOSE_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(MontPyParser.OPEN_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(MontPyParser.CLOSE_PAREN, 0); }
		public TerminalNode INT() { return getToken(MontPyParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(MontPyParser.FLOAT, 0); }
		public TerminalNode ID() { return getToken(MontPyParser.ID, 0); }
		public TerminalNode PLUS() { return getToken(MontPyParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MontPyParser.MINUS, 0); }
		public TerminalNode MULTIPLY() { return getToken(MontPyParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(MontPyParser.DIVIDE, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MontPyListener ) ((MontPyListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MontPyListener ) ((MontPyListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				{
				setState(34);
				match(OPEN_PAREN);
				setState(35);
				expression(0);
				setState(36);
				match(CLOSE_PAREN);
				}
				break;
			case INT:
				{
				setState(38);
				match(INT);
				}
				break;
			case FLOAT:
				{
				setState(39);
				match(FLOAT);
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
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(43);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(44);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 125829120L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(45);
					expression(5);
					}
					} 
				}
				setState(50);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u000104\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001\u0000"+
		"\u0004\u0000\f\b\u0000\u000b\u0000\f\u0000\r\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0015\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u001b\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004*\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004/\b\u0004"+
		"\n\u0004\f\u00042\t\u0004\u0001\u0004\u0000\u0001\b\u0005\u0000\u0002"+
		"\u0004\u0006\b\u0000\u0002\u0001\u0000\u0006\u0007\u0001\u0000\u0017\u001a"+
		"6\u0000\u000b\u0001\u0000\u0000\u0000\u0002\u0014\u0001\u0000\u0000\u0000"+
		"\u0004\u0016\u0001\u0000\u0000\u0000\u0006\u001c\u0001\u0000\u0000\u0000"+
		"\b)\u0001\u0000\u0000\u0000\n\f\u0003\u0002\u0001\u0000\u000b\n\u0001"+
		"\u0000\u0000\u0000\f\r\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000"+
		"\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e\u000f\u0001\u0000\u0000\u0000"+
		"\u000f\u0010\u0005\u0000\u0000\u0001\u0010\u0001\u0001\u0000\u0000\u0000"+
		"\u0011\u0015\u0003\u0004\u0002\u0000\u0012\u0015\u0003\u0006\u0003\u0000"+
		"\u0013\u0015\u0003\b\u0004\u0000\u0014\u0011\u0001\u0000\u0000\u0000\u0014"+
		"\u0012\u0001\u0000\u0000\u0000\u0014\u0013\u0001\u0000\u0000\u0000\u0015"+
		"\u0003\u0001\u0000\u0000\u0000\u0016\u0017\u0007\u0000\u0000\u0000\u0017"+
		"\u001a\u00050\u0000\u0000\u0018\u0019\u0005#\u0000\u0000\u0019\u001b\u0003"+
		"\b\u0004\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000"+
		"\u0000\u0000\u001b\u0005\u0001\u0000\u0000\u0000\u001c\u001d\u0005\u0015"+
		"\u0000\u0000\u001d\u001e\u0005!\u0000\u0000\u001e\u001f\u0003\b\u0004"+
		"\u0000\u001f \u0005\"\u0000\u0000 \u0007\u0001\u0000\u0000\u0000!\"\u0006"+
		"\u0004\uffff\uffff\u0000\"#\u0005!\u0000\u0000#$\u0003\b\u0004\u0000$"+
		"%\u0005\"\u0000\u0000%*\u0001\u0000\u0000\u0000&*\u0005\u0002\u0000\u0000"+
		"\'*\u0005\u0001\u0000\u0000(*\u00050\u0000\u0000)!\u0001\u0000\u0000\u0000"+
		")&\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)(\u0001\u0000\u0000"+
		"\u0000*0\u0001\u0000\u0000\u0000+,\n\u0004\u0000\u0000,-\u0007\u0001\u0000"+
		"\u0000-/\u0003\b\u0004\u0005.+\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000"+
		"\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u00001\t\u0001\u0000"+
		"\u0000\u000020\u0001\u0000\u0000\u0000\u0005\r\u0014\u001a)0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}