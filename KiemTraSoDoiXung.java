package thuchanh;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KiemTraSoDoiXung extends JFrame {

    private JTextField oNhapSo;
    private JButton nutKiemTra;
    private JLabel nhanKetQua;

    public KiemTraSoDoiXung() {
        setTitle("Kiểm Tra Số Đối Xứng");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // căn giữa cửa sổ
        setLayout(new GridLayout(4, 1));

        JLabel nhanHuongDan = new JLabel("Nhập số cần kiểm tra:", SwingConstants.CENTER);
        oNhapSo = new JTextField();
        nutKiemTra = new JButton("Kiểm tra");
        nhanKetQua = new JLabel("", SwingConstants.CENTER);

        add(nhanHuongDan);
        add(oNhapSo);
        add(nutKiemTra);
        add(nhanKetQua);

        nutKiemTra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String chuoiNhap = oNhapSo.getText().trim();
                if (!chuoiNhap.matches("\\d+")) {
                    nhanKetQua.setText("Vui lòng nhập một số nguyên dương hợp lệ!");
                    return;
                }

                int so = Integer.parseInt(chuoiNhap);
                if (laSoDoiXung(so)) {
                    nhanKetQua.setText(so + " là số đối xứng.");
                } else {
                    nhanKetQua.setText(so + " không phải là số đối xứng.");
                }
            }
        });
    }

    public boolean laSoDoiXung(int so) {
        int soDaoNguoc = 0, soGoc = so;
        while (so > 0) {
            int chuSo = so % 10;
            soDaoNguoc = soDaoNguoc * 10 + chuSo;
            so /= 10;
        }
        return soGoc == soDaoNguoc;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            KiemTraSoDoiXung ungDung = new KiemTraSoDoiXung();
            ungDung.setVisible(true);
        });
    }
}
