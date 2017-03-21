import java.util.ArrayList;
/**
 * Created by husvi on 12.03.2017.
 */
public class Archive {
    private ArrayList<Table> gangeTabell;

    public Archive() {
        gangeTabell = new ArrayList<Table>();
    }

    public void addTable(Table table){
        gangeTabell.add(table);
    }

    public void showMeter(int nr){
        for(Table a : gangeTabell){
            if(a.getNr() == nr){
                System.out.println(a);
            }
        }
    }
}
