package VersionA;

import Clases.Cliente;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.SwingUtilities;
import VersionA.MenuHabitacion;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MenuPrincipal extends javax.swing.JFrame {
    private String valor;
    private MenuHabitacion abrir; /*metodo constructor*/
    public MenuPrincipal(String numerodehabitacion ) {
        initComponents();
        abrir=new MenuHabitacion(relleno,"nada");
        Thread relojThread = new Thread(() -> {
            while (true) {
                actualizarHora();
                actualizarFecha();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        });
        relojThread.start();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        txtTerminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnH106 = new javax.swing.JButton();
        btnH101 = new javax.swing.JButton();
        btnH102 = new javax.swing.JButton();
        btnH103 = new javax.swing.JButton();
        btnH104 = new javax.swing.JButton();
        btnH105 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        lbfecha = new javax.swing.JLabel();
        lbHora = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTerminar.setText("TERMINAR TURNO");
        txtTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTerminarActionPerformed(evt);
            }
        });
        getContentPane().add(txtTerminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel1.setText("CONTROL DE HOTEL INKAY");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        btnH106.setText("H-106");
        btnH106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnH106ActionPerformed(evt);
            }
        });
        getContentPane().add(btnH106, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 150, 70));

        btnH101.setText("H-101");
        btnH101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnH101ActionPerformed(evt);
            }
        });
        getContentPane().add(btnH101, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 150, 70));

        btnH102.setText("H-102");
        btnH102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnH102ActionPerformed(evt);
            }
        });
        getContentPane().add(btnH102, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 150, 70));

        btnH103.setText("H-103");
        btnH103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnH103ActionPerformed(evt);
            }
        });
        getContentPane().add(btnH103, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 150, 70));

        btnH104.setText("H-104");
        btnH104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnH104ActionPerformed(evt);
            }
        });
        getContentPane().add(btnH104, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 150, 70));

        btnH105.setText("H-105");
        btnH105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnH105ActionPerformed(evt);
            }
        });
        getContentPane().add(btnH105, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 150, 70));

        jButton8.setText("ESTADO");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, -1, -1));

        jButton10.setText("MANT.");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        jButton11.setText("ESTADO");
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, -1));

        jButton12.setText("ESTADO");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        jButton13.setText("ESTADO");
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, -1, -1));

        lbfecha.setText("Fecha");
        getContentPane().add(lbfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 80, 20));

        lbHora.setText("Hora");
        getContentPane().add(lbHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 60, 30));

        jButton14.setText("MANT.");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Cliente relleno=new Cliente();

    public void actualizarFecha() {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fechaActual = formatoFecha.format(fecha);
        lbfecha.setText(fechaActual);
    }

    private void actualizarHora() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        String HoraActual = dateFormat.format(new Date());
        lbHora.setText(HoraActual);
    }
    
    private void txtTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTerminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTerminarActionPerformed

    private void btnH101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnH101ActionPerformed
        relleno.setNumero("1");
        abrir.NumerodeH("101");
        abrir.setVisible(true);
        relleno.setSeleccion(101);
        abrir.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        abrir.mostrarDatos();
    }//GEN-LAST:event_btnH101ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void btnH102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnH102ActionPerformed
        relleno.setNumero("2");
        abrir.NumerodeH("102");
        relleno.setSeleccion(102);
        abrir.setVisible(true);
        abrir.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        abrir.mostrarDatos();
    }//GEN-LAST:event_btnH102ActionPerformed

    private void btnH103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnH103ActionPerformed
        abrir.NumerodeH("103");
        relleno.setSeleccion(103);
        abrir.setVisible(true);
        abrir.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        abrir.mostrarDatos();
    }//GEN-LAST:event_btnH103ActionPerformed

    private void btnH104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnH104ActionPerformed
        abrir.NumerodeH("104");
        relleno.setSeleccion(104);
        abrir.setVisible(true);
        abrir.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        abrir.mostrarDatos();
    }//GEN-LAST:event_btnH104ActionPerformed

    private void btnH105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnH105ActionPerformed
        abrir.NumerodeH("105");
        relleno.setSeleccion(105);
        abrir.setVisible(true);
        abrir.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        abrir.mostrarDatos();
    }//GEN-LAST:event_btnH105ActionPerformed

    private void btnH106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnH106ActionPerformed
        abrir.NumerodeH("106");
        relleno.setSeleccion(106);
        abrir.setVisible(true);
        abrir.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        abrir.mostrarDatos();
    }//GEN-LAST:event_btnH106ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            Cliente relleno=new Cliente();
            public void run() {
                java.awt.EventQueue.invokeLater(() -> {
                    MenuPrincipal menu = new MenuPrincipal("alguna cadena");
                    menu.setVisible(true);
                });
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnH101;
    private javax.swing.JButton btnH102;
    private javax.swing.JButton btnH103;
    private javax.swing.JButton btnH104;
    private javax.swing.JButton btnH105;
    private javax.swing.JButton btnH106;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbHora;
    private javax.swing.JLabel lbfecha;
    private javax.swing.JButton txtTerminar;
    // End of variables declaration//GEN-END:variables
}
