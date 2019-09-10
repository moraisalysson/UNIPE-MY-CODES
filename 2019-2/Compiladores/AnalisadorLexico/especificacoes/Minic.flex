package br.com.analisadorlexico;

%%

%class AnalisadorLexico
%unicode
%type Token
%line
%column

LETRA = [a-zA-Z]
DIGITO = [0-9]
FINAL_LINHA = (\r | \n | \r\n | \t)
ESPACO_EM_BRANCO = [ ]

ID = ( {LETRA} | _ )( {LETRA} | {DIGITO} | _ )*

LITERAL_INTEIRO = {DIGITO}+
LITERAL_PONTO_FLUTUANTE = {DIGITO}+("."{DIGITO}+)*

LITERAL_CHAR  = '( {LETRA} | {DIGITO} | "\\n" | "\\\\" | "\\t" | "\\r" )?'
LITERAL_STRING = "\"" [^"\""]* "\""

COMENTARIO_LINHA = "//" [^\r\n]* {FINAL_LINHA}?
COMENTARIO_MULTI_LINHAS = "/*"~"*/"

%%


"void" { return new Token( TipoToken.PALAVRA_RESERVADA.toString(), yyline, yycolumn, yytext() ); }
"int" { return new Token( TipoToken.PALAVRA_RESERVADA.toString(), yyline, yycolumn, yytext() ); }
"float" { return new Token( TipoToken.PALAVRA_RESERVADA.toString(), yyline, yycolumn, yytext() ); }
"double" { return new Token( TipoToken.PALAVRA_RESERVADA.toString(), yyline, yycolumn, yytext() ); }
"char" { return new Token( TipoToken.PALAVRA_RESERVADA.toString(), yyline, yycolumn, yytext() ); }
 
"include" { return new Token( TipoToken.PALAVRA_RESERVADA.toString(), yyline, yycolumn, yytext() ); }
"main" { return new Token( TipoToken.PALAVRA_RESERVADA.toString(), yyline, yycolumn, yytext() ); }
"return" { return new Token( TipoToken.PALAVRA_RESERVADA.toString(), yyline, yycolumn, yytext() ); }
"if" { return new Token( TipoToken.PALAVRA_RESERVADA.toString(), yyline, yycolumn, yytext() ); }
"else" { return new Token( TipoToken.PALAVRA_RESERVADA.toString(), yyline, yycolumn, yytext() ); }
"while" { return new Token( TipoToken.PALAVRA_RESERVADA.toString(), yyline, yycolumn, yytext() ); }
"printf" { return new Token( TipoToken.PALAVRA_RESERVADA.toString(), yyline, yycolumn, yytext() ); }
"printint" { return new Token( TipoToken.PALAVRA_RESERVADA.toString(), yyline, yycolumn, yytext() ); }
"printstr" { return new Token( TipoToken.PALAVRA_RESERVADA.toString(), yyline, yycolumn, yytext() ); }

"<=" { return new Token( TipoToken.OPERADOR.toString(), yyline, yycolumn, yytext() ); } 
"<" { return new Token( TipoToken.OPERADOR.toString(), yyline, yycolumn, yytext() ); }
">=" { return new Token( TipoToken.OPERADOR.toString(), yyline, yycolumn, yytext() ); }
">" { return new Token( TipoToken.OPERADOR.toString(), yyline, yycolumn, yytext() ); }
"==" { return new Token( TipoToken.OPERADOR.toString(), yyline, yycolumn, yytext() ); }
"=" { return new Token( TipoToken.OPERADOR.toString(), yyline, yycolumn, yytext() ); }
"!=" { return new Token( TipoToken.OPERADOR.toString(), yyline, yycolumn, yytext() ); }
"!" { return new Token( TipoToken.OPERADOR.toString(), yyline, yycolumn, yytext() ); }

"+" { return new Token( TipoToken.OPERADOR.toString(), yyline, yycolumn, yytext() ); }
"-" { return new Token( TipoToken.OPERADOR.toString(), yyline, yycolumn, yytext() ); }
"/" { return new Token( TipoToken.OPERADOR.toString(), yyline, yycolumn, yytext() ); }
"*" { return new Token( TipoToken.OPERADOR.toString(), yyline, yycolumn, yytext() ); }

"#" { return new Token( TipoToken.PONTUACAO.toString(), yyline, yycolumn, yytext() ); }
"." { return new Token( TipoToken.PONTUACAO.toString(), yyline, yycolumn, yytext() ); }
";" { return new Token( TipoToken.PONTUACAO.toString(), yyline, yycolumn, yytext() ); }
"," { return new Token( TipoToken.PONTUACAO.toString(), yyline, yycolumn, yytext() ); }
"{" { return new Token( TipoToken.PONTUACAO.toString(), yyline, yycolumn, yytext() ); }
"}" { return new Token( TipoToken.PONTUACAO.toString(), yyline, yycolumn, yytext() ); }
"(" { return new Token( TipoToken.PONTUACAO.toString(), yyline, yycolumn, yytext() ); }
")" { return new Token( TipoToken.PONTUACAO.toString(), yyline, yycolumn, yytext() ); }

{ID} { return new Token( TipoToken.IDENTIFICADOR.toString(), yyline, yycolumn, yytext() ); }
{LITERAL_INTEIRO} { return new Token( TipoToken.LITERAL_INTEIRO.toString(), yyline, yycolumn, yytext() ); }
{LITERAL_PONTO_FLUTUANTE} { return new Token( TipoToken.LITERAL_PONTO_FLUTUANTE.toString(), yyline, yycolumn, yytext() ); }
{LITERAL_CHAR} { return new Token( TipoToken.LITERAL_CHAR.toString(), yyline, yycolumn, yytext() ); }
{LITERAL_STRING} { return new Token( TipoToken.LITERAL_STRING.toString(), yyline, yycolumn, yytext() ); }

{COMENTARIO_MULTI_LINHAS} {}
{COMENTARIO_LINHA} {}

{FINAL_LINHA} {}
{ESPACO_EM_BRANCO} {}

. { return new Token( TipoToken.ERRO.toString(), yyline, yycolumn, yytext() );}