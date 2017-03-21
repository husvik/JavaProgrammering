/**
 * Areal av Sirkel = pi * r * r
 */
public class Sirkel extends Figur{
    private double radius;

    public Sirkel(double radius){
        setRadius(radius);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double beregnAreal() {
        return Math.PI * radius * radius;
    }
}
