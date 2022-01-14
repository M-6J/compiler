// Generated from C:/Users/jmk07/Desktop/lab3\lab3.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lab3Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, WS=17, 
		Line_comment=18, Comment=19, Decimal_const=20, Octal_const=21, Hexadecimal_const=22, 
		Digit_const=23, Hexadecimal_prefix=24, Nonzero_digit=25, Octal_digit=26, 
		Digit=27, Hexadecimal_digit=28, Digit_a=29, Non_digit=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "WS", "Line_comment", 
			"Comment", "Decimal_const", "Octal_const", "Hexadecimal_const", "Digit_const", 
			"Hexadecimal_prefix", "Nonzero_digit", "Octal_digit", "Digit", "Hexadecimal_digit", 
			"Digit_a", "Non_digit"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'int'", "'main'", "'const'", "','", "';'", "'='", 
			"'{'", "'}'", "'return'", "'+'", "'-'", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "WS", "Line_comment", "Comment", "Decimal_const", 
			"Octal_const", "Hexadecimal_const", "Digit_const", "Hexadecimal_prefix", 
			"Nonzero_digit", "Octal_digit", "Digit", "Hexadecimal_digit", "Digit_a", 
			"Non_digit"
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


	public lab3Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "lab3.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00c4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\6\22o\n\22\r\22\16\22"+
		"p\3\22\3\22\3\23\3\23\3\23\3\23\7\23y\n\23\f\23\16\23|\13\23\3\23\5\23"+
		"\177\n\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u0089\n\24\f\24"+
		"\16\24\u008c\13\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\7\25\u0095\n\25"+
		"\f\25\16\25\u0098\13\25\3\26\3\26\7\26\u009c\n\26\f\26\16\26\u009f\13"+
		"\26\3\27\3\27\7\27\u00a3\n\27\f\27\16\27\u00a6\13\27\3\30\3\30\7\30\u00aa"+
		"\n\30\f\30\16\30\u00ad\13\30\3\31\3\31\3\31\3\31\5\31\u00b3\n\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\5\34\u00bb\n\34\3\35\3\35\3\36\3\36\5\36\u00c1"+
		"\n\36\3\37\3\37\4z\u008a\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= \3\2\5\5\2\13\f\17\17\"\"\5\2\62;CHch\5\2"+
		"C\\aac|\2\u00ce\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5A\3\2\2\2\7C\3\2\2\2\tG\3"+
		"\2\2\2\13L\3\2\2\2\rR\3\2\2\2\17T\3\2\2\2\21V\3\2\2\2\23X\3\2\2\2\25Z"+
		"\3\2\2\2\27\\\3\2\2\2\31c\3\2\2\2\33e\3\2\2\2\35g\3\2\2\2\37i\3\2\2\2"+
		"!k\3\2\2\2#n\3\2\2\2%t\3\2\2\2\'\u0084\3\2\2\2)\u0092\3\2\2\2+\u0099\3"+
		"\2\2\2-\u00a0\3\2\2\2/\u00a7\3\2\2\2\61\u00b2\3\2\2\2\63\u00b4\3\2\2\2"+
		"\65\u00b6\3\2\2\2\67\u00ba\3\2\2\29\u00bc\3\2\2\2;\u00c0\3\2\2\2=\u00c2"+
		"\3\2\2\2?@\7*\2\2@\4\3\2\2\2AB\7+\2\2B\6\3\2\2\2CD\7k\2\2DE\7p\2\2EF\7"+
		"v\2\2F\b\3\2\2\2GH\7o\2\2HI\7c\2\2IJ\7k\2\2JK\7p\2\2K\n\3\2\2\2LM\7e\2"+
		"\2MN\7q\2\2NO\7p\2\2OP\7u\2\2PQ\7v\2\2Q\f\3\2\2\2RS\7.\2\2S\16\3\2\2\2"+
		"TU\7=\2\2U\20\3\2\2\2VW\7?\2\2W\22\3\2\2\2XY\7}\2\2Y\24\3\2\2\2Z[\7\177"+
		"\2\2[\26\3\2\2\2\\]\7t\2\2]^\7g\2\2^_\7v\2\2_`\7w\2\2`a\7t\2\2ab\7p\2"+
		"\2b\30\3\2\2\2cd\7-\2\2d\32\3\2\2\2ef\7/\2\2f\34\3\2\2\2gh\7,\2\2h\36"+
		"\3\2\2\2ij\7\61\2\2j \3\2\2\2kl\7\'\2\2l\"\3\2\2\2mo\t\2\2\2nm\3\2\2\2"+
		"op\3\2\2\2pn\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\b\22\2\2s$\3\2\2\2tu\7\61\2"+
		"\2uv\7\61\2\2vz\3\2\2\2wy\13\2\2\2xw\3\2\2\2y|\3\2\2\2z{\3\2\2\2zx\3\2"+
		"\2\2{~\3\2\2\2|z\3\2\2\2}\177\7\17\2\2~}\3\2\2\2~\177\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\u0081\7\f\2\2\u0081\u0082\3\2\2\2\u0082\u0083\b\23\2\2"+
		"\u0083&\3\2\2\2\u0084\u0085\7\61\2\2\u0085\u0086\7,\2\2\u0086\u008a\3"+
		"\2\2\2\u0087\u0089\13\2\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008d\u008e\7,\2\2\u008e\u008f\7\61\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0091\b\24\2\2\u0091(\3\2\2\2\u0092\u0096\5\63\32\2\u0093\u0095\5\67"+
		"\34\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097*\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009d\7\62\2\2"+
		"\u009a\u009c\5\65\33\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009d\u009e\3\2\2\2\u009e,\3\2\2\2\u009f\u009d\3\2\2\2\u00a0"+
		"\u00a4\5\61\31\2\u00a1\u00a3\59\35\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3"+
		"\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5.\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a7\u00ab\5=\37\2\u00a8\u00aa\5;\36\2\u00a9\u00a8\3\2\2\2\u00aa"+
		"\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\60\3\2\2"+
		"\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\7\62\2\2\u00af\u00b3\7z\2\2\u00b0\u00b1"+
		"\7\62\2\2\u00b1\u00b3\7Z\2\2\u00b2\u00ae\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3"+
		"\62\3\2\2\2\u00b4\u00b5\4\63;\2\u00b5\64\3\2\2\2\u00b6\u00b7\4\629\2\u00b7"+
		"\66\3\2\2\2\u00b8\u00bb\7\62\2\2\u00b9\u00bb\5\63\32\2\u00ba\u00b8\3\2"+
		"\2\2\u00ba\u00b9\3\2\2\2\u00bb8\3\2\2\2\u00bc\u00bd\t\3\2\2\u00bd:\3\2"+
		"\2\2\u00be\u00c1\5=\37\2\u00bf\u00c1\5\67\34\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00bf\3\2\2\2\u00c1<\3\2\2\2\u00c2\u00c3\t\4\2\2\u00c3>\3\2\2\2\16\2"+
		"pz~\u008a\u0096\u009d\u00a4\u00ab\u00b2\u00ba\u00c0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}