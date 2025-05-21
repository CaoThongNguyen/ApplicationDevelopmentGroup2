package Labb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KiemTra extends JFrame implements ActionListener {

    private JTextField textFieldA;
    private JTextField textFieldB;
    private JButton checkButton;
    private JLabel resultLabel;

    public KiemTra() {
        setTitle("Kiểm Tra Chia Hết");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout(10, 10));

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(2, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel labelA = new JLabel("Nhập số a:");
        textFieldA = new JTextField(15);
        textFieldA.setFont(new Font("Arial", Font.PLAIN, 14));

        JLabel labelB = new JLabel("Nhập số b:");
        textFieldB = new JTextField(15);
        textFieldB.setFont(new Font("Arial", Font.PLAIN, 14));

        inputPanel.add(labelA);
        inputPanel.add(textFieldA);
        inputPanel.add(labelB);
        inputPanel.add(textFieldB);

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        controlPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));

        checkButton = new JButton("Kiểm Tra");
        checkButton.addActionListener(this);
        checkButton.setFont(new Font("Arial", Font.BOLD, 16));
        checkButton.setPreferredSize(new Dimension(150, 40));

        resultLabel = new JLabel("Kết quả:");
        resultLabel.setFont(new Font("Arial", Font.ITALIC, 14));

        controlPanel.add(checkButton);
        
        JPanel resultPanel = new JPanel();
        resultPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        resultPanel.add(resultLabel);


        add(inputPanel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.NORTH);
        add(resultPanel, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == checkButton) {
            try {
                int a = Integer.parseInt(textFieldA.getText());
                int b = Integer.parseInt(textFieldB.getText());

                if (b == 0) {
                    JOptionPane.showMessageDialog(this, "Số b không thể bằng 0 để chia hết.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                } else if (a % b == 0) {
                    resultLabel.setText("Kết quả: " + a + " chia hết cho " + b);
                } else {
                    resultLabel.setText("Kết quả: " + a + " KHÔNG chia hết cho " + b);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập số nguyên hợp lệ.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new KiemTra());
    }
}