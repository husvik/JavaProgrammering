/**
 * FigurClient.java
 *
 * objekter av figurer i en tabell, se om polymorfien virker
 * Created by husvi on 07.03.2017.
 */
public class FigurClient {
    public static void main(String[] args) {
        Sirkel a = new Sirkel(2);
        Trekant b = new Trekant(3,3);
        Kvadrat c = new Kvadrat(11);

        Figur [] figTabell = new Figur[3];
        figTabell[0]=a;
        figTabell[1]=b;
        figTabell[2]=c;

        for(int i = 0; i < figTabell.length; i++){
            System.out.println("Arealet av en " + figTabell[i].getClass().getName() + " = " + figTabell[i].beregnAreal());
        }
    }
}
