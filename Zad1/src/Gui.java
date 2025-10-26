import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame {
    private JPanel PanelG;
    private JButton konwertujButton;
    private JTextField podajTemperaturęTextField;
    private JLabel far;

    public Gui(){
        setContentPane(PanelG);
        setTitle("Gui");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);

        konwertujButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String celcjusze= podajTemperaturęTextField.getText();
                double pars=Double.parseDouble(celcjusze);
                double fha= pars*9/5+32;
                String temp=Double.toString(fha);
               // JOptionPane.showMessageDialog(Gui.this,"elo "+ fha);
                far.setText(temp);
            }
        });
    }
}
