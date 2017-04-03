import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Note extends JFrame implements ActionListener {
    private JLabel hilsen = new JLabel("her kommer valget ditt frem");
    public Note(){
        setTitle("huskelapp");
        add(new JTextArea(), BorderLayout.CENTER);
        JPanel pnlSouth = new JPanel(new GridLayout(1,3));
        JButton btnSave = new JButton("Lagre");
        btnSave.setBackground(Color.GREEN);
        pnlSouth.add(btnSave);
        JButton btnLoad = new JButton("Hent");
        pnlSouth.add(btnLoad);
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
        add(hilsen);

    }

    public void actionPerformed(ActionEvent event) {
        String text = event.getActionCommand();
        if (text.equals("Avslutt")){
            System.out.println("Avslutter..");
            System.exit(0);
        }else if (text.equals("Hent")){
            System.out.println("Henter..");
        }else {
            System.out.println("Lagrer");
        }
       
    }
}