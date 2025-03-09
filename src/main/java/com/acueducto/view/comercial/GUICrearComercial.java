package com.acueducto.view.comercial;

import com.acueducto.exceptions.PredioException;
import com.acueducto.model.Comercial;
import com.acueducto.model.LicenciaComercial;
import com.acueducto.service.IServicioAcueducto;
import com.acueducto.service.ServicioAcueducto;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class GUICrearComercial extends javax.swing.JFrame {

    private IServicioAcueducto servicioAcueducto = new ServicioAcueducto();

    public GUICrearComercial() {
        initComponents();
        setLocationRelativeTo(null);
        txtEstadoCuenta.setText("AC");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPropietario = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtEstadoCuenta = new javax.swing.JTextField();
        txtConsumo = new javax.swing.JTextField();
        txtTiempoComercio = new javax.swing.JTextField();
        txtImpuesto = new javax.swing.JTextField();
        txtRepresentanteLegal = new javax.swing.JTextField();
        jComboBoxEstrato = new javax.swing.JComboBox<>();
        btnCrear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crear Predio Comercial");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Crear Predio Comercial");

        jLabel2.setText("Propietario");

        jLabel3.setText("Direccion");

        jLabel5.setText("Estado Cuenta");

        jLabel6.setText("Estrato");

        jLabel7.setText("Consumo (m3)");

        jLabel8.setText("Tipo Comercio");

        jLabel9.setText("Representante Legal");

        jLabel10.setText("Impuesto (%)");

        txtPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPropietarioActionPerformed(evt);
            }
        });

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        txtEstadoCuenta.setEditable(false);
        txtEstadoCuenta.setText("AC");
        txtEstadoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoCuentaActionPerformed(evt);
            }
        });

        txtConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConsumoActionPerformed(evt);
            }
        });

        txtTiempoComercio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTiempoComercioActionPerformed(evt);
            }
        });

        txtImpuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImpuestoActionPerformed(evt);
            }
        });

        txtRepresentanteLegal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRepresentanteLegalActionPerformed(evt);
            }
        });

        jComboBoxEstrato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion", "1", "2", "3", "4", "5", "6" }));
        jComboBoxEstrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEstratoActionPerformed(evt);
            }
        });

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCrear))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(30, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPropietario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEstadoCuenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxEstrato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConsumo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTiempoComercio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtImpuesto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRepresentanteLegal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel2, jLabel3, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jComboBoxEstrato, txtConsumo, txtDireccion, txtEstadoCuenta, txtImpuesto, txtPropietario, txtRepresentanteLegal, txtTiempoComercio});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtEstadoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jComboBoxEstrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtTiempoComercio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtRepresentanteLegal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCrear)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jComboBoxEstrato, jLabel10, jLabel2, jLabel3, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9, txtConsumo, txtDireccion, txtEstadoCuenta, txtImpuesto, txtPropietario, txtRepresentanteLegal, txtTiempoComercio});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        try {
            String propietario = txtPropietario.getText().trim();
            String direccion = txtDireccion.getText().trim();
            String estadoCuenta = txtEstadoCuenta.getText().trim();
            int estrato = Integer.parseInt(jComboBoxEstrato.getSelectedItem().toString());
            double consumo = Double.parseDouble(txtConsumo.getText().trim());
            String tipoComercio = txtTiempoComercio.getText().trim();
            double impuesto = Double.parseDouble(txtImpuesto.getText().trim());
            String representanteLegal = txtRepresentanteLegal.getText().trim();

            Comercial comercial = servicioAcueducto.crearComercial(tipoComercio, impuesto, representanteLegal, null, propietario, direccion, LocalDate.now(), estadoCuenta, estrato, consumo);

            
            GUICrearLicenciaComercial gui = new GUICrearLicenciaComercial(comercial, servicioAcueducto);
            gui.setVisible(true);
            limpiarCampos();
            

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: Ingrese valores validos para el Consumo, Subsidio y Estrato.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (PredioException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void limpiarCampos(){
        txtPropietario.setText("");
        txtDireccion.setText("");
        txtEstadoCuenta.setText("AC");
        txtConsumo.setText("");
        txtTiempoComercio.setText("");
        txtImpuesto.setText("");
        txtRepresentanteLegal.setText("");
        txtPropietario.setText("");
        jComboBoxEstrato.setSelectedIndex(0);
        
    }
    
    
    private void txtPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPropietarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPropietarioActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtEstadoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoCuentaActionPerformed

    private void jComboBoxEstratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEstratoActionPerformed

    private void txtConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConsumoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsumoActionPerformed

    private void txtTiempoComercioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTiempoComercioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTiempoComercioActionPerformed

    private void txtImpuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImpuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImpuestoActionPerformed

    private void txtRepresentanteLegalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRepresentanteLegalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepresentanteLegalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUICrearComercial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUICrearComercial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUICrearComercial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUICrearComercial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUICrearComercial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JComboBox<String> jComboBoxEstrato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtConsumo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEstadoCuenta;
    private javax.swing.JTextField txtImpuesto;
    private javax.swing.JTextField txtPropietario;
    private javax.swing.JTextField txtRepresentanteLegal;
    private javax.swing.JTextField txtTiempoComercio;
    // End of variables declaration//GEN-END:variables

}
