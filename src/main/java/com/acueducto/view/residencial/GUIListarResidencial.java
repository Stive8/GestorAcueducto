package com.acueducto.view.residencial;

import com.acueducto.model.Predio;
import com.acueducto.model.Residencial;
import com.acueducto.service.IServicioAcueducto;
import com.acueducto.service.ServicioAcueducto;
import com.acueducto.view.ICambiable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class GUIListarResidencial extends javax.swing.JFrame implements ICambiable {

    private ServicioAcueducto servicioAcueducto;

    public GUIListarResidencial(ServicioAcueducto servicioAcueducto) {
        initComponents();
        setLocationRelativeTo(null);
        this.servicioAcueducto = servicioAcueducto;
        servicioAcueducto.registarGui(this);
        btnGrupo.add(rbtnActivos);
        btnGrupo.add(rbtnInactivos);
        btnGrupo.add(rbtnTodos);
        listarTodos();

    }

    @Override
    public void cambio() {
        System.out.println("GUIListarResidencial recibió la notificación de cambio.");
        listarTodos();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupo = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResidencial = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        rbtnTodos = new javax.swing.JRadioButton();
        rbtnActivos = new javax.swing.JRadioButton();
        rbtnInactivos = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listado Predio Residencial");

        tblResidencial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Propietario", "Dirección", "Fecha Creacion", "Estado Cuenta", "Estrato", "Consumo", "Subsidio", "Tipo Vivienda", "Valor Factura"
            }
        ));
        jScrollPane1.setViewportView(tblResidencial);

        jButton1.setText("Listar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        rbtnTodos.setSelected(true);
        rbtnTodos.setText("Todos");
        rbtnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTodosActionPerformed(evt);
            }
        });

        rbtnActivos.setText("Activos");

        rbtnInactivos.setText("Inactivos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbtnTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnInactivos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(rbtnTodos)
                    .addComponent(rbtnActivos)
                    .addComponent(rbtnInactivos))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        listarTodos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rbtnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnTodosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnTodosActionPerformed

    private void setResidencialesToTable(List<Residencial> residenciales) {

        DefaultTableModel model = (DefaultTableModel) tblResidencial.getModel();
        model.setRowCount(0); // Limpiar la tabla

        for (Residencial red : residenciales) {
            Object[] row = {
                red.getId(),
                red.getPropietario(),
                red.getDireccion(),
                red.getFechaRegistro(),
                red.getEstadoCuenta(),
                red.getEstrato(),
                red.getConsumo(),
                red.getSubsidio(),
                red.getTipoVivienda(),
                red.calcularPago()
            };
            model.addRow(row);
        }

        model.fireTableDataChanged(); // Notificar a la tabla que los datos cambiaron
    }

    private void listarTodos() {
        System.out.println("LISTANDO RESIDENCIALES");

        List<Predio> predios = servicioAcueducto.getResidencial(); // Devuelve List<Predio>
        List<Residencial> residenciales = new ArrayList<>();

        for (Predio pre : predios) {
            if (pre instanceof Residencial) {
                residenciales.add((Residencial) pre); // Casteo a Residencial
            }
        }

        List<Residencial> filtrados = new ArrayList<>();

        if (rbtnActivos.isSelected()) {
            for (Residencial red : residenciales) {
                if (red.getEstadoCuenta().equalsIgnoreCase("AC")) { // Filtrar activos
                    filtrados.add(red);
                }
            }
        } else if (rbtnInactivos.isSelected()) {
            for (Residencial red : residenciales) {
                if (red.getEstadoCuenta().equalsIgnoreCase("INAC")) { // Filtrar inactivos
                    filtrados.add(red);
                }
            }
        } else {
            filtrados = residenciales;
        }

        setResidencialesToTable(filtrados);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGrupo;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtnActivos;
    private javax.swing.JRadioButton rbtnInactivos;
    private javax.swing.JRadioButton rbtnTodos;
    private javax.swing.JTable tblResidencial;
    // End of variables declaration//GEN-END:variables
}
