import javax.swing.*;
/**
 * Created by husvi on 28.03.2017.
 */
public class Huskelapp extends JFrame{
    public Huskelapp(){
        setTitle("Huskelapp");
        add(new JTextArea());
        setSize(800,800);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Huskelapp a = new Huskelapp();
    }

}
