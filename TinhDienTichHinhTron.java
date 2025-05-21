package NguyenGiaBao;

import javax.swing.*;
import java.awt.event.*;

public class TinhDienTichHinhTron extends JFrame {
    private JTextField txtBanKinh, txtDienTich;
    private JButton btnTinh;

    public TinhDienTichHinhTron() {
        setTitle("Tính Diện Tích Hình Tròn");
        setSize(300, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblBanKinh = new JLabel("Bán kính:");
        lblBanKinh.setBounds(20, 20, 80, 25);
        add(lblBanKinh);

        txtBanKinh = new JTextField();
        txtBanKinh.setBounds(100, 20, 150, 25);
        add(txtBanKinh);

        JLabel lblDienTich = new JLabel("Diện tích:");
        lblDienTich.setBounds(20, 50, 80, 25);
        add(lblDienTich);

        txtDienTich = new JTextField();
        txtDienTich.setBounds(100, 50, 150, 25);
        txtDienTich.setEditable(false);
        add(txtDienTich);

        btnTinh = new JButton("Tính");
        btnTinh.setBounds(100, 90, 80, 25);
        add(btnTinh);

        btnTinh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double banKinh = Double.parseDouble(txtBanKinh.getText());
                    double dienTich = Math.PI * banKinh * banKinh;
                    txtDienTich.setText(String.format("%.2f", dienTich));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập bán kính hợp lệ.");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new TinhDienTichHinhTron();
    }
}
