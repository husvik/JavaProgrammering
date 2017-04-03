import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Note extends JFrame implements ActionListener {
    JLabel hilsen = new JLabel("her kommer valget ditt frem");
    JButton btnSave = new JButton("Lagre");
    JButton btnLoad = new JButton("Hent");
    public Note(){
        setTitle("Tommy");
        add(new JPanel(), BorderLayout.CENTER);
        add(hilsen);
        JPanel pnlSouth = new JPanel(new GridLayout(1,3));
        btnSave.setBackground(Color.GREEN);
        pnlSouth.add(btnSave);
        pnlSouth.add(btnLoad);
        btnLoad.setBackground(Color.CYAN);
        JButton btnExit = new JButton("Avslutt");
        btnExit.setBackground(Color.RED);
        pnlSouth.add(btnExit);
        btnSave.addActionListener(this);
        btnLoad.addActionListener(this);
        btnExit.addActionListener(this);
        add(pnlSouth, BorderLayout.SOUTH);
        setSize(400, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent event) {
        String text = event.getActionCommand();
        if (text.equals("Avslutt")){
            System.out.println("Avslutter..");
            hilsen.setText("EXIT");
            System.exit(0);
        }else if (text.equals("Hent")){
            System.out.println("Henter..");
            hilsen.setText("Du valgte å hente");
            if(btnLoad.getBackground()==Color.CYAN){
                btnLoad.setBackground(Color.PINK);
            } else {
                btnLoad.setBackground(Color.CYAN);
            }
        }else {
            System.out.println("Lagrer");
            hilsen.setText("Du valgte å lagre");
            if(btnSave.getBackground()==Color.GREEN){
                btnSave.setBackground(Color.YELLOW);
            } else {
                btnSave.setBackground(Color.GREEN);
            }
        }

    }
}