package com.codebind;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ingreso");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(new Ingreso().pnlIngreso);
        frame.pack();
        frame.setVisible(true);
    }
}
