package com.codebind;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ingreso {
    private JButton btnIngresar;
    private JLabel lblIngreso;
    public JPanel pnlIngreso;
    private JLabel lbNombre;


    public Ingreso() {
        btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("PreciosDivisas");
                PreciosDivisas preciosdivisas = new PreciosDivisas();
                frame.setContentPane(preciosdivisas.pnlPreciosDivisas);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
