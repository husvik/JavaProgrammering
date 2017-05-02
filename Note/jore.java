import java.awt.*; //Layout
import javax.swing.*; //GUI-komponenter
import java.awt.event.*; //Action handling
import static javax.swing.JOptionPane.*; //Meldingsbokser
import java.io.*; //Input & output
import java.util.Scanner; //For lesing av fil

public class Valutakalkulator extends JFrame implements ActionListener
{
    private JButton btnGBP, btnEUR, btnUSD, btnSEK;
    private JButton btnFjernNok, btnFjernAnnen, btnFjernBegge, btnExit;
    private JTextField txtNok, txtOutput;
    private JLabel annenValuta;

    public Valutakalkulator(){
        setTitle("VALUTAKALKULATOR");
        JPanel pnlCenter = new JPanel(new GridLayout(2, 2));
        btnGBP = new JButton("GBP");
        btnEUR = new JButton("EUR");
        btnUSD = new JButton("USD");
        btnSEK = new JButton("SEK");

        //Legger til knappene til Center
        pnlCenter.add(btnGBP);
        pnlCenter.add(btnEUR);
        pnlCenter.add(btnUSD);
        pnlCenter.add(btnSEK); 
        add(pnlCenter, BorderLayout.CENTER); //Legger til panel til Center
        
        btnGBP.addActionListener(this);
        btnEUR.addActionListener(this);
        btnUSD.addActionListener(this);
        btnSEK.addActionListener(this);

        JPanel pnlSouth = new JPanel(new GridLayout(1, 4)); //Oppretter southPanel
        btnFjernNok = new JButton ("Fjern NOK");
        btnFjernAnnen = new JButton("Fjern annen valuta");
        btnFjernBegge = new JButton("Fjern begge");
        btnExit = new JButton("Avslutt");

        //Legger til knappene til South
        pnlSouth.add(btnFjernNok);
        pnlSouth.add(btnFjernAnnen);
        pnlSouth.add(btnFjernBegge);
        pnlSouth.add(btnExit);
        add(pnlSouth, BorderLayout.SOUTH); //Legger til panel til South

        //Oppretter grid øverst
        JPanel pnlNorth = new JPanel(new GridLayout(1, 4));
        pnlNorth.add(new JLabel("NOK")); //Legger til teksten NOK
        txtNok = new JTextField(); //Legger til textfelt hvor man skal skrive inn kr i NOK
        pnlNorth.add(txtNok); //Legger til textfeltet
        annenValuta = new JLabel("Annen Valuta");
        //pnlNorth.add(new JLabel("Annen valuta")); //Legger til teksten output
        txtOutput = new JTextField(); //oppretter output tekstfeltet
        pnlNorth.add(annenValuta);
        pnlNorth.add(txtOutput); //legger til tekstfeltet
        add(pnlNorth, BorderLayout.NORTH); //legger til selvet panelet i north

        btnFjernNok.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    fjernNok();}
            });
        btnFjernAnnen.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    fjernAnnen();}
            });
        btnFjernBegge.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    fjernBegge();}
            });
        btnExit.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    exit();}
            });

        setVisible(true);
        setSize(600,125);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
    
    public void fjernNok(){
        txtNok.setText("");
    }
    
    public void endreOutput(String output){
        annenValuta.setText("Annen Valuta");
    }

    public void fjernAnnen(){
        txtOutput.setText("");
        endreOutput("Output");
    }

    public void fjernBegge(){
        txtNok.setText("");
        txtOutput.setText("");
        endreOutput("Output");
    }
    
    private void exit(){
        System.exit(0);
    }
    
    
    public void actionPerformed(ActionEvent event){
        Object clicked = event.getSource();
        if (clicked == btnGBP) {
            annenValuta.setText("GBP");
            String strNumber1 = txtNok.getText();
            double number1 = Double.parseDouble(strNumber1);
            
            double result = number1 * 10.89;
            String resultString = Double.toString(result);
            txtOutput.setText(resultString);
        }
            
        else if (clicked == btnEUR) {
            annenValuta.setText("EUR");
            String strNumber1 = txtNok.getText();
            double number1 = Double.parseDouble(strNumber1);
            
            double result = number1 * 9.24;
            String resultString = Double.toString(result);
            txtOutput.setText(resultString);
        }
        
        else if (clicked == btnUSD){
            annenValuta.setText("USD");
            
            String strNumber1 = txtNok.getText();
            double number1 = Double.parseDouble(strNumber1);
            
            double result = number1 * 8.52;
            String resultString = Double.toString(result);
            txtOutput.setText(resultString);
        }
        else{
            annenValuta.setText("SEK");
            
            String strNumber1 = txtNok.getText();
            double number1 = Double.parseDouble(strNumber1);
            
            double result = number1 * 0.96;
            String resultString = Double.toString(result);
            txtOutput.setText(resultString);
        }
    }
    public void actionPerformed2(ActionEvent event){
            Object clicked = event.getSource();
            if (clicked == btnGBP) {
            annenValuta.setText("GBP");
            String strNumber1 = txtOutput.getText();
            double number1 = Double.parseDouble(strNumber1);
            
            double result = number1 * 10.89;
            String resultString = Double.toString(result);
            txtNok.setText(resultString);
        }
        
    }
}
