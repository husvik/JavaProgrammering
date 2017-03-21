import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Created by husvi on 11.03.2017.
 */
public class TrykknappVindu extends JFrame{
    public TrykknappVindu(String tittel){
        setTitle(tittel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        LayoutManager layout = new FlowLayout();
        setLayout(layout);

        JButton knapp = new JButton("Trykk her");//lager knappen
        add(knapp); //legger knappem i beholdern
        Knappelytter knappelytteren = new Knappelytter();//lager en lytter
        knapp.addActionListener(knappelytteren);
        pack();
    }
}
