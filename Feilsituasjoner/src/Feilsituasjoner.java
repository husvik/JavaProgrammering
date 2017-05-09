import java.util.*;
/**
 * Created by husvi on 09.05.2017.
 */
public class Feilsituasjoner {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(System.in);
            System.out.println("Oppgi teller: ");
            int teller = input.nextInt();
            System.out.println("Oppgi nevner: ");
            int nevner = input.nextInt();
            int resultat = teller/nevner;
            System.out.println("\nResultat= " + teller + "/" + nevner +" = " + resultat);
            input.close();
        }
        catch (ArithmeticException ae){
            System.out.println("Feil: " + ae.getMessage());
        }
        catch (InputMismatchException ime){
            System.out.println("Feil input: " + ime.getMessage());
        }
    }
}
