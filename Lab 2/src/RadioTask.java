import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioTask extends JFrame {
    private JRadioButton WampirRadioButton;
    private JRadioButton wózkowyRadioButton;
    private JRadioButton trollRadioButton;
    private JButton OKButton;
    private JButton zamknijButton;
    private JPanel Panel3;
    private JLabel Ikonka;
    private JLabel lblSystemCheck;
    private ImageIcon IconKot = new ImageIcon(getClass().getResource("wampir.png"));
    private ImageIcon IconTroll = new ImageIcon(getClass().getResource("troll.png"));
    private ImageIcon IconWozkowy = new ImageIcon(getClass().getResource("wozkowy.png"));

    public RadioTask() {
        super("Lab2");
        this.setContentPane(this.Panel3);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        int width = 600, height = 500;
        this.setSize(width, height);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        WampirRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(WampirRadioButton.isSelected())
                    Ikonka.setIcon(IconKot);
                    lblSystemCheck.setText("Wybrano: Wampira");
            }
        });
        zamknijButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        trollRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (trollRadioButton.isSelected())
                    Ikonka.setIcon(IconTroll);
                    lblSystemCheck.setText("Wybrano: Trolla");
            }
        });
        wózkowyRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (wózkowyRadioButton.isSelected())
                    Ikonka.setIcon(IconWozkowy);
                lblSystemCheck.setText("Wybrano: Wózkowego");
            }
        });


        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String wybor = "";
                if (WampirRadioButton.isSelected()) {
                    wybor = "Wampir";
                } else if (trollRadioButton.isSelected()) {
                    wybor = "Troll";
                } else if (wózkowyRadioButton.isSelected()) {
                    wybor = "Wózkowy";
                } else {
                    wybor = "Nie wybrano żadnej postaci!";
                }

                JOptionPane.showMessageDialog(
                    null,"Twój wybór: "+wybor,"Podsomwanie",JOptionPane.INFORMATION_MESSAGE
                );
            }
        });
    }
}
