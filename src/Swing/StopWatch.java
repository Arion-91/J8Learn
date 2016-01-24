package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

/**
 * Created by arion on 11.01.2016.
 */
class StopWatch implements ActionListener {
    JLabel jlab;
    long start;

    StopWatch() {
        JFrame jfrm = new JFrame("A Simple Stopwatch");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(230, 90);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jButtonStart = new JButton("Start");
        JButton jButtonStop = new JButton("Stop");
        jButtonStart.addActionListener(this);
        jButtonStop.addActionListener(this);
        jfrm.add(jButtonStart);
        jfrm.add(jButtonStop);

        jlab = new JLabel("Press Start to begin timing.");
        jfrm.add(jlab);

        jfrm.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Calendar calendar = Calendar.getInstance();
        if (e.getActionCommand().equals("Start")) {
            start = calendar.getTimeInMillis();
            jlab.setText("Stopwatch is Running...");
        } else
            jlab.setText("Elapsed time is " + (double)(calendar.getTimeInMillis()-start)/1000);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StopWatch();
            }
        });
    }
}
