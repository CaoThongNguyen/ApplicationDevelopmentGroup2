package Labb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DienTIchHCN extends JFrame implements ActionListener {

    private JLabel lengthLabel;
    private JTextField lengthTextField;
    private JLabel widthLabel;
    private JTextField widthTextField;
    private JButton calculateButton;
    private JLabel resultLabel;

    public DienTIchHCN() {
        setTitle("Tính Diện Tích Hình Chữ Nhật");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 10, 10));

        lengthLabel = new JLabel("Chiều dài:");
        lengthTextField = new JTextField(10);

        widthLabel = new JLabel("Chiều rộng:");
        widthTextField = new JTextField(10);

        calculateButton = new JButton("Tính Diện Tích");
        calculateButton.addActionListener(this);

        resultLabel = new JLabel("Diện tích: ");

        add(lengthLabel);
        add(lengthTextField);
        add(widthLabel);
        add(widthTextField);
        add(calculateButton);
        add(resultLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            try {
                double length = Double.parseDouble(lengthTextField.getText());
                double width = Double.parseDouble(widthTextField.getText());

                if (length <= 0 || width <= 0) {
                    JOptionPane.showMessageDialog(this, "Chiều dài và chiều rộng phải là số dương.", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
                } else {
                    double area = length * width;
                    resultLabel.setText("Diện tích: " + String.format("%.2f", area));
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập số hợp lệ cho chiều dài và chiều rộng.", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DienTIchHCN());
    }
}