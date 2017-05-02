import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static  javax.swing.JOptionPane.*;
import java.io.*;
import java.util.Scanner;

/**
 * Created by husvi on 18.04.2017.
 */
public class Vote extends JFrame implements ActionListener{
    JButton btnJa = new JButton("Ja");
    JButton btnNei = new JButton("Nei");
    JButton btnLagre = new JButton("Lagre");
    JButton btnHent = new JButton("Hent");
    JButton btnAvslutt = new JButton("Avslutt");
    private int yesNum;
    private int noNum;
    JLabel yesVote = new JLabel("   ");
    JLabel noVote = new JLabel("");


    //konstruktør
    public Vote(){

        setTitle("Stemmeopptelling");
        setSize(400,120);
        setVisible(true);

        JPanel pnlNorth = new JPanel(new GridLayout(1,5));
        pnlNorth.add(btnJa);
        pnlNorth.add(btnNei);
        pnlNorth.add(btnLagre);
        pnlNorth.add(btnHent);
        pnlNorth.add(btnAvslutt);
        add(pnlNorth, BorderLayout.NORTH);

        JPanel pnlSouth = new JPanel(new GridLayout(2,2));
        pnlSouth.add(new JLabel("JA-Stemmer"));
        pnlSouth.add(yesVote);
        pnlSouth.add(new JLabel("NEI-Stemmer"));
        pnlSouth.add(noVote);
        add(pnlSouth, BorderLayout.SOUTH);


        btnJa.addActionListener(this);
        btnNei.addActionListener(this);
        btnHent.addActionListener(this);
        btnLagre.addActionListener(this);
        btnAvslutt.addActionListener(this);
        setVisible(true);


    }

    public void actionPerformed(ActionEvent event){


        String text = event.getActionCommand();
        if(text.equals("Ja")){
            yesNum++;
            String num = Integer.toString(yesNum);
            yesVote.setText(num);
        }else if(text.equals("Nei")){
            noNum++;
            String num = Integer.toString(noNum);
            noVote.setText(num);
        }else if(text.equals("Hent")){
            yesVote.setText("");
            noVote.setText("");
            yesNum=0;
            noNum=0;

        }
    }

    public static void main(String[] args) {
        Vote vote = new Vote();
    }
}
