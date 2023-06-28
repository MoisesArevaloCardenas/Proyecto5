/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.practica5.ventanas.cantante;

import ec.edu.ups.practica5.controlador.ControladorCantante;

/**
 *
 * @author Usuario
 */
public class VentanaEliminarCantante extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaEliminarCompositor
     */
    public VentanaEliminarCantante(ControladorCantante controladorCantante) {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jlCodigo = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jlEdad = new javax.swing.JLabel();
        jlApellido = new javax.swing.JLabel();
        jlNacionalidad = new javax.swing.JLabel();
        jlSalario = new javax.swing.JLabel();
        jlSalario1 = new javax.swing.JLabel();
        jlSalario2 = new javax.swing.JLabel();
        jlSalario3 = new javax.swing.JLabel();
        jlSalario4 = new javax.swing.JLabel();
        jlSalario5 = new javax.swing.JLabel();
        txtCodigoCantanteEliminar = new javax.swing.JTextField();
        txtNombreCantanteEliminar = new javax.swing.JTextField();
        txtApellidoCantanteEliminar = new javax.swing.JTextField();
        txtEdadCantanteEliminar = new javax.swing.JTextField();
        txtNacionalidadCantanteEliminar = new javax.swing.JTextField();
        txtSalarioCantanteEliminar = new javax.swing.JTextField();
        txtNombreArtisticoCantanteEliminar = new javax.swing.JTextField();
        txtGeneroMusicalCantanteEliminar = new javax.swing.JTextField();
        txtSencillosCantanteEliminar = new javax.swing.JTextField();
        txtConciertosCantanteEliminar = new javax.swing.JTextField();
        txtGirasCantanteEliminar = new javax.swing.JTextField();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Eliminar Cantante");

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Eliminar Cantante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        jPanel6.setForeground(new java.awt.Color(153, 153, 153));

        btnAceptar.setText("Aceptar");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jlCodigo.setText("Código");

        jlNombre.setText("Nombre");

        jlEdad.setText("Edad");

        jlApellido.setText("Apellido");

        jlNacionalidad.setText("Nacionalidad");

        jlSalario.setText("Salario");

        jlSalario1.setText("Nombre Artístico");

        jlSalario2.setText("Genero Musical");

        jlSalario3.setText("Número de sencillos");

        jlSalario4.setText("Número de conciertos");

        jlSalario5.setText("Número de giras");

        txtCodigoCantanteEliminar.setToolTipText("Ingrese las cancionesTop100Billboard");
        txtCodigoCantanteEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoCantanteEliminarActionPerformed(evt);
            }
        });

        txtNombreCantanteEliminar.setToolTipText("Ingrese las cancionesTop100Billboard");
        txtNombreCantanteEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCantanteEliminarActionPerformed(evt);
            }
        });

        txtApellidoCantanteEliminar.setToolTipText("Ingrese las cancionesTop100Billboard");
        txtApellidoCantanteEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoCantanteEliminarActionPerformed(evt);
            }
        });

        txtEdadCantanteEliminar.setToolTipText("Ingrese las cancionesTop100Billboard");
        txtEdadCantanteEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadCantanteEliminarActionPerformed(evt);
            }
        });

        txtNacionalidadCantanteEliminar.setToolTipText("Ingrese las cancionesTop100Billboard");
        txtNacionalidadCantanteEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNacionalidadCantanteEliminarActionPerformed(evt);
            }
        });

        txtSalarioCantanteEliminar.setToolTipText("Ingrese las cancionesTop100Billboard");
        txtSalarioCantanteEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioCantanteEliminarActionPerformed(evt);
            }
        });

        txtNombreArtisticoCantanteEliminar.setToolTipText("Ingrese las cancionesTop100Billboard");
        txtNombreArtisticoCantanteEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreArtisticoCantanteEliminarActionPerformed(evt);
            }
        });

        txtGeneroMusicalCantanteEliminar.setToolTipText("Ingrese las cancionesTop100Billboard");
        txtGeneroMusicalCantanteEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeneroMusicalCantanteEliminarActionPerformed(evt);
            }
        });

        txtSencillosCantanteEliminar.setToolTipText("Ingrese las cancionesTop100Billboard");
        txtSencillosCantanteEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSencillosCantanteEliminarActionPerformed(evt);
            }
        });

        txtConciertosCantanteEliminar.setToolTipText("Ingrese las cancionesTop100Billboard");
        txtConciertosCantanteEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConciertosCantanteEliminarActionPerformed(evt);
            }
        });

        txtGirasCantanteEliminar.setToolTipText("Ingrese las cancionesTop100Billboard");
        txtGirasCantanteEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGirasCantanteEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnAceptar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlCodigo)
                            .addComponent(jlNombre)
                            .addComponent(jlApellido)
                            .addComponent(jlEdad)
                            .addComponent(jlNacionalidad)
                            .addComponent(jlSalario)
                            .addComponent(jlSalario1)
                            .addComponent(jlSalario2)
                            .addComponent(jlSalario3)
                            .addComponent(jlSalario4)
                            .addComponent(jlSalario5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNacionalidadCantanteEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEdadCantanteEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtApellidoCantanteEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombreCantanteEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCodigoCantanteEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtGirasCantanteEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConciertosCantanteEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSencillosCantanteEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGeneroMusicalCantanteEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreArtisticoCantanteEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSalarioCantanteEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSalarioCantanteEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlSalario1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreArtisticoCantanteEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlSalario2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGeneroMusicalCantanteEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlSalario3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSencillosCantanteEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlSalario4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConciertosCantanteEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtCodigoCantanteEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreCantanteEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellidoCantanteEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEdadCantanteEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNacionalidadCantanteEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSalario5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGirasCantanteEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtCodigoCantanteEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoCantanteEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoCantanteEliminarActionPerformed

    private void txtNombreCantanteEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCantanteEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCantanteEliminarActionPerformed

    private void txtApellidoCantanteEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoCantanteEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoCantanteEliminarActionPerformed

    private void txtEdadCantanteEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadCantanteEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadCantanteEliminarActionPerformed

    private void txtNacionalidadCantanteEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNacionalidadCantanteEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNacionalidadCantanteEliminarActionPerformed

    private void txtSalarioCantanteEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioCantanteEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioCantanteEliminarActionPerformed

    private void txtNombreArtisticoCantanteEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreArtisticoCantanteEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreArtisticoCantanteEliminarActionPerformed

    private void txtGeneroMusicalCantanteEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeneroMusicalCantanteEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeneroMusicalCantanteEliminarActionPerformed

    private void txtSencillosCantanteEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSencillosCantanteEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSencillosCantanteEliminarActionPerformed

    private void txtConciertosCantanteEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConciertosCantanteEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConciertosCantanteEliminarActionPerformed

    private void txtGirasCantanteEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGirasCantanteEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGirasCantanteEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlEdad;
    private javax.swing.JLabel jlNacionalidad;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlSalario;
    private javax.swing.JLabel jlSalario1;
    private javax.swing.JLabel jlSalario2;
    private javax.swing.JLabel jlSalario3;
    private javax.swing.JLabel jlSalario4;
    private javax.swing.JLabel jlSalario5;
    private javax.swing.JTextField txtApellidoCantanteEliminar;
    private javax.swing.JTextField txtCodigoCantanteEliminar;
    private javax.swing.JTextField txtConciertosCantanteEliminar;
    private javax.swing.JTextField txtEdadCantanteEliminar;
    private javax.swing.JTextField txtGeneroMusicalCantanteEliminar;
    private javax.swing.JTextField txtGirasCantanteEliminar;
    private javax.swing.JTextField txtNacionalidadCantanteEliminar;
    private javax.swing.JTextField txtNombreArtisticoCantanteEliminar;
    private javax.swing.JTextField txtNombreCantanteEliminar;
    private javax.swing.JTextField txtSalarioCantanteEliminar;
    private javax.swing.JTextField txtSencillosCantanteEliminar;
    // End of variables declaration//GEN-END:variables
}
