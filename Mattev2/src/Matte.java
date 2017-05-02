import java.util.Scanner;
/**
 * Created by husvi on 13.04.2017.
 */
public class Matte {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//legger til en scanner

        System.out.println("første tall");
        int førsteTall = scanner.nextInt();//scanner inn det første tallet

        System.out.println("andre tall");
        int andreTall = scanner.nextInt();//scanner inn det andre tallet

        int sum = førsteTall + andreTall;
        System.out.println(førsteTall + " + " + andreTall + " = " + sum);//skriver ut summen

    }
}
