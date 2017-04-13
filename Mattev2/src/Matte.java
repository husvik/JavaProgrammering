import java.util.Scanner;
/**
 * Created by husvi on 13.04.2017.
 */
public class Matte {

    public static void main(String[] args) {

        Scanner tommy = new Scanner(System.in);//legger til en scanner

        System.out.println("første tall");
        int nra = tommy.nextInt();//scanner inn det første tallet

        System.out.println("andre tall");
        int nrb = tommy.nextInt();//scanner inn det andre tallet

        int sum = nra + nrb;
        System.out.println(nra + " + " + nrb + " = " + sum);//skriver ut summen

    }
}
