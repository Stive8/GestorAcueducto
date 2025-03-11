package com.acueducto.view.residencial;

import com.acueducto.exceptions.PredioException;
import com.acueducto.model.Residencial;
import com.acueducto.service.IServicioAcueducto;
import com.acueducto.service.ServicioAcueducto;
import com.acueducto.view.ICambiable;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GUICrearResidencial extends javax.swing.JFrame {

    private ServicioAcueducto servicioAcueducto;

    public GUICrearResidencial(ServicioAcueducto servicioAcueducto) {
        this.servicioAcueducto = servicioAcueducto;
        initComponents();
        setLocationRelativeTo(this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEstado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtConsumo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTipoVivienda = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtPropietario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crear Predio Residencial");

        txtEstado.setEditable(false);
        txtEstado.setText("AC");
        txtEstado.setToolTipText("");

        jLabel5.setText("Estado Cuenta");

        jLabel6.setText("Estrato");

        jLabel7.setText("Consumo (m3)");

        jLabel8.setText("Subsidio");

        jLabel10.setText("Tipo Vivienda");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion", "1", "2", "3", "4", "5", "6" }));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Crear Predio Residencial");

        jLabel2.setText("Propietario");

        jLabel3.setText("Direccion");

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Una Opcion", "1", "2", "3", "No Aplica" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCrear)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtEstado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtConsumo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTipoVivienda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtPropietario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jComboBox1, jComboBox2, txtConsumo, txtDireccion, txtEstado, txtTipoVivienda});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel2, jLabel3, jLabel5, jLabel6, jLabel7, jLabel8});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTipoVivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCrear)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jComboBox1, jComboBox2, jLabel10, jLabel2, jLabel3, jLabel5, jLabel6, jLabel7, jLabel8, txtConsumo, txtDireccion, txtEstado, txtPropietario, txtTipoVivienda});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed

        try {
            // Obtener valores de los campos
            String propietario = txtPropietario.getText().trim();
            String direccion = txtDireccion.getText().trim();
            String estadoCuenta = txtEstado.getText().trim();
            String tipoVivienda = txtTipoVivienda.getText().trim();

            // Validaciones de campos vacíos
            if (propietario.isEmpty()) {
                JOptionPane.showMessageDialog(this, "El Propietario no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (direccion.isEmpty()) {
                JOptionPane.showMessageDialog(this, "La dirección no puede estar vacía.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (estadoCuenta.isEmpty()) {
                JOptionPane.showMessageDialog(this, "El estado de cuenta no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (tipoVivienda.isEmpty()) {
                JOptionPane.showMessageDialog(this, "El tipo de vivienda no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Validar selección del estrato
            String estratoSeleccionado = jComboBox1.getSelectedItem().toString();
            if (estratoSeleccionado.equalsIgnoreCase("Seleccione una opción")) {
                JOptionPane.showMessageDialog(this, "Debe escoger un estrato válido.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            int estrato = Integer.parseInt(estratoSeleccionado);

            // Validar selección del subsidio
            String subsidioSeleccionado = jComboBox2.getSelectedItem().toString();
            int subsidio = 0; // Valor por defecto si es "No Aplica"
            if (!subsidioSeleccionado.equalsIgnoreCase("No Aplica")) {
                try {
                    subsidio = Integer.parseInt(subsidioSeleccionado);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Debe seleccionar un subsidio válido.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            // Validaciones numéricas (consumo debe ser mayor a 0)
            double consumo = Double.parseDouble(txtConsumo.getText().trim());
            if (consumo <= 0) {
                JOptionPane.showMessageDialog(this, "El consumo debe ser mayor que cero.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Crear objeto Residencial
            Residencial residencial = servicioAcueducto.crearResidencial(subsidio, tipoVivienda, propietario,
                    direccion, LocalDate.now(), estadoCuenta,
                    estrato, consumo);

            servicioAcueducto.adicionarResidencial(residencial);

            // Confirmación de creación exitosa
            JOptionPane.showMessageDialog(this, "Predio Residencial creado exitosamente");

            // Limpiar campos después de la creación
            limpiarCampos();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: Ingrese valores válidos para el Consumo, Subsidio y Estrato.", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnCrearActionPerformed

    public void limpiarCampos() {
        txtTipoVivienda.setText("");
        txtPropietario.setText("");
        txtDireccion.setText("");
        jComboBox1.setSelectedIndex(0);
        txtConsumo.setText("");
        jComboBox2.setSelectedIndex(0);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtConsumo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtPropietario;
    private javax.swing.JTextField txtTipoVivienda;
    // End of variables declaration//GEN-END:variables

}
