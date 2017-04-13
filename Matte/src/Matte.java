/**
 * Created by husvi on 12.04.2017.
 */
public class Matte {
    private int a;
    private int b;

    public Matte(int a, int b){
        setA(a);
        setB(b);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String toString(){
        int pluss = getA() + getB();
        int minus = getA() - getB();
        int gange = getA() * getB();
        return getA() + " + " + getB() + " = " + pluss + "\n" + getA() + " - " + getB() + " = " +
                minus + "\n" + getA() + " * " + getB() + " = " + gange;
    }

    public static void main(String[] args) {
        Matte tommy = new Matte(10, 2);
        System.out.println(tommy);
    }
}