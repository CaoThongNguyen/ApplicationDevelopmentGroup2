package Labb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Min2So extends JFrame implements ActionListener {

    private JTextField number1TextField;
    private JTextField number2TextField;
    private JButton findMinButton;
    private JLabel resultLabel;

    public Min2So() {
        setTitle("Tìm Số Nhỏ Nhất");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        JLabel label1 = new JLabel("Nhập số thứ nhất:");
        label1.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        mainPanel.add(label1, gbc);

        number1TextField = new JTextField(15);
        number1TextField.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(number1TextField, gbc);

        JLabel label2 = new JLabel("Nhập số thứ hai:");
        label2.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        mainPanel.add(label2, gbc);

        number2TextField = new JTextField(15);
        number2TextField.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(number2TextField, gbc);

        findMinButton = new JButton("Tìm Số Nhỏ Nhất");
        findMinButton.setFont(new Font("Arial", Font.BOLD, 16));
        findMinButton.setPreferredSize(new Dimension(200, 45));
        findMinButton.addActionListener(this);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.NONE;
        mainPanel.add(findMinButton, gbc);

        resultLabel = new JLabel("Số nhỏ nhất:");
        resultLabel.setFont(new Font("Arial", Font.ITALIC, 16));
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.NONE;
        mainPanel.add(resultLabel, gbc);

        add(mainPanel);

        pack();
        setMinimumSize(new Dimension(450, 300));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == findMinButton) {
            try {
                double num1 = Double.parseDouble(number1TextField.getText());
                double num2 = Double.parseDouble(number2TextField.getText());

                double min = Math.min(num1, num2);
                resultLabel.setText("Số nhỏ nhất: " + min);

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập số hợp lệ.", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Min2So());
    }
}