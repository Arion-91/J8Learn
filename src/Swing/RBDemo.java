package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by arion on 17.01.2016.
 */
class RBDemo implements ActionListener {

    JLabel jlabOptions, jlabWhat;
    JCheckBox jcbOptions;
    JRadioButton jcbSpeed, jcbSize, jcbDebug;

    RBDemo() {
        JFrame jfrm = new JFrame("Demonstrate Radio Buttons");
        jfrm.setLayout(new GridLayout(6, 1));
        jfrm.setSize(300, 150);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jlabOptions = new JLabel("Choose Options:");
        jlabWhat = new JLabel("Options selected: Speed");

        jcbOptions = new JCheckBox("Enable Options");
        jcbSpeed = new JRadioButton("Maximize Speed", true);
        jcbSize = new JRadioButton("Minimize Size");
        jcbDebug = new JRadioButton("Debug");

        ButtonGroup bg = new ButtonGroup();
        bg.add(jcbSpeed);
        bg.add(jcbSize);
        bg.add(jcbDebug);

        jcbSpeed.setEnabled(false);
        jcbSize.setEnabled(false);
        jcbDebug.setEnabled(false);

        jcbOptions.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (jcbOptions.isSelected()) {
                    jcbSpeed.setEnabled(true);
                    jcbSize.setEnabled(true);
                    jcbDebug.setEnabled(true);
                } else {
                    jcbSpeed.setEnabled(false);
                    jcbSize.setEnabled(false);
                    jcbDebug.setEnabled(false);
                }
            }
        });

        jcbSpeed.addActionListener(this);
        jcbSize.addActionListener(this);
        jcbDebug.addActionListener(this);

        jfrm.add(jcbOptions);
        jfrm.add(jlabOptions);

        jfrm.add(jcbSpeed);
        jfrm.add(jcbSize);
        jfrm.add(jcbDebug);
        jfrm.add(jlabWhat);

        jfrm.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String opts = "";

        if (jcbSpeed.isSelected()) opts += "Speed ";
        if (jcbSize.isSelected()) opts += "Size ";
        if (jcbDebug.isSelected()) opts += "Debug ";

        jlabWhat.setText("Options selected: " + opts);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RBDemo();
            }
        });
    }
}
