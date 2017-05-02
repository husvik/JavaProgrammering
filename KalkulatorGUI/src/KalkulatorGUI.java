import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by husvi on 18.04.2017.
 */
public class KalkulatorGUI extends JFrame implements ActionListener{
    JTextField txtNumber1;
    JTextField txtNumber2;
    JLabel res = new JLabel("  ");
    JButton btnPluss = new JButton("+");
    JButton btnMinus = new JButton("-");
    JButton btnGange = new JButton("*");
    JButton btnDele = new JButton("/");
    JButton btnAvslutt = new JButton("Avslutt");

    public KalkulatorGUI(){
        setTitle("Kalkulator");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 200);
        //De øverste panel boksene
        JPanel pnlCenter = new JPanel(new GridLayout(3, 3));
        pnlCenter.add(new JLabel("Tall1"));
        txtNumber1 = new JTextField();
        pnlCenter.add(txtNumber1);
        pnlCenter.add(new JLabel("Tall2"));
        txtNumber2 = new JTextField();
        pnlCenter.add(txtNumber2);
        pnlCenter.add(new JLabel("Resultat"));
        pnlCenter.add(res);
        res.setBackground(Color.WHITE);
        setVisible(true);
        add(pnlCenter, BorderLayout.CENTER);
        //De nederste knappene
        JPanel pnlSouth = new JPanel(new GridLayout(1,5));
        pnlSouth.add(btnPluss);
        pnlSouth.add(btnMinus);
        pnlSouth.add(btnGange);
        pnlSouth.add(btnDele);
        pnlSouth.add(btnAvslutt);
        btnPluss.addActionListener(this);
        btnMinus.addActionListener(this);
        btnGange.addActionListener(this);
        btnDele.addActionListener(this);
        btnAvslutt.addActionListener(this);
        add(pnlSouth, BorderLayout.SOUTH);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        //konvertere tallene fra String
        String strNumber1 = txtNumber1.getText();
        String strNumber2 = txtNumber2.getText();
        int number1 = Integer.parseInt(strNumber1);
        int number2 = Integer.parseInt(strNumber2);
        //Tegn på knappene og hva som skal skje
        String text = event.getActionCommand();
        if (text.equals("+")){
            int sum = number1 + number2;
            String sum1 = Integer.toString(sum);
            res.setText(sum1);
        }else if (text.equals("-")) {
            int sum = number1 - number2;
            String sum1 = Integer.toString(sum);
            res.setText(sum1);
        }else if (text.equals("*")){
            int sum = number1 * number2;
            String sum1 = Integer.toString(sum);
            res.setText(sum1);
        }else if (text.equals("/")){
            int sum = number1 / number2;
            String sum1 = Integer.toString(sum);
            res.setText(sum1);
        }else if (text.equals("Avslutt")) {
            System.exit(0);
        }


    }

    public static void main(String[] args) {
        KalkulatorGUI a = new KalkulatorGUI();
    }
}
