package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by arion on 11.01.2016.
 */
class ButtonDemo implements ActionListener {
    JLabel jlab;

    ButtonDemo() {
        JFrame jfrm = new JFrame("A Button Example");
        jfrm.getContentPane().setLayout(new FlowLayout());
        jfrm.setSize(220, 90);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jButton1 = new JButton("First");
        JButton jButton2 = new JButton("Second");

        jButton1.addActionListener(this);
        jButton1.addActionListener(new ButtonAdd2());
        jButton2.addActionListener(new ButtonAdd2());

        jfrm.getContentPane().add(jButton1);
        jfrm.getContentPane().add(jButton2);

        jlab = new JLabel("Press a button.");
        jfrm.add(jlab);

        jfrm.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("First"))
            jlab.setText("First button was pressed.");
        else
            jlab.setText("Second button was pressed.");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ButtonDemo();
            }
        });
    }
}

class ButtonAdd2 implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Тут тоже сработало!!! ЛОЛ !!!");
    }
}