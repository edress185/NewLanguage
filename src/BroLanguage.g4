




grammar BroLanguage;

prog:  statment+ ;

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
    '(' mathExpr ')'                    #mathExprBrackets
    | '-' mathExpr                      #mathExprNegative
    |mathExpr MATHOPERATORS mathExpr    #mathExprOperators
    |number=BRONUM                      #mathExprNumber
    |variable=ID                        #mathExprIntVar
    ;

stringExpr:
    variable=ID                        #stringExprStringVar
    |BROTEXT                           #stringExprString
    ;



logicalExpr:
    leftExpr=logicalExpr ('&&'|'|') rightExpr=logicalExpr         #logicalExpressionMultiple
    |leftMathExpr=mathExpr LOGICALOPERATORS rightMathExpr=mathExpr        #logicalExpressionMathExpr
    |('yes'|'no')                                                             #logicalExpressionBoolean
    |ID                                                                     #logicalExpressionBooleanVar
    ;


value:
    ID                      #valueVar
    |logicalExpr            #valueLogicalExp
    |mathExpr               #valueMathExp
    |stringExpr             #valueStringExp
    ;

print:
    'brossage' '(' value? ')' ;



initializeVar:
    typeVar=('broolean'|'bronum'|'brotext')  varName=ID
    |'broolean'  varName=ID '=' logicalExpr
    |'bronum'  varName=ID '=' mathExpr
    |'brotext'  varName=ID '=' stringExpr
    ;
assignVar:
      varName=ID '=' value
      |  varName=ID '=' value
      |  varName=ID '=' value
    ;

initializeMethod:
    'broolean' methodName=ID '(' param?   ('){'|')''{') prog* 'return' logicalExpr'}'
    |'bronum' methodName=ID '(' param? ('){'|')''{') prog* 'return' mathExpr  '}'
    |'brotext' methodName=ID '(' param? ('){'|')''{') prog* 'return' stringExpr  '}'
    |'broid'  methodName=ID '(' param? ('){'|')''{') prog*'}'
    ;



callMethod:
    ID'('(ID (',' ID)*)?')'
    ;

param:
    ('broolean'|'bronum'|'brotext') ID
	|('broolean'|'bronum'|'brotext') ID ',' param
	;


loop:
    'whileBro''(' condition=logicalExpr '){' prog?'}'
    ;


ifStatment:
    'ifBro''(' condition=logicalExpr'){' prog? '}'
    ;


LOGICALOPERATORS:('=='|'!='|'>='|'<='|'<'|'>');

MATHOPERATORS:('*'|'/'|'%'|'+'|'-');

ID: [A-Za-z] [A-Za-z0-9_]*;
BRONUM:'0' | [1-9][0-9]*;
BROTEXT: '"' ID '"';
COMMENT: '//' ~( '\r' | '\n' )* -> skip;
WS: [\t ]+ -> skip;