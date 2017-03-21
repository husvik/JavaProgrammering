import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 * Created by husvi on 11.03.2017.
 */
public class FargeknappVindu extends JFrame{
    public FargeknappVindu(String tittel){
        setTitle(tittel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        JButton knapp = new JButton("Click me");
        knapp.setBackground(Color.BLUE);
        add(knapp);
        Knappelytter knappelytteren = new Knappelytter();
        knapp.addActionListener(knappelytteren);
        pack();
    }
}
