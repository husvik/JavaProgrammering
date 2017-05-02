import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * CurrencyCalculator.Java
 *
 * (Norwegian text)
 * Filen inneholder to klasser:
 * CurrencyCalculator - Et brukergrensesnitt som lar deg se hva Norske kroner er verdt i
 * GBP, EUR, USD eller SEK, den kan også sjekke omvendt.
 * Med metodene(getValueSubstract(), getValueMultiplication(), setCurrency(), checkLegal().
 * MathListener - En indre klasse som håndterer den hendelsen at brukeren trykker på en av
 * knappene.
 *
 * Created by Tommy Husvik on 22.04.2017.
 */
public class CurrencyCalculator extends JFrame{

    //Fields of the class
    private JTextField txtDisplayOne, txtDisplayTwo;
    private JLabel labelOne = new JLabel("NOK");
    private JLabel labelTwo = new JLabel("Annen Valuta");
    private JButton[] exchange;
    private JButton[] menu;
    private double currency;

    //The constructor
    public CurrencyCalculator(){
        super("VALUTAKALKULATOR");//title of the program
        MathListener listener = new MathListener();//The actionListener

        //Panel North
        JPanel pnlNorth = new JPanel(new GridLayout(1,4));
        pnlNorth.add(labelOne);//row1,col1
        txtDisplayOne = new JTextField();
        pnlNorth.add(txtDisplayOne);//row1,col2
        pnlNorth.add(labelTwo);//row1,col3
        txtDisplayTwo = new JTextField();
        pnlNorth.add(txtDisplayTwo);//row1,col4

        //Panel Centre
        JPanel pnlCentre = new JPanel(new GridLayout(2,2));
        String[] exchangeTxt = {"GBP", "EUR", "USD", "SEK"};
        exchange = new JButton[exchangeTxt.length];

        //For loop to create buttons and adapt with actionListener for panel Centre
        for(int i = 0; i < exchangeTxt.length; i++){
            exchange[i] = new JButton(exchangeTxt[i]);
            exchange[i].addActionListener(listener);
            pnlCentre.add(exchange[i]);
        }

        //Panel South
        JPanel pnlSouth = new JPanel(new GridLayout(1,4));
        String[] menuTxt = {"Fjern NOK", "Fjern Annen valuta", "Fjern begge", "Avslutt"};
        menu = new JButton[menuTxt.length];

        //For loop to create buttons and adapt with actionListener for panel South
        for(int i = 0; i < menuTxt.length; i++){
            menu[i] = new JButton(menuTxt[i]);
            menu[i].addActionListener(listener);
            pnlSouth.add(menu[i]);
        }

        //add panels to GUI
        add(pnlNorth, BorderLayout.NORTH);
        add(pnlCentre, BorderLayout.CENTER);
        add(pnlSouth, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 150);
        setVisible(true);
    }
    //NOK converter to GBP, USD, EUR
    public void getValueSubstract(){
        String strNum1 = txtDisplayOne.getText();
        double num1 = Double.parseDouble(strNum1);
        double sum1 = num1 / currency;
        String strSum = Double.toString(sum1);
        txtDisplayTwo.setText(strSum);
    }
    //GBP,USD,EUR converter to NOK
    public void getValueMultiplication(){
        String strNum2 = txtDisplayTwo.getText();
        double num2 = Double.parseDouble(strNum2);
        double sum2 = num2 * currency;
        String strSum2 = Double.toString(sum2);
        txtDisplayOne.setText(strSum2);
    }
    //The class set method
    public void setCurrency(double currency){
        this.currency = currency;
    }
    //This method checks if one of the JTextField is empty
    public void checkLegal(){
        if(!txtDisplayOne.getText().equals("") && !txtDisplayTwo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Du må skrive bare et beløp!");
        } else if (txtDisplayOne.getText().equals("") && txtDisplayTwo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Du må skrive et beløp");
        }
    }
    private class MathListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            //Centre panel buttons
            if(e.getSource() == exchange[0]){//Button GBP
                setCurrency(10.89);
                checkLegal();
                if(txtDisplayTwo.getText().equals("")){
                    getValueSubstract();
                    labelTwo.setText("GBP");
                } else {
                    getValueMultiplication();
                    labelTwo.setText("GBP");
                }
            } else if (e.getSource() == exchange[1]){//Button EUR
                setCurrency(9.21);
                checkLegal();
                if(txtDisplayTwo.getText().equals("")){
                    getValueSubstract();
                    labelTwo.setText("EUR");
                } else {
                    getValueMultiplication();
                    labelTwo.setText("EUR");
                }
            } else if (e.getSource() == exchange[2]){//Button USD
                setCurrency(8.57);
                checkLegal();
                if(txtDisplayTwo.getText().equals("")){
                    getValueSubstract();
                    labelTwo.setText("USD");
                } else {
                    getValueMultiplication();
                    labelTwo.setText("USD");
                }
            } else if (e.getSource() == exchange[3]){//Button SEK
                setCurrency(0.95);
                checkLegal();
                if(txtDisplayTwo.getText().equals("")){
                    String strNum1 = txtDisplayOne.getText();
                    double num1 = Double.parseDouble(strNum1);
                    double sum1 = num1 * currency;
                    String strSum = Double.toString(sum1);
                    txtDisplayTwo.setText(strSum);
                    labelTwo.setText("SEK");
                } else {
                    String strNum2 = txtDisplayTwo.getText();
                    double num2 = Double.parseDouble(strNum2);
                    double sum2 = num2 / currency;
                    String strSum2 = Double.toString(sum2);
                    txtDisplayOne.setText(strSum2);
                    labelTwo.setText("SEK");
                }
                //South panel Buttons
            } if (e.getSource() == menu[0]){//Fjern NOK(Remove NOK)Button
                txtDisplayOne.setText("");
                labelTwo.setText("Annen Valuta");
            } else if (e.getSource() == menu[1]){//Fjern annen Valuta(Remove other currency)Button
                txtDisplayTwo.setText("");
                labelTwo.setText("Annen Valuta");
            } else if (e.getSource() == menu[2]){//Fjerb begge(Remove both)Button
                txtDisplayOne.setText("");
                txtDisplayTwo.setText("");
                labelTwo.setText("Annen Valuta");
            } else if (e.getSource() == menu[3]){//Avslutt(Exit)Button
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        CurrencyCalculator currencyCalculator = new CurrencyCalculator();
    }
}


