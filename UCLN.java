import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UCLN extends JPanel {
    private JTextField text1;
    private JTextField text2;
    private JLabel resultLabel;

    public UCLN() {
        setLayout(null);
        setSize(350, 220);

        JLabel label1 = new JLabel("Số thứ nhất:");
        label1.setBounds(30, 20, 100, 25);
        text1 = new JTextField();
        text1.setBounds(130, 20, 150, 25);

        JLabel label2 = new JLabel("Số thứ hai:");
        label2.setBounds(30, 60, 100, 25);
        text2 = new JTextField();
        text2.setBounds(130, 60, 150, 25);

        JButton button = new JButton("Tìm ƯCLN");  // ✅ sửa lại từ "Tính" thành "Tìm"
        button.setBounds(110, 100, 120, 30);

        resultLabel = new JLabel("Kết quả:");
        resultLabel.setBounds(30, 150, 300, 25);

        add(label1);
        add(text1);
        add(label2);
        add(text2);
        add(button);
        add(resultLabel);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timUCLNVaHienThi();
            }
        });
    }

    private void timUCLNVaHienThi() {
        try {
            int a = Integer.parseInt(text1.getText());
            int b = Integer.parseInt(text2.getText());

            if (a <= 0 || b <= 0) {
                resultLabel.setText("Vui lòng nhập số nguyên dương.");
                return;
            }

            int ucln = timUCLN(a, b);
            resultLabel.setText("ƯCLN của " + a + " và " + b + " là: " + ucln);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Vui lòng nhập số hợp lệ.");
        }
    }

    // Hàm tìm ƯCLN (Euclid)
    private int timUCLN(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tìm ƯCLN");  // ✅ sửa lại tiêu đề
        frame.setSize(380, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Canh giữa màn hình

        UCLN panel = new UCLN();
        frame.add(panel);

        frame.setVisible(true);
    }
}
