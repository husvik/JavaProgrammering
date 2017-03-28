import javax.swing.*;
import java.awt.*;

/**
 * Created by husvi on 28.03.2017.
 */
public class Huskelapp extends JFrame{

    public Huskelapp(){

        setTitle("Huskelapp");
        JTextArea lol = new JTextArea();
        add(lol);
        lol.setBackground(Color.yellow);//legger til tekstområde
        setSize(800,800);//Setter dimensjoner
        setVisible(true);//Betyr at dette blir synelig når det blir opprettet
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Hva skal skje når jeg lukker vinduet?


    }

    public static void main(String[] args) {
        Huskelapp a = new Huskelapp();


    }

}
