// Generated from /home/joao/ine5426-compiladores/src/main/antlr/MyGrammar.g4 by ANTLR 4.9.1

    package main.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Def=1, Int=2, Float=3, String=4, Print=5, Read=6, Return=7, Break=8, If=9, 
		Else=10, For=11, New=12, Null=13, Ident=14, Int_constant=15, Float_constant=16, 
		String_constant=17, Whitespace=18, Lparen=19, Rparen=20, Lbrace=21, Rbrace=22, 
		Lbracket=23, Rbracket=24, Semicolon=25, Comma=26, Assign=27, Lesser=28, 
		Greater=29, Lesserequal=30, Greaterequal=31, Equal=32, Different=33, Plus=34, 
		Minus=35, Multiply=36, Divide=37, Module=38;
	public static final int
		RULE_program = 0, RULE_funclist = 1, RULE_funclistaux = 2, RULE_funcdef = 3, 
		RULE_paramlist = 4, RULE_paramlistaux = 5, RULE_statement = 6, RULE_vardecl = 7, 
		RULE_vardeclaux = 8, RULE_vartype = 9, RULE_atribstat = 10, RULE_atribstataux = 11, 
		RULE_funccall = 12, RULE_paramlistcall = 13, RULE_paramlistcallaux = 14, 
		RULE_printstat = 15, RULE_readstat = 16, RULE_returnstat = 17, RULE_breakstat = 18, 
		RULE_ifstat = 19, RULE_elsestat = 20, RULE_forstat = 21, RULE_statelist = 22, 
		RULE_statelistaux = 23, RULE_allocexpression = 24, RULE_allocexpressionaux = 25, 
		RULE_allocexpressionaux2 = 26, RULE_expression = 27, RULE_expressionaux = 28, 
		RULE_comparator = 29, RULE_numexpression = 30, RULE_numexpressionaux = 31, 
		RULE_term = 32, RULE_termaux = 33, RULE_minusplus = 34, RULE_operators = 35, 
		RULE_unaryexpr = 36, RULE_factor = 37, RULE_lvalue = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "funclist", "funclistaux", "funcdef", "paramlist", "paramlistaux", 
			"statement", "vardecl", "vardeclaux", "vartype", "atribstat", "atribstataux", 
			"funccall", "paramlistcall", "paramlistcallaux", "printstat", "readstat", 
			"returnstat", "breakstat", "ifstat", "elsestat", "forstat", "statelist", 
			"statelistaux", "allocexpression", "allocexpressionaux", "allocexpressionaux2", 
			"expression", "expressionaux", "comparator", "numexpression", "numexpressionaux", 
			"term", "termaux", "minusplus", "operators", "unaryexpr", "factor", "lvalue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'int'", "'float'", "'string'", "'print'", "'read'", "'return'", 
			"'break'", "'if'", "'else'", "'for'", "'new'", "'null'", null, null, 
			null, null, null, "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", 
			"'='", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'+'", "'-'", "'*'", 
			"'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Def", "Int", "Float", "String", "Print", "Read", "Return", "Break", 
			"If", "Else", "For", "New", "Null", "Ident", "Int_constant", "Float_constant", 
			"String_constant", "Whitespace", "Lparen", "Rparen", "Lbrace", "Rbrace", 
			"Lbracket", "Rbracket", "Semicolon", "Comma", "Assign", "Lesser", "Greater", 
			"Lesserequal", "Greaterequal", "Equal", "Different", "Plus", "Minus", 
			"Multiply", "Divide", "Module"
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
	public String getGrammarFileName() { return "MyGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FunclistContext funclist() {
			return getRuleContext(FunclistContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
			case Float:
			case String:
			case Print:
			case Read:
			case Return:
			case Break:
			case If:
			case For:
			case Ident:
			case Lbrace:
			case Semicolon:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				statement();
				}
				break;
			case Def:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				funclist();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class FunclistContext extends ParserRuleContext {
		public FuncdefContext funcdef() {
			return getRuleContext(FuncdefContext.class,0);
		}
		public FunclistauxContext funclistaux() {
			return getRuleContext(FunclistauxContext.class,0);
		}
		public FunclistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funclist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterFunclist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitFunclist(this);
		}
	}

	public final FunclistContext funclist() throws RecognitionException {
		FunclistContext _localctx = new FunclistContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funclist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			funcdef();
			setState(84);
			funclistaux();
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

	public static class FunclistauxContext extends ParserRuleContext {
		public FunclistContext funclist() {
			return getRuleContext(FunclistContext.class,0);
		}
		public FunclistauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funclistaux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterFunclistaux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitFunclistaux(this);
		}
	}

	public final FunclistauxContext funclistaux() throws RecognitionException {
		FunclistauxContext _localctx = new FunclistauxContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funclistaux);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Def:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				funclist();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class FuncdefContext extends ParserRuleContext {
		public TerminalNode Def() { return getToken(MyGrammarParser.Def, 0); }
		public TerminalNode Ident() { return getToken(MyGrammarParser.Ident, 0); }
		public TerminalNode Lparen() { return getToken(MyGrammarParser.Lparen, 0); }
		public ParamlistContext paramlist() {
			return getRuleContext(ParamlistContext.class,0);
		}
		public TerminalNode Rparen() { return getToken(MyGrammarParser.Rparen, 0); }
		public TerminalNode Lbrace() { return getToken(MyGrammarParser.Lbrace, 0); }
		public StatelistContext statelist() {
			return getRuleContext(StatelistContext.class,0);
		}
		public TerminalNode Rbrace() { return getToken(MyGrammarParser.Rbrace, 0); }
		public FuncdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterFuncdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitFuncdef(this);
		}
	}

	public final FuncdefContext funcdef() throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcdef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(Def);
			setState(91);
			match(Ident);
			setState(92);
			match(Lparen);
			setState(93);
			paramlist();
			setState(94);
			match(Rparen);
			setState(95);
			match(Lbrace);
			setState(96);
			statelist();
			setState(97);
			match(Rbrace);
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

	public static class ParamlistContext extends ParserRuleContext {
		public VartypeContext vartype() {
			return getRuleContext(VartypeContext.class,0);
		}
		public TerminalNode Ident() { return getToken(MyGrammarParser.Ident, 0); }
		public ParamlistauxContext paramlistaux() {
			return getRuleContext(ParamlistauxContext.class,0);
		}
		public ParamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterParamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitParamlist(this);
		}
	}

	public final ParamlistContext paramlist() throws RecognitionException {
		ParamlistContext _localctx = new ParamlistContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_paramlist);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
			case Float:
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				vartype();
				setState(100);
				match(Ident);
				setState(101);
				paramlistaux();
				}
				break;
			case Rparen:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ParamlistauxContext extends ParserRuleContext {
		public TerminalNode Comma() { return getToken(MyGrammarParser.Comma, 0); }
		public ParamlistContext paramlist() {
			return getRuleContext(ParamlistContext.class,0);
		}
		public ParamlistauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramlistaux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterParamlistaux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitParamlistaux(this);
		}
	}

	public final ParamlistauxContext paramlistaux() throws RecognitionException {
		ParamlistauxContext _localctx = new ParamlistauxContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_paramlistaux);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Comma:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(Comma);
				setState(107);
				paramlist();
				}
				break;
			case Rparen:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class StatementContext extends ParserRuleContext {
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(MyGrammarParser.Semicolon, 0); }
		public AtribstatContext atribstat() {
			return getRuleContext(AtribstatContext.class,0);
		}
		public PrintstatContext printstat() {
			return getRuleContext(PrintstatContext.class,0);
		}
		public ReadstatContext readstat() {
			return getRuleContext(ReadstatContext.class,0);
		}
		public ReturnstatContext returnstat() {
			return getRuleContext(ReturnstatContext.class,0);
		}
		public IfstatContext ifstat() {
			return getRuleContext(IfstatContext.class,0);
		}
		public ForstatContext forstat() {
			return getRuleContext(ForstatContext.class,0);
		}
		public TerminalNode Lbrace() { return getToken(MyGrammarParser.Lbrace, 0); }
		public StatelistContext statelist() {
			return getRuleContext(StatelistContext.class,0);
		}
		public TerminalNode Rbrace() { return getToken(MyGrammarParser.Rbrace, 0); }
		public BreakstatContext breakstat() {
			return getRuleContext(BreakstatContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
			case Float:
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				vardecl();
				setState(112);
				match(Semicolon);
				}
				break;
			case Ident:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				atribstat();
				setState(115);
				match(Semicolon);
				}
				break;
			case Print:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				printstat();
				setState(118);
				match(Semicolon);
				}
				break;
			case Read:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				readstat();
				setState(121);
				match(Semicolon);
				}
				break;
			case Return:
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				returnstat();
				setState(124);
				match(Semicolon);
				}
				break;
			case If:
				enterOuterAlt(_localctx, 6);
				{
				setState(126);
				ifstat();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 7);
				{
				setState(127);
				forstat();
				}
				break;
			case Lbrace:
				enterOuterAlt(_localctx, 8);
				{
				setState(128);
				match(Lbrace);
				setState(129);
				statelist();
				setState(130);
				match(Rbrace);
				}
				break;
			case Break:
				enterOuterAlt(_localctx, 9);
				{
				setState(132);
				breakstat();
				}
				break;
			case Semicolon:
				enterOuterAlt(_localctx, 10);
				{
				setState(133);
				match(Semicolon);
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

	public static class VardeclContext extends ParserRuleContext {
		public VartypeContext vartype() {
			return getRuleContext(VartypeContext.class,0);
		}
		public TerminalNode Ident() { return getToken(MyGrammarParser.Ident, 0); }
		public VardeclauxContext vardeclaux() {
			return getRuleContext(VardeclauxContext.class,0);
		}
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterVardecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitVardecl(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_vardecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			vartype();
			setState(137);
			match(Ident);
			setState(138);
			vardeclaux();
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

	public static class VardeclauxContext extends ParserRuleContext {
		public TerminalNode Lbracket() { return getToken(MyGrammarParser.Lbracket, 0); }
		public TerminalNode Int_constant() { return getToken(MyGrammarParser.Int_constant, 0); }
		public TerminalNode Rbracket() { return getToken(MyGrammarParser.Rbracket, 0); }
		public VardeclauxContext vardeclaux() {
			return getRuleContext(VardeclauxContext.class,0);
		}
		public VardeclauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardeclaux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterVardeclaux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitVardeclaux(this);
		}
	}

	public final VardeclauxContext vardeclaux() throws RecognitionException {
		VardeclauxContext _localctx = new VardeclauxContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_vardeclaux);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Lbracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(Lbracket);
				setState(141);
				match(Int_constant);
				setState(142);
				match(Rbracket);
				setState(143);
				vardeclaux();
				}
				break;
			case Semicolon:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class VartypeContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(MyGrammarParser.Int, 0); }
		public TerminalNode Float() { return getToken(MyGrammarParser.Float, 0); }
		public TerminalNode String() { return getToken(MyGrammarParser.String, 0); }
		public VartypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vartype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterVartype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitVartype(this);
		}
	}

	public final VartypeContext vartype() throws RecognitionException {
		VartypeContext _localctx = new VartypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_vartype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Float) | (1L << String))) != 0)) ) {
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

	public static class AtribstatContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode Assign() { return getToken(MyGrammarParser.Assign, 0); }
		public AtribstatauxContext atribstataux() {
			return getRuleContext(AtribstatauxContext.class,0);
		}
		public AtribstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterAtribstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitAtribstat(this);
		}
	}

	public final AtribstatContext atribstat() throws RecognitionException {
		AtribstatContext _localctx = new AtribstatContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_atribstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			lvalue();
			setState(150);
			match(Assign);
			setState(151);
			atribstataux();
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

	public static class AtribstatauxContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AllocexpressionContext allocexpression() {
			return getRuleContext(AllocexpressionContext.class,0);
		}
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public AtribstatauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribstataux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterAtribstataux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitAtribstataux(this);
		}
	}

	public final AtribstatauxContext atribstataux() throws RecognitionException {
		AtribstatauxContext _localctx = new AtribstatauxContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_atribstataux);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				allocexpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				funccall();
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

	public static class FunccallContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(MyGrammarParser.Ident, 0); }
		public TerminalNode Lparen() { return getToken(MyGrammarParser.Lparen, 0); }
		public ParamlistcallContext paramlistcall() {
			return getRuleContext(ParamlistcallContext.class,0);
		}
		public TerminalNode Rparen() { return getToken(MyGrammarParser.Rparen, 0); }
		public FunccallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterFunccall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitFunccall(this);
		}
	}

	public final FunccallContext funccall() throws RecognitionException {
		FunccallContext _localctx = new FunccallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funccall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(Ident);
			setState(159);
			match(Lparen);
			setState(160);
			paramlistcall();
			setState(161);
			match(Rparen);
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

	public static class ParamlistcallContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(MyGrammarParser.Ident, 0); }
		public ParamlistcallauxContext paramlistcallaux() {
			return getRuleContext(ParamlistcallauxContext.class,0);
		}
		public ParamlistcallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramlistcall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterParamlistcall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitParamlistcall(this);
		}
	}

	public final ParamlistcallContext paramlistcall() throws RecognitionException {
		ParamlistcallContext _localctx = new ParamlistcallContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_paramlistcall);
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ident:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(Ident);
				setState(164);
				paramlistcallaux();
				}
				break;
			case Rparen:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ParamlistcallauxContext extends ParserRuleContext {
		public TerminalNode Comma() { return getToken(MyGrammarParser.Comma, 0); }
		public ParamlistcallContext paramlistcall() {
			return getRuleContext(ParamlistcallContext.class,0);
		}
		public ParamlistcallauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramlistcallaux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterParamlistcallaux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitParamlistcallaux(this);
		}
	}

	public final ParamlistcallauxContext paramlistcallaux() throws RecognitionException {
		ParamlistcallauxContext _localctx = new ParamlistcallauxContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_paramlistcallaux);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Comma:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(Comma);
				setState(169);
				paramlistcall();
				}
				break;
			case Rparen:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class PrintstatContext extends ParserRuleContext {
		public TerminalNode Print() { return getToken(MyGrammarParser.Print, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterPrintstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitPrintstat(this);
		}
	}

	public final PrintstatContext printstat() throws RecognitionException {
		PrintstatContext _localctx = new PrintstatContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_printstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(Print);
			setState(174);
			expression();
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

	public static class ReadstatContext extends ParserRuleContext {
		public TerminalNode Read() { return getToken(MyGrammarParser.Read, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ReadstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterReadstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitReadstat(this);
		}
	}

	public final ReadstatContext readstat() throws RecognitionException {
		ReadstatContext _localctx = new ReadstatContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_readstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(Read);
			setState(177);
			lvalue();
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

	public static class ReturnstatContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(MyGrammarParser.Return, 0); }
		public ReturnstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterReturnstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitReturnstat(this);
		}
	}

	public final ReturnstatContext returnstat() throws RecognitionException {
		ReturnstatContext _localctx = new ReturnstatContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_returnstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(Return);
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

	public static class BreakstatContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(MyGrammarParser.Break, 0); }
		public TerminalNode Semicolon() { return getToken(MyGrammarParser.Semicolon, 0); }
		public BreakstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterBreakstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitBreakstat(this);
		}
	}

	public final BreakstatContext breakstat() throws RecognitionException {
		BreakstatContext _localctx = new BreakstatContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_breakstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(Break);
			setState(182);
			match(Semicolon);
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

	public static class IfstatContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(MyGrammarParser.If, 0); }
		public TerminalNode Lparen() { return getToken(MyGrammarParser.Lparen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Rparen() { return getToken(MyGrammarParser.Rparen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElsestatContext elsestat() {
			return getRuleContext(ElsestatContext.class,0);
		}
		public IfstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterIfstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitIfstat(this);
		}
	}

	public final IfstatContext ifstat() throws RecognitionException {
		IfstatContext _localctx = new IfstatContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ifstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(If);
			setState(185);
			match(Lparen);
			setState(186);
			expression();
			setState(187);
			match(Rparen);
			setState(188);
			statement();
			setState(189);
			elsestat();
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

	public static class ElsestatContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(MyGrammarParser.Else, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElsestatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsestat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterElsestat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitElsestat(this);
		}
	}

	public final ElsestatContext elsestat() throws RecognitionException {
		ElsestatContext _localctx = new ElsestatContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_elsestat);
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(Else);
				setState(192);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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

	public static class ForstatContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(MyGrammarParser.For, 0); }
		public TerminalNode Lparen() { return getToken(MyGrammarParser.Lparen, 0); }
		public List<AtribstatContext> atribstat() {
			return getRuleContexts(AtribstatContext.class);
		}
		public AtribstatContext atribstat(int i) {
			return getRuleContext(AtribstatContext.class,i);
		}
		public List<TerminalNode> Semicolon() { return getTokens(MyGrammarParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(MyGrammarParser.Semicolon, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Rparen() { return getToken(MyGrammarParser.Rparen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterForstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitForstat(this);
		}
	}

	public final ForstatContext forstat() throws RecognitionException {
		ForstatContext _localctx = new ForstatContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_forstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(For);
			setState(197);
			match(Lparen);
			setState(198);
			atribstat();
			setState(199);
			match(Semicolon);
			setState(200);
			expression();
			setState(201);
			match(Semicolon);
			setState(202);
			atribstat();
			setState(203);
			match(Rparen);
			setState(204);
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

	public static class StatelistContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatelistauxContext statelistaux() {
			return getRuleContext(StatelistauxContext.class,0);
		}
		public StatelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterStatelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitStatelist(this);
		}
	}

	public final StatelistContext statelist() throws RecognitionException {
		StatelistContext _localctx = new StatelistContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_statelist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			statement();
			setState(207);
			statelistaux();
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

	public static class StatelistauxContext extends ParserRuleContext {
		public StatelistContext statelist() {
			return getRuleContext(StatelistContext.class,0);
		}
		public StatelistauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statelistaux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterStatelistaux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitStatelistaux(this);
		}
	}

	public final StatelistauxContext statelistaux() throws RecognitionException {
		StatelistauxContext _localctx = new StatelistauxContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_statelistaux);
		try {
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
			case Float:
			case String:
			case Print:
			case Read:
			case Return:
			case Break:
			case If:
			case For:
			case Ident:
			case Lbrace:
			case Semicolon:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				statelist();
				}
				break;
			case Rbrace:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class AllocexpressionContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(MyGrammarParser.New, 0); }
		public VartypeContext vartype() {
			return getRuleContext(VartypeContext.class,0);
		}
		public TerminalNode Lbracket() { return getToken(MyGrammarParser.Lbracket, 0); }
		public NumexpressionContext numexpression() {
			return getRuleContext(NumexpressionContext.class,0);
		}
		public TerminalNode Rbracket() { return getToken(MyGrammarParser.Rbracket, 0); }
		public AllocexpressionauxContext allocexpressionaux() {
			return getRuleContext(AllocexpressionauxContext.class,0);
		}
		public AllocexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allocexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterAllocexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitAllocexpression(this);
		}
	}

	public final AllocexpressionContext allocexpression() throws RecognitionException {
		AllocexpressionContext _localctx = new AllocexpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_allocexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(New);
			setState(214);
			vartype();
			setState(215);
			match(Lbracket);
			setState(216);
			numexpression();
			setState(217);
			match(Rbracket);
			setState(218);
			allocexpressionaux();
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

	public static class AllocexpressionauxContext extends ParserRuleContext {
		public TerminalNode Lbracket() { return getToken(MyGrammarParser.Lbracket, 0); }
		public NumexpressionContext numexpression() {
			return getRuleContext(NumexpressionContext.class,0);
		}
		public TerminalNode Rbracket() { return getToken(MyGrammarParser.Rbracket, 0); }
		public Allocexpressionaux2Context allocexpressionaux2() {
			return getRuleContext(Allocexpressionaux2Context.class,0);
		}
		public AllocexpressionauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allocexpressionaux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterAllocexpressionaux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitAllocexpressionaux(this);
		}
	}

	public final AllocexpressionauxContext allocexpressionaux() throws RecognitionException {
		AllocexpressionauxContext _localctx = new AllocexpressionauxContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_allocexpressionaux);
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Lbracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(Lbracket);
				setState(221);
				numexpression();
				setState(222);
				match(Rbracket);
				setState(223);
				allocexpressionaux2();
				}
				break;
			case Rparen:
			case Rbracket:
			case Semicolon:
			case Assign:
			case Lesser:
			case Greater:
			case Lesserequal:
			case Greaterequal:
			case Equal:
			case Different:
			case Plus:
			case Minus:
			case Multiply:
			case Divide:
			case Module:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Allocexpressionaux2Context extends ParserRuleContext {
		public TerminalNode Lbracket() { return getToken(MyGrammarParser.Lbracket, 0); }
		public NumexpressionContext numexpression() {
			return getRuleContext(NumexpressionContext.class,0);
		}
		public TerminalNode Rbracket() { return getToken(MyGrammarParser.Rbracket, 0); }
		public AllocexpressionauxContext allocexpressionaux() {
			return getRuleContext(AllocexpressionauxContext.class,0);
		}
		public Allocexpressionaux2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allocexpressionaux2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterAllocexpressionaux2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitAllocexpressionaux2(this);
		}
	}

	public final Allocexpressionaux2Context allocexpressionaux2() throws RecognitionException {
		Allocexpressionaux2Context _localctx = new Allocexpressionaux2Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_allocexpressionaux2);
		try {
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Lbracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(Lbracket);
				setState(229);
				numexpression();
				setState(230);
				match(Rbracket);
				setState(231);
				allocexpressionaux();
				}
				break;
			case Rparen:
			case Rbracket:
			case Semicolon:
			case Assign:
			case Lesser:
			case Greater:
			case Lesserequal:
			case Greaterequal:
			case Equal:
			case Different:
			case Plus:
			case Minus:
			case Multiply:
			case Divide:
			case Module:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExpressionContext extends ParserRuleContext {
		public NumexpressionContext numexpression() {
			return getRuleContext(NumexpressionContext.class,0);
		}
		public ExpressionauxContext expressionaux() {
			return getRuleContext(ExpressionauxContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			numexpression();
			setState(237);
			expressionaux();
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

	public static class ExpressionauxContext extends ParserRuleContext {
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public NumexpressionContext numexpression() {
			return getRuleContext(NumexpressionContext.class,0);
		}
		public ExpressionauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionaux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterExpressionaux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitExpressionaux(this);
		}
	}

	public final ExpressionauxContext expressionaux() throws RecognitionException {
		ExpressionauxContext _localctx = new ExpressionauxContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expressionaux);
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Lesser:
			case Greater:
			case Lesserequal:
			case Greaterequal:
			case Equal:
			case Different:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				comparator();
				setState(240);
				numexpression();
				}
				break;
			case Rparen:
			case Semicolon:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ComparatorContext extends ParserRuleContext {
		public TerminalNode Lesser() { return getToken(MyGrammarParser.Lesser, 0); }
		public TerminalNode Greater() { return getToken(MyGrammarParser.Greater, 0); }
		public TerminalNode Lesserequal() { return getToken(MyGrammarParser.Lesserequal, 0); }
		public TerminalNode Greaterequal() { return getToken(MyGrammarParser.Greaterequal, 0); }
		public TerminalNode Equal() { return getToken(MyGrammarParser.Equal, 0); }
		public TerminalNode Different() { return getToken(MyGrammarParser.Different, 0); }
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterComparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitComparator(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Lesser) | (1L << Greater) | (1L << Lesserequal) | (1L << Greaterequal) | (1L << Equal) | (1L << Different))) != 0)) ) {
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

	public static class NumexpressionContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public NumexpressionauxContext numexpressionaux() {
			return getRuleContext(NumexpressionauxContext.class,0);
		}
		public NumexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterNumexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitNumexpression(this);
		}
	}

	public final NumexpressionContext numexpression() throws RecognitionException {
		NumexpressionContext _localctx = new NumexpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_numexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			term();
			setState(248);
			numexpressionaux();
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

	public static class NumexpressionauxContext extends ParserRuleContext {
		public MinusplusContext minusplus() {
			return getRuleContext(MinusplusContext.class,0);
		}
		public NumexpressionContext numexpression() {
			return getRuleContext(NumexpressionContext.class,0);
		}
		public NumexpressionauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numexpressionaux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterNumexpressionaux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitNumexpressionaux(this);
		}
	}

	public final NumexpressionauxContext numexpressionaux() throws RecognitionException {
		NumexpressionauxContext _localctx = new NumexpressionauxContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_numexpressionaux);
		try {
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Plus:
			case Minus:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				minusplus();
				setState(251);
				numexpression();
				}
				break;
			case Rparen:
			case Rbracket:
			case Semicolon:
			case Lesser:
			case Greater:
			case Lesserequal:
			case Greaterequal:
			case Equal:
			case Different:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class TermContext extends ParserRuleContext {
		public UnaryexprContext unaryexpr() {
			return getRuleContext(UnaryexprContext.class,0);
		}
		public TermauxContext termaux() {
			return getRuleContext(TermauxContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			unaryexpr();
			setState(257);
			termaux();
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

	public static class TermauxContext extends ParserRuleContext {
		public OperatorsContext operators() {
			return getRuleContext(OperatorsContext.class,0);
		}
		public UnaryexprContext unaryexpr() {
			return getRuleContext(UnaryexprContext.class,0);
		}
		public TermauxContext termaux() {
			return getRuleContext(TermauxContext.class,0);
		}
		public TermauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termaux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterTermaux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitTermaux(this);
		}
	}

	public final TermauxContext termaux() throws RecognitionException {
		TermauxContext _localctx = new TermauxContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_termaux);
		try {
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Multiply:
			case Divide:
			case Module:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				operators();
				setState(260);
				unaryexpr();
				setState(261);
				termaux();
				}
				break;
			case Rparen:
			case Rbracket:
			case Semicolon:
			case Lesser:
			case Greater:
			case Lesserequal:
			case Greaterequal:
			case Equal:
			case Different:
			case Plus:
			case Minus:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class MinusplusContext extends ParserRuleContext {
		public TerminalNode Plus() { return getToken(MyGrammarParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(MyGrammarParser.Minus, 0); }
		public MinusplusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minusplus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterMinusplus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitMinusplus(this);
		}
	}

	public final MinusplusContext minusplus() throws RecognitionException {
		MinusplusContext _localctx = new MinusplusContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_minusplus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_la = _input.LA(1);
			if ( !(_la==Plus || _la==Minus) ) {
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

	public static class OperatorsContext extends ParserRuleContext {
		public TerminalNode Multiply() { return getToken(MyGrammarParser.Multiply, 0); }
		public TerminalNode Divide() { return getToken(MyGrammarParser.Divide, 0); }
		public TerminalNode Module() { return getToken(MyGrammarParser.Module, 0); }
		public OperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterOperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitOperators(this);
		}
	}

	public final OperatorsContext operators() throws RecognitionException {
		OperatorsContext _localctx = new OperatorsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Multiply) | (1L << Divide) | (1L << Module))) != 0)) ) {
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

	public static class UnaryexprContext extends ParserRuleContext {
		public MinusplusContext minusplus() {
			return getRuleContext(MinusplusContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public UnaryexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterUnaryexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitUnaryexpr(this);
		}
	}

	public final UnaryexprContext unaryexpr() throws RecognitionException {
		UnaryexprContext _localctx = new UnaryexprContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_unaryexpr);
		try {
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Plus:
			case Minus:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				minusplus();
				setState(271);
				factor();
				}
				break;
			case Null:
			case Ident:
			case Int_constant:
			case Float_constant:
			case String_constant:
			case Lparen:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				factor();
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode Int_constant() { return getToken(MyGrammarParser.Int_constant, 0); }
		public TerminalNode Float_constant() { return getToken(MyGrammarParser.Float_constant, 0); }
		public TerminalNode String_constant() { return getToken(MyGrammarParser.String_constant, 0); }
		public TerminalNode Null() { return getToken(MyGrammarParser.Null, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode Lparen() { return getToken(MyGrammarParser.Lparen, 0); }
		public NumexpressionContext numexpression() {
			return getRuleContext(NumexpressionContext.class,0);
		}
		public TerminalNode Rparen() { return getToken(MyGrammarParser.Rparen, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_factor);
		try {
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int_constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(Int_constant);
				}
				break;
			case Float_constant:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(Float_constant);
				}
				break;
			case String_constant:
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				match(String_constant);
				}
				break;
			case Null:
				enterOuterAlt(_localctx, 4);
				{
				setState(279);
				match(Null);
				}
				break;
			case Ident:
				enterOuterAlt(_localctx, 5);
				{
				setState(280);
				lvalue();
				}
				break;
			case Lparen:
				enterOuterAlt(_localctx, 6);
				{
				setState(281);
				match(Lparen);
				setState(282);
				numexpression();
				setState(283);
				match(Rparen);
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

	public static class LvalueContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(MyGrammarParser.Ident, 0); }
		public AllocexpressionauxContext allocexpressionaux() {
			return getRuleContext(AllocexpressionauxContext.class,0);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitLvalue(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_lvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(Ident);
			setState(288);
			allocexpressionaux();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u0125\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\5\2T\n\2"+
		"\3\3\3\3\3\3\3\4\3\4\5\4[\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\5\6k\n\6\3\7\3\7\3\7\5\7p\n\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\b\u0089\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u0094\n\n\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u009f\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\5\17\u00a9\n\17\3\20\3\20\3\20\5\20\u00ae\n\20\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\5\26\u00c5\n\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\5\31\u00d6\n\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00e5"+
		"\n\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00ed\n\34\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\5\36\u00f6\n\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\5!\u0101"+
		"\n!\3\"\3\"\3\"\3#\3#\3#\3#\3#\5#\u010b\n#\3$\3$\3%\3%\3&\3&\3&\3&\5&"+
		"\u0115\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0120\n\'\3(\3(\3(\3"+
		"(\2\2)\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLN\2\6\3\2\4\6\3\2\36#\3\2$%\3\2&(\2\u011d\2S\3\2\2\2\4U\3\2\2"+
		"\2\6Z\3\2\2\2\b\\\3\2\2\2\nj\3\2\2\2\fo\3\2\2\2\16\u0088\3\2\2\2\20\u008a"+
		"\3\2\2\2\22\u0093\3\2\2\2\24\u0095\3\2\2\2\26\u0097\3\2\2\2\30\u009e\3"+
		"\2\2\2\32\u00a0\3\2\2\2\34\u00a8\3\2\2\2\36\u00ad\3\2\2\2 \u00af\3\2\2"+
		"\2\"\u00b2\3\2\2\2$\u00b5\3\2\2\2&\u00b7\3\2\2\2(\u00ba\3\2\2\2*\u00c4"+
		"\3\2\2\2,\u00c6\3\2\2\2.\u00d0\3\2\2\2\60\u00d5\3\2\2\2\62\u00d7\3\2\2"+
		"\2\64\u00e4\3\2\2\2\66\u00ec\3\2\2\28\u00ee\3\2\2\2:\u00f5\3\2\2\2<\u00f7"+
		"\3\2\2\2>\u00f9\3\2\2\2@\u0100\3\2\2\2B\u0102\3\2\2\2D\u010a\3\2\2\2F"+
		"\u010c\3\2\2\2H\u010e\3\2\2\2J\u0114\3\2\2\2L\u011f\3\2\2\2N\u0121\3\2"+
		"\2\2PT\5\16\b\2QT\5\4\3\2RT\3\2\2\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2T\3\3"+
		"\2\2\2UV\5\b\5\2VW\5\6\4\2W\5\3\2\2\2X[\5\4\3\2Y[\3\2\2\2ZX\3\2\2\2ZY"+
		"\3\2\2\2[\7\3\2\2\2\\]\7\3\2\2]^\7\20\2\2^_\7\25\2\2_`\5\n\6\2`a\7\26"+
		"\2\2ab\7\27\2\2bc\5.\30\2cd\7\30\2\2d\t\3\2\2\2ef\5\24\13\2fg\7\20\2\2"+
		"gh\5\f\7\2hk\3\2\2\2ik\3\2\2\2je\3\2\2\2ji\3\2\2\2k\13\3\2\2\2lm\7\34"+
		"\2\2mp\5\n\6\2np\3\2\2\2ol\3\2\2\2on\3\2\2\2p\r\3\2\2\2qr\5\20\t\2rs\7"+
		"\33\2\2s\u0089\3\2\2\2tu\5\26\f\2uv\7\33\2\2v\u0089\3\2\2\2wx\5 \21\2"+
		"xy\7\33\2\2y\u0089\3\2\2\2z{\5\"\22\2{|\7\33\2\2|\u0089\3\2\2\2}~\5$\23"+
		"\2~\177\7\33\2\2\177\u0089\3\2\2\2\u0080\u0089\5(\25\2\u0081\u0089\5,"+
		"\27\2\u0082\u0083\7\27\2\2\u0083\u0084\5.\30\2\u0084\u0085\7\30\2\2\u0085"+
		"\u0089\3\2\2\2\u0086\u0089\5&\24\2\u0087\u0089\7\33\2\2\u0088q\3\2\2\2"+
		"\u0088t\3\2\2\2\u0088w\3\2\2\2\u0088z\3\2\2\2\u0088}\3\2\2\2\u0088\u0080"+
		"\3\2\2\2\u0088\u0081\3\2\2\2\u0088\u0082\3\2\2\2\u0088\u0086\3\2\2\2\u0088"+
		"\u0087\3\2\2\2\u0089\17\3\2\2\2\u008a\u008b\5\24\13\2\u008b\u008c\7\20"+
		"\2\2\u008c\u008d\5\22\n\2\u008d\21\3\2\2\2\u008e\u008f\7\31\2\2\u008f"+
		"\u0090\7\21\2\2\u0090\u0091\7\32\2\2\u0091\u0094\5\22\n\2\u0092\u0094"+
		"\3\2\2\2\u0093\u008e\3\2\2\2\u0093\u0092\3\2\2\2\u0094\23\3\2\2\2\u0095"+
		"\u0096\t\2\2\2\u0096\25\3\2\2\2\u0097\u0098\5N(\2\u0098\u0099\7\35\2\2"+
		"\u0099\u009a\5\30\r\2\u009a\27\3\2\2\2\u009b\u009f\58\35\2\u009c\u009f"+
		"\5\62\32\2\u009d\u009f\5\32\16\2\u009e\u009b\3\2\2\2\u009e\u009c\3\2\2"+
		"\2\u009e\u009d\3\2\2\2\u009f\31\3\2\2\2\u00a0\u00a1\7\20\2\2\u00a1\u00a2"+
		"\7\25\2\2\u00a2\u00a3\5\34\17\2\u00a3\u00a4\7\26\2\2\u00a4\33\3\2\2\2"+
		"\u00a5\u00a6\7\20\2\2\u00a6\u00a9\5\36\20\2\u00a7\u00a9\3\2\2\2\u00a8"+
		"\u00a5\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\35\3\2\2\2\u00aa\u00ab\7\34\2"+
		"\2\u00ab\u00ae\5\34\17\2\u00ac\u00ae\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ad"+
		"\u00ac\3\2\2\2\u00ae\37\3\2\2\2\u00af\u00b0\7\7\2\2\u00b0\u00b1\58\35"+
		"\2\u00b1!\3\2\2\2\u00b2\u00b3\7\b\2\2\u00b3\u00b4\5N(\2\u00b4#\3\2\2\2"+
		"\u00b5\u00b6\7\t\2\2\u00b6%\3\2\2\2\u00b7\u00b8\7\n\2\2\u00b8\u00b9\7"+
		"\33\2\2\u00b9\'\3\2\2\2\u00ba\u00bb\7\13\2\2\u00bb\u00bc\7\25\2\2\u00bc"+
		"\u00bd\58\35\2\u00bd\u00be\7\26\2\2\u00be\u00bf\5\16\b\2\u00bf\u00c0\5"+
		"*\26\2\u00c0)\3\2\2\2\u00c1\u00c2\7\f\2\2\u00c2\u00c5\5\16\b\2\u00c3\u00c5"+
		"\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5+\3\2\2\2\u00c6"+
		"\u00c7\7\r\2\2\u00c7\u00c8\7\25\2\2\u00c8\u00c9\5\26\f\2\u00c9\u00ca\7"+
		"\33\2\2\u00ca\u00cb\58\35\2\u00cb\u00cc\7\33\2\2\u00cc\u00cd\5\26\f\2"+
		"\u00cd\u00ce\7\26\2\2\u00ce\u00cf\5\16\b\2\u00cf-\3\2\2\2\u00d0\u00d1"+
		"\5\16\b\2\u00d1\u00d2\5\60\31\2\u00d2/\3\2\2\2\u00d3\u00d6\5.\30\2\u00d4"+
		"\u00d6\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\61\3\2\2"+
		"\2\u00d7\u00d8\7\16\2\2\u00d8\u00d9\5\24\13\2\u00d9\u00da\7\31\2\2\u00da"+
		"\u00db\5> \2\u00db\u00dc\7\32\2\2\u00dc\u00dd\5\64\33\2\u00dd\63\3\2\2"+
		"\2\u00de\u00df\7\31\2\2\u00df\u00e0\5> \2\u00e0\u00e1\7\32\2\2\u00e1\u00e2"+
		"\5\66\34\2\u00e2\u00e5\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00de\3\2\2\2"+
		"\u00e4\u00e3\3\2\2\2\u00e5\65\3\2\2\2\u00e6\u00e7\7\31\2\2\u00e7\u00e8"+
		"\5> \2\u00e8\u00e9\7\32\2\2\u00e9\u00ea\5\64\33\2\u00ea\u00ed\3\2\2\2"+
		"\u00eb\u00ed\3\2\2\2\u00ec\u00e6\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\67"+
		"\3\2\2\2\u00ee\u00ef\5> \2\u00ef\u00f0\5:\36\2\u00f09\3\2\2\2\u00f1\u00f2"+
		"\5<\37\2\u00f2\u00f3\5> \2\u00f3\u00f6\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5"+
		"\u00f1\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6;\3\2\2\2\u00f7\u00f8\t\3\2\2"+
		"\u00f8=\3\2\2\2\u00f9\u00fa\5B\"\2\u00fa\u00fb\5@!\2\u00fb?\3\2\2\2\u00fc"+
		"\u00fd\5F$\2\u00fd\u00fe\5> \2\u00fe\u0101\3\2\2\2\u00ff\u0101\3\2\2\2"+
		"\u0100\u00fc\3\2\2\2\u0100\u00ff\3\2\2\2\u0101A\3\2\2\2\u0102\u0103\5"+
		"J&\2\u0103\u0104\5D#\2\u0104C\3\2\2\2\u0105\u0106\5H%\2\u0106\u0107\5"+
		"J&\2\u0107\u0108\5D#\2\u0108\u010b\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u0105"+
		"\3\2\2\2\u010a\u0109\3\2\2\2\u010bE\3\2\2\2\u010c\u010d\t\4\2\2\u010d"+
		"G\3\2\2\2\u010e\u010f\t\5\2\2\u010fI\3\2\2\2\u0110\u0111\5F$\2\u0111\u0112"+
		"\5L\'\2\u0112\u0115\3\2\2\2\u0113\u0115\5L\'\2\u0114\u0110\3\2\2\2\u0114"+
		"\u0113\3\2\2\2\u0115K\3\2\2\2\u0116\u0120\7\21\2\2\u0117\u0120\7\22\2"+
		"\2\u0118\u0120\7\23\2\2\u0119\u0120\7\17\2\2\u011a\u0120\5N(\2\u011b\u011c"+
		"\7\25\2\2\u011c\u011d\5> \2\u011d\u011e\7\26\2\2\u011e\u0120\3\2\2\2\u011f"+
		"\u0116\3\2\2\2\u011f\u0117\3\2\2\2\u011f\u0118\3\2\2\2\u011f\u0119\3\2"+
		"\2\2\u011f\u011a\3\2\2\2\u011f\u011b\3\2\2\2\u0120M\3\2\2\2\u0121\u0122"+
		"\7\20\2\2\u0122\u0123\5\64\33\2\u0123O\3\2\2\2\24SZjo\u0088\u0093\u009e"+
		"\u00a8\u00ad\u00c4\u00d5\u00e4\u00ec\u00f5\u0100\u010a\u0114\u011f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}