package Swing;

import com.intellij.util.ui.CheckBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by arion on 17.01.2016.
 */
class CBDemo implements ItemListener {

    JLabel jlabOptions, jlabWhat, jlabChange;
    JCheckBox jcbOptions, jcbSpeed, jcbSize, jcbDebug;

    CBDemo() {
        JFrame jfrm = new JFrame("Demonstrate Check Boxes");
        jfrm.setLayout(new GridLayout(7, 1));
        jfrm.setSize(300, 150);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jlabOptions = new JLabel("Options:");
        jlabChange = new JLabel("");
        jlabWhat = new JLabel("Options selected:");

        jcbOptions = new JCheckBox("Enable Options");
        jcbSpeed = new JCheckBox("Maximize Speed");
        jcbSize = new JCheckBox("Minimize Size");
        jcbDebug = new JCheckBox("Debug");

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

        jcbSpeed.addItemListener(this);
        jcbSize.addItemListener(this);
        jcbDebug.addItemListener(this);

        jfrm.add(jcbOptions);
        jfrm.add(jlabOptions);

        jfrm.add(jcbSpeed);
        jfrm.add(jcbSize);
        jfrm.add(jcbDebug);
        jfrm.add(jlabChange);
        jfrm.add(jlabWhat);

        jfrm.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String opts = "";

        JCheckBox cb = (JCheckBox) e.getItem();
        if (e.getStateChange() == ItemEvent.SELECTED) {
            jlabChange.setText("Selection change: " + cb.getText() + " selected.");
        } else
            jlabChange.setText("Selection change: " + cb.getText() + " cleared.");

        if (jcbSpeed.isSelected()) opts += "Speed ";
        if (jcbSize.isSelected()) opts += "Size ";
        if (jcbDebug.isSelected()) opts += "Debug ";

        jlabWhat.setText("Options selected: " + opts);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CBDemo();
            }
        });
    }
}
