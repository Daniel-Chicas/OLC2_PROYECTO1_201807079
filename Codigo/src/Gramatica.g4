 grammar Gramatica;

//Tipos de datos
INT                     : 'int';
FLOAT                   : 'float';
STRING                  : 'string';
BOOL                    : 'bool';
CHAR                    : 'char';

//Primitivas
CARACTER                : ('\'' ( '\\'. | '""' | ~('"'| '\\') )? '\'');
CADENA                  : ('"' ( '\\'. | '""' | ~('"'| '\\') )* '"');
ENTERO                  : [0-9]+;
DECIMAL                 : [0-9]+ '.' [0-9]+;
TF                      : 'true' | 'false';
ID                      : (([a-zA-ZáéíóúÁÉÍÓÚ] | '_' )+( '_' | [0-9A-Za-záéíóúÁÉÍÓÚ])*);


//Relacionales
MENI                    : '<='  ;
MAYI                    : '>='  ;
MEN                     : '<'   ;
MAY                     : '>'   ;
IGUALI                  : '=='  ;
DIFERENCIA              : '!='  ;

//Lógicas
AND                     : '&&' ;
OR                      : '||' ;
NOT                     : '!'  ;

//Aritméticas
MOD                     : '%' ;
POR                     : '*' ;
DIVIDIR                 : '/' ;
MAS                     : '+' ;
MENOS                   : '-' ;
IGUAL                   : '=' ;

//EXTRAS
GUIONB                  : '_';
PUNTO                   : '.';
PARA                    : '(';
PARC                    : ')';
LLABRE                  : '{';
LLACIE                  : '}';
CABRE                   : '[';
CCIER                   : ']';
DPUNTOS                 : ':';
PCOMA                   : ';';
COMA                    : ',';
AMPERSAND               : '&';
INTERROGACION           : '?';

// IGNORED TOKENS
ESPACIOS                : [ \t\r\n]+                                            -> skip;
COMENTARIO_LIN          : ('//'(~[\n])+ | '//')                                 -> skip;
COMENTARIO_MLIN          :  '/*'  ( ~['*'] | ('*')+ ~['*','/'] )* ( '*')+ '/'   -> skip;


//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

start
    : listaInstrucciones
;

listaInstrucciones
    : instrucciones listaInstrucciones
    | instrucciones
;

instrucciones
    : block
    | declaracion
;

block
    : LLABRE listaInstrucciones LLACIE
    | LLABRE LLACIE
;

declaracion
    : tipo ID IGUAL expresion PCOMA
;

tipo
    : INT
    | FLOAT
    | STRING
    | BOOL
    | CHAR
;

expresion
    : expresion (POR | DIVIDIR) expresion
    | expresion (MAS | MENOS) expresion
    | PARA expresion PARC
    | ENTERO
    | DECIMAL
    | CADENA
    | CHAR
    | TF
;