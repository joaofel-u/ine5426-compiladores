// Generated from lcc.g4 by ANTLR 4.9

    package main.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lcc extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Program=1, Funclist=2, Funcdef=3, Paramlist=4, Statement=5, Vardecl=6, 
		Atribstat=7, Funcall=8, Paramlistcall=9, Printstat=10, Readstat=11, Ifstat=12, 
		Forstat=13, Statelist=14, Allocexpression=15, Expression=16, Numexpression=17, 
		Term=18, Unaryexpr=19, Factor=20, Lvalue=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Program", "Funclist", "Funcdef", "Paramlist", "Statement", "Vardecl", 
			"Atribstat", "Funcall", "Paramlistcall", "Printstat", "Readstat", "Returnstat", 
			"Ifstat", "Forstat", "Statelist", "Allocexpression", "Expression", "Numexpression", 
			"Term", "Unaryexpr", "Factor", "Lvalue", "Ident", "Intconstant", "Floatconstant", 
			"Stringconstant"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Program", "Funclist", "Funcdef", "Paramlist", "Statement", "Vardecl", 
			"Atribstat", "Funcall", "Paramlistcall", "Printstat", "Readstat", "Ifstat", 
			"Forstat", "Statelist", "Allocexpression", "Expression", "Numexpression", 
			"Term", "Unaryexpr", "Factor", "Lvalue"
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


	public lcc(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "lcc.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u0175\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\5\2:\n\2\3\3\3\3\3\3\3\3\5\3@\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4I\n\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5^\n\5\3\5\3\5\3\5\5\5c\n"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5s\n\5\3"+
		"\5\5\5v\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0095\n"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00a5\n"+
		"\7\3\7\3\7\3\7\3\7\3\7\7\7\u00ac\n\7\f\7\16\7\u00af\13\7\3\b\3\b\3\b\3"+
		"\b\3\b\5\b\u00b6\n\b\3\t\3\t\3\t\5\t\u00bb\n\t\3\t\3\t\3\n\3\n\3\n\5\n"+
		"\u00c2\n\n\3\n\5\n\u00c5\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ea\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\5\20\u00fb\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u010f\n\21\3\21\3\21\3\21\3\21"+
		"\6\21\u0115\n\21\r\21\16\21\u0116\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\5\22\u0123\n\22\3\22\5\22\u0126\n\22\3\23\3\23\3\23\7\23"+
		"\u012b\n\23\f\23\16\23\u012e\13\23\3\24\3\24\3\24\7\24\u0133\n\24\f\24"+
		"\16\24\u0136\13\24\3\25\5\25\u0139\n\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0149\n\26\3\27\3\27\3\27"+
		"\3\27\3\27\7\27\u0150\n\27\f\27\16\27\u0153\13\27\3\30\5\30\u0156\n\30"+
		"\3\30\7\30\u0159\n\30\f\30\16\30\u015c\13\30\3\31\6\31\u015f\n\31\r\31"+
		"\16\31\u0160\3\32\6\32\u0164\n\32\r\32\16\32\u0165\3\32\3\32\7\32\u016a"+
		"\n\32\f\32\16\32\u016d\13\32\5\32\u016f\n\32\3\33\6\33\u0172\n\33\r\33"+
		"\16\33\u0173\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\2\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\2\61\2\63\2\65\2"+
		"\3\2\b\4\2>>@@\4\2--//\5\2\'\',,^^\4\2C\\c|\5\2\62;C\\c|\3\2\62;\2\u01a3"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\39\3\2\2\2\5?\3\2\2\2"+
		"\7A\3\2\2\2\tu\3\2\2\2\13\u0094\3\2\2\2\r\u00a4\3\2\2\2\17\u00b0\3\2\2"+
		"\2\21\u00b7\3\2\2\2\23\u00c4\3\2\2\2\25\u00c6\3\2\2\2\27\u00ce\3\2\2\2"+
		"\31\u00d5\3\2\2\2\33\u00dc\3\2\2\2\35\u00eb\3\2\2\2\37\u00f8\3\2\2\2!"+
		"\u00fc\3\2\2\2#\u0118\3\2\2\2%\u0127\3\2\2\2\'\u012f\3\2\2\2)\u0138\3"+
		"\2\2\2+\u0148\3\2\2\2-\u014a\3\2\2\2/\u0155\3\2\2\2\61\u015e\3\2\2\2\63"+
		"\u0163\3\2\2\2\65\u0171\3\2\2\2\67:\5\13\6\28:\5\5\3\29\67\3\2\2\298\3"+
		"\2\2\29:\3\2\2\2:\4\3\2\2\2;<\5\7\4\2<=\5\5\3\2=@\3\2\2\2>@\5\7\4\2?;"+
		"\3\2\2\2?>\3\2\2\2@\6\3\2\2\2AB\7f\2\2BC\7g\2\2CD\7h\2\2DE\3\2\2\2EF\5"+
		"/\30\2FH\7*\2\2GI\5\t\5\2HG\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\7+\2\2KL\7}"+
		"\2\2LM\5\37\20\2MN\7\177\2\2N\b\3\2\2\2OP\7k\2\2PQ\7p\2\2Q^\7v\2\2RS\7"+
		"h\2\2ST\7n\2\2TU\7q\2\2UV\7c\2\2V^\7v\2\2WX\7u\2\2XY\7v\2\2YZ\7t\2\2Z"+
		"[\7k\2\2[\\\7p\2\2\\^\7i\2\2]O\3\2\2\2]R\3\2\2\2]W\3\2\2\2^_\3\2\2\2_"+
		"`\5/\30\2`b\7.\2\2ac\5\t\5\2ba\3\2\2\2bc\3\2\2\2cv\3\2\2\2de\7k\2\2ef"+
		"\7p\2\2fs\7v\2\2gh\7h\2\2hi\7n\2\2ij\7q\2\2jk\7c\2\2ks\7v\2\2lm\7u\2\2"+
		"mn\7v\2\2no\7t\2\2op\7k\2\2pq\7p\2\2qs\7i\2\2rd\3\2\2\2rg\3\2\2\2rl\3"+
		"\2\2\2st\3\2\2\2tv\5/\30\2u]\3\2\2\2ur\3\2\2\2v\n\3\2\2\2wx\5\r\7\2xy"+
		"\7=\2\2y\u0095\3\2\2\2z{\5\17\b\2{|\7=\2\2|\u0095\3\2\2\2}~\5\25\13\2"+
		"~\177\7=\2\2\177\u0095\3\2\2\2\u0080\u0081\5\27\f\2\u0081\u0082\7=\2\2"+
		"\u0082\u0095\3\2\2\2\u0083\u0084\5\31\r\2\u0084\u0085\7=\2\2\u0085\u0095"+
		"\3\2\2\2\u0086\u0095\5\33\16\2\u0087\u0095\5\35\17\2\u0088\u0089\7}\2"+
		"\2\u0089\u008a\5\37\20\2\u008a\u008b\7\177\2\2\u008b\u0095\3\2\2\2\u008c"+
		"\u008d\7d\2\2\u008d\u008e\7t\2\2\u008e\u008f\7g\2\2\u008f\u0090\7c\2\2"+
		"\u0090\u0091\7m\2\2\u0091\u0092\3\2\2\2\u0092\u0095\7=\2\2\u0093\u0095"+
		"\7=\2\2\u0094w\3\2\2\2\u0094z\3\2\2\2\u0094}\3\2\2\2\u0094\u0080\3\2\2"+
		"\2\u0094\u0083\3\2\2\2\u0094\u0086\3\2\2\2\u0094\u0087\3\2\2\2\u0094\u0088"+
		"\3\2\2\2\u0094\u008c\3\2\2\2\u0094\u0093\3\2\2\2\u0095\f\3\2\2\2\u0096"+
		"\u0097\7k\2\2\u0097\u0098\7p\2\2\u0098\u00a5\7v\2\2\u0099\u009a\7h\2\2"+
		"\u009a\u009b\7n\2\2\u009b\u009c\7q\2\2\u009c\u009d\7c\2\2\u009d\u00a5"+
		"\7v\2\2\u009e\u009f\7u\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1\7t\2\2\u00a1"+
		"\u00a2\7k\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a5\7i\2\2\u00a4\u0096\3\2\2"+
		"\2\u00a4\u0099\3\2\2\2\u00a4\u009e\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00ad"+
		"\5/\30\2\u00a7\u00a8\7]\2\2\u00a8\u00a9\5\61\31\2\u00a9\u00aa\7_\2\2\u00aa"+
		"\u00ac\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ad\u00ae\3\2\2\2\u00ae\16\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1"+
		"\5-\27\2\u00b1\u00b5\7?\2\2\u00b2\u00b6\5#\22\2\u00b3\u00b6\5!\21\2\u00b4"+
		"\u00b6\5\21\t\2\u00b5\u00b2\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3"+
		"\2\2\2\u00b6\20\3\2\2\2\u00b7\u00b8\5/\30\2\u00b8\u00ba\7*\2\2\u00b9\u00bb"+
		"\5\23\n\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2"+
		"\u00bc\u00bd\7+\2\2\u00bd\22\3\2\2\2\u00be\u00bf\5/\30\2\u00bf\u00c1\7"+
		".\2\2\u00c0\u00c2\5\23\n\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c5\3\2\2\2\u00c3\u00c5\5/\30\2\u00c4\u00be\3\2\2\2\u00c4\u00c3\3\2"+
		"\2\2\u00c5\24\3\2\2\2\u00c6\u00c7\7r\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9"+
		"\7k\2\2\u00c9\u00ca\7p\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00cd\5#\22\2\u00cd\26\3\2\2\2\u00ce\u00cf\7t\2\2\u00cf\u00d0\7g\2\2"+
		"\u00d0\u00d1\7c\2\2\u00d1\u00d2\7f\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4"+
		"\5-\27\2\u00d4\30\3\2\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7g\2\2\u00d7"+
		"\u00d8\7v\2\2\u00d8\u00d9\7w\2\2\u00d9\u00da\7t\2\2\u00da\u00db\7p\2\2"+
		"\u00db\32\3\2\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7h\2\2\u00de\u00df\3"+
		"\2\2\2\u00df\u00e0\7*\2\2\u00e0\u00e1\5#\22\2\u00e1\u00e2\7+\2\2\u00e2"+
		"\u00e9\5\13\6\2\u00e3\u00e4\7g\2\2\u00e4\u00e5\7n\2\2\u00e5\u00e6\7u\2"+
		"\2\u00e6\u00e7\7g\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\5\13\6\2\u00e9\u00e3"+
		"\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\34\3\2\2\2\u00eb\u00ec\7h\2\2\u00ec"+
		"\u00ed\7q\2\2\u00ed\u00ee\7t\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\7*\2"+
		"\2\u00f0\u00f1\5\17\b\2\u00f1\u00f2\7=\2\2\u00f2\u00f3\5#\22\2\u00f3\u00f4"+
		"\7=\2\2\u00f4\u00f5\5\17\b\2\u00f5\u00f6\7+\2\2\u00f6\u00f7\5\13\6\2\u00f7"+
		"\36\3\2\2\2\u00f8\u00fa\5\13\6\2\u00f9\u00fb\5\13\6\2\u00fa\u00f9\3\2"+
		"\2\2\u00fa\u00fb\3\2\2\2\u00fb \3\2\2\2\u00fc\u00fd\7p\2\2\u00fd\u00fe"+
		"\7g\2\2\u00fe\u00ff\7y\2\2\u00ff\u010e\3\2\2\2\u0100\u0101\7k\2\2\u0101"+
		"\u0102\7p\2\2\u0102\u010f\7v\2\2\u0103\u0104\7h\2\2\u0104\u0105\7n\2\2"+
		"\u0105\u0106\7q\2\2\u0106\u0107\7c\2\2\u0107\u010f\7v\2\2\u0108\u0109"+
		"\7u\2\2\u0109\u010a\7v\2\2\u010a\u010b\7t\2\2\u010b\u010c\7k\2\2\u010c"+
		"\u010d\7p\2\2\u010d\u010f\7i\2\2\u010e\u0100\3\2\2\2\u010e\u0103\3\2\2"+
		"\2\u010e\u0108\3\2\2\2\u010f\u0114\3\2\2\2\u0110\u0111\7]\2\2\u0111\u0112"+
		"\5%\23\2\u0112\u0113\7_\2\2\u0113\u0115\3\2\2\2\u0114\u0110\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\"\3\2\2\2"+
		"\u0118\u0125\5%\23\2\u0119\u0123\t\2\2\2\u011a\u011b\7>\2\2\u011b\u0123"+
		"\7?\2\2\u011c\u011d\7@\2\2\u011d\u0123\7?\2\2\u011e\u011f\7?\2\2\u011f"+
		"\u0123\7?\2\2\u0120\u0121\7#\2\2\u0121\u0123\7?\2\2\u0122\u0119\3\2\2"+
		"\2\u0122\u011a\3\2\2\2\u0122\u011c\3\2\2\2\u0122\u011e\3\2\2\2\u0122\u0120"+
		"\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126\5%\23\2\u0125\u0122\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126$\3\2\2\2\u0127\u012c\5\'\24\2\u0128\u0129\t\3\2\2"+
		"\u0129\u012b\5\'\24\2\u012a\u0128\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a"+
		"\3\2\2\2\u012c\u012d\3\2\2\2\u012d&\3\2\2\2\u012e\u012c\3\2\2\2\u012f"+
		"\u0134\5)\25\2\u0130\u0131\t\4\2\2\u0131\u0133\5)\25\2\u0132\u0130\3\2"+
		"\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"(\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0139\t\3\2\2\u0138\u0137\3\2\2\2"+
		"\u0138\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\5+\26\2\u013b*\3"+
		"\2\2\2\u013c\u0149\5\61\31\2\u013d\u0149\5\63\32\2\u013e\u0149\5\65\33"+
		"\2\u013f\u0140\7p\2\2\u0140\u0141\7w\2\2\u0141\u0142\7n\2\2\u0142\u0149"+
		"\7n\2\2\u0143\u0149\5-\27\2\u0144\u0145\7*\2\2\u0145\u0146\5%\23\2\u0146"+
		"\u0147\7+\2\2\u0147\u0149\3\2\2\2\u0148\u013c\3\2\2\2\u0148\u013d\3\2"+
		"\2\2\u0148\u013e\3\2\2\2\u0148\u013f\3\2\2\2\u0148\u0143\3\2\2\2\u0148"+
		"\u0144\3\2\2\2\u0149,\3\2\2\2\u014a\u0151\5/\30\2\u014b\u014c\7]\2\2\u014c"+
		"\u014d\5%\23\2\u014d\u014e\7_\2\2\u014e\u0150\3\2\2\2\u014f\u014b\3\2"+
		"\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		".\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0156\t\5\2\2\u0155\u0154\3\2\2\2"+
		"\u0156\u015a\3\2\2\2\u0157\u0159\t\6\2\2\u0158\u0157\3\2\2\2\u0159\u015c"+
		"\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\60\3\2\2\2\u015c"+
		"\u015a\3\2\2\2\u015d\u015f\t\7\2\2\u015e\u015d\3\2\2\2\u015f\u0160\3\2"+
		"\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\62\3\2\2\2\u0162\u0164"+
		"\t\7\2\2\u0163\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0163\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u016e\3\2\2\2\u0167\u016b\7\60\2\2\u0168\u016a\t"+
		"\7\2\2\u0169\u0168\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u0167\3\2"+
		"\2\2\u016e\u016f\3\2\2\2\u016f\64\3\2\2\2\u0170\u0172\t\5\2\2\u0171\u0170"+
		"\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\66\3\2\2\2%\29?H]bru\u0094\u00a4\u00ad\u00b5\u00ba\u00c1\u00c4\u00e9"+
		"\u00fa\u010e\u0116\u0122\u0125\u012c\u0134\u0138\u0148\u0151\u0155\u0158"+
		"\u015a\u0160\u0165\u016b\u016e\u0171\u0173\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}