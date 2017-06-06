




grammar BroLanguage;

prog:  (statment ';') +;

statment: initialize
		|assign
		|print
		|loop
		|ifStatment
		|initializeMethod
		|mathExpr
		|callMethod;

mathExpr: '(' mathExpr ')'
		| '-' mathExpr
		|mathExpr ('*'|'/'|'%') mathExpr
		|mathExpr ('+'|'-') mathExpr
		|INT
		|ID;

logicalExpr: logicalExpr ('&&'|'|') logicalExpr
            | mathExpr logicalOperation mathExpr
            |STRING logicalOperation STRING
            |BOOL logicalOperation BOOL
            |BOOL;


	INT: '0' | [1-9][0-9]*;
	ID: [A-Za-z] [A-Za-z0-9_]*;
    BOOL: 'yes'|'no';
    STRING: '"' ID '"';
	WS: [\r\n\t ]+ -> skip;
	VAR: ('broolean'|'bronum'|'brotext');
	COMMENT: '//' ~( '\r' | '\n' )* -> skip;
	PARAM: VAR ID
	      |VAR ID ',' PARAM;


print     : 'brossage' '(' (mathExpr| STRING) ')' ;
initialize: VAR ID ('=' ( BOOL| STRING| mathExpr))? ;
assign: ID '=' ( BOOL| STRING| mathExpr);

initializeMethod: (VAR|'broid') ID'(' PARAM? '){' statment '}';
callMethod: ID(ID*);


logicalOperation : ('=='|'!='|'>='|'<='|'<'|'>');
loop: 'whileBro{' logicalExpr '){' prog'}';
ifStatment : 'ifBro(' logicalExpr'){' prog '}';