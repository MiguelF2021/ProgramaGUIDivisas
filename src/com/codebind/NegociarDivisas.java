package com.codebind;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class NegociarDivisas {
    public JPanel pnlNegociarDivisas;
    private JComboBox comboBoxDivisasCompra;
    private JComboBox comboBoxDivisasVenta;
    private JTextField txtCantidadDivisaCompra;
    private JTextField txtCantidadDivisaVenta;
    private JButton btnComprar;
    private JButton btnVender;
    private JButton btnRegresar;
    private JLabel lblDolar;
    private JLabel lblPagaras;
    private JLabel lblPesosPorCompra;
    private JLabel lblRecibirás;
    private JLabel lblPesosPorVenta;
    public JLabel lblDisponiblesCOP;
    public JLabel lblPrecioCompraDolar;
    public JLabel lblPrecioVentaDolar;
    public JLabel lblDisponibleDolar;
    public JLabel lblPrecioDolarCompra;
    public JLabel lblPrecioDolarVenta;
    private JLabel lblPesosCOP;
    private JLabel lblEuro;
    private JLabel lblNegociarDivisas;
    public JLabel lblPrecioCompraEuro;
    public JLabel lblPrecioVentaEuro;
    public JLabel lblDisponibleEuro;
    public JLabel lblPrecioEuroCompra;
    public JLabel lblPrecioEuroVenta;
    private JLabel lblLibra;
    public JLabel lblPrecioCompraLibra;
    public JLabel lblPrecioVentaLibra;
    public JLabel lblDisponibleLibra;
    public JLabel lblPrecioLibraCompra;
    public JLabel lblPrecioLibraVenta;


    private Boolean compraExitosaDolar = false;
    private Boolean ventaExitosaDolar = false;
    private Double pesosPorCompraDolar;
    private Double pesosPorVentaDolar;
    private Double cantidadVentaDolar;
    private Boolean compraExitosaEuro = false;
    private Boolean ventaExitosaEuro = false;
    private Double pesosPorCompraEuro;
    private Double pesosPorVentaEuro;
    private Double cantidadVentaEuro;
    private Boolean compraExitosaLibra = false;
    private Boolean ventaExitosaLibra = false;
    private Double pesosPorCompraLibra;
    private Double pesosPorVentaLibra;
    private Double cantidadVentaLibra;



    public NegociarDivisas() {

        comboBoxDivisasVenta.addItem(".....");
        comboBoxDivisasVenta.addItem("Dolar");
        comboBoxDivisasVenta.addItem("Euro");
        comboBoxDivisasVenta.addItem("Libra");

        comboBoxDivisasCompra.addItem(".....");
        comboBoxDivisasCompra.addItem("Dolar");
        comboBoxDivisasCompra.addItem("Euro");
        comboBoxDivisasCompra.addItem("Libra");

        //Compra y venta de dólares

        comboBoxDivisasCompra.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getSource() == comboBoxDivisasCompra) {
                    String seleccionado = (String) comboBoxDivisasCompra.getSelectedItem();
                    if (seleccionado == "Dolar") {
                        pesosPorCompraDolar = Double.valueOf(txtCantidadDivisaCompra.getText()) * Double.valueOf(lblPrecioDolarCompra.getText());
                        lblPesosPorCompra.setText(String.valueOf(pesosPorCompraDolar));
                    }
                    if (pesosPorCompraDolar > Double.valueOf(lblDisponiblesCOP.getText())) {
                        JOptionPane.showMessageDialog(null, "No tiene la cantidad suficiente de COP para comprar esa cantidad de Dólares." +
                                " Modifique la cantidad de Dólares que desea comprar.");
                        txtCantidadDivisaCompra.setText("");
                        lblPesosPorCompra.setText(" ");
                    }
                    if (pesosPorCompraDolar <= Double.valueOf(lblDisponiblesCOP.getText())) {
                        compraExitosaDolar = true;
                    }
                }
            }
        });

        comboBoxDivisasVenta.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getSource() == comboBoxDivisasVenta) {
                    String seleccionado = (String) comboBoxDivisasVenta.getSelectedItem();
                    if (seleccionado == "Dolar") {
                        cantidadVentaDolar = Double.valueOf(txtCantidadDivisaVenta.getText());
                        if (cantidadVentaDolar <= Double.valueOf(lblDisponibleDolar.getText())) {
                            pesosPorVentaDolar = Double.valueOf(txtCantidadDivisaVenta.getText()) * Double.valueOf(lblPrecioDolarVenta.getText());
                            lblPesosPorVenta.setText(String.valueOf(pesosPorVentaDolar));
                        }
                        if (cantidadVentaDolar > Double.valueOf(lblDisponibleDolar.getText())) {
                            JOptionPane.showMessageDialog(null, "La cantidad de dolares disponibles no es suficiente para la venta" +
                                    " Modifique la cantidad de Dólares que desea vender.");
                            txtCantidadDivisaVenta.setText("");
                            lblPesosPorVenta.setText("");
                        }
                        if (cantidadVentaDolar <= Double.valueOf(lblDisponibleDolar.getText())) {
                            ventaExitosaDolar = true;
                        }
                    }
                }
            }
        });

        //Compra y venta de euros
        comboBoxDivisasCompra.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getSource() == comboBoxDivisasCompra) {
                    String seleccionado = (String) comboBoxDivisasCompra.getSelectedItem();
                    if (seleccionado == "Euro") {
                        pesosPorCompraEuro = Double.valueOf(txtCantidadDivisaCompra.getText()) * Double.valueOf(lblPrecioEuroCompra.getText());
                        lblPesosPorCompra.setText(String.valueOf(pesosPorCompraEuro));
                    }
                    if (pesosPorCompraEuro > Double.valueOf(lblDisponiblesCOP.getText())) {
                        JOptionPane.showMessageDialog(null, "No tiene la cantidad suficiente de COP para comprar esa cantidad de Euros." +
                                " Modifique la cantidad de Euros que desea comprar.");
                        txtCantidadDivisaCompra.setText("");
                        lblPesosPorCompra.setText(" ");
                    }
                    if (pesosPorCompraEuro <= Double.valueOf(lblDisponiblesCOP.getText())) {
                        compraExitosaEuro = true;
                    }
                }
            }
        });

        comboBoxDivisasVenta.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getSource() == comboBoxDivisasVenta) {
                    String seleccionado = (String) comboBoxDivisasVenta.getSelectedItem();
                    if (seleccionado == "Euro") {
                        cantidadVentaEuro = Double.valueOf(txtCantidadDivisaVenta.getText());
                        if (cantidadVentaEuro <= Double.valueOf(lblDisponibleEuro.getText())) {
                            pesosPorVentaEuro = Double.valueOf(txtCantidadDivisaVenta.getText()) * Double.valueOf(lblPrecioEuroVenta.getText());
                            lblPesosPorVenta.setText(String.valueOf(pesosPorVentaEuro));
                        }
                        if (cantidadVentaEuro > Double.valueOf(lblDisponibleEuro.getText())) {
                            JOptionPane.showMessageDialog(null, "La cantidad de Euros disponibles no es suficiente para la venta" +
                                    " Modifique la cantidad de Euros que desea vender.");
                            txtCantidadDivisaVenta.setText("");
                            lblPesosPorVenta.setText("");
                        }
                        if (cantidadVentaEuro <= Double.valueOf(lblDisponibleEuro.getText())) {
                            ventaExitosaEuro = true;
                        }
                    }
                }
            }
        });

        //Compra y venta de Libras

        comboBoxDivisasCompra.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getSource() == comboBoxDivisasCompra) {
                    String seleccionado = (String) comboBoxDivisasCompra.getSelectedItem();
                    if (seleccionado == "Libra") {
                        pesosPorCompraLibra = Double.valueOf(txtCantidadDivisaCompra.getText()) * Double.valueOf(lblPrecioLibraCompra.getText());
                        lblPesosPorCompra.setText(String.valueOf(pesosPorCompraLibra));
                    }
                    if (pesosPorCompraLibra > Double.valueOf(lblDisponiblesCOP.getText())) {
                        JOptionPane.showMessageDialog(null, "No tiene la cantidad suficiente de COP para comprar esa cantidad de Libras." +
                                " Modifique la cantidad de Libras que desea comprar.");
                        txtCantidadDivisaCompra.setText("");
                        lblPesosPorCompra.setText(" ");
                    }
                    if (pesosPorCompraLibra <= Double.valueOf(lblDisponiblesCOP.getText())) {
                        compraExitosaLibra = true;
                    }
                }
            }
        });

        comboBoxDivisasVenta.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getSource() == comboBoxDivisasVenta) {
                    String seleccionado = (String) comboBoxDivisasVenta.getSelectedItem();
                    if (seleccionado == "Libra") {
                        cantidadVentaLibra = Double.valueOf(txtCantidadDivisaVenta.getText());
                        if (cantidadVentaLibra <= Double.valueOf(lblDisponibleLibra.getText())) {
                            pesosPorVentaLibra = Double.valueOf(txtCantidadDivisaVenta.getText()) * Double.valueOf(lblPrecioLibraVenta.getText());
                            lblPesosPorVenta.setText(String.valueOf(pesosPorVentaLibra));
                        }
                        if (cantidadVentaLibra > Double.valueOf(lblDisponibleLibra.getText())) {
                            JOptionPane.showMessageDialog(null, "La cantidad de Libras disponibles no es suficiente para la venta" +
                                    " Modifique la cantidad de Libras que desea vender.");
                            txtCantidadDivisaVenta.setText("");
                            lblPesosPorVenta.setText("");
                        }
                        if (cantidadVentaLibra <= Double.valueOf(lblDisponibleLibra.getText())) {
                            ventaExitosaLibra = true;
                        }
                    }
                }
            }
        });


        btnComprar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (compraExitosaEuro == true) {
                    Double cantidadDisponibleEuro = Double.valueOf(lblDisponibleEuro.getText()) + Double.valueOf(txtCantidadDivisaCompra.getText());
                    lblDisponibleEuro.setText(String.valueOf(cantidadDisponibleEuro));
                    Double DisponibleCOP = Double.valueOf(lblDisponiblesCOP.getText()) - (pesosPorCompraEuro);
                    lblDisponiblesCOP.setText(String.valueOf(DisponibleCOP));
                    JOptionPane.showMessageDialog(null, " La compra fue exítosa");
                    txtCantidadDivisaCompra.setText("");
                    lblPesosPorCompra.setText(" ");
                }
                if (compraExitosaLibra == true) {
                    Double cantidadDisponibleLibra = Double.valueOf(lblDisponibleLibra.getText()) + Double.valueOf(txtCantidadDivisaCompra.getText());
                    lblDisponibleLibra.setText(String.valueOf(cantidadDisponibleLibra));
                    Double DisponibleCOP = Double.valueOf(lblDisponiblesCOP.getText()) - (pesosPorCompraLibra);
                    lblDisponiblesCOP.setText(String.valueOf(DisponibleCOP));
                    JOptionPane.showMessageDialog(null, " La compra fue exítosa");
                    txtCantidadDivisaCompra.setText("");
                    lblPesosPorCompra.setText(" ");
                }
                if (compraExitosaDolar == true) {
                    Double cantidadDisponibleDolar = Double.valueOf(lblDisponibleDolar.getText()) + Double.valueOf(txtCantidadDivisaCompra.getText());
                    lblDisponibleDolar.setText(String.valueOf(cantidadDisponibleDolar));
                    Double DisponibleCOP = Double.valueOf(lblDisponiblesCOP.getText()) - (pesosPorCompraDolar);
                    lblDisponiblesCOP.setText(String.valueOf(DisponibleCOP));
                    JOptionPane.showMessageDialog(null, " La compra fue exítosa");
                    txtCantidadDivisaCompra.setText("");
                    lblPesosPorCompra.setText(" ");
                }
            }
        });

        btnVender.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ventaExitosaEuro == true){
                    Double cantidadDisponibleEuro = Double.valueOf(lblDisponibleEuro.getText()) - Double.valueOf(txtCantidadDivisaVenta.getText());
                    lblDisponibleEuro.setText(String.valueOf(cantidadDisponibleEuro));
                    Double DisponibleCOP = Double.valueOf(lblDisponiblesCOP.getText()) + (pesosPorVentaEuro);
                    lblDisponiblesCOP.setText(String.valueOf(DisponibleCOP));
                    JOptionPane.showMessageDialog(null, " La venta fue exítosa");
                    txtCantidadDivisaVenta.setText("");
                    lblPesosPorVenta.setText(" ");
                }
                if(ventaExitosaLibra == true){
                    Double cantidadDisponibleLibra = Double.valueOf(lblDisponibleLibra.getText()) - Double.valueOf(txtCantidadDivisaVenta.getText());
                    lblDisponibleLibra.setText(String.valueOf(cantidadDisponibleLibra));
                    Double DisponibleCOP = Double.valueOf(lblDisponiblesCOP.getText()) + (pesosPorVentaLibra);
                    lblDisponiblesCOP.setText(String.valueOf(DisponibleCOP));
                    JOptionPane.showMessageDialog(null, " La venta fue exítosa");
                    txtCantidadDivisaVenta.setText("");
                    lblPesosPorVenta.setText(" ");
                }
                if(ventaExitosaDolar == true){
                    Double cantidadDisponibleDolar = Double.valueOf(lblDisponibleDolar.getText()) - Double.valueOf(txtCantidadDivisaVenta.getText());
                    lblDisponibleDolar.setText(String.valueOf(cantidadDisponibleDolar));
                    Double DisponibleCOP = Double.valueOf(lblDisponiblesCOP.getText()) + (pesosPorVentaDolar);
                    lblDisponiblesCOP.setText(String.valueOf(DisponibleCOP));
                    JOptionPane.showMessageDialog(null, " La venta fue exítosa");
                    txtCantidadDivisaVenta.setText("");
                    lblPesosPorVenta.setText(" ");
                }
            }
        });

        btnRegresar.addActionListener(new ActionListener() {
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








