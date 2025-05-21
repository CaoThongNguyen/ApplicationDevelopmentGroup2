package NguyenGiaBao;

import javax.swing.*;
import java.awt.event.*;

public class SapXepTangDan extends JFrame {
    private JTextField txtSo1, txtSo2, txtKetQua;
    private JButton btnSapXep;

    public SapXepTangDan() {
        setTitle("Sắp Xếp 2 Số");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblSo1 = new JLabel("Số thứ nhất:");
        lblSo1.setBounds(20, 20, 100, 25);
        add(lblSo1);

        txtSo1 = new JTextField();
        txtSo1.setBounds(120, 20, 130, 25);
        add(txtSo1);

        JLabel lblSo2 = new JLabel("Số thứ hai:");
        lblSo2.setBounds(20, 50, 100, 25);
        add(lblSo2);

        txtSo2 = new JTextField();
        txtSo2.setBounds(120, 50, 130, 25);
        add(txtSo2);

        JLabel lblKetQua = new JLabel("Tăng dần:");
        lblKetQua.setBounds(20, 80, 100, 25);
        add(lblKetQua);

        txtKetQua = new JTextField();
        txtKetQua.setBounds(120, 80, 130, 25);
        txtKetQua.setEditable(false);
        add(txtKetQua);

        btnSapXep = new JButton("Sắp xếp");
        btnSapXep.setBounds(90, 120, 100, 30);
        add(btnSapXep);

        btnSapXep.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(txtSo1.getText());
                    int b = Integer.parseInt(txtSo2.getText());
                    if (a > b) {
                        int temp = a;
                        a = b;
                        b = temp;
                    }
                    txtKetQua.setText(a + ", " + b);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số nguyên hợp lệ.");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new SapXepTangDan();
    }
}
