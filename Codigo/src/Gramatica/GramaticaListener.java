// Generated from C:/Users/Daniel Chicas/Desktop/VACAS_JUNIO_2022/Compi2/Laboratorio/OLC2_PROYECTO1_201807079/Codigo/src\Gramatica.g4 by ANTLR 4.10.1
package Gramatica;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(GramaticaParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(GramaticaParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#listaInstrucciones}.
	 * @param ctx the parse tree
	 */
	void enterListaInstrucciones(GramaticaParser.ListaInstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#listaInstrucciones}.
	 * @param ctx the parse tree
	 */
	void exitListaInstrucciones(GramaticaParser.ListaInstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(GramaticaParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(GramaticaParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void enterDeclaraciones(GramaticaParser.DeclaracionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void exitDeclaraciones(GramaticaParser.DeclaracionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#listaImpresiones}.
	 * @param ctx the parse tree
	 */
	void enterListaImpresiones(GramaticaParser.ListaImpresionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#listaImpresiones}.
	 * @param ctx the parse tree
	 */
	void exitListaImpresiones(GramaticaParser.ListaImpresionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#listaDeclaraciones}.
	 * @param ctx the parse tree
	 */
	void enterListaDeclaraciones(GramaticaParser.ListaDeclaracionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#listaDeclaraciones}.
	 * @param ctx the parse tree
	 */
	void exitListaDeclaraciones(GramaticaParser.ListaDeclaracionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(GramaticaParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(GramaticaParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(GramaticaParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(GramaticaParser.ExpresionContext ctx);
}