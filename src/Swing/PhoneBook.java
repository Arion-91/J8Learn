package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by arion on 24.01.2016.
 */
class PhoneBook {
    JTextField jtfName, jtfNumber;
    JRadioButton jrbExact, jrbStartWith, jrbEndsWith;

    JCheckBox jcbIgnoreCase;

    String[][] phonelist = {
            {"Jon", "555-55-55"},
            {"Jessica", "555-3434"},
            {"Adam", "355-343111114"},
            {"Rachel", "555-343334"},
            {"Tom & Jerry", "512355-3434"}
    };

    PhoneBook() {
        JFrame jfrm = new JFrame("A Simple Phone List");
        jfrm.setLayout(new GridLayout(0, 1));
        jfrm.setSize(240, 220);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jlabName = new JLabel("Name");
        JLabel jlabNumber = new JLabel("Number");
        JLabel jlabOptions = new JLabel("Search Options");

        jtfName = new JTextField(10);
        jtfNumber = new JTextField(10);

        jcbIgnoreCase = new JCheckBox("Ignore Case");
        jrbExact = new JRadioButton("Exact Match", true);
        jrbStartWith = new JRadioButton("Start with");
        jrbEndsWith = new JRadioButton("End with");

        ButtonGroup bg = new ButtonGroup();
        bg.add(jrbExact);
        bg.add(jrbStartWith);
        bg.add(jrbEndsWith);

        jtfName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtfNumber.setText(lookupName(jtfName.getText()));
            }
        });
        jtfNumber.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtfName.setText(lookupName(jtfNumber.getText()));
            }
        });

        jfrm.add(jlabName);
        jfrm.add(jtfName);
        jfrm.add(jlabNumber);
        jfrm.add(jtfNumber);
        jfrm.add(new Label());
        jfrm.add(jlabOptions);
        jfrm.add(jcbIgnoreCase);
        jfrm.add(new Label());
        jfrm.add(jrbStartWith);
        jfrm.add(jrbEndsWith);

        jfrm.setVisible(true);
    }

    String lookupName(String n) {
        for (int i = 0; i < phonelist.length; i++) {
            if (jrbStartWith.isSelected()) {
                if (jcbIgnoreCase.isSelected()) {
                    if (phonelist[i][0].toLowerCase().startsWith(n.toLowerCase()))
                        return phonelist[i][1];
                } else {
                    if (phonelist[i][0].startsWith(n))
                        return phonelist[i][1];
                }
            } else if (jrbEndsWith.isSelected()) {
                if (jcbIgnoreCase.isSelected()) {
                    if (phonelist[i][0].toLowerCase().endsWith(n.toLowerCase()))
                        return phonelist[i][1];
                } else {
                    if (phonelist[i][0].endsWith(n))
                        return phonelist[i][1];
                }
            } else {
                if (jcbIgnoreCase.isSelected()) {
                    if (phonelist[i][0].toLowerCase().equals(n.toLowerCase()))
                        return phonelist[i][1];
                } else {
                    if (phonelist[i][0].equals(n))
                        return phonelist[i][1];

                }
            }
        }
        return "Not found";
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PhoneBook();
            }
        });
    }
}
