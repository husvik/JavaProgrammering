import java.io.*;
import java.util.*;

/**
 * Created by Thomas on 06.06.2017.
 */
public class SkattBehandler {

    File skatt;
    File skatt1;
    File skatt2;
    ArrayList<String> navnList;
    ArrayList<Integer> inntektList;
    ArrayList<Integer> skatteklasseList;
    ArrayList<SkattPerson> personList;

    public SkattBehandler() {
        skatt = new File("skatt.txt");
        skatt1 = new File("skatt1.txt");
        skatt2 = new File("skatt2.txt");
        //readNPrint();
        readTwoPrintInc();
    }

    public void readNPrint(){

        try{
            Scanner scan = new Scanner(skatt);
            navnList = new ArrayList<>();
            inntektList= new ArrayList<>();
            skatteklasseList = new ArrayList<>();


            while(scan.hasNext()){

                navnList.add(scan.nextLine());
                String inntekt = scan.nextLine();
                inntektList.add(Integer.parseInt(inntekt));
                String skatt = scan.nextLine();
                skatteklasseList.add(Integer.parseInt(skatt));


            }
        }



        catch(FileNotFoundException ex ) {
            System.out.println(ex.toString());
        }

        for(int i = 0; i < navnList.size(); i ++){
            System.out.println(navnList.get(i) + "  " + inntektList.get(i) +
                    "  "+ skatteklasseList.get(i));
        }

        int antSkatt1 = 0;
        int antSkatt2 = 0;
        for(Integer i : skatteklasseList){
            //for(int i = 0; i < skatteklasseList.size(); i++){
            if(skatteklasseList.get(i) == 1){
                antSkatt1++;
            }
            else if(skatteklasseList.get(i) == 2){
                antSkatt2++;
            }
        }
        int sum = 0;


        for(int i = 0; i < inntektList.size(); i++){
            int inntekt = inntektList.get(i);
            sum += inntekt;
        }


        int size = inntektList.size();
        int gjennomsnitt = sum / size;

        System.out.println("Antall i skatreklasse 1: "+antSkatt1);
        System.out.println("Antall i skatreklasse 2: "+ antSkatt2);
        System.out.println("Gjennomsnittsinntekt: "+gjennomsnitt);



    }
    public void readTwoPrintInc(){
        try{
            Scanner scan = new Scanner(skatt1);
            Scanner scan2 = new Scanner(skatt2);
            personList = new ArrayList<>();


            while(scan.hasNext()){

                String name = scan.nextLine();
                String inntekt = scan.nextLine();
                int inntektInt = Integer.parseInt(inntekt);
                String skatt = scan.nextLine();
                int skattInt = Integer.parseInt(skatt);
                SkattPerson p = new SkattPerson(name, inntektInt, skattInt);
                personList.add(p);


            }
            while(scan2.hasNext()){

                String name = scan2.nextLine();
                String inntekt = scan2.nextLine();
                int inntektInt = Integer.parseInt(inntekt);
                String skatt = scan2.nextLine();
                int skattInt = Integer.parseInt(skatt);
                SkattPerson p = new SkattPerson(name, inntektInt, skattInt);
                personList.add(p);
            }
            scan.close();
            scan2.close();
        }



        catch(FileNotFoundException ex ) {
            System.out.println(ex.toString());
        }



        for(SkattPerson s : personList){
            System.out.println(s);
        }

        ArrayList<Integer> inntektList = new ArrayList<>();
        ArrayList<SkattPerson> sortedPerson = new ArrayList<>();

        for(SkattPerson p : personList){
            inntektList.add(p.getInntekt());
        }

        Collections.sort(inntektList);

        for(Integer i : inntektList){

            for(SkattPerson p : personList){
                if(p.getInntekt() == i){
                    sortedPerson.add(p);
                }
            }

        }
        System.out.println();
        System.out.println("---------SORTERER -------------");
        System.out.println();
        for(SkattPerson p : sortedPerson){
            System.out.println(p);
        }

        try{

            File skatt3 = new File("skatt3.txt");
            PrintWriter writer = new PrintWriter(skatt3);
            for(SkattPerson p : sortedPerson){
                writer.append(p.getName());
                writer.println();
                writer.append(p.getInntekt()+"");
                writer.println();
                writer.append(p.getSkatteklasse()+"");
                writer.println();
            }

            writer.close();
        }catch (Exception e){
            System.out.println(e.toString());
        }




    }

    public static void main(String[] args) {
        SkattBehandler a = new SkattBehandler();

    }



}