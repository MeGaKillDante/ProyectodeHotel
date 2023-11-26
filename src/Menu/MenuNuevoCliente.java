/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Menu;

import Clases.Cliente;
import VersionA.MenuHabitacion;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MenuNuevoCliente extends javax.swing.JInternalFrame {
    Cliente e;
    String NumeroH;
    public MenuNuevoCliente() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        txtcompas = new javax.swing.JTextField();
        txtDatosex = new javax.swing.JTextField();
        CBHabitacion = new javax.swing.JComboBox<>();
        CBPago = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        CBPago1 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(204, 204, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setMaximumSize(new java.awt.Dimension(75, 20));
        setMinimumSize(new java.awt.Dimension(75, 20));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("REGISTRO DE CLIENTE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 17, -1, -1));

        jLabel2.setText("NOMBRE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jLabel3.setText("DNI");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        jLabel4.setText("DATOS EXTRAS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 256, -1, -1));

        jLabel5.setText("ACOMPAÑANTES");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 200, -1, -1));

        jLabel6.setText("HABITACION");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 305, -1, -1));

        jLabel7.setText("TIPO DE RENTA");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 84, 170, -1));
        getContentPane().add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 133, 170, -1));
        getContentPane().add(txtcompas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 170, -1));
        getContentPane().add(txtDatosex, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 256, 170, -1));

        CBHabitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "101", "102", "103", "104", "105", "106" }));
        getContentPane().add(CBHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 305, -1, -1));

        CBPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Dias", "Semanas", "Mensual" }));
        getContentPane().add(CBPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, -1, -1));

        jButton1.setText("TERMINAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, -1, -1));

        jLabel8.setText("METODO DE PAGO");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        CBPago1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta" }));
        getContentPane().add(CBPago1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void DatosGenerales() {
        FileWriter DatosGenerales = null;
        PrintWriter pw10 = null;
        try {
            DatosGenerales = new FileWriter("DatosGeneralesdeClientes.txt", true);
            pw10 = new PrintWriter(DatosGenerales);
            pw10.println(txtNombre.getText() + " " + txtDNI.getText() + " " + txtcompas.getText() + " " + txtDatosex.getText()+" HABITACION: "+CBHabitacion.getSelectedItem());
        } catch (IOException ex) {
            Logger.getLogger(MenuHabitacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            DatosGenerales.close();
        } catch (IOException ex) {
            Logger.getLogger(MenuHabitacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        e=new Cliente();
        e.setNombre(txtNombre.getText());
        e.setDNI(Integer.parseInt(txtDNI.getText()));
        e.setCompas(txtcompas.getText());
        e.setDatosex(txtDatosex.getText());
        System.out.println(CBHabitacion.getSelectedItem().toString());
        NumeroH=(String) CBHabitacion.getSelectedItem();
        if ("101".equals(NumeroH)){
            FileWriter H101 = null;
            PrintWriter pw1 = null;
            try {
                H101 = new FileWriter("Habitacion101Clientes.txt", true);
                pw1 = new PrintWriter(H101);
                pw1.println(txtNombre.getText() + " " + txtDNI.getText() + " " + txtcompas.getText() + " " + txtDatosex.getText()+" "+CBPago.getSelectedItem().toString());
            } catch (IOException ex) {
                Logger.getLogger(MenuHabitacion.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                H101.close();
            } catch (IOException ex) {
                Logger.getLogger(MenuHabitacion.class.getName()).log(Level.SEVERE, null, ex);
            }
            DatosGenerales();
        }
        if ("102".equals(NumeroH)){
            FileWriter H101 = null;
            PrintWriter pw1 = null;
            try {
                H101 = new FileWriter("Habitacion102Clientes.txt", true);
                pw1 = new PrintWriter(H101);
                pw1.println(txtNombre.getText() + " " + txtDNI.getText() + " " + txtcompas.getText() + " " + txtDatosex.getText()+" "+CBPago.getSelectedItem().toString());
            } catch (IOException ex) {
                Logger.getLogger(MenuHabitacion.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                H101.close();
            } catch (IOException ex) {
                Logger.getLogger(MenuHabitacion.class.getName()).log(Level.SEVERE, null, ex);
            }
            DatosGenerales();
        }
        if ("103".equals(NumeroH)){
            FileWriter H101 = null;
            PrintWriter pw1 = null;
            try {
                H101 = new FileWriter("Habitacion103Clientes.txt", true);
                pw1 = new PrintWriter(H101);
                pw1.println(txtNombre.getText() + " " + txtDNI.getText() + " " + txtcompas.getText() + " " + txtDatosex.getText()+" "+CBPago.getSelectedItem().toString());
            } catch (IOException ex) {
                Logger.getLogger(MenuHabitacion.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                H101.close();
            } catch (IOException ex) {
                Logger.getLogger(MenuHabitacion.class.getName()).log(Level.SEVERE, null, ex);
            }
            DatosGenerales();
        }
        if ("104".equals(NumeroH)){
            FileWriter H101 = null;
            PrintWriter pw1 = null;
            try {
                H101 = new FileWriter("Habitacion104Clientes.txt", true);
                pw1 = new PrintWriter(H101);
                pw1.println(txtNombre.getText() + " " + txtDNI.getText() + " " + txtcompas.getText() + " " + txtDatosex.getText()+" "+CBPago.getSelectedItem().toString());
            } catch (IOException ex) {
                Logger.getLogger(MenuHabitacion.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                H101.close();
            } catch (IOException ex) {
                Logger.getLogger(MenuHabitacion.class.getName()).log(Level.SEVERE, null, ex);
            }
            DatosGenerales();
        }
        if ("105".equals(NumeroH)){
            FileWriter H101 = null;
            PrintWriter pw1 = null;
            try {
                H101 = new FileWriter("Habitacion15clientes.txt", true);
                pw1 = new PrintWriter(H101);
                pw1.println(txtNombre.getText() + " " + txtDNI.getText() + " " + txtcompas.getText() + " " + txtDatosex.getText()+" "+CBPago.getSelectedItem().toString());
            } catch (IOException ex) {
                Logger.getLogger(MenuHabitacion.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                H101.close();
            } catch (IOException ex) {
                Logger.getLogger(MenuHabitacion.class.getName()).log(Level.SEVERE, null, ex);
            }
            DatosGenerales();
        }
        if ("106".equals(NumeroH)){
            FileWriter H101 = null;
            PrintWriter pw1 = null;
            try {
                H101 = new FileWriter("Habitacion106Clientes.txt", true);
                pw1 = new PrintWriter(H101);
                pw1.println(txtNombre.getText() + " " + txtDNI.getText() + " " + txtcompas.getText() + " " + txtDatosex.getText()+" "+CBPago.getSelectedItem().toString());
            } catch (IOException ex) {
                Logger.getLogger(MenuHabitacion.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                H101.close();
            } catch (IOException ex) {
                Logger.getLogger(MenuHabitacion.class.getName()).log(Level.SEVERE, null, ex);
            }
            DatosGenerales();
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        
    }//GEN-LAST:event_txtNombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBHabitacion;
    private javax.swing.JComboBox<String> CBPago;
    private javax.swing.JComboBox<String> CBPago1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDatosex;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtcompas;
    // End of variables declaration//GEN-END:variables
}
