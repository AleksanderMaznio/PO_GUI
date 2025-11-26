import javax.swing.*;

public class Contacts extends JFrame{
    private JPanel Contacts;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton saveNewButton;
    private JButton saveExistingButton;
    private JList list1;

    public Contacts(){
        setContentPane(Contacts);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,450);
        setVisible(true);
    }
}
