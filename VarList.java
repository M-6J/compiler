import java.util.ArrayList;

public class VarList {
    private static VarList instance;
    private final ArrayList<Var> list;
    private VarList(){
        this.list=new ArrayList<>();
    }
    public static VarList getInstance(){
        if(instance==null){
            instance=new VarList();
        }
        return instance;
    }
    public void add(Var var){
        this.list.add(var);
    }
    public Var getVar(String a){
        for (Var var : this.list) {
            if (a.equals(var.getName())) {
                return var;
            }
        }
        return null;
    }
}