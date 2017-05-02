import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by husvi on 18.04.2017.
 */
public class MemoryGame extends JFrame implements ActionListener {
    JButton btn1 = new JButton("1");
    JButton btn1d = new JButton("1");
    JButton btn2 = new JButton("2");
    JButton btn3 = new JButton("3");
    JButton btn4 = new JButton("4");
    JButton btn5 = new JButton("5");
    JButton btn6 = new JButton("6");
    JButton btn7 = new JButton("7");
    JButton btn8 = new JButton("8");
    JButton btn9 = new JButton("9");
    JButton btn10 = new JButton("10");
    JButton btn11 = new JButton("11");
    JButton btn12 = new JButton("12");
    JButton btn13 = new JButton("13");
    JButton btn14 = new JButton("14");
    JButton btn15 = new JButton("15");
    JButton btnRestart = new JButton("Restart");
    JButton btnExit = new JButton("Exit");

    public MemoryGame() {
        //GUI
        setTitle("MEMORY");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 200);
        //Buttons center
        JPanel pnlCenter = new JPanel(new GridLayout(5, 5));

        btn1.setBackground(Color.WHITE);
        btn1.setForeground(Color.WHITE);

        pnlCenter.add(btn1);
        pnlCenter.add(btn1d);
        pnlCenter.add(btn2);
        pnlCenter.add(btn2);
        pnlCenter.add(btn3);
        pnlCenter.add(btn3);
        pnlCenter.add(btn4);
        pnlCenter.add(btn4);
        pnlCenter.add(btn5);
        pnlCenter.add(btn5);
        pnlCenter.add(btn6);
        pnlCenter.add(btn6);
        pnlCenter.add(btn7);
        pnlCenter.add(btn7);
        pnlCenter.add(btn8);
        pnlCenter.add(btn8);
        pnlCenter.add(btn9);
        pnlCenter.add(btn9);
        pnlCenter.add(btn10);
        pnlCenter.add(btn10);
        pnlCenter.add(btn15);
        pnlCenter.add(btn11);
        pnlCenter.add(btn11);
        pnlCenter.add(btn12);
        pnlCenter.add(btn12);
        pnlCenter.add(btn13);
        pnlCenter.add(btn13);
        pnlCenter.add(btn14);
        pnlCenter.add(btn14);
        pnlCenter.add(btn15);
        btn1.setHideActionText(true);
        btn2.setHideActionText(true);
        btn3.setHideActionText(true);
        btn4.setHideActionText(true);
        btn5.setHideActionText(true);
        btn6.setHideActionText(true);
        btn7.setHideActionText(true);
        btn8.setHideActionText(true);
        btn9.setHideActionText(true);
        btn10.setHideActionText(true);
        btn11.setHideActionText(true);
        btn12.setHideActionText(true);
        btn14.setHideActionText(true);
        btn15.setHideActionText(true);
        btn13.setHideActionText(true);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn10.addActionListener(this);
        btn11.addActionListener(this);
        btn12.addActionListener(this);
        btn13.addActionListener(this);
        btn14.addActionListener(this);
        btn15.addActionListener(this);

        JPanel pnlSouth = new JPanel(new GridLayout(1, 2));
        pnlSouth.add(btnRestart);
        pnlSouth.add(btnExit);
        btnRestart.addActionListener(this);
        btnRestart.addActionListener(this);
        add(pnlCenter, BorderLayout.CENTER);
        add(pnlSouth, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent event){
        String text = event.getActionCommand();
        if(text.equals(getName())==text.equals(getName())){
            btn1.setForeground(Color.BLACK);
        }
    }

    public static void main(String[] args) {
        MemoryGame a = new MemoryGame();
    }

}
