package NguyenGiaBao;

import javax.swing.*;
import java.awt.event.*;

public class TinhTien extends JFrame {
    private JTextField txtSoLuong, txtDonGia, txtThanhTien;
    private JButton btnTinh;

    public TinhTien() {
        setTitle("Tính Thành Tiền");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblSoLuong = new JLabel("Số lượng:");
        lblSoLuong.setBounds(20, 20, 80, 25);
        add(lblSoLuong);

        txtSoLuong = new JTextField();
        txtSoLuong.setBounds(100, 20, 150, 25);
        add(txtSoLuong);

        JLabel lblDonGia = new JLabel("Đơn giá:");
        lblDonGia.setBounds(20, 50, 80, 25);
        add(lblDonGia);

        txtDonGia = new JTextField();
        txtDonGia.setBounds(100, 50, 150, 25);
        add(txtDonGia);

        JLabel lblThanhTien = new JLabel("Thành tiền:");
        lblThanhTien.setBounds(20, 80, 80, 25);
        add(lblThanhTien);

        txtThanhTien = new JTextField();
        txtThanhTien.setBounds(100, 80, 150, 25);
        txtThanhTien.setEditable(false);
        add(txtThanhTien);

        btnTinh = new JButton("Tính");
        btnTinh.setBounds(100, 120, 80, 25);
        add(btnTinh);

        btnTinh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int soLuong = Integer.parseInt(txtSoLuong.getText());
                    double donGia = Double.parseDouble(txtDonGia.getText());
                    double thanhTien = soLuong * donGia;
                    txtThanhTien.setText(String.valueOf(thanhTien));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số hợp lệ.");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new TinhTien();
    }
}
