package thuchanh;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tru extends JFrame {
    private JTextField num1Field, num2Field;
    private JLabel resultLabel;

    public Tru() {
        setTitle("Trừ");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 5, 5));

        add(new JLabel("Số thứ nhất:"));
        num1Field = new JTextField();
        add(num1Field);

        add(new JLabel("Số thứ hai:"));
        num2Field = new JTextField();
        add(num2Field);

        JButton subButton = new JButton("Trừ");
        add(subButton);

        resultLabel = new JLabel("Kết quả:");
        add(resultLabel);

        subButton.addActionListener(e -> {
            try {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                double result = num1 - num2;
                resultLabel.setText("Kết quả: " + result);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập số hợp lệ.");
            }
        });

        setVisible(true);
    }
}
