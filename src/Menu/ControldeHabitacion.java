
package Menu;
import javax.swing.table.DefaultTableModel;
import Clases.Servicios;
import java.util.ArrayList;
public class ControldeHabitacion extends javax.swing.JInternalFrame {
    Servicios e=new Servicios();
    DefaultTableModel modelo=new DefaultTableModel();
    private void CargarModelodeServicios(){
        modelo.addColumn("Servicio");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Total");
        TbServicios.setModel(modelo);
    }
    public ControldeHabitacion() {
        initComponents();
        CargarModelodeServicios();
    }
    public DefaultTableModel getModelodeServicios(){
        return modelo;
    }
    public void Informacion(int numero,String descripcion,String Nombre, String DNI, String compas, String datosex,String Renta ){
        txtNumero.setText(String.valueOf(numero));
        txtDescripcion.setText(descripcion);
        txtNombre.setText(Nombre);
        txtDNI.setText(DNI);
        txtCompas.setText(compas);
        txtDatosex.setText(datosex);
        txtRenta.setText(Renta);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDatosex = new javax.swing.JTextField();
        txtRenta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCompas = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbServicios = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("HABITACION N ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 280, -1));

        txtNumero.setEditable(false);
        txtNumero.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });
        getContentPane().add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 150, 40));

        jLabel2.setText("DESCRIPCION");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 80, 30));

        txtDatosex.setEditable(false);
        getContentPane().add(txtDatosex, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 230, -1));

        txtRenta.setEditable(false);
        getContentPane().add(txtRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 110, -1));

        jLabel3.setText("TIPO DE RENTA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel4.setText("FINALIZA EL:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 120, -1));

        jLabel5.setText("ID DE CUARTO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, -1, -1));

        jTextField5.setEditable(false);
        jTextField5.setText(" 5039498");
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 120, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel6.setText("SERVICIOS EXTRAS:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        jLabel7.setText("DNI");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel8.setText("NOMBRE");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLabel9.setText("ACOMPAÑANTES");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel10.setText("DATOS EXTRAS");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        txtDescripcion.setEditable(false);
        getContentPane().add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 220, -1));

        txtDNI.setEditable(false);
        getContentPane().add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 220, -1));

        txtNombre.setEditable(false);
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 220, -1));

        txtCompas.setEditable(false);
        getContentPane().add(txtCompas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 220, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel11.setText("DATOS DEL CLIENTE:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        TbServicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Servicio", "Descripcion", "Cantidad", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TbServicios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 860, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void AgregarServicios(Servicios e){
        
    }
    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TbServicios;
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
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField txtCompas;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDatosex;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRenta;
    // End of variables declaration//GEN-END:variables
}
