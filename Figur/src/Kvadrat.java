/**
 * Areal.java
 *
 *
 * Areal = side*side
 */
public class Kvadrat extends Figur {
    private double side;

    public Kvadrat(int side){
        setSide(side);
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double beregnAreal() {
        return side * side;
    }
}
