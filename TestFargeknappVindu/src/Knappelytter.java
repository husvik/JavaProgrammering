import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by husvi on 11.03.2017.
 */
class Knappelytter implements ActionListener {
    public void actionPerformed(ActionEvent hendelse) {
        JButton knapp = (JButton) hendelse.getSource();
        Color farge = knapp.getBackground();
        if (farge == Color.RED) {
            knapp.setBackground(Color.BLUE);
        } else {
            knapp.setBackground(Color.RED);
        }
    }
}
