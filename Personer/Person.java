
/**
 * Created by husvi on 06.06.2017.
 */
public class Person {
    public String name;
    public int inntekt;
    public int klasse;


    public Person(String name, int inntekt, int klasse){
        setName(name);
        setInntekt(inntekt);
        setKlasse(klasse);
    }

    public void setName(String name){
        this.name = name;
    }
    public void setInntekt(int inntekt){
        this.inntekt = inntekt;
    }
    public void setKlasse(int klasse){
        this.klasse = klasse;
    }
    public String getName(){
        return name;
    }
    public int getInntekt(){
        return inntekt;
    }
    public int getKlasse(){
        return klasse;
    }
    public String toString(){
        return "name: " + getName() + "inntekt: " + getInntekt() + "skatteklasse: " + getKlasse();
    }
}
