
package Menu;
import Clases.Servicios;
import javax.swing.SpinnerNumberModel;
public class MenuAgregarServicio extends javax.swing.JInternalFrame {
    Servicios e;
    String TipoSeleccion;
    String TipoServicio;
    String ServicioElegido;
    ControldeHabitacion control;
    Servicios es;
    public MenuAgregarServicio() {
        initComponents();
        CBTipo.addItem("Seleccionar");
        CBTipo.addItem("Bebidas");
        CBTipo.addItem("Comida");
        CBTipo.addItem("Streaming");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        CBHabitacion = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        CBTipo = new javax.swing.JComboBox<>();
        btnContinuar = new javax.swing.JButton();
        CBServicio = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbCanoHoras = new javax.swing.JLabel();
        SCantidad = new javax.swing.JSpinner();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Para la Habitacion N");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        CBHabitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "H-101", "H-102", "H-103", "H-104", "H-105", "H-106" }));
        CBHabitacion.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                CBHabitacionComponentAdded(evt);
            }
        });
        CBHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBHabitacionActionPerformed(evt);
            }
        });
        getContentPane().add(CBHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        jLabel2.setText("Tipo de Servicio");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        CBTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBTipoActionPerformed(evt);
            }
        });
        getContentPane().add(CBTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 130, -1));

        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        CBServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBServicioActionPerformed(evt);
            }
        });
        getContentPane().add(CBServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 130, 30));

        jLabel3.setText("Servicio Deseado");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        lbCanoHoras.setText("(Selecciona el tipo de Servicio)");
        getContentPane().add(lbCanoHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));
        getContentPane().add(SCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void Seleccion(){
        CBServicio.removeAllItems();
        TipoSeleccion=(String) CBTipo.getSelectedItem();
        if("Bebidas".equals(TipoSeleccion)){
            CBServicio.addItem("Pilsen en lata");
            CBServicio.addItem("Gaseosa Coca Kola 300ml");
            CBServicio.addItem("Gaseosa Inca Kola 300ml");
            CBServicio.addItem("Licor Four Loko Morado");
        }else if ("Streaming".equals(TipoSeleccion)){
            CBServicio.addItem("Amazon Prime");
            CBServicio.addItem("Diney Plus");
            CBServicio.addItem("HBO MAX");
            CBServicio.addItem("Netflix");
        }else if ("Comida".equals(TipoSeleccion)){
            CBServicio.addItem("Hamburguesa Inkay");
            CBServicio.addItem("Hamburguesa Inkay Especial");
            CBServicio.addItem("Pizza Inkay de doble queso");
            CBServicio.addItem("Broaster Inkay Alivaestomagos");
        }
        ServicioElegido=(String) CBServicio.getSelectedItem();
        if ("Bebidas".equals(TipoSeleccion) || "Comida".equals(TipoSeleccion)){
            lbCanoHoras.setText("Indique la Cantidad");
        } else if ("Streaming".equals(TipoSeleccion)){
            lbCanoHoras.setText("Indique los dias");
        }
    }
    public void ColocarServicio(Servicios es){
        TipoServicio=(String) CBServicio.getSelectedItem();
        es.setProducto(CBTipo.getSelectedItem().toString());
        if ("Pilsen en lata".equals(TipoServicio)){
            es.setDescripcion("Son cervezas frescas, doradas, ligeras, con buena carbonatación y con un sutil amargor final.");
            es.setPrecio(5);
        }else if ("Gaseosa Coca Kola".equals(TipoServicio)){
            es.setDescripcion("Gaseosa Gasificada,mezcla de azúcar y aceites de naranja, limón y vainilla.");
        }else if ("Gaseosa Inca Kola".equals(TipoServicio)){
            es.setDescripcion("Gaseosa Gasificada,sabor dulce y un color amarillo-dorado.");
        }else if ("Licor Four Loko Morado".equals(TipoServicio)){
            es.setDescripcion("Purple destacará por su lata color violeta y por un sabor de uva agridulce,");
        }
        SpinnerNumberModel model=(SpinnerNumberModel) SCantidad.getModel();
        int cantidad=(int) model.getNumber();
        es.setCantidad(cantidad);
    }

    private void CBHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBHabitacionActionPerformed

    private void CBHabitacionComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_CBHabitacionComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_CBHabitacionComponentAdded

    private void CBServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBServicioActionPerformed

    }//GEN-LAST:event_CBServicioActionPerformed
    
    private void CBTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBTipoActionPerformed
        Seleccion();
    }//GEN-LAST:event_CBTipoActionPerformed
    
    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        ColocarServicio(es);
        
    }//GEN-LAST:event_btnContinuarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBHabitacion;
    private javax.swing.JComboBox<String> CBServicio;
    private javax.swing.JComboBox<String> CBTipo;
    private javax.swing.JSpinner SCantidad;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbCanoHoras;
    // End of variables declaration//GEN-END:variables
}

