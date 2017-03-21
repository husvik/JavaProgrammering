/**
 * Centimeter.java
 *
 * Denne klassen regner om tommer til cm
 * Created by husvi on 12.03.2017.
 */
public class Centimeter {
    private double tommer;

    public Centimeter(double tommer){
        setTommer(tommer);
    }

    public double getTommer() {
        return tommer;
    }

    public void setTommer(double tommer) {
        this.tommer = tommer;
    }

    public String toString(){
        String retur = getTommer() + " Tommer = " + (getTommer() * 2.54) + "cm.";
        return retur;
    }

    public static void main(String[] args) {
        Centimeter a = new Centimeter(20);
        System.out.println(a);
    }
}
