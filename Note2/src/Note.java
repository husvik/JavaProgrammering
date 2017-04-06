import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.net.*;

public class Note extends JFrame implements ActionListener {
    JLabel hilsen = new JLabel("YOLO");
    JButton btnSave = new JButton("Lagre");
    JButton btnLoad = new JButton("Hent");
    JButton btnExit = new JButton("Avslutt");
    JButton btnYolo = new JButton("YOLO");

    public Note(){//konstruktøren i Note klassen
        //Lager rammen--------------------------
        setTitle("Tommy");
        add(new JPanel(), BorderLayout.CENTER);
        hilsen.setFont(new Font("Courier", Font.BOLD,75));
        add(hilsen);
        setSize(800, 800);
        setVisible(true);
        //Lager knappe meny---------------------
        JPanel pnlSouth = new JPanel(new GridLayout(2,2));
        //legger til knappene-------------------
        pnlSouth.add(btnSave);
        pnlSouth.add(btnLoad);
        pnlSouth.add(btnExit);
        pnlSouth.add(btnYolo);
        //Leget til farge-----------------------
        btnSave.setBackground(Color.GREEN);
        btnLoad.setBackground(Color.CYAN);
        btnExit.setBackground(Color.RED);
        btnYolo.setBackground(Color.YELLOW);
        btnExit.setFont(new Font("Tahoma", Font.BOLD,12));
        btnLoad.setFont(new Font("Tahoma", Font.BOLD,12));
        btnSave.setFont(new Font("Tahoma", Font.BOLD,12));
        btnYolo.setFont(new Font("Tahoma", Font.BOLD,12));


        btnSave.addActionListener(this);
        btnLoad.addActionListener(this);
        btnExit.addActionListener(this);
        btnYolo.addActionListener(this);
        add(pnlSouth, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent event) {
        String text = event.getActionCommand();
        if (text.equals("Avslutt")){
            hilsen.setForeground(Color.BLACK);
            System.out.println("Avslutter..");
            hilsen.setText("EXIT");
            System.exit(0);
        }else if (text.equals("Hent")){
            System.out.println("Henter..");
            hilsen.setText("Du valgte å hente");



            /*
            * try {
                Desktop.getDesktop().browse(new URL("http://www.google.com").toURI());
            } catch (Exception e) {}
        }
            * */

        }else if (text.equals("YOLO")){
            System.out.println("<3 JAVA..");
            hilsen.setText("<3<3JAVA<3<3");
            hilsen.setForeground(Color.PINK);
            if(btnYolo.getBackground()==Color.YELLOW){
                btnYolo.setBackground(Color.PINK);
            } else {
                btnYolo.setBackground(Color.YELLOW);
            }
        }else {
            System.out.println("Lagrer");
            hilsen.setText("Du valgte å lagre");
            hilsen.setForeground(Color.BLUE);
            if(btnSave.getBackground()==Color.GREEN){
                btnSave.setBackground(Color.YELLOW);
            } else {
                btnSave.setBackground(Color.GREEN);
            }
        }

    }



    public static void main(String[] args) {
        Note a = new Note();
    }
}