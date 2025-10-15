import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pierwszegui extends JFrame{
    private JPanel JPanel1;
    private JButton zamknijButton;
    private JButton witajButton;
    private JPanel JPanelData;
    private JButton KlikButton;
    private JTextField textField1;


    public pierwszegui(){
        super("Moje pierwsze GUi");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //  int width=400,height=400;
       // this.setSize(width,height);
        this.pack();

        witajButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name=textField1.getText();



               // JOptionPane.showMessageDialog(null, "Witaj: "+name);
               // JOptionPane.showMessageDialog(null, "Witaj: "+name,"uwaga",JOptionPane.WARNING_MESSAGE);
            }
        });
        zamknijButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        KlikButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("To jest tekst po kliknieciu KLIK");

            }
        });
    }
}
