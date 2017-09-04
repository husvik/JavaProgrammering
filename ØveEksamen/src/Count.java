import java.util.ArrayList;
/**
 * Created by husvi on 27.05.2017.
 */
public class Count {
    static int count(ArrayList<String> list, int helTall){
        int teller = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).length()==helTall) teller++;
        }
        return teller;
    }

    static void replace(ArrayList<String> list){

        for(int i = 0; i < list.size(); i++){
            String replacement = "";
            String element = list.get(i);
            for(int j = 0; j < element.length(); j++){
                replacement +="*";
            }
            list.set(i, replacement);
        }
    }
}
