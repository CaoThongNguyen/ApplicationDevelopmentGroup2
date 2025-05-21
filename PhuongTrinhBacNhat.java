package thuchanh;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PhuongTrinhBacNhat extends JFrame {
    private JTextField aField, bField;
    private JLabel resultLabel;

    public PhuongTrinhBacNhat() {
        setTitle("Giải phương trình bậc nhất: ax + b = 0");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("Hệ số a:"));
        aField = new JTextField();
        add(aField);

        add(new JLabel("Hệ số b:"));
        bField = new JTextField();
        add(bField);

        JButton solveButton = new JButton("Giải");
        add(solveButton);

        resultLabel = new JLabel("Kết quả:");
        add(resultLabel);

        solveButton.addActionListener(e -> {
            try {
                double a = Double.parseDouble(aField.getText());
                double b = Double.parseDouble(bField.getText());
                if (a == 0) {
                    if (b == 0) {
                        resultLabel.setText("Phương trình vô số nghiệm.");
                    } else {
                        resultLabel.setText("Phương trình vô nghiệm.");
                    }
                } else {
                    double x = -b / a;
                    resultLabel.setText("Nghiệm x = " + x);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập số hợp lệ cho a và b.");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new PhuongTrinhBacNhat();
    }
}
