




grammar BroLanguage;

prog:  (statment) +;

statment:
    initializeVar                 #statmentInititalizeVar
    |assignVar                      #statmentAssignVar
    |print                          #statmentPrint
    |loop                           #statmentLoop
    |ifStatment                     #statmentIf
    |initializeMethod               #statmentInitializeMethod
    |callMethod                    #statmentCallMethod
    ;

mathExpr:
    '(' mathExpr ')'
    | '-' mathExpr
    |mathExpr MATHOPERATORS mathExpr
    |BRONUM
    |ID
    ;

logicalExpr:
    leftExpr=logicalExpr ('&&'|'|') rightExpr=logicalExpr         #logicalExpressionMultiple
    |leftMathExpr=mathExpr LOGICALOPERATORS rightMathExpr=mathExpr        #logicalExpressionMathExpr
            ;


value:
    mathExpr
    |logicalExpr
    |BROTEXT
    ;

print:
    'brossage' '(' value ')' ;


initializeVar:
    varType=VARTYPE varName=ID                      #varInitializing
    |varType=VARTYPE varName=ID '=' value           #varInitializingAndAssigning
    ;
assignVar:
    varName=ID '=' value                            #varAssigning
    ;

initializeMethod:
    methodType=METHODTYPE methodName=ID '(' param? '){' statment '}'
    ;

callMethod:
    ID(ID*)
    ;

param:
    VARTYPE ID
	|VARTYPE ID ',' param
	;


loop:
    'whileBro{' condition=logicalExpr '){' prog'}'
    ;


ifStatment:
    'ifBro(' condition=logicalExpr'){' prog '}'
    ;


LOGICALOPERATORS:('=='|'!='|'>='|'<='|'<'|'>');

MATHOPERATORS:('*'|'/'|'%'|'+'|'-');

ID: [A-Za-z] [A-Za-z0-9_]*;
BRONUM:'0' | [1-9][0-9]*;
BROOLEAN: 'yes'|'no';
BROTEXT: '"' ID '"';
VARTYPE: ('broolean'|'bronum'|'brotext');
METHODTYPE: VARTYPE|'broid';
COMMENT: '//' ~( '\r' | '\n' )* -> skip;
WS: [\r\n\t ]+ -> skip;