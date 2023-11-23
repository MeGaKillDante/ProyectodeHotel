package Menu;

import Clases.Cliente;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MenuHabitacion extends javax.swing.JFrame {

    private String numero;
    private Cliente relleno;
    private String valor;

    public MenuHabitacion(Cliente relleno, String numero) {
        initComponents();
        this.relleno = relleno;
        this.numero = numero;
        txtNumerodeH.setText(numero);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtEntrada = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        txtcompa = new javax.swing.JTextField();
        txtDatosex = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtNumerodeH = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Ta = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("SERVICIOS EXTRAS:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 330, 30));

        jLabel2.setText("DESCRIPCION");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jTextField1.setText("HABITACION PREMIUM CON VISTA AL MAR");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 390, -1));

        jLabel3.setText("TIPO DE RENTA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel4.setText("CONTROL DE HABITACION");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 450, 30));

        jLabel5.setText("NOMBRE");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel6.setText("DNI");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel7.setText("ACOMPAÑANTES");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel8.setText("DATOS EXTRAS:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jTextField3.setText("(FOTO)");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 250, 150));

        jLabel9.setText("HORA DE ENTRADA:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        txtEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEntradaActionPerformed(evt);
            }
        });
        getContentPane().add(txtEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 360, 20));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 360, -1));

        txtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIActionPerformed(evt);
            }
        });
        getContentPane().add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 360, -1));

        txtcompa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcompaActionPerformed(evt);
            }
        });
        getContentPane().add(txtcompa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 360, -1));

        txtDatosex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatosexActionPerformed(evt);
            }
        });
        getContentPane().add(txtDatosex, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 360, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel10.setText("DATOS DEL CLIENTE");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 580, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "PRODUCTO", "CANTIDAD", "DESCRIPCION", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 920, 220));

        jButton1.setText("AGREGAR SERVICIO");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, -1, -1));

        jLabel11.setText("FINALIZA EN:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, 20));

        jTextField9.setText("28/12/2023 6:45");
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 260, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jButton2.setText("Nuevo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        txtNumerodeH.setEditable(false);
        txtNumerodeH.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNumerodeH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumerodeHActionPerformed(evt);
            }
        });
        getContentPane().add(txtNumerodeH, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 150, 40));

        Ta.setColumns(20);
        Ta.setRows(5);
        jScrollPane2.setViewportView(Ta);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 370, -1));

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void NumerodeH(String numero) {
        this.numero = numero;
        txtNumerodeH.setText(numero);

    }
    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void txtEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEntradaActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIActionPerformed

    private void txtcompaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcompaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcompaActionPerformed

    private void txtDatosexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatosexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDatosexActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed

    }//GEN-LAST:event_jTextField9ActionPerformed

    private void txtNumerodeHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumerodeHActionPerformed

    }//GEN-LAST:event_txtNumerodeHActionPerformed
    public void mostrarDatos() {
        /*Al abrir el menuhabitacion, muestro los ultimos datos*/
        String ultimonombre = null;
        String ultimodni = null;
        String ultimocompas = null;
        String ultimodatosex = null;
        String ultimoentrada = null;
        if (relleno.getSeleccion() == 101) {
            String linea;
            try (BufferedReader br1 = new BufferedReader(new FileReader("Habitacion101Clientes.txt"))) {
                while ((linea = br1.readLine()) != null) {
                    String[] partes = linea.split(" ");
                    ultimonombre = partes[0];
                    ultimodni = partes[1];
                    ultimocompas = partes[2];
                    ultimodatosex = partes[3];
                    ultimoentrada = partes[4];
                }
                txtNombre.setText(ultimonombre);
                txtDNI.setText(ultimodni);
                txtcompa.setText(ultimocompas);
                txtDatosex.setText(ultimodatosex);
                txtEntrada.setText(ultimoentrada);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else if (relleno.getSeleccion() == 102) {
            try (BufferedReader br2 = new BufferedReader(new FileReader("Habitacion102Clientes.txt"))) {
                String linea2;
                while ((linea2 = br2.readLine()) != null) {
                    String[] partes = linea2.split(" ");
                    ultimonombre = partes[0];
                    ultimodni = partes[1];
                    ultimocompas = partes[2];
                    ultimodatosex = partes[3];
                    ultimoentrada = partes[4];
                }
                txtNombre.setText(ultimonombre);
                txtDNI.setText(ultimodni);
                txtcompa.setText(ultimocompas);
                txtDatosex.setText(ultimodatosex);
                txtEntrada.setText(ultimoentrada);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        else if (relleno.getSeleccion() == 103) {
            try (BufferedReader br3 = new BufferedReader(new FileReader("Habitacion103Clientes.txt"))) {
                String linea3;
                while ((linea3 = br3.readLine()) != null) {
                    String[] partes = linea3.split(" ");
                    ultimonombre = partes[0];
                    ultimodni = partes[1];
                    ultimocompas = partes[2];
                    ultimodatosex = partes[3];
                    ultimoentrada = partes[4];
                }
                txtNombre.setText(ultimonombre);
                txtDNI.setText(ultimodni);
                txtcompa.setText(ultimocompas);
                txtDatosex.setText(ultimodatosex);
                txtEntrada.setText(ultimoentrada);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        else if (relleno.getSeleccion() == 104) {
            try (BufferedReader br4 = new BufferedReader(new FileReader("Habitacion104Clientes.txt"))) {
                String linea4;
                while ((linea4 = br4.readLine()) != null) {
                    String[] partes = linea4.split(" ");
                    ultimonombre = partes[0];
                    ultimodni = partes[1];
                    ultimocompas = partes[2];
                    ultimodatosex = partes[3];
                    ultimoentrada = partes[4];
                }
                txtNombre.setText(ultimonombre);
                txtDNI.setText(ultimodni);
                txtcompa.setText(ultimocompas);
                txtDatosex.setText(ultimodatosex);
                txtEntrada.setText(ultimoentrada);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        else if (relleno.getSeleccion() == 105) {
            try (BufferedReader br5 = new BufferedReader(new FileReader("Habitacion105Clientes.txt"))) {
                String linea5;
                while ((linea5 = br5.readLine()) != null) {
                    String[] partes = linea5.split(" ");
                    ultimonombre = partes[0];
                    ultimodni = partes[1];
                    ultimocompas = partes[2];
                    ultimodatosex = partes[3];
                    ultimoentrada = partes[4];
                }
                txtNombre.setText(ultimonombre);
                txtDNI.setText(ultimodni);
                txtcompa.setText(ultimocompas);
                txtDatosex.setText(ultimodatosex);
                txtEntrada.setText(ultimoentrada);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }else if (relleno.getSeleccion() == 106) {
            try (BufferedReader br6 = new BufferedReader(new FileReader("Habitacion106Clientes.txt"))) {
                String linea6;
                while ((linea6 = br6.readLine()) != null) {
                    String[] partes = linea6.split(" ");
                    ultimonombre = partes[0];
                    ultimodni = partes[1];
                    ultimocompas = partes[2];
                    ultimodatosex = partes[3];
                    ultimoentrada = partes[4];
                }
                txtNombre.setText(ultimonombre);
                txtDNI.setText(ultimodni);
                txtcompa.setText(ultimocompas);
                txtDatosex.setText(ultimodatosex);
                txtEntrada.setText(ultimoentrada);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void DatosGenerales() {
        FileWriter DatosGenerales = null;
        PrintWriter pw10 = null;
        try {
            DatosGenerales = new FileWriter("DatosGeneralesdeClientes.txt", true);
            pw10 = new PrintWriter(DatosGenerales);
            pw10.println(txtNombre.getText() + " " + txtDNI.getText() + " " + txtcompa.getText() + " " + txtDatosex.getText() + " " + txtEntrada.getText());
        } catch (IOException ex) {
            Logger.getLogger(MenuHabitacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            DatosGenerales.close();
        } catch (IOException ex) {
            Logger.getLogger(MenuHabitacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (relleno.getSeleccion() == 101) {
            FileWriter H101 = null;
            PrintWriter pw1 = null;
            try {
                H101 = new FileWriter("Habitacion101Clientes.txt", true);
                pw1 = new PrintWriter(H101);
                pw1.println(txtNombre.getText() + " " + txtDNI.getText() + " " + txtcompa.getText() + " " + txtDatosex.getText() + " " + txtEntrada.getText());
            } catch (IOException ex) {
                Logger.getLogger(MenuHabitacion.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                H101.close();
            } catch (IOException ex) {
                Logger.getLogger(MenuHabitacion.class.getName()).log(Level.SEVERE, null, ex);
            }
            DatosGenerales();
        } else if (relleno.getSeleccion() == 102) {
            FileWriter H102 = null;
            PrintWriter pw2 = null;
            try {
                H102 = new FileWriter("Habitacion102Clientes.txt", true);
                pw2 = new PrintWriter(H102);
                pw2.println(txtNombre.getText() + " " + txtDNI.getText() + " " + txtcompa.getText() + " " + txtDatosex.getText() + " " + txtEntrada.getText());
            } catch (IOException ex) {
                Logger.getLogger(MenuHabitacion.class.getName()).log(Level.SEVERE, null, ex);;
            }
            try {
                H102.close();
            } catch (IOException ex) {
                Logger.getLogger(MenuHabitacion.class.getName()).log(Level.SEVERE, null, ex);
            }
            DatosGenerales();
        } else if (relleno.getSeleccion() == 103) {
            FileWriter H103 = null;
            PrintWriter pw3 = null;
            try {
                H103 = new FileWriter("Habitacion103Clientes.txt", true);
                pw3 = new PrintWriter(H103);
                pw3.println(txtNombre.getText() + " " + txtDNI.getText() + " " + txtcompa.getText() + " " + txtDatosex.getText() + " " + txtEntrada.getText());
            } catch (IOException ex) {
                Logger.getLogger(MenuHabitacion.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                H103.close();
            } catch (IOException ex) {
                Logger.getLogger(MenuHabitacion.class.getName()).log(Level.SEVERE, null, ex);
            }
            DatosGenerales();
        } else if (relleno.getSeleccion() == 104) {
            FileWriter H104 = null;
            PrintWriter pw4 = null;
            try {
                H104 = new FileWriter("Habitacion104Clientes.txt", true);
                pw4 = new PrintWriter(H104);
                pw4.println(txtNombre.getText() + " " + txtDNI.getText() + " " + txtcompa.getText() + " " + txtDatosex.getText() + " " + txtEntrada.getText());
            } catch (IOException ex) {
                Logger.getLogger(MenuHabitacion.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                H104.close();
            } catch (IOException ex) {
                Logger.getLogger(MenuHabitacion.class.getName()).log(Level.SEVERE, null, ex);
            }
            DatosGenerales();
        } else if (relleno.getSeleccion() == 105) {
            FileWriter H105 = null;
            PrintWriter pw5 = null;
            try {
                H105 = new FileWriter("Habitacion105Clientes.txt", true);
                pw5 = new PrintWriter(H105);
                pw5.println(txtNombre.getText() + " " + txtDNI.getText() + " " + txtcompa.getText() + " " + txtDatosex.getText() + " " + txtEntrada.getText());
            } catch (IOException ex) {
                Logger.getLogger(MenuHabitacion.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                H105.close();
            } catch (IOException ex) {
                Logger.getLogger(MenuHabitacion.class.getName()).log(Level.SEVERE, null, ex);
            }
            DatosGenerales();
        } else if (relleno.getSeleccion() == 106) {
            FileWriter H106 = null;
            PrintWriter pw6 = null;
            try {
                H106 = new FileWriter("Habitacion106Clientes.txt", true);
                pw6 = new PrintWriter(H106);
                pw6.println(txtNombre.getText() + " " + txtDNI.getText() + " " + txtcompa.getText() + " " + txtDatosex.getText() + " " + txtEntrada.getText());
            } catch (IOException ex) {
                Logger.getLogger(MenuHabitacion.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                H106.close();
            } catch (IOException ex) {
                Logger.getLogger(MenuHabitacion.class.getName()).log(Level.SEVERE, null, ex);
            }
            DatosGenerales();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        BufferedReader br6 = null;
        FileReader fr6 = null;
        String linea;
        String data = "";
        try {
            fr6 = new FileReader("Habitacion106Clientes.txt");
            br6 = new BufferedReader(fr6);
            try {
                while ((linea = br6.readLine()) != null) {
                    data += linea + "\n";

                }
                Ta.append(data);

            } catch (IOException ex) {
                Logger.getLogger(MenuHabitacion.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    br6.close();
                } catch (IOException ex) {
                    Logger.getLogger(MenuHabitacion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(MenuHabitacion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtNombre.setText("");
        txtDNI.setText("");
        txtcompa.setText("");
        txtDatosex.setText("");
        txtEntrada.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Cliente cliente = new Cliente();
                new MenuHabitacion(cliente, "ola").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Ta;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDatosex;
    private javax.swing.JTextField txtEntrada;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumerodeH;
    private javax.swing.JTextField txtcompa;
    // End of variables declaration//GEN-END:variables
}
