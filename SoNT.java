package Labb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SoNT extends JFrame implements ActionListener {

    private JTextField numberTextField;
    private JButton checkButton;
    private JLabel resultLabel;

    public SoNT() {
        setTitle("Kiểm Tra Số Nguyên Tố");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        JLabel numberLabel = new JLabel("Nhập số:");
        numberLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        mainPanel.add(numberLabel, gbc);

        numberTextField = new JTextField(15);
        numberTextField.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(numberTextField, gbc);

        checkButton = new JButton("Kiểm Tra");
        checkButton.setFont(new Font("Arial", Font.BOLD, 16));
        checkButton.setPreferredSize(new Dimension(180, 45));
        checkButton.addActionListener(this);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.NONE;
        mainPanel.add(checkButton, gbc);

        resultLabel = new JLabel("Kết quả:");
        resultLabel.setFont(new Font("Arial", Font.ITALIC, 16));
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.NONE;
        mainPanel.add(resultLabel, gbc);

        add(mainPanel);

        pack();
        setMinimumSize(new Dimension(400, 250));
        setVisible(true);
    }

    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == checkButton) {
            try {
                int number = Integer.parseInt(numberTextField.getText());

                if (isPrime(number)) {
                    resultLabel.setText(number + " là SỐ NGUYÊN TỐ.");
                } else {
                    resultLabel.setText(number + " KHÔNG phải là SỐ NGUYÊN TỐ.");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập số nguyên hợp lệ.", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SoNT());
    }
}