import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * created by husvi 09.05.2017
 */

public class Joker extends JFrame {
    private JButton[] btnValgOppe = new JButton[5];
    private JButton[] btnValgNede = new JButton[5];
    private JLabel[] lblTallene = new JLabel[5];
    private JLabel[] lblPremier = new JLabel[6];
    private int valg, premie;
    private Spillpanel pnlSpillpanel;
    private Premiepanel pnlPremiepanel;

    public Joker() {
        super("JOKER");
        pnlSpillpanel = new Spillpanel();
        pnlPremiepanel = new Premiepanel();
        add(pnlSpillpanel, BorderLayout.EAST);
        add(pnlPremiepanel, BorderLayout.WEST);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        valg = 4;
        premie = 5;
        setSize(150, 200);
        setVisible(true);
    }

    // Lytter etter knappetrykk.
    private class KnappeLytter implements ActionListener {
        public void actionPerformed(ActionEvent klikk) {
            int tilfeldigTall = (int) (Math.random() * 9) + 1;
            int tallet = Integer.parseInt(lblTallene[valg].getText());
            if (klikk.getSource() == btnValgOppe[valg]) {
                btnValgOppe[valg].setText(tilfeldigTall + "");
                if (tilfeldigTall >= tallet) {
                    lblPremier[premie].setForeground(Color.BLACK);
                    lblPremier[--premie].setForeground(Color.WHITE);
                } else if (premie < 5) {
                    lblPremier[premie].setForeground(Color.BLACK);
                    lblPremier[++premie].setForeground(Color.WHITE);
                }
            } else if (klikk.getSource() == btnValgNede[valg]) {
                btnValgNede[valg].setText(tilfeldigTall + "");
                if (tilfeldigTall <= tallet) {
                    lblPremier[premie].setForeground(Color.BLACK);
                    lblPremier[--premie].setForeground(Color.WHITE);
                } else if (premie < 5) {
                    lblPremier[premie].setForeground(Color.BLACK);
                    lblPremier[++premie].setForeground(Color.WHITE);
                }

            }
            btnValgOppe[valg].setEnabled(false);
            btnValgNede[valg].setEnabled(false);
            if (valg > 0) {
                btnValgOppe[--valg].setEnabled(true);
                btnValgNede[valg].setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "Gratulerer - du vant "
                        + lblPremier[premie].getText());
                System.exit(0);
            }
        }
    }

    private class Spillpanel extends JPanel {
        public Spillpanel() {
            KnappeLytter lytter = new KnappeLytter();
            setLayout(new GridLayout(3, 5));
            for (int i = 0; i < 5; i++) {
                btnValgOppe[i] = new JButton("opp");
                btnValgOppe[i].addActionListener(lytter);
                add(btnValgOppe[i]);
                if (i < 4) {
                    btnValgOppe[i].setEnabled(false);
                }
            }

            for (int i = 0; i < 5; i++) {
                int tall = (int) (Math.random() * 9) + 1;
                lblTallene[i] = new JLabel(tall + "", JLabel.CENTER);
                add(lblTallene[i]);
            }

            for (int i = 0; i < 5; i++) {
                btnValgNede[i] = new JButton("ned");
                btnValgNede[i].addActionListener(lytter);
                add(btnValgNede[i]);
                if (i < 4) {
                    btnValgNede[i].setEnabled(false);
                }
            }
        }
    }

    private class Premiepanel extends JPanel {
        public Premiepanel() {
            setLayout(new GridLayout(6, 1));
            setBackground(Color.LIGHT_GRAY);
            for (int i = 0; i < 6; i++) {
                int premie = (6 - i + 1) * 100000;
                lblPremier[i] = new JLabel("   " + premie + "   ", JLabel.RIGHT);
                add(lblPremier[i]);
            }
            lblPremier[5].setForeground(Color.RED);
        }
    }

    public static void main(String[] args) {
        Joker a = new Joker();
    }
}