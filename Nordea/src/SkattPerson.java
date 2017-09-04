/**
 * Created by husvi on 06.06.2017.
 */
public class SkattPerson{
    String name;
    int inntekt;
    int skatteklasse;

    public SkattPerson(String name, int inntekt, int skatteklasse){
        this.name = name;
        this.inntekt = inntekt;
        this.skatteklasse = skatteklasse;

    }







    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInntekt() {
        return inntekt;
    }

    public void setInntekt(int inntekt) {
        this.inntekt = inntekt;
    }

    public int getSkatteklasse() {
        return skatteklasse;
    }

    public void setSkatteklasse(int skatteklasse) {
        this.skatteklasse = skatteklasse;
    }

    @Override
    public String toString() {
        return name +" "+ inntekt +" "+ skatteklasse;
    }
}
