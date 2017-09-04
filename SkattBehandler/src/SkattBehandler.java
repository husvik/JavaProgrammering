import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.*;

/**
 * Created by husvi on 06.06.2017.
 */
public class SkattBehandler {
    File skatt;
    ArrayList<String> navnList;
    ArrayList<Integer> inntektList;
    ArrayList<Integer> klasseList;


    public SkattBehandler(){
        skatt = new File("skatt.txt");
    }

    public void readNPrint(){
        try{
            Scanner scan = new Scanner(skatt);
            navnList = new ArrayList<>();
            inntektList = new ArrayList<>();
            klasseList = new ArrayList<>();

            while(scan.hasNext()){
                navnList.add(scan.nextLine());
                String inntekt = scan.nextLine();
                inntektList.add(Integer.parseInt(inntekt));
                String skatt = scan.nextLine();
                klasseList.add(Integer.parseInt(skatt));
            }
        } catch(FileNotFoundException ex){
            System.out.println(ex.toString());
        }
        for(int i = 0; i < navnList.size(); i++){
            System.out.println(navnList.get(i)+" "+inntektList.get(i)+" "+klasseList.get(i));
        }

        int antSkatt1 = 0;
        int antSkatt2 = 0;

        for(Integer i : klasseList){
            if(i==1){
                antSkatt1++;
            }else if(i==2){
                antSkatt2++;
            }
        }

        int sum = 0;

        for(Integer i : inntektList){
            int inntekt = i;
            sum += inntekt;
        }
        int size = inntektList.size();
        int gjennomsnitt = sum / size;

        System.out.println("antall i skatt 1: " + antSkatt1);
        System.out.println("antall i skatt 1: " + antSkatt1);
        System.out.println("gjennom " + gjennomsnitt);

    }

    public static void main(String[] args) {
        SkattBehandler a = new SkattBehandler();
        a.readNPrint();
    }
}
