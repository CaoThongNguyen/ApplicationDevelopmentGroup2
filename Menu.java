package thuchanh;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame {
    public Menu() {
        setTitle("Máy Tính");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 1, 5, 5));

        JButton addButton = new JButton("Cộng");
        JButton subButton = new JButton("Trừ");
        JButton mulButton = new JButton("Nhân");
        JButton divButton = new JButton("Chia");

        add(addButton);
        add(subButton);
        add(mulButton);
        add(divButton);

        addButton.addActionListener(e -> new Cong());
        subButton.addActionListener(e -> new Tru());
        mulButton.addActionListener(e -> new Nhan());
        divButton.addActionListener(e -> new Chia());

        setVisible(true);
    }

    public static void main(String[] args) {
        new Menu();
    }
}
