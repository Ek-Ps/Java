package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class newApp extends JFrame {

    int count = 0;

    public newApp(){
        setBounds(500,400,300,100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Счётчик кликов");

        JLabel counter = new JLabel("0");
        JButton lButton = new  JButton("<");
        JButton rButton = new  JButton(">");

        Font font = new Font("Consolas", Font.BOLD, 20);
        counter.setFont(font);
        counter.setHorizontalAlignment(SwingConstants.CENTER);

        lButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count--;
                counter.setText(String.valueOf(count));
            }
        });

        rButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                counter.setText(String.valueOf(count));
            }
        });
        add(lButton, BorderLayout.WEST);
        add(counter, BorderLayout.CENTER);
        add(rButton, BorderLayout.EAST);

        setVisible(true);

    }

    public static void main(String[] args) {
        new newApp();
    }
}
