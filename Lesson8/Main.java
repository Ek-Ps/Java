package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
    public Main(){
        setTitle("Первое приложение Java");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300,300,450,200);
        setResizable(false);

        setLayout(null);
        //setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        JTextField jTextField1 = new JTextField();
        JButton jButton3 = new JButton("Кнопка 3");
        JLabel jLabel  = new JLabel("Ввод текста");

        jTextField1.setBounds(100,20,200,20);
        jTextField1.setSelectionColor(Color.cyan);
        jButton3.setBounds(310,20,90,20);
        jLabel.setBounds(20,-20,100,100);

//        add(jLabel, BorderLayout.NORTH);
//        add(jTextField1, BorderLayout.CENTER);
//        add(jButton3, BorderLayout.SOUTH);

        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText(jTextField1.getText());
            }
        });
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Окно закрылось");;
            }
        });

        add(jLabel);
        add(jTextField1);
        add(jButton3);

//        JButton jButton1 = new JButton("Проверка кнопки1");
//        JButton jButton2 = new JButton("Проверка кнопки2");
//        add(jButton1, BorderLayout.NORTH);
//        add(jButton2, BorderLayout.SOUTH);

//        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
//        for (int i = 0; i < 7; i++){
//            add(new JButton(String.valueOf(i)));
//        }

        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
