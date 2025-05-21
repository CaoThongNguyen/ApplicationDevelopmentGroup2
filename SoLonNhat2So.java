import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SoLonNhat2So extends JPanel {
    private JTextField text1;
    private JTextField text2;
    private JLabel resultLabel;

    public SoLonNhat2So() {
        setLayout(null);
        setSize(300, 200);

        JLabel label1 = new JLabel("Số thứ nhất:");
        label1.setBounds(20, 20, 100, 25);
        text1 = new JTextField();
        text1.setBounds(120, 20, 140, 25);

        JLabel label2 = new JLabel("Số thứ hai:");
        label2.setBounds(20, 60, 100, 25);
        text2 = new JTextField();
        text2.setBounds(120, 60, 140, 25);

        JButton button = new JButton("So sánh");
        button.setBounds(90, 100, 100, 30);

        resultLabel = new JLabel("Kết quả:");
        resultLabel.setBounds(20, 140, 250, 25);

        add(label1);
        add(text1);
        add(label2);
        add(text2);
        add(button);
        add(resultLabel);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                soSanhHaiSo();
            }
        });
    }

    private void soSanhHaiSo() {
        try {
            double so1 = Double.parseDouble(text1.getText());
            double so2 = Double.parseDouble(text2.getText());

            if (so1 > so2) {
                resultLabel.setText("Số lớn nhất: " + so1);
            } else if (so2 > so1) {
                resultLabel.setText("Số lớn nhất: " + so2);
            } else {
                resultLabel.setText("Hai số bằng nhau.");
            }
        } catch (NumberFormatException ex) {
            resultLabel.setText("Vui lòng nhập số hợp lệ.");
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tìm số lớn nhất");
        frame.setSize(320, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Canh giữa màn hình

        SoLonNhat2So panel = new SoLonNhat2So();
        frame.add(panel);

        frame.setVisible(true);
    }
}
