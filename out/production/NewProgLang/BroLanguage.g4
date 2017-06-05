




grammar BroLanguage;

prog:  (statment ';') +;

statment: mathExpr
		|initialize
		|print
		|loop
		|ifStatment;

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
	COMMENT: '//' ~( '\r' | '\n' )* -> skip;


print     : 'print' (mathExpr| STRING) ;
initialize: 'var' ID '=' ( BOOL| STRING| mathExpr) ;
logicalOperation : ('=='|'!='|'>='|'<='|'<'|'>');
loop: 'while{' logicalExpr '){' prog'}';
ifStatment : 'if(' logicalExpr'){' prog '}';