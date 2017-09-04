import java.util.ArrayList;
import java.util.*;
import java.io.*;
/**
 * Created by husvi on 06.06.2017.
 */
public class Archive {
    ArrayList<Person> list;
    File skatt;

    public Archive(){
        list = new ArrayList<>();
        skatt = new File("skatt.txt");
    }

    public void readFile(){}
    try{
        Scanner scan = new Scanner(skatt);


    }catch(FileNotFoundException ex){
        System.out.println(ex.toString());
    }
}
