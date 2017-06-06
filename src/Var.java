/**
 * Created by Maks on 05.06.2017.
 */
public class Var {
    enum Type {broolean, bronum, brotext}

    private Type type;
    private int tokenId;
    private String name;

    public Var(String name, int tokenId, Type type){
        this.name = name;
        this.tokenId = tokenId;
        this.type = type;

    }

    public int getTokenId() {
        return tokenId;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }


}
