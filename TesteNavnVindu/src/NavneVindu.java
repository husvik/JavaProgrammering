import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * NavneVindu.java
 * Inneholder:
 */

class NavneVindu extends JFrame {
    private JTextField navnefelt = new JTextField(20);
    private JLabel hilsen = new JLabel("Her kommer det en liten hilsen");

    public NavneVindu (String tittel){
        setTitle(tittel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        JLabel ledetekst = new JLabel("Skriv navnet ditt her");
        add(ledetekst);
        add(navnefelt);

        JButton knapp = new JButton("Trykk her");
        add(knapp);
        KnappeLytter knappelytteren = new KnappeLytter();
        knapp.addActionListener(knappelytteren);

        add(hilsen);
        pack();
    }

    private class KnappeLytter implements ActionListener{

        public void actionPerformed(ActionEvent hendelse){

            String navn = navnefelt.getText();
            hilsen.setText("Hei på deg, " + navn + "!");

        }
    }


}
