import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;


/**
 * Created by husvi on 02.05.2017.
 */
public class EnkelJList extends JFrame implements ListSelectionListener, ActionListener {
    private JList<String> liste;
    private DefaultListModel<String> listedata;
    private JButton btnAdd, btnRemove, btnExit;
    private int selectedIndex = -1;

    public  EnkelJList(){
        super("JListDemo");
        JPanel pnlButtons = new JPanel(new GridLayout(1,3));
        btnAdd = new JButton("Add");
        btnRemove = new JButton("Remove");
        btnExit = new JButton("Exit");
        btnAdd.addActionListener(this);
        btnExit.addActionListener(this);
        btnRemove.addActionListener(this);
        pnlButtons.add(btnAdd);
        pnlButtons.add(btnExit);
        pnlButtons.add(btnRemove);
        add(pnlButtons, BorderLayout.SOUTH);
        listedata = new DefaultListModel<String>();
        liste = new JList<String>(listedata);
        liste.addListSelectionListener(this);
        add(liste, BorderLayout.CENTER);
        setSize(500,200);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent event){
        Object source = event.getSource();
        if (source == btnExit) System.exit(0);
        else if (source == btnAdd) {
            String data = JOptionPane.showInputDialog(this, "Skriv en linje:");
            listedata.addElement(data);
        }
        else if (source == btnRemove){
            String removed = removeLine(selectedIndex);
            JOptionPane.showMessageDialog(this, removed + " er fjernet");
        }
    }

    public String removeLine (int index){
        if (index < 0 ){
            JOptionPane.showMessageDialog(this, "velg en linje");
            return null;
        }
        return listedata.remove(index);
    }

    public void valueChanged(ListSelectionEvent e){
        selectedIndex = liste.getSelectedIndex();
    }

    public static void main(String[] args) {
        EnkelJList a = new EnkelJList();
    }
}
