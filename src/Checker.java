import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * Created by Maks on 06.06.2017.
 */
public class Checker extends BroLanguageBaseVisitor {

    private Scope scope;
    private ParseTreeProperty<Var> symb = new ParseTreeProperty<>();
    private int invVarNum =0;


    public Checker(){
        this.scope = new Scope(null);//original/root scope
    }



}
