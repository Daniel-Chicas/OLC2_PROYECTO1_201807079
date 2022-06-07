// Generated from C:/Users/Daniel Chicas/Desktop/VACAS_JUNIO_2022/Compi2/Laboratorio/OLC2_PROYECTO1_201807079/Codigo/src\Gramatica.g4 by ANTLR 4.10.1
package Gramatica;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(GramaticaParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#listaInstrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaInstrucciones(GramaticaParser.ListaInstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(GramaticaParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#declaraciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaraciones(GramaticaParser.DeclaracionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#listaImpresiones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaImpresiones(GramaticaParser.ListaImpresionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#listaDeclaraciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaDeclaraciones(GramaticaParser.ListaDeclaracionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(GramaticaParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(GramaticaParser.ExpresionContext ctx);
}