package com.acueducto.view;

import com.acueducto.model.Comercial;
import com.acueducto.service.IServicioAcueducto;
import com.acueducto.service.ServicioAcueducto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class GUIListarComercial extends javax.swing.JFrame {

    /**
     * Creates new form GUIListarComercial
     */
    private IServicioAcueducto servicioAcueducto = new ServicioAcueducto();

    public GUIListarComercial() {
        initComponents();
        setLocationRelativeTo(null);
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblComercial = new javax.swing.JTable();
        rbtnTodos = new javax.swing.JRadioButton();
        rbtnActivos = new javax.swing.JRadioButton();
        rbtnInactivos = new javax.swing.JRadioButton();
        btnListar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listado Predio Comercial");

        tblComercial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Propietario", "Direccion", "Fecha Creacion", "Estado Cuenta", "Estrato", "Consumo", "Tipo Comercio", "Representante legal", "Impuesto", "Licenecia Comercial"
            }
        ));
        jScrollPane1.setViewportView(tblComercial);

        rbtnTodos.setSelected(true);
        rbtnTodos.setText("Todos");
        rbtnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTodosActionPerformed(evt);
            }
        });

        rbtnActivos.setText("Activos");
        rbtnActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnActivosActionPerformed(evt);
            }
        });

        rbtnInactivos.setText("Inactivos");
        rbtnInactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnInactivosActionPerformed(evt);
            }
        });

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbtnTodos)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnActivos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtnInactivos)
                        .addGap(638, 638, 638)
                        .addComponent(btnListar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnTodos)
                    .addComponent(rbtnActivos)
                    .addComponent(rbtnInactivos)
                    .addComponent(btnListar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnTodosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnTodosActionPerformed

    private void rbtnActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnActivosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnActivosActionPerformed

    private void rbtnInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnInactivosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnInactivosActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:
        List<Comercial> comerciales = servicioAcueducto.getComercial();
        List<Comercial> filtrados = new ArrayList<>();

        // Filtrar según el estado de cuenta
        if (rbtnActivos.isSelected()) {
            for (Comercial com : comerciales) {
                if (com.getEstadoCuenta().equalsIgnoreCase("AC")) {
                    filtrados.add(com);
                }
            }
        } else if (rbtnInactivos.isSelected()) {
            for (Comercial com : comerciales) {
                if (com.getEstadoCuenta().equalsIgnoreCase("INAC")) {
                    filtrados.add(com);
                }
            }
        } else {
            filtrados = comerciales;
        }

        // Actualizar la tabla con los datos filtrados
        setComercialesToTable(filtrados);
    }//GEN-LAST:event_btnListarActionPerformed

    private void setComercialesToTable(List<Comercial> residenciales) {

        DefaultTableModel model = (DefaultTableModel) tblComercial.getModel();
        model.setRowCount(0);
        for (Comercial red : residenciales) {
            Object[] row = {
                red.getPropietario(),
                red.getDireccion(),
                red.getFechaRegistro(),
                red.getEstadoCuenta(),
                red.getEstrato(),
                red.getConsumo(),
                red.getTipoComercio(),
                red.getRepresentanteLegal(),
                red.getImpuesto(),
                red.getLicenciaComercial().getNumeroLicencia()
            };
            model.addRow(row);
        }
    }
        
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
            java.util.logging.Logger.getLogger(GUIListarComercial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIListarComercial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIListarComercial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIListarComercial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIListarComercial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtnActivos;
    private javax.swing.JRadioButton rbtnInactivos;
    private javax.swing.JRadioButton rbtnTodos;
    private javax.swing.JTable tblComercial;
    // End of variables declaration//GEN-END:variables

    

}
