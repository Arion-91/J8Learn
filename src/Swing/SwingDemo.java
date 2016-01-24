package Swing;

import javax.swing.*;

/**
 * Created by arion on 10.01.2016.
 */
class SwingDemo {

    SwingDemo() {
        JFrame jFrame = new JFrame("A Simple Swing Program");
        jFrame.setSize(275, 100);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jLabel = new JLabel("Swing powers the modern Java GUI.");
        jFrame.getContentPane().add(jLabel);

        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });
    }
}
