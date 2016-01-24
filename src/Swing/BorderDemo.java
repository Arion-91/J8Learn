package Swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by arion on 12.01.2016.
 */
class BorderDemo {
    BorderDemo() {
        JFrame jfrm = new JFrame("Use Line and Etched Borders");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(280, 90);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jlab = new JLabel("This uses a line border. ");
        jlab.setBorder(BorderFactory.createLineBorder(Color.BLUE));

        JLabel jlab2 = new JLabel("This uses a line border. ");
        jlab2.setBorder(BorderFactory.createEtchedBorder());

        jfrm.add(jlab);
        jfrm.add(jlab2);

        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BorderDemo();
            }
        });
    }
}
