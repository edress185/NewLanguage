import java.util.ArrayList;

/**
 * Created by Maks on 06.06.2017.
 */
public class Method {

    private String name;
    private Var.Type type;
    private ArrayList<Var.Type> params;

    public Method(Var.Type type, String name, ArrayList<Var.Type> params){
        this.name = name;
        this.params = params;
        this.type = type;

    }

    public Var.Type getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Var.Type> getParams() {
        return params;
    }


}

