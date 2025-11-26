import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kurs extends JFrame{
    private JPanel Kursy;
    private JCheckBox javaPrice3500PLNCheckBox;
    private JCheckBox cPrice3000PLNCheckBox;
    private JCheckBox cPrice4000PLNCheckBox;
    private JCheckBox pythonPrice5000PLNCheckBox;
    private JButton podliczButton;

    public Kurs(){
        setContentPane(Kursy);
        setTitle("Cwiczenie3");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);
        setLocationRelativeTo(null);
        podliczButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int suma=0;
                //StringBuilder wynik = new StringBuilder();
                String wynik="";

                if (javaPrice3500PLNCheckBox.isSelected()) {
                    //wynik.append("Java #price 3500 PLN\n");
                    wynik+="Java #price 3500 PLN\n";
                    suma += 3500;
                }
                if (cPrice3000PLNCheckBox.isSelected()) {
                    wynik+="C# #price 3000 PLN\n";
                   // wynik.append("C# #price 3000 PLN\n");
                    suma += 3000;
                }
                if (cPrice4000PLNCheckBox.isSelected()) {
                    wynik+="C++ #price 4000 PLN\n";
                    // wynik.append("C++ #price 4000 PLN\n");
                    suma += 4000;
                }
                if (pythonPrice5000PLNCheckBox.isSelected()) {
                    wynik+="Python #price 5000 PLN\n";
                    //wynik.append("Python #price 5000 PLN\n");
                    suma += 5000;
                }

                if (wynik.length() == 0) {
                    JOptionPane.showMessageDialog(
                            Kurs.this,
                            "Nie wybrano żadnego kursu!",
                            "Uwaga",
                            JOptionPane.WARNING_MESSAGE
                    );

                }
                else {
                   // wynik.append("\nRazem: ").append(suma).append(" PLN");
                    JOptionPane.showMessageDialog(
                            null,
                            wynik+"Razem: "+suma)

                    ;
                }

            }
        });
    }

}
