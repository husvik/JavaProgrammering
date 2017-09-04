import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by husvi on 09.05.2017.
 */
public class TestFileReader {

    public static void main(String[] args) {
        String filnavn = "Skatt.txt";
        try{
            FileReader forbindelse = new FileReader(filnavn);
            BufferedReader leser = new BufferedReader(forbindelse);
            Scanner fileIn = new Scanner(leser);
            while(fileIn.hasNext()){
                String data = fileIn.nextLine();
                System.out.println(data);

            }
            System.out.println("Navn");

        } catch (FileNotFoundException e){
            System.out.println("Fil ikke funnet: " + filnavn);
        } catch (IOException e){
            System.out.println("IOfeil ved åpning av fil: " + filnavn);
        }
    }
}
