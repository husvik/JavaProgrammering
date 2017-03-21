/**
 * Trekant= 0,5 * grunnlinje * høyde
 */
public class Trekant extends Figur {
    private double grunnLinje;
    private double høyde;

    public Trekant(double grunnLinje, double høyde){
        setGrunnLinje(grunnLinje);
        setHøyde(høyde);
    }

    public void setGrunnLinje(double grunnLinje) {
        this.grunnLinje = grunnLinje;
    }

    public void setHøyde(double høyde) {
        this.høyde = høyde;
    }

    public double getGrunnLinje() {
        return grunnLinje;
    }

    public double getHøyde() {
        return høyde;
    }

    @Override
    public double beregnAreal() {
        return 0.5 * grunnLinje * høyde;
    }
}
