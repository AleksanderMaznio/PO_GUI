import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test extends JFrame {
    private JComboBox comboBox1;
    private JPanel Test;
    private JLabel Tabela;
    private JTable table1;
    private JButton show;
    private JLabel selected;

    public  Test() {

        setContentPane(Test);
        setTitle("Cwiczenie3");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);
        setLocationRelativeTo(null);
        show.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text=(String) comboBox1.getSelectedItem();
                selected.setText(text);

            }
        });
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txt=(String) comboBox1.getItemAt(comboBox1.getSelectedIndex());
                selected.setText(txt);
            }
        });
    }
}
