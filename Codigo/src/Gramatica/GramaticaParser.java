// Generated from C:/Users/Daniel Chicas/Desktop/VACAS_JUNIO_2022/Compi2/Laboratorio/OLC2_PROYECTO1_201807079/Codigo/src\Gramatica.g4 by ANTLR 4.10.1
package Gramatica;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, END=2, IMPLICITNONE=3, PRINT=4, INTEGER=5, REAL=6, COMPLEX=7, 
		CHARACTER=8, LOGICAL=9, CADENA=10, ENTERO=11, DECIMAL=12, TF=13, ID=14, 
		MENI=15, MAYI=16, MEN=17, MAY=18, IGUALI=19, DIFERENCIA=20, AND=21, OR=22, 
		NOT=23, POTENCIA=24, MULTIPLICACION=25, DIVISION=26, SUMA=27, RESTA=28, 
		IGUAL=29, GUIONB=30, PUNTO=31, PARA=32, PARC=33, LLABRE=34, LLACIE=35, 
		CABRE=36, CCIER=37, DPUNTOS=38, PCOMA=39, COMA=40, AMPERSAND=41, INTERROGACION=42, 
		ESPACIOS=43, COMENTARIO_LIN=44;
	public static final int
		RULE_start = 0, RULE_listaInstrucciones = 1, RULE_instrucciones = 2, RULE_declaraciones = 3, 
		RULE_listaImpresiones = 4, RULE_listaDeclaraciones = 5, RULE_tipo = 6, 
		RULE_expresion = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "listaInstrucciones", "instrucciones", "declaraciones", "listaImpresiones", 
			"listaDeclaraciones", "tipo", "expresion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'.and.'", "'.or.'", 
			"'.not.'", "'**'", "'*'", "'/'", "'+'", "'-'", "'='", "'_'", "'.'", "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "':'", "';'", "','", "'&'", "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "END", "IMPLICITNONE", "PRINT", "INTEGER", "REAL", "COMPLEX", 
			"CHARACTER", "LOGICAL", "CADENA", "ENTERO", "DECIMAL", "TF", "ID", "MENI", 
			"MAYI", "MEN", "MAY", "IGUALI", "DIFERENCIA", "AND", "OR", "NOT", "POTENCIA", 
			"MULTIPLICACION", "DIVISION", "SUMA", "RESTA", "IGUAL", "GUIONB", "PUNTO", 
			"PARA", "PARC", "LLABRE", "LLACIE", "CABRE", "CCIER", "DPUNTOS", "PCOMA", 
			"COMA", "AMPERSAND", "INTERROGACION", "ESPACIOS", "COMENTARIO_LIN"
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
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public ListaInstruccionesContext listaInstrucciones() {
			return getRuleContext(ListaInstruccionesContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			listaInstrucciones();
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

	public static class ListaInstruccionesContext extends ParserRuleContext {
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public ListaInstruccionesContext listaInstrucciones() {
			return getRuleContext(ListaInstruccionesContext.class,0);
		}
		public ListaInstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaInstrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterListaInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitListaInstrucciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitListaInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaInstruccionesContext listaInstrucciones() throws RecognitionException {
		ListaInstruccionesContext _localctx = new ListaInstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_listaInstrucciones);
		try {
			setState(22);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				instrucciones();
				setState(19);
				listaInstrucciones();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				instrucciones();
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

	public static class InstruccionesContext extends ParserRuleContext {
		public DeclaracionesContext declaraciones() {
			return getRuleContext(DeclaracionesContext.class,0);
		}
		public TerminalNode PRINT() { return getToken(GramaticaParser.PRINT, 0); }
		public ListaImpresionesContext listaImpresiones() {
			return getRuleContext(ListaImpresionesContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitInstrucciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instrucciones);
		try {
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case REAL:
			case COMPLEX:
			case CHARACTER:
			case LOGICAL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				declaraciones();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				match(PRINT);
				setState(26);
				listaImpresiones();
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

	public static class DeclaracionesContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> DPUNTOS() { return getTokens(GramaticaParser.DPUNTOS); }
		public TerminalNode DPUNTOS(int i) {
			return getToken(GramaticaParser.DPUNTOS, i);
		}
		public ListaDeclaracionesContext listaDeclaraciones() {
			return getRuleContext(ListaDeclaracionesContext.class,0);
		}
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(GramaticaParser.IGUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public DeclaracionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaraciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDeclaraciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDeclaraciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDeclaraciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionesContext declaraciones() throws RecognitionException {
		DeclaracionesContext _localctx = new DeclaracionesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaraciones);
		try {
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case REAL:
			case COMPLEX:
			case CHARACTER:
			case LOGICAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				tipo();
				setState(30);
				match(DPUNTOS);
				setState(31);
				match(DPUNTOS);
				setState(32);
				listaDeclaraciones();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(ID);
				setState(35);
				match(IGUAL);
				setState(36);
				expresion(0);
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

	public static class ListaImpresionesContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode COMA() { return getToken(GramaticaParser.COMA, 0); }
		public ListaImpresionesContext listaImpresiones() {
			return getRuleContext(ListaImpresionesContext.class,0);
		}
		public ListaImpresionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaImpresiones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterListaImpresiones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitListaImpresiones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitListaImpresiones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaImpresionesContext listaImpresiones() throws RecognitionException {
		ListaImpresionesContext _localctx = new ListaImpresionesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_listaImpresiones);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				expresion(0);
				setState(40);
				match(COMA);
				setState(41);
				listaImpresiones();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				expresion(0);
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

	public static class ListaDeclaracionesContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(GramaticaParser.IGUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode COMA() { return getToken(GramaticaParser.COMA, 0); }
		public ListaDeclaracionesContext listaDeclaraciones() {
			return getRuleContext(ListaDeclaracionesContext.class,0);
		}
		public ListaDeclaracionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaDeclaraciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterListaDeclaraciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitListaDeclaraciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitListaDeclaraciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaDeclaracionesContext listaDeclaraciones() throws RecognitionException {
		ListaDeclaracionesContext _localctx = new ListaDeclaracionesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_listaDeclaraciones);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(ID);
				setState(47);
				match(IGUAL);
				setState(48);
				expresion(0);
				setState(49);
				match(COMA);
				setState(50);
				listaDeclaraciones();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(ID);
				setState(53);
				match(IGUAL);
				setState(54);
				expresion(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				match(ID);
				setState(56);
				match(COMA);
				setState(57);
				listaDeclaraciones();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				match(ID);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(GramaticaParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(GramaticaParser.REAL, 0); }
		public TerminalNode COMPLEX() { return getToken(GramaticaParser.COMPLEX, 0); }
		public TerminalNode CHARACTER() { return getToken(GramaticaParser.CHARACTER, 0); }
		public TerminalNode LOGICAL() { return getToken(GramaticaParser.LOGICAL, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << REAL) | (1L << COMPLEX) | (1L << CHARACTER) | (1L << LOGICAL))) != 0)) ) {
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

	public static class ExpresionContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(GramaticaParser.PARA, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode PARC() { return getToken(GramaticaParser.PARC, 0); }
		public TerminalNode ENTERO() { return getToken(GramaticaParser.ENTERO, 0); }
		public TerminalNode DECIMAL() { return getToken(GramaticaParser.DECIMAL, 0); }
		public TerminalNode CADENA() { return getToken(GramaticaParser.CADENA, 0); }
		public TerminalNode TF() { return getToken(GramaticaParser.TF, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode POTENCIA() { return getToken(GramaticaParser.POTENCIA, 0); }
		public TerminalNode MULTIPLICACION() { return getToken(GramaticaParser.MULTIPLICACION, 0); }
		public TerminalNode DIVISION() { return getToken(GramaticaParser.DIVISION, 0); }
		public TerminalNode SUMA() { return getToken(GramaticaParser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(GramaticaParser.RESTA, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expresion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARA:
				{
				setState(64);
				match(PARA);
				setState(65);
				expresion(0);
				setState(66);
				match(PARC);
				}
				break;
			case ENTERO:
				{
				setState(68);
				match(ENTERO);
				}
				break;
			case DECIMAL:
				{
				setState(69);
				match(DECIMAL);
				}
				break;
			case CADENA:
				{
				setState(70);
				match(CADENA);
				}
				break;
			case TF:
				{
				setState(71);
				match(TF);
				}
				break;
			case ID:
				{
				setState(72);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(84);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(75);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						{
						setState(76);
						match(POTENCIA);
						}
						setState(77);
						expresion(10);
						}
						break;
					case 2:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(78);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(79);
						_la = _input.LA(1);
						if ( !(_la==MULTIPLICACION || _la==DIVISION) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(80);
						expresion(9);
						}
						break;
					case 3:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(81);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(82);
						_la = _input.LA(1);
						if ( !(_la==SUMA || _la==RESTA) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(83);
						expresion(8);
						}
						break;
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		case 7:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001,Z\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u0017\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u001c\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003&\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004-\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005<\b\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007J\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007U\b\u0007\n\u0007\f\u0007X\t\u0007\u0001"+
		"\u0007\u0000\u0001\u000e\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000\u0003"+
		"\u0001\u0000\u0005\t\u0001\u0000\u0019\u001a\u0001\u0000\u001b\u001c`"+
		"\u0000\u0010\u0001\u0000\u0000\u0000\u0002\u0016\u0001\u0000\u0000\u0000"+
		"\u0004\u001b\u0001\u0000\u0000\u0000\u0006%\u0001\u0000\u0000\u0000\b"+
		",\u0001\u0000\u0000\u0000\n;\u0001\u0000\u0000\u0000\f=\u0001\u0000\u0000"+
		"\u0000\u000eI\u0001\u0000\u0000\u0000\u0010\u0011\u0003\u0002\u0001\u0000"+
		"\u0011\u0001\u0001\u0000\u0000\u0000\u0012\u0013\u0003\u0004\u0002\u0000"+
		"\u0013\u0014\u0003\u0002\u0001\u0000\u0014\u0017\u0001\u0000\u0000\u0000"+
		"\u0015\u0017\u0003\u0004\u0002\u0000\u0016\u0012\u0001\u0000\u0000\u0000"+
		"\u0016\u0015\u0001\u0000\u0000\u0000\u0017\u0003\u0001\u0000\u0000\u0000"+
		"\u0018\u001c\u0003\u0006\u0003\u0000\u0019\u001a\u0005\u0004\u0000\u0000"+
		"\u001a\u001c\u0003\b\u0004\u0000\u001b\u0018\u0001\u0000\u0000\u0000\u001b"+
		"\u0019\u0001\u0000\u0000\u0000\u001c\u0005\u0001\u0000\u0000\u0000\u001d"+
		"\u001e\u0003\f\u0006\u0000\u001e\u001f\u0005&\u0000\u0000\u001f \u0005"+
		"&\u0000\u0000 !\u0003\n\u0005\u0000!&\u0001\u0000\u0000\u0000\"#\u0005"+
		"\u000e\u0000\u0000#$\u0005\u001d\u0000\u0000$&\u0003\u000e\u0007\u0000"+
		"%\u001d\u0001\u0000\u0000\u0000%\"\u0001\u0000\u0000\u0000&\u0007\u0001"+
		"\u0000\u0000\u0000\'(\u0003\u000e\u0007\u0000()\u0005(\u0000\u0000)*\u0003"+
		"\b\u0004\u0000*-\u0001\u0000\u0000\u0000+-\u0003\u000e\u0007\u0000,\'"+
		"\u0001\u0000\u0000\u0000,+\u0001\u0000\u0000\u0000-\t\u0001\u0000\u0000"+
		"\u0000./\u0005\u000e\u0000\u0000/0\u0005\u001d\u0000\u000001\u0003\u000e"+
		"\u0007\u000012\u0005(\u0000\u000023\u0003\n\u0005\u00003<\u0001\u0000"+
		"\u0000\u000045\u0005\u000e\u0000\u000056\u0005\u001d\u0000\u00006<\u0003"+
		"\u000e\u0007\u000078\u0005\u000e\u0000\u000089\u0005(\u0000\u00009<\u0003"+
		"\n\u0005\u0000:<\u0005\u000e\u0000\u0000;.\u0001\u0000\u0000\u0000;4\u0001"+
		"\u0000\u0000\u0000;7\u0001\u0000\u0000\u0000;:\u0001\u0000\u0000\u0000"+
		"<\u000b\u0001\u0000\u0000\u0000=>\u0007\u0000\u0000\u0000>\r\u0001\u0000"+
		"\u0000\u0000?@\u0006\u0007\uffff\uffff\u0000@A\u0005 \u0000\u0000AB\u0003"+
		"\u000e\u0007\u0000BC\u0005!\u0000\u0000CJ\u0001\u0000\u0000\u0000DJ\u0005"+
		"\u000b\u0000\u0000EJ\u0005\f\u0000\u0000FJ\u0005\n\u0000\u0000GJ\u0005"+
		"\r\u0000\u0000HJ\u0005\u000e\u0000\u0000I?\u0001\u0000\u0000\u0000ID\u0001"+
		"\u0000\u0000\u0000IE\u0001\u0000\u0000\u0000IF\u0001\u0000\u0000\u0000"+
		"IG\u0001\u0000\u0000\u0000IH\u0001\u0000\u0000\u0000JV\u0001\u0000\u0000"+
		"\u0000KL\n\t\u0000\u0000LM\u0005\u0018\u0000\u0000MU\u0003\u000e\u0007"+
		"\nNO\n\b\u0000\u0000OP\u0007\u0001\u0000\u0000PU\u0003\u000e\u0007\tQ"+
		"R\n\u0007\u0000\u0000RS\u0007\u0002\u0000\u0000SU\u0003\u000e\u0007\b"+
		"TK\u0001\u0000\u0000\u0000TN\u0001\u0000\u0000\u0000TQ\u0001\u0000\u0000"+
		"\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000"+
		"\u0000\u0000W\u000f\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000"+
		"\b\u0016\u001b%,;ITV";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}