import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import static javax.swing.JOptionPane.*;

public class A extends JFrame implements ActionListener{
    private JButton btnPlus, btnMinus, btnMultiply, btnDivide, btnExit;
    private JTextField txtNumber1, txtNumber2, txtRes;

    public A(){
        setTitle("Calculator");
        JPanel pnlDisplay = new JPanel(new GridLayout(3,2));
        JPanel pnlButtons = new JPanel(new GridLayout(1,5));

        txtNumber1 = new JTextField(12);
        txtNumber2 = new JTextField(12);
        txtRes = new JTextField(12);

        pnlDisplay.add(new JLabel("Tall 1:"));
        pnlDisplay.add(txtNumber1);
        pnlDisplay.add(new JLabel("Tall 2:"));
        pnlDisplay.add(txtNumber2);
        pnlDisplay.add(new JLabel("Resultat:"));
        pnlDisplay.add(txtRes);
        add(pnlDisplay, BorderLayout.CENTER);

        btnPlus = new JButton("+");
        btnMinus = new JButton("-");
        btnMultiply = new JButton("*");
        btnDivide = new JButton("/");
        btnExit = new JButton("Avslutt");

        btnExit.addActionListener(this);
        btnDivide.addActionListener(this);
        btnMultiply.addActionListener(this);
        btnMinus.addActionListener(this);
        btnPlus.addActionListener(this);

        pnlButtons.add(btnPlus);
        pnlButtons.add(btnMinus);
        pnlButtons.add(btnMultiply);
        pnlButtons.add(btnDivide);
        pnlButtons.add(btnExit);
        add(pnlButtons, BorderLayout.SOUTH);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        JButton clicked = (JButton) e.getSource();
        if(clicked == btnExit) System.exit(0);

        String strNumber1 = txtNumber1.getText();
        String strNumber2 = txtNumber2.getText();
        if(strNumber1.length() == 0 || strNumber2.length() == 0){
            showMessageDialog(this, "feil i tall");
        } else {
            double number1 = Double.parseDouble(strNumber1);
            double number2 = Double.parseDouble(strNumber2);
            double result = 0;
            if(clicked == btnPlus){
                result = number1 + number2;
            } else if (clicked == btnMinus) {
                result = number1 - number2;
            } else if (clicked == btnMultiply){
                result = number1 * number2;
            } else if (clicked == btnDivide){
                result = number1 / number2;
            }

            txtRes.setText("" + result);
        }
    }

    public static void main(String[] args) {
        A a = new A();
    }
}


