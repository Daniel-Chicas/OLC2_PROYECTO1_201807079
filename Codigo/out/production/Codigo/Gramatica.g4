 grammar Gramatica;

//ABECEDARIO
fragment A : ('a'|'A');
fragment B : ('b'|'B');
fragment C : ('c'|'C');
fragment D : ('d'|'D');
fragment E : ('e'|'E');
fragment F : ('f'|'F');
fragment G : ('g'|'G');
fragment H : ('h'|'H');
fragment I : ('i'|'I');
fragment J : ('j'|'J');
fragment K : ('k'|'K');
fragment L : ('l'|'L');
fragment M : ('m'|'M');
fragment N : ('n'|'N');
fragment O : ('o'|'O');
fragment P : ('p'|'P');
fragment Q : ('q'|'Q');
fragment R : ('r'|'R');
fragment S : ('s'|'S');
fragment T : ('t'|'T');
fragment U : ('u'|'U');
fragment V : ('v'|'V');
fragment W : ('w'|'W');
fragment X : ('x'|'X');
fragment Y : ('y'|'Y');
fragment Z : ('z'|'Z');


//RESERVADAS
PROGRAM                 :P R O G R A M ;
END                     :E N D ;
IMPLICITNONE            :I M P L I C I T ' ' N O N E;
PRINT                   :P R I N T ' *,';


//Tipos de datos
INTEGER                 :I N T E G E R ;
REAL                    :R E A L;
COMPLEX                 :C O M P L E X;
CHARACTER               :C H A R A C T E R;
LOGICAL                 :L O G I C A L;

//Primitivas
CADENA                  : ('\'' ( '\\'. | '""' | ~('\''| '\\') )* '\'') | ('"' ( '\\'. | '""' | ~('"'| '\\') )* '"');
ENTERO                  : [0-9]+;
DECIMAL                 : [0-9]+ '.' [0-9]+;
TF                      : '.'T R U E '.' | '.' F A L S E '.';
ID                      : (([a-zA-ZáéíóúÁÉÍÓÚ]+)( '_' | [0-9A-Za-záéíóúÁÉÍÓÚ])*);

//Relacionales
MENI                    : '<='| '.le.' ;
MAYI                    : '>='| '.ge.' ;
MEN                     : '<' | '.lt.' ;
MAY                     : '>' | '.gt.' ;
IGUALI                  : '=='| '.eq.' ;
DIFERENCIA              : '!='| '.ne.' ;

//Lógicas
AND                     : '.and.'   ;
OR                      : '.or.'    ;
NOT                     : '.not.'   ;

//Aritméticas
POTENCIA                : '**'  ;
MULTIPLICACION          : '*'   ;
DIVISION                : '/'   ;
SUMA                    : '+'   ;
RESTA                   : '-'   ;
IGUAL                   : '='   ;

//EXTRAS
GUIONB                  : '_'   ;
PUNTO                   : '.'   ;
PARA                    : '('   ;
PARC                    : ')'   ;
LLABRE                  : '{'   ;
LLACIE                  : '}'   ;
CABRE                   : '['   ;
CCIER                   : ']'   ;
DPUNTOS                 : ':'   ;
PCOMA                   : ';'   ;
COMA                    : ','   ;
AMPERSAND               : '&'   ;
INTERROGACION           : '?'   ;

// IGNORED TOKENS
ESPACIOS                : [ \t\r\n]+          -> skip;
COMENTARIO_LIN          : ('!'(~[\n])+ | '!') -> skip;


//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

start
    : listaInstrucciones
;

listaInstrucciones
    : instrucciones listaInstrucciones
    | instrucciones
;

instrucciones
    : declaraciones
    | PRINT listaImpresiones
;

declaraciones
    : tipo DPUNTOS DPUNTOS listaDeclaraciones
    | ID IGUAL expresion
;

listaImpresiones
    : expresion COMA listaImpresiones
    | expresion
;

listaDeclaraciones
    : ID IGUAL expresion COMA listaDeclaraciones
    | ID IGUAL expresion
    | ID COMA listaDeclaraciones
    | ID
;

tipo
    : INTEGER
    | REAL
    | COMPLEX
    | CHARACTER
    | LOGICAL
;

expresion
    : expresion (POTENCIA) expresion
    | expresion (MULTIPLICACION | DIVISION) expresion
    | expresion (SUMA | RESTA) expresion
    | PARA expresion PARC
    | ENTERO
    | DECIMAL
    | CADENA
    | TF
    | ID
;