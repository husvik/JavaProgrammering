/**
 * Created by husvi on 12.03.2017.
 */
public class Table {
    private int nr;

    public Table(int nr){
        setNr(nr);
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String toString(){
        String retur = getNr() + "-gangen:\n" +
                getNr() + " x 1 = " + (getNr()*1) + "\n" +
                getNr() + " x 2 = " + (getNr()*2) + "\n" +
                getNr() + " x 3 = " + (getNr()*3) + "\n" +
                getNr() + " x 4 = " + (getNr()*4) + "\n" +
                getNr() + " x 5 = " + (getNr()*5) + "\n" +
                getNr() + " x 6 = " + (getNr()*6) + "\n" +
                getNr() + " x 7 = " + (getNr()*7) + "\n" +
                getNr() + " x 8 = " + (getNr()*8) + "\n" +
                getNr() + " x 9 = " + (getNr()*9) + "\n" +
                getNr() + " x 10 = " + (getNr()*10) + "\n";
        return retur;
    }

    public static void main(String[] args) {
        Archive a = new Archive();
        a.addTable(new Table(1));
        a.addTable(new Table(2));
        a.addTable(new Table(3));
        a.addTable(new Table(4));
        a.addTable(new Table(5));
        a.addTable(new Table(6));
        a.addTable(new Table(7));
        a.addTable(new Table(8));
        a.addTable(new Table(9));
        a.addTable(new Table(10000234));
        a.showMeter(10000234);
    }
}
