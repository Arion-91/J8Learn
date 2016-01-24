package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by arion on 16.01.2016.
 */
class ToggleDemo {

    JLabel jlab;
    JToggleButton jtbn;

    ToggleDemo() {
        JFrame jfrm = new JFrame("Demonstrate a Toggle Button");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(290, 80);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jlab = new JLabel("Button is off.");
        jtbn = new JToggleButton("On/Off");
        jtbn.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (jtbn.isSelected()) {
                    jlab.setText("Button is on");
                } else
                    jlab.setText("Button is off");
            }
        });

        jfrm.add(jtbn);
        jfrm.add(jlab);

        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ToggleDemo();
            }
        });
    }

}
