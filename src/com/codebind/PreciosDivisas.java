package com.codebind;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PreciosDivisas {
    public JPanel pnlPreciosDivisas;
    private JLabel lblDivisa;
    private JLabel lblCantidad;
    private JLabel lblPrecioVenta;
    private JLabel lblPrecioCompra;
    private JButton btnNegociar;
    private JTextField txtCantidadDolar;
    private JTextField txtCantidadEuro;
    private JTextField txtCantidadLibra;
    private JTextField txtPrecioVentaDolar;
    private JTextField txtPrecioCompraDolar;
    private JTextField txtPrecioVentaEuro;
    private JTextField txtPrecioCompraEuro;
    private JTextField txtPrecioVentaLibra;
    public JTextField txtPrecioCompraLibra;
    private JLabel lblDolar;
    private JLabel lblEuro;
    private JLabel lblLibraEsterlina;
    private JLabel lblDatosCompraVenta;
    private JLabel lblPesoDisponibleParaNegociar;
    private JTextField txtCantidadPeso;
    private JButton btnNegociarDolares;
    private JButton btnNegociarDivisas;

    public PreciosDivisas() {

        btnNegociar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("NegociarDivisas");
                NegociarDivisas negociardivisas = new NegociarDivisas();
                frame.setContentPane(negociardivisas.pnlNegociarDivisas);
                negociardivisas.lblDisponibleDolar.setText(txtCantidadDolar.getText());
                negociardivisas.lblDisponibleEuro.setText(txtCantidadEuro.getText());
                negociardivisas.lblDisponibleLibra.setText(txtCantidadLibra.getText());
                negociardivisas.lblDisponiblesCOP.setText(txtCantidadPeso.getText());
                negociardivisas.lblPrecioDolarCompra.setText(txtPrecioCompraDolar.getText());
                negociardivisas.lblPrecioDolarVenta.setText(txtPrecioVentaDolar.getText());
                negociardivisas.lblPrecioEuroCompra.setText(txtPrecioCompraEuro.getText());
                negociardivisas.lblPrecioEuroVenta.setText(txtPrecioVentaEuro.getText());
                negociardivisas.lblPrecioLibraCompra.setText(txtPrecioCompraLibra.getText());
                negociardivisas.lblPrecioLibraVenta.setText(txtPrecioVentaLibra.getText());
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
