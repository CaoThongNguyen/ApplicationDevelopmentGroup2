package thuchanh;

import javax.swing.*;
import java.awt.*;

public class SoDoiXung extends JFrame {
    private JTextField soField;
    private JLabel ketQuaLabel;

    public SoDoiXung() {
        setTitle("Kiểm Tra Số Đối Xứng");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 2, 5, 5));

        add(new JLabel("Nhập số:"));
        soField = new JTextField();
        add(soField);

        JButton nutKiemTra = new JButton("Kiểm tra");
        add(nutKiemTra);

        ketQuaLabel = new JLabel("Kết quả:");
        add(ketQuaLabel);

        nutKiemTra.addActionListener(e -> {
            try {
                int so = Integer.parseInt(soField.getText().trim());
                if (laSoDoiXung(so)) {
                    ketQuaLabel.setText("Kết quả: Là số đối xứng");
                } else {
                    ketQuaLabel.setText("Kết quả: Không phải số đối xứng");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập một số nguyên hợp lệ.");
            }
        });

        setVisible(true);
    }

    private boolean laSoDoiXung(int so) {
        int soGoc = so;
        int dao = 0;
        while (so > 0) {
            int chuSo = so % 10;
            dao = dao * 10 + chuSo;
            so /= 10;
        }
        return soGoc == dao;
    }
}
