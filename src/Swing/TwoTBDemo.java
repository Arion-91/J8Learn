package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by arion on 17.01.2016.
 */
class TwoTBDemo implements ItemListener {
    JLabel jlabAlpha, jlabBeta;
    JToggleButton jtbnAlpha, jtbnBeta;

    TwoTBDemo() {
        JFrame jfrm = new JFrame("Two Toggle Buttons");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(290, 80);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jlabAlpha = new JLabel("Alpha is off. ");
        jlabBeta = new JLabel("Beta is off.");

        jtbnAlpha = new JToggleButton("Alpha");
        jtbnBeta = new JToggleButton("Beta");

        jtbnAlpha.addItemListener(this);
        jtbnBeta.addItemListener(this);

        jfrm.add(jtbnAlpha);
        jfrm.add(jlabAlpha);
        jfrm.add(jtbnBeta);
        jfrm.add(jlabBeta);

        jfrm.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        JToggleButton tb = (JToggleButton) e.getItem();

        if (tb == jtbnAlpha) {
            if (tb.isSelected()) {
                jlabAlpha.setText("Alpha is on.");
            } else
                jlabAlpha.setText("Alpha is off.");
        } else if (tb == jtbnBeta) {
            if (tb.isSelected()) {
                jlabBeta.setText("Alpha is on.");
            } else
                jlabBeta.setText("Alpha is off.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TwoTBDemo();
            }
        });
    }
}
