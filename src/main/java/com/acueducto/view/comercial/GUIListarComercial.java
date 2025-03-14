package com.acueducto.view.comercial;

import com.acueducto.model.Comercial;
import com.acueducto.model.Predio;
import com.acueducto.service.IServicioAcueducto;
import com.acueducto.service.ServicioAcueducto;
import com.acueducto.view.ICambiable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class GUIListarComercial extends javax.swing.JFrame implements ICambiable {

    private ServicioAcueducto servicioAcueducto;

    public GUIListarComercial(ServicioAcueducto servicioAcueducto) {
        initComponents();
        setLocationRelativeTo(null);
        this.servicioAcueducto = servicioAcueducto;
        servicioAcueducto.registarGui(this);
        btnGrupo.add(rbtnActivos);
        btnGrupo.add(rbtnInactivos);
        btnGrupo.add(rbtnTodos);
    }

    @Override
    public void cambio() {
        System.out.println("GUIListarResidencial recibió la notificación de cambio.");
        listarTodos();

    }

    public void listarTodos() {

        // TODO add your handling code here:
        List<Predio> comerciales = servicioAcueducto.getComercial();
        List<Predio> filtrados = new ArrayList<>();

        // Filtrar según el estado de cuenta
        if (rbtnActivos.isSelected()) {
            for (Predio com : comerciales) {
                if (com.getEstadoCuenta().equalsIgnoreCase("AC")) {
                    filtrados.add(com);
                }
            }
        } else if (rbtnInactivos.isSelected()) {
            for (Predio com : comerciales) {
                if (com.getEstadoCuenta().equalsIgnoreCase("INAC")) {
                    filtrados.add(com);
                }
            }
        } else {
            filtrados = comerciales;
        }

        // Actualizar la tabla con los datos filtrados
        setComercialesToTable(filtrados);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupo = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblComercial = new javax.swing.JTable();
        btnListar = new javax.swing.JButton();
        rbtnTodos = new javax.swing.JRadioButton();
        rbtnActivos = new javax.swing.JRadioButton();
        rbtnInactivos = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listado Predio Comercial");

        tblComercial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Propietario", "Direccion", "Fecha Creacion", "Estado Cuenta", "Estrato", "Consumo", "Tipo Comercio", "Representante legal", "Impuesto", "Licenecia Comercial", "Valor Factura"
            }
        ));
        jScrollPane1.setViewportView(tblComercial);

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        rbtnTodos.setText("Todos");

        rbtnActivos.setText("Activos");

        rbtnInactivos.setText("Inactivos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(rbtnTodos)
                        .addGap(29, 29, 29)
                        .addComponent(rbtnActivos)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnInactivos)
                        .addGap(613, 613, 613)
                        .addComponent(btnListar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListar)
                    .addComponent(rbtnTodos)
                    .addComponent(rbtnActivos)
                    .addComponent(rbtnInactivos))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed

        listarTodos();
    }//GEN-LAST:event_btnListarActionPerformed

    private void setComercialesToTable(List<Predio> predios) {

        DefaultTableModel model = (DefaultTableModel) tblComercial.getModel();
        model.setRowCount(0);
        for (Predio pre : predios) {
            if (pre instanceof Comercial) {
                Comercial comercial = (Comercial) pre;
                Object[] row = {
                    comercial.getId(),
                    comercial.getPropietario(),
                    comercial.getDireccion(),
                    comercial.getFechaRegistro(),
                    comercial.getEstadoCuenta(),
                    comercial.getEstrato(),
                    comercial.getConsumo(),
                    comercial.getTipoComercio(),
                    comercial.getRepresentanteLegal(),
                    comercial.getImpuesto(),
                    comercial.getLicenciaComercial() != null ? comercial.getLicenciaComercial().getNumeroLicencia() : "No tiene",
                    comercial.calcularPago()
                };
                model.addRow(row);
            }
        }
        model.fireTableDataChanged();  // Llamarlo solo una vez

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGrupo;
    private javax.swing.JButton btnListar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtnActivos;
    private javax.swing.JRadioButton rbtnInactivos;
    private javax.swing.JRadioButton rbtnTodos;
    private javax.swing.JTable tblComercial;
    // End of variables declaration//GEN-END:variables

}
