package Menu;

import Clases.Servicios;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class MDI extends javax.swing.JFrame {
    DefaultTableModel modelo=new DefaultTableModel();
    ArrayList <Servicios> listaServicios=new ArrayList<Servicios>();
    ControldeHabitacion Infohabitacion;
    DefaultTableModel modelodeservicios=Infohabitacion.getModelodeServicios();
    MenuAgregarServicio Servicios;
    String ultimonombre = null;
    String ultimodni = null;
    String ultimocompas = null;
    String ultimodatosex = null;
    String ultimoentrada = null;
    String descripcion;
    int numerodehabitacion;
    public MDI() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        Infohabitacion = new ControldeHabitacion();
        Servicios= new MenuAgregarServicio();
        Thread relojThread = new Thread(() -> {
            while (true) {
                SwingUtilities.invokeLater(() -> {
                    actualizarHora();
                    actualizarFecha();
                });
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

        desktopPane = new javax.swing.JDesktopPane();
        lbHora = new javax.swing.JLabel();
        lbFecha = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        InformacionMenu = new javax.swing.JMenu();
        ReservarMenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        InfoH101SubM = new javax.swing.JMenuItem();
        InfoH102SubM = new javax.swing.JMenuItem();
        InfoH103SubM = new javax.swing.JMenuItem();
        InfoH104SubM = new javax.swing.JMenuItem();
        InfoH105SubM = new javax.swing.JMenuItem();
        InfoH106SubM = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbHora.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbHora.setText("Hora");
        desktopPane.add(lbHora);
        lbHora.setBounds(1240, 80, 80, 30);

        lbFecha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbFecha.setText("Fecha");
        desktopPane.add(lbFecha);
        lbFecha.setBounds(1240, 20, 100, 40);

        InformacionMenu.setMnemonic('f');
        InformacionMenu.setText("Informacion");

        ReservarMenuItem.setMnemonic('o');
        ReservarMenuItem.setText("Mostrar Habitaciones");
        ReservarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservarMenuItemActionPerformed(evt);
            }
        });
        InformacionMenu.add(ReservarMenuItem);

        jMenu1.setText("Informacion de cuarto");

        InfoH101SubM.setText("H-101");
        InfoH101SubM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoH101SubMActionPerformed(evt);
            }
        });
        jMenu1.add(InfoH101SubM);

        InfoH102SubM.setText("H-102");
        InfoH102SubM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoH102SubMActionPerformed(evt);
            }
        });
        jMenu1.add(InfoH102SubM);

        InfoH103SubM.setText("H-103");
        InfoH103SubM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoH103SubMActionPerformed(evt);
            }
        });
        jMenu1.add(InfoH103SubM);

        InfoH104SubM.setText("H-104");
        InfoH104SubM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoH104SubMActionPerformed(evt);
            }
        });
        jMenu1.add(InfoH104SubM);

        InfoH105SubM.setText("H-105");
        InfoH105SubM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoH105SubMActionPerformed(evt);
            }
        });
        jMenu1.add(InfoH105SubM);

        InfoH106SubM.setText("H-106");
        InfoH106SubM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoH106SubMActionPerformed(evt);
            }
        });
        jMenu1.add(InfoH106SubM);

        InformacionMenu.add(jMenu1);

        menuBar.add(InformacionMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Nuevo");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Reservar Cuarto");
        cutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(cutMenuItem);

        jMenuItem1.setText("Agregar Servicio");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        editMenu.add(jMenuItem1);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Llamada de aviso ");
        editMenu.add(pasteMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Liberar Cuarto");
        editMenu.add(copyMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Cerrar Sesion");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1515, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 827, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void actualizarHora() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        String HoraActual = dateFormat.format(new Date());
        lbHora.setText(HoraActual);
    }
    private void CargarModelodeServicios(){
        modelo.addColumn("Servicio");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Total");
        
    }
    public void actualizarFecha(){
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fechaActual = formatoFecha.format(fecha);
        lbFecha.setText(fechaActual);
    }
    private void ReservarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservarMenuItemActionPerformed
        MenuMostrarHabitaciones Mostrar;
        Mostrar = new MenuMostrarHabitaciones();
        this.desktopPane.add(Mostrar);
        Mostrar.show();
    }//GEN-LAST:event_ReservarMenuItemActionPerformed

    private void cutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItemActionPerformed


    }//GEN-LAST:event_cutMenuItemActionPerformed

    private void InfoH101SubMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoH101SubMActionPerformed
        numerodehabitacion=101;
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
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        descripcion="Cuarto de 2 camas y vista el mar seccion:Premium";
        Infohabitacion.Informacion(numerodehabitacion,descripcion,ultimonombre, ultimodni, ultimocompas, ultimoentrada);
        this.desktopPane.add(Infohabitacion);
        Infohabitacion.show();
    }//GEN-LAST:event_InfoH101SubMActionPerformed

    private void InfoH105SubMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoH105SubMActionPerformed
        numerodehabitacion=105;
        String linea;
        try (BufferedReader br5 = new BufferedReader(new FileReader("Habitacion101Clientes.txt"))) {
            while ((linea = br5.readLine()) != null) {
                String[] partes = linea.split(" ");
                ultimonombre = partes[0];
                ultimodni = partes[1];
                ultimocompas = partes[2];
                ultimodatosex = partes[3];
                ultimoentrada = partes[4];
            }
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        descripcion="Cuarto de 2 camas y vista el mar seccion:Premium";
        Infohabitacion.Informacion(numerodehabitacion,descripcion,ultimonombre, ultimodni, ultimocompas, ultimoentrada);
        this.desktopPane.add(Infohabitacion);
        Infohabitacion.show();
    }//GEN-LAST:event_InfoH105SubMActionPerformed

    private void InfoH102SubMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoH102SubMActionPerformed
        numerodehabitacion=102;
        String linea;
        try (BufferedReader br2 = new BufferedReader(new FileReader("Habitacion103Clientes.txt"))) {
            while ((linea = br2.readLine()) != null) {
                String[] partes = linea.split(" ");
                ultimonombre = partes[0];
                ultimodni = partes[1];
                ultimocompas = partes[2];
                ultimodatosex = partes[3];
                ultimoentrada = partes[4];
            }
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        descripcion="Cuarto de 2 camas y vista el mar seccion:Premium";
        Infohabitacion.Informacion(numerodehabitacion,descripcion,ultimonombre, ultimodni, ultimocompas, ultimoentrada);
        this.desktopPane.add(Infohabitacion);
        Infohabitacion.show();
    }//GEN-LAST:event_InfoH102SubMActionPerformed

    private void InfoH103SubMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoH103SubMActionPerformed
        numerodehabitacion=103;
        String linea;
        try (BufferedReader br3 = new BufferedReader(new FileReader("Habitacion103Clientes.txt"))) {
            while ((linea = br3.readLine()) != null) {
                String[] partes = linea.split(" ");
                ultimonombre = partes[0];
                ultimodni = partes[1];
                ultimocompas = partes[2];
                ultimodatosex = partes[3];
                ultimoentrada = partes[4];
            }
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        descripcion="Cuarto de 2 camas y vista el mar seccion:Premium";
        Infohabitacion.Informacion(numerodehabitacion,descripcion,ultimonombre, ultimodni, ultimocompas, ultimoentrada);
        this.desktopPane.add(Infohabitacion);
        Infohabitacion.show();
    }//GEN-LAST:event_InfoH103SubMActionPerformed

    private void InfoH104SubMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoH104SubMActionPerformed
        numerodehabitacion=104;
        String linea;
        try (BufferedReader br4 = new BufferedReader(new FileReader("Habitacion101Clientes.txt"))) {
            while ((linea = br4.readLine()) != null) {
                String[] partes = linea.split(" ");
                ultimonombre = partes[0];
                ultimodni = partes[1];
                ultimocompas = partes[2];
                ultimodatosex = partes[3];
                ultimoentrada = partes[4];
            }
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        descripcion="Cuarto de 2 camas y vista el mar seccion:Premium";
        Infohabitacion.Informacion(numerodehabitacion,descripcion,ultimonombre, ultimodni, ultimocompas, ultimoentrada);
        this.desktopPane.add(Infohabitacion);
        Infohabitacion.show();
    }//GEN-LAST:event_InfoH104SubMActionPerformed

    private void InfoH106SubMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoH106SubMActionPerformed
        numerodehabitacion=106;
        String linea;
        try (BufferedReader br6 = new BufferedReader(new FileReader("Habitacion106Clientes.txt"))) {
            while ((linea = br6.readLine()) != null) {
                String[] partes = linea.split(" ");
                ultimonombre = partes[0];
                ultimodni = partes[1];
                ultimocompas = partes[2];
                ultimodatosex = partes[3];
                ultimoentrada = partes[4];
            }
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        descripcion="Cuarto de 2 camas y vista el mar seccion:Premium";
        Infohabitacion.Informacion(numerodehabitacion,descripcion,ultimonombre, ultimodni, ultimocompas, ultimoentrada);
        this.desktopPane.add(Infohabitacion);
        Infohabitacion.show();
    }//GEN-LAST:event_InfoH106SubMActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.desktopPane.add(Servicios);
        Servicios.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                java.awt.EventQueue.invokeLater(() -> {
                    MDI menu = new MDI();
                    menu.setVisible(true);
                });
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem InfoH101SubM;
    private javax.swing.JMenuItem InfoH102SubM;
    private javax.swing.JMenuItem InfoH103SubM;
    private javax.swing.JMenuItem InfoH104SubM;
    private javax.swing.JMenuItem InfoH105SubM;
    private javax.swing.JMenuItem InfoH106SubM;
    private javax.swing.JMenu InformacionMenu;
    private javax.swing.JMenuItem ReservarMenuItem;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbHora;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem pasteMenuItem;
    // End of variables declaration//GEN-END:variables

}
