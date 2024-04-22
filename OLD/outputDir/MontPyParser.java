// Generated from MontPy.g4 by ANTLR 4.13.1
package your.package.name;
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
		WS=47, ID=48, ERROR=49;
	public static final int
		RULE_programa = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa"
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
			"COMMA", "COLON", "DOT", "TAB", "COMMENT", "WS", "ID", "ERROR"
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
		public TerminalNode DEF() { return getToken(MontPyParser.DEF, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(MontPyParser.FLOAT_TYPE, 0); }
		public TerminalNode INT_TYPE() { return getToken(MontPyParser.INT_TYPE, 0); }
		public TerminalNode FOR() { return getToken(MontPyParser.FOR, 0); }
		public TerminalNode IN() { return getToken(MontPyParser.IN, 0); }
		public TerminalNode RANGE() { return getToken(MontPyParser.RANGE, 0); }
		public TerminalNode WHILE() { return getToken(MontPyParser.WHILE, 0); }
		public TerminalNode IF() { return getToken(MontPyParser.IF, 0); }
		public TerminalNode ELIF() { return getToken(MontPyParser.ELIF, 0); }
		public TerminalNode ELSE() { return getToken(MontPyParser.ELSE, 0); }
		public TerminalNode SIZE() { return getToken(MontPyParser.SIZE, 0); }
		public TerminalNode ADD() { return getToken(MontPyParser.ADD, 0); }
		public TerminalNode REMOVE() { return getToken(MontPyParser.REMOVE, 0); }
		public TerminalNode AND() { return getToken(MontPyParser.AND, 0); }
		public TerminalNode OR() { return getToken(MontPyParser.OR, 0); }
		public TerminalNode RETURN() { return getToken(MontPyParser.RETURN, 0); }
		public TerminalNode PRINT() { return getToken(MontPyParser.PRINT, 0); }
		public TerminalNode INPUT() { return getToken(MontPyParser.INPUT, 0); }
		public TerminalNode ID() { return getToken(MontPyParser.ID, 0); }
		public TerminalNode FLOAT() { return getToken(MontPyParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(MontPyParser.INT, 0); }
		public TerminalNode STRING() { return getToken(MontPyParser.STRING, 0); }
		public TerminalNode PLUS() { return getToken(MontPyParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MontPyParser.MINUS, 0); }
		public TerminalNode MULTIPLY() { return getToken(MontPyParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(MontPyParser.DIVIDE, 0); }
		public TerminalNode EXPONENT() { return getToken(MontPyParser.EXPONENT, 0); }
		public TerminalNode FLOOR_DIVIDE() { return getToken(MontPyParser.FLOOR_DIVIDE, 0); }
		public TerminalNode POWER() { return getToken(MontPyParser.POWER, 0); }
		public TerminalNode MODULO() { return getToken(MontPyParser.MODULO, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(MontPyParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MontPyParser.CLOSE_BRACKET, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(MontPyParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(MontPyParser.CLOSE_PAREN, 0); }
		public TerminalNode EQUALS() { return getToken(MontPyParser.EQUALS, 0); }
		public TerminalNode EQUALITY() { return getToken(MontPyParser.EQUALITY, 0); }
		public TerminalNode INEQUALITY() { return getToken(MontPyParser.INEQUALITY, 0); }
		public TerminalNode GREATER_THAN() { return getToken(MontPyParser.GREATER_THAN, 0); }
		public TerminalNode LESS_THAN() { return getToken(MontPyParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN_OR_EQUAL() { return getToken(MontPyParser.GREATER_THAN_OR_EQUAL, 0); }
		public TerminalNode LESS_THAN_OR_EQUAL() { return getToken(MontPyParser.LESS_THAN_OR_EQUAL, 0); }
		public TerminalNode COMMA() { return getToken(MontPyParser.COMMA, 0); }
		public TerminalNode COLON() { return getToken(MontPyParser.COLON, 0); }
		public TerminalNode DOT() { return getToken(MontPyParser.DOT, 0); }
		public TerminalNode TAB() { return getToken(MontPyParser.TAB, 0); }
		public TerminalNode COMMENT() { return getToken(MontPyParser.COMMENT, 0); }
		public TerminalNode WS() { return getToken(MontPyParser.WS, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MontPyVisitor ) return ((MontPyVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEF:
				{
				setState(2);
				match(DEF);
				}
				break;
			case FLOAT_TYPE:
				{
				setState(3);
				match(FLOAT_TYPE);
				}
				break;
			case INT_TYPE:
				{
				setState(4);
				match(INT_TYPE);
				}
				break;
			case FOR:
				{
				setState(5);
				match(FOR);
				}
				break;
			case IN:
				{
				setState(6);
				match(IN);
				}
				break;
			case RANGE:
				{
				setState(7);
				match(RANGE);
				}
				break;
			case WHILE:
				{
				setState(8);
				match(WHILE);
				}
				break;
			case IF:
				{
				setState(9);
				match(IF);
				}
				break;
			case ELIF:
				{
				setState(10);
				match(ELIF);
				}
				break;
			case ELSE:
				{
				setState(11);
				match(ELSE);
				}
				break;
			case SIZE:
				{
				setState(12);
				match(SIZE);
				}
				break;
			case ADD:
				{
				setState(13);
				match(ADD);
				}
				break;
			case REMOVE:
				{
				setState(14);
				match(REMOVE);
				}
				break;
			case AND:
				{
				setState(15);
				match(AND);
				}
				break;
			case OR:
				{
				setState(16);
				match(OR);
				}
				break;
			case RETURN:
				{
				setState(17);
				match(RETURN);
				}
				break;
			case PRINT:
				{
				setState(18);
				match(PRINT);
				}
				break;
			case INPUT:
				{
				setState(19);
				match(INPUT);
				}
				break;
			case ID:
				{
				setState(20);
				match(ID);
				}
				break;
			case FLOAT:
				{
				setState(21);
				match(FLOAT);
				}
				break;
			case INT:
				{
				setState(22);
				match(INT);
				}
				break;
			case STRING:
				{
				setState(23);
				match(STRING);
				}
				break;
			case PLUS:
				{
				setState(24);
				match(PLUS);
				}
				break;
			case MINUS:
				{
				setState(25);
				match(MINUS);
				}
				break;
			case MULTIPLY:
				{
				setState(26);
				match(MULTIPLY);
				}
				break;
			case DIVIDE:
				{
				setState(27);
				match(DIVIDE);
				}
				break;
			case EXPONENT:
				{
				setState(28);
				match(EXPONENT);
				}
				break;
			case FLOOR_DIVIDE:
				{
				setState(29);
				match(FLOOR_DIVIDE);
				}
				break;
			case POWER:
				{
				setState(30);
				match(POWER);
				}
				break;
			case MODULO:
				{
				setState(31);
				match(MODULO);
				}
				break;
			case OPEN_BRACKET:
				{
				setState(32);
				match(OPEN_BRACKET);
				}
				break;
			case CLOSE_BRACKET:
				{
				setState(33);
				match(CLOSE_BRACKET);
				}
				break;
			case OPEN_PAREN:
				{
				setState(34);
				match(OPEN_PAREN);
				}
				break;
			case CLOSE_PAREN:
				{
				setState(35);
				match(CLOSE_PAREN);
				}
				break;
			case EQUALS:
				{
				setState(36);
				match(EQUALS);
				}
				break;
			case EQUALITY:
				{
				setState(37);
				match(EQUALITY);
				}
				break;
			case INEQUALITY:
				{
				setState(38);
				match(INEQUALITY);
				}
				break;
			case GREATER_THAN:
				{
				setState(39);
				match(GREATER_THAN);
				}
				break;
			case LESS_THAN:
				{
				setState(40);
				match(LESS_THAN);
				}
				break;
			case GREATER_THAN_OR_EQUAL:
				{
				setState(41);
				match(GREATER_THAN_OR_EQUAL);
				}
				break;
			case LESS_THAN_OR_EQUAL:
				{
				setState(42);
				match(LESS_THAN_OR_EQUAL);
				}
				break;
			case COMMA:
				{
				setState(43);
				match(COMMA);
				}
				break;
			case COLON:
				{
				setState(44);
				match(COLON);
				}
				break;
			case DOT:
				{
				setState(45);
				match(DOT);
				}
				break;
			case TAB:
				{
				setState(46);
				match(TAB);
				}
				break;
			case COMMENT:
				{
				setState(47);
				match(COMMENT);
				}
				break;
			case WS:
				{
				setState(48);
				match(WS);
				}
				break;
			case EOF:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(52);
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

	public static final String _serializedATN =
		"\u0004\u000117\u0002\u0000\u0007\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u00003\b\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000d\u00002\u0001"+
		"\u0000\u0000\u0000\u00023\u0005\u0005\u0000\u0000\u00033\u0005\u0006\u0000"+
		"\u0000\u00043\u0005\u0007\u0000\u0000\u00053\u0005\b\u0000\u0000\u0006"+
		"3\u0005\t\u0000\u0000\u00073\u0005\n\u0000\u0000\b3\u0005\u000b\u0000"+
		"\u0000\t3\u0005\f\u0000\u0000\n3\u0005\r\u0000\u0000\u000b3\u0005\u000e"+
		"\u0000\u0000\f3\u0005\u000f\u0000\u0000\r3\u0005\u0010\u0000\u0000\u000e"+
		"3\u0005\u0011\u0000\u0000\u000f3\u0005\u0012\u0000\u0000\u00103\u0005"+
		"\u0013\u0000\u0000\u00113\u0005\u0014\u0000\u0000\u00123\u0005\u0015\u0000"+
		"\u0000\u00133\u0005\u0016\u0000\u0000\u00143\u00050\u0000\u0000\u0015"+
		"3\u0005\u0001\u0000\u0000\u00163\u0005\u0002\u0000\u0000\u00173\u0005"+
		"\u0004\u0000\u0000\u00183\u0005\u0017\u0000\u0000\u00193\u0005\u0018\u0000"+
		"\u0000\u001a3\u0005\u0019\u0000\u0000\u001b3\u0005\u001a\u0000\u0000\u001c"+
		"3\u0005\u001b\u0000\u0000\u001d3\u0005\u001c\u0000\u0000\u001e3\u0005"+
		"\u001d\u0000\u0000\u001f3\u0005\u001e\u0000\u0000 3\u0005\u001f\u0000"+
		"\u0000!3\u0005 \u0000\u0000\"3\u0005!\u0000\u0000#3\u0005\"\u0000\u0000"+
		"$3\u0005#\u0000\u0000%3\u0005$\u0000\u0000&3\u0005%\u0000\u0000\'3\u0005"+
		"&\u0000\u0000(3\u0005\'\u0000\u0000)3\u0005(\u0000\u0000*3\u0005)\u0000"+
		"\u0000+3\u0005*\u0000\u0000,3\u0005+\u0000\u0000-3\u0005,\u0000\u0000"+
		".3\u0005-\u0000\u0000/3\u0005.\u0000\u000003\u0005/\u0000\u000013\u0001"+
		"\u0000\u0000\u00002\u0002\u0001\u0000\u0000\u00002\u0003\u0001\u0000\u0000"+
		"\u00002\u0004\u0001\u0000\u0000\u00002\u0005\u0001\u0000\u0000\u00002"+
		"\u0006\u0001\u0000\u0000\u00002\u0007\u0001\u0000\u0000\u00002\b\u0001"+
		"\u0000\u0000\u00002\t\u0001\u0000\u0000\u00002\n\u0001\u0000\u0000\u0000"+
		"2\u000b\u0001\u0000\u0000\u00002\f\u0001\u0000\u0000\u00002\r\u0001\u0000"+
		"\u0000\u00002\u000e\u0001\u0000\u0000\u00002\u000f\u0001\u0000\u0000\u0000"+
		"2\u0010\u0001\u0000\u0000\u00002\u0011\u0001\u0000\u0000\u00002\u0012"+
		"\u0001\u0000\u0000\u00002\u0013\u0001\u0000\u0000\u00002\u0014\u0001\u0000"+
		"\u0000\u00002\u0015\u0001\u0000\u0000\u00002\u0016\u0001\u0000\u0000\u0000"+
		"2\u0017\u0001\u0000\u0000\u00002\u0018\u0001\u0000\u0000\u00002\u0019"+
		"\u0001\u0000\u0000\u00002\u001a\u0001\u0000\u0000\u00002\u001b\u0001\u0000"+
		"\u0000\u00002\u001c\u0001\u0000\u0000\u00002\u001d\u0001\u0000\u0000\u0000"+
		"2\u001e\u0001\u0000\u0000\u00002\u001f\u0001\u0000\u0000\u00002 \u0001"+
		"\u0000\u0000\u00002!\u0001\u0000\u0000\u00002\"\u0001\u0000\u0000\u0000"+
		"2#\u0001\u0000\u0000\u00002$\u0001\u0000\u0000\u00002%\u0001\u0000\u0000"+
		"\u00002&\u0001\u0000\u0000\u00002\'\u0001\u0000\u0000\u00002(\u0001\u0000"+
		"\u0000\u00002)\u0001\u0000\u0000\u00002*\u0001\u0000\u0000\u00002+\u0001"+
		"\u0000\u0000\u00002,\u0001\u0000\u0000\u00002-\u0001\u0000\u0000\u0000"+
		"2.\u0001\u0000\u0000\u00002/\u0001\u0000\u0000\u000020\u0001\u0000\u0000"+
		"\u000021\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000045\u0005\u0000"+
		"\u0000\u00015\u0001\u0001\u0000\u0000\u0000\u00012";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}