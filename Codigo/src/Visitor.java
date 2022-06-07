import Gramatica.GramaticaBaseVisitor;
import Gramatica.GramaticaParser;

public class Visitor extends GramaticaBaseVisitor<Object> {
    public Object visitStart(GramaticaParser.StartContext ctx) {
        return visitChildren(ctx);
    }
    public Object visitListaInstrucciones(GramaticaParser.ListaInstruccionesContext ctx) {
        return visitChildren(ctx);
    }

    public Object visitInstrucciones(GramaticaParser.InstruccionesContext ctx) {
        return visitChildren(ctx);
    }

    public Object visitDeclaraciones(GramaticaParser.DeclaracionesContext ctx) {
        return visitChildren(ctx);
    }

    public Object visitListaImpresiones(GramaticaParser.ListaImpresionesContext ctx) {
        return visitChildren(ctx);
    }

    public Object visitListaDeclaraciones(GramaticaParser.ListaDeclaracionesContext ctx) {
        return visitChildren(ctx);
    }

    public Object visitTipo(GramaticaParser.TipoContext ctx) {
        return visitChildren(ctx);
    }

    public Object visitExpresion(GramaticaParser.ExpresionContext ctx) {
        return visitChildren(ctx);
    }

}
