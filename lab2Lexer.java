// Generated from C:/Users/jmk07/Desktop/lab2\lab2.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lab2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, WS=14, Line_comment=15, Comment=16, 
		Decimal_const=17, Octal_const=18, Hexadecimal_const=19, Hexadecimal_prefix=20, 
		Nonzero_digit=21, Octal_digit=22, Digit=23, Hexadecimal_digit=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "WS", "Line_comment", "Comment", "Decimal_const", 
			"Octal_const", "Hexadecimal_const", "Hexadecimal_prefix", "Nonzero_digit", 
			"Octal_digit", "Digit", "Hexadecimal_digit"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'int'", "'main'", "'{'", "'}'", "'return'", "';'", 
			"'+'", "'-'", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "WS", "Line_comment", "Comment", "Decimal_const", "Octal_const", 
			"Hexadecimal_const", "Hexadecimal_prefix", "Nonzero_digit", "Octal_digit", 
			"Digit", "Hexadecimal_digit"
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


	public lab2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "lab2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00a1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\6\17Y\n\17\r\17\16\17Z\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\7\20c\n\20\f\20\16\20f\13\20\3\20\5\20i\n\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\7\21s\n\21\f\21\16\21v\13\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\7\22\177\n\22\f\22\16\22\u0082\13\22\3\23\3\23\7\23\u0086"+
		"\n\23\f\23\16\23\u0089\13\23\3\24\3\24\7\24\u008d\n\24\f\24\16\24\u0090"+
		"\13\24\3\25\3\25\3\25\3\25\5\25\u0096\n\25\3\26\3\26\3\27\3\27\3\30\3"+
		"\30\5\30\u009e\n\30\3\31\3\31\4dt\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\3\2\4\5\2\13\f\17\17\"\"\5\2\62;CHch\2\u00a9\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\3\63\3\2\2\2\5\65\3\2\2\2\7\67\3\2\2\2\t;\3\2\2\2\13@\3\2\2\2\rB\3\2"+
		"\2\2\17D\3\2\2\2\21K\3\2\2\2\23M\3\2\2\2\25O\3\2\2\2\27Q\3\2\2\2\31S\3"+
		"\2\2\2\33U\3\2\2\2\35X\3\2\2\2\37^\3\2\2\2!n\3\2\2\2#|\3\2\2\2%\u0083"+
		"\3\2\2\2\'\u008a\3\2\2\2)\u0095\3\2\2\2+\u0097\3\2\2\2-\u0099\3\2\2\2"+
		"/\u009d\3\2\2\2\61\u009f\3\2\2\2\63\64\7*\2\2\64\4\3\2\2\2\65\66\7+\2"+
		"\2\66\6\3\2\2\2\678\7k\2\289\7p\2\29:\7v\2\2:\b\3\2\2\2;<\7o\2\2<=\7c"+
		"\2\2=>\7k\2\2>?\7p\2\2?\n\3\2\2\2@A\7}\2\2A\f\3\2\2\2BC\7\177\2\2C\16"+
		"\3\2\2\2DE\7t\2\2EF\7g\2\2FG\7v\2\2GH\7w\2\2HI\7t\2\2IJ\7p\2\2J\20\3\2"+
		"\2\2KL\7=\2\2L\22\3\2\2\2MN\7-\2\2N\24\3\2\2\2OP\7/\2\2P\26\3\2\2\2QR"+
		"\7,\2\2R\30\3\2\2\2ST\7\61\2\2T\32\3\2\2\2UV\7\'\2\2V\34\3\2\2\2WY\t\2"+
		"\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\b\17\2\2]\36"+
		"\3\2\2\2^_\7\61\2\2_`\7\61\2\2`d\3\2\2\2ac\13\2\2\2ba\3\2\2\2cf\3\2\2"+
		"\2de\3\2\2\2db\3\2\2\2eh\3\2\2\2fd\3\2\2\2gi\7\17\2\2hg\3\2\2\2hi\3\2"+
		"\2\2ij\3\2\2\2jk\7\f\2\2kl\3\2\2\2lm\b\20\2\2m \3\2\2\2no\7\61\2\2op\7"+
		",\2\2pt\3\2\2\2qs\13\2\2\2rq\3\2\2\2sv\3\2\2\2tu\3\2\2\2tr\3\2\2\2uw\3"+
		"\2\2\2vt\3\2\2\2wx\7,\2\2xy\7\61\2\2yz\3\2\2\2z{\b\21\2\2{\"\3\2\2\2|"+
		"\u0080\5+\26\2}\177\5/\30\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2"+
		"\u0080\u0081\3\2\2\2\u0081$\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0087\7"+
		"\62\2\2\u0084\u0086\5-\27\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088&\3\2\2\2\u0089\u0087\3\2\2\2"+
		"\u008a\u008e\5)\25\2\u008b\u008d\5\61\31\2\u008c\u008b\3\2\2\2\u008d\u0090"+
		"\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f(\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0091\u0092\7\62\2\2\u0092\u0096\7z\2\2\u0093\u0094\7\62"+
		"\2\2\u0094\u0096\7Z\2\2\u0095\u0091\3\2\2\2\u0095\u0093\3\2\2\2\u0096"+
		"*\3\2\2\2\u0097\u0098\4\63;\2\u0098,\3\2\2\2\u0099\u009a\4\629\2\u009a"+
		".\3\2\2\2\u009b\u009e\7\62\2\2\u009c\u009e\5+\26\2\u009d\u009b\3\2\2\2"+
		"\u009d\u009c\3\2\2\2\u009e\60\3\2\2\2\u009f\u00a0\t\3\2\2\u00a0\62\3\2"+
		"\2\2\f\2Zdht\u0080\u0087\u008e\u0095\u009d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}