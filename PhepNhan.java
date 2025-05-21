import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PhepNhan {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Nhân hai số");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label1 = new JLabel("Số thứ nhất:");
        label1.setBounds(20, 20, 100, 25);
        JTextField text1 = new JTextField();
        text1.setBounds(120, 20, 140, 25);

        JLabel label2 = new JLabel("Số thứ hai:");
        label2.setBounds(20, 60, 100, 25);
        JTextField text2 = new JTextField();
        text2.setBounds(120, 60, 140, 25);

        JButton button = new JButton("Nhân");
        button.setBounds(90, 100, 100, 30);

        JLabel resultLabel = new JLabel("Kết quả:");
        resultLabel.setBounds(20, 140, 250, 25);

        frame.add(label1);
        frame.add(text1);
        frame.add(label2);
        frame.add(text2);
        frame.add(button);
        frame.add(resultLabel);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double so1 = Double.parseDouble(text1.getText());
                    double so2 = Double.parseDouble(text2.getText());
                    double tich = so1 * so2;
                    resultLabel.setText("Kết quả: " + tich);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Vui lòng nhập số hợp lệ.");
                }
            }
        });

        frame.setVisible(true);
    }
}
