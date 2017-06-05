




grammar BroLanguage;

prog:  (statment ';') +;

statment: mathExpr
		|initializeVar
		|print
		|loop
		|assignVar
		|ifStatment
		|callMethod
		|initializeMethod;

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
	VAR: ('BroInt'|'BroString'|'BroBool');
	COMMENT: '//' ~( '\r' | '\n' )* -> skip;
	PARAM: VAR ID
	       |VAR ID ',' PARAM;


print     : 'broSay' (mathExpr| STRING) ;
initializeVar: VAR ID ('=' ( BOOL| STRING| mathExpr))? ;
assignVar: ID '=' ( BOOL| STRING| mathExpr);

initializeMethod: (VAR| 'BroVoid') ID '(' PARAM? '){' prog '}';
callMethod: ID '(' PARAM? ');';

logicalOperation : ('=='|'!='|'>='|'<='|'<'|'>');
loop: 'whileBro{' logicalExpr '){' prog'}';
ifStatment : 'if(' logicalExpr'){' prog '}';