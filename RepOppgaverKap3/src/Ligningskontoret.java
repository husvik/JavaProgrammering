/**
 * Created by husvi on 12.03.2017.
 */
public class Ligningskontoret {
    private int dag;

    public Ligningskontoret(int dag){
        setDag(dag);
    }

    public void setDag(int dag) {
        this.dag = dag;
    }

    public int getDag() {
        return dag;
    }

    public int kontor(){
        int sted = 0;
        if(dag >= 1){
            sted = 113;
        } if(dag >= 9){
            sted = 120;
        } if(dag >= 15){
            sted = 125;
        } if(dag >= 26){
            sted = 134;
        }
        return sted;
    }

    public String toString(){
        String retur = "Du er født på dagnr: " + getDag() + "\nDu skal på kontor nr: " + kontor();
        return retur;
    }

    public static void main(String[] args) {
        Ligningskontoret a = new Ligningskontoret(26);
        System.out.println(a);
    }
}
