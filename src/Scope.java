import java.util.HashMap;
import java.util.Map;

/**
 * Created by Maks on 05.06.2017.
 */
public class Scope {
    private Map<String, Method> methods;
    private Map<String, Var> vars;

    private Scope parentScope;


    public Scope(Scope parentScope){
        this.methods = new HashMap<>();
        this.vars = new HashMap<>();
        this.parentScope = parentScope;
    }

    public void addMethod(String methodName, Method method){
        methods.put(methodName, method);
    }

    public void addVar(String varName, Var var){
        vars.put(varName, var);
    }

    public Method findMethod(String methodName){


        if(parentScope == null){//what if it is root scope?
            if(methods.containsKey(methodName)){
                return methods.get(methodName);
            }else{
                return null;
            }
        }else if(methods.containsKey(methodName)){
            return methods.get(methodName);
        }else{
            return parentScope.findMethod(methodName);
        }
    }

    public Var findVar(String vardName){


        if(parentScope == null){//what if it is root scope?
            if(vars.containsKey(vardName)){
                return vars.get(vardName);
            }else{
                return null;
            }
        }else if(vars.containsKey(vardName)){
            return vars.get(vardName);
        }else{
            return parentScope.findVar(vardName);
        }
    }

    public Scope getParentScope() {
        return parentScope;
    }
}
