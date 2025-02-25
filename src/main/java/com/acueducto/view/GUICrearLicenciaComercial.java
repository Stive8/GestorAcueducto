package com.acueducto.view;

import com.acueducto.model.Comercial;
import com.acueducto.model.LicenciaComercial;
import com.acueducto.service.IServicioAcueducto;
import com.acueducto.service.ServicioAcueducto;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;

public class GUICrearLicenciaComercial extends javax.swing.JFrame {

    private LicenciaComercial licenciaComercial;
    private Comercial comercial;
    private IServicioAcueducto servicioAcueducto;

    public GUICrearLicenciaComercial() {
        initComponents();
    }

    public GUICrearLicenciaComercial(Comercial comercial, IServicioAcueducto servicioAcueducto) {
        this.comercial = comercial;
        this.servicioAcueducto = servicioAcueducto;
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumeroLicencia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFechaExpedicion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFechaVencimiento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        btnCrearLicenciaComercial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Crear Licencia Comercial");

        jLabel2.setText("Número de licencia");

        txtNumeroLicencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroLicenciaActionPerformed(evt);
            }
        });

        jLabel3.setText("Fecha de expedición");

        txtFechaExpedicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaExpedicionActionPerformed(evt);
            }
        });

        jLabel4.setText("Fecha de vencimiento");

        txtFechaVencimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaVencimientoActionPerformed(evt);
            }
        });

        jLabel5.setText("Estado");

        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Activo", "Inactivo" }));
        jComboBoxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEstadoActionPerformed(evt);
            }
        });

        btnCrearLicenciaComercial.setText("Crear Licencia Comercial");
        btnCrearLicenciaComercial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearLicenciaComercialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNumeroLicencia)
                            .addComponent(txtFechaExpedicion)
                            .addComponent(txtFechaVencimiento)
                            .addComponent(jComboBoxEstado, 0, 134, Short.MAX_VALUE))))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCrearLicenciaComercial)
                .addGap(118, 118, 118))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumeroLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFechaExpedicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFechaVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCrearLicenciaComercial)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroLicenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroLicenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroLicenciaActionPerformed

    private void txtFechaExpedicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaExpedicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaExpedicionActionPerformed

    private void txtFechaVencimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaVencimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaVencimientoActionPerformed

    private void jComboBoxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEstadoActionPerformed

    private void btnCrearLicenciaComercialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearLicenciaComercialActionPerformed
        try {
            String numeroLicencia = txtNumeroLicencia.getText().trim();
            String fechaExpedicionStr = txtFechaExpedicion.getText().trim();
            String fechaVencimientoStr = txtFechaVencimiento.getText().trim();
            String estado = jComboBoxEstado.getSelectedItem().toString();

            if (numeroLicencia.isEmpty()) {
                JOptionPane.showMessageDialog(this, "El número de licencia es obligatorio.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (estado.equals("Seleccionar")) {
                JOptionPane.showMessageDialog(this, "Debes seleccionar un estado válido.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate fechaExpedicion, fechaVencimiento;

            try {
                fechaExpedicion = LocalDate.parse(fechaExpedicionStr, formatter);
            } catch (DateTimeParseException e) {
                JOptionPane.showMessageDialog(this, "Formato de fecha de expedición incorrecto. Usa 'yyyy-MM-dd'.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            try {
                fechaVencimiento = LocalDate.parse(fechaVencimientoStr, formatter);
            } catch (DateTimeParseException e) {
                JOptionPane.showMessageDialog(this, "Formato de fecha de vencimiento incorrecto. Usa 'yyyy-MM-dd'.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (fechaVencimiento.isBefore(fechaExpedicion)) {
                JOptionPane.showMessageDialog(this, "La fecha de vencimiento debe ser posterior a la de expedición.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            LicenciaComercial licenciaComercial = new LicenciaComercial(numeroLicencia, fechaExpedicion, fechaVencimiento, estado);
            comercial.setLicenciaComercial(licenciaComercial);

            servicioAcueducto.adicionarComercial(comercial);

            JOptionPane.showMessageDialog(this, "Comercial y Licencia creados exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            this.dispose(); // Cerrar la ventana

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnCrearLicenciaComercialActionPerformed

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
            java.util.logging.Logger.getLogger(GUICrearLicenciaComercial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUICrearLicenciaComercial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUICrearLicenciaComercial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUICrearLicenciaComercial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUICrearLicenciaComercial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearLicenciaComercial;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtFechaExpedicion;
    private javax.swing.JTextField txtFechaVencimiento;
    private javax.swing.JTextField txtNumeroLicencia;
    // End of variables declaration//GEN-END:variables
}
