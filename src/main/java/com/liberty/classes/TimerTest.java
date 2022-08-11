package com.liberty.classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TimerTest {

    public static void main(String[] args) {
        ActionListener timePrinter = new TimePrinter();

        Timer timer = new Timer(1000, timePrinter);
        timer.start();
        JOptionPane.showMessageDialog(null, "quit program?");
        System.exit(0);
    }
}


class TimePrinter implements ActionListener {

    private int count;

    public TimePrinter() {
        this.count = 0;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("[" + count + "], At the tone, the time is " + new Date());
        count += 1;
        // Toolkit.getDefaultToolkit().beep();
    }
}
