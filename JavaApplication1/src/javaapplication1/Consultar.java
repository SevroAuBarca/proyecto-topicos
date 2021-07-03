/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class Consultar extends javax.swing.JFrame {

    /**
     * Creates new form Consultar
     */
    public Consultar() {
        initComponents();
        
    }

    DefaultTableModel modelo;

    public void crear_modelo(String dat) {
        String dato = "";
        if (dat.equals("Alumno")) {
            dato = "Carrera";
        } else {
            dato = "Grado";
        }

        modelo = (new DefaultTableModel(
                null, new String[]{
                    "No.Control", "Nombre",
                    "Apellido Paterno", "Apellido Materno",
                    "odigo Postal", "Sexo",
                    "Edad", "Telefono",
                    "Direccion", dato
                }) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class,
                java.lang.String.class, java.lang.String.class,
                java.lang.String.class, java.lang.String.class,
                java.lang.String.class, java.lang.String.class,
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int colIndex) {
                return canEdit[colIndex];
            }
        });
        jTable1.setModel(modelo);
    }

    private void consultar(String dat) throws SQLException {
        String dato = "";
        if (dat.equals("Alumno")) {
            dato = "Carrera";
        } else {
            dato = "Grado_estudios";
        }
        int i = 0;
        Object ob[] = null;
        conexion db = new conexion();
        db.conexion();
        String SQL = "SELECT * FROM " + dat + "";
        db.rs = db.stmt.executeQuery(SQL);
        modelo.setRowCount(0);
        while (db.rs.next()) {
            modelo.addRow(ob);
            modelo.setValueAt(db.rs.getInt("ncontrol"), i, 0);
            modelo.setValueAt(db.rs.getString("nombre"), i, 1);
            modelo.setValueAt(db.rs.getString("apellido_p"), i, 2);
            modelo.setValueAt(db.rs.getString("apellido_m"), i, 3);
            modelo.setValueAt(db.rs.getInt("edad"), i, 4);
            modelo.setValueAt(db.rs.getString("sexo"), i, 5);
            modelo.setValueAt(db.rs.getInt("codigo_post"), i, 6);
            modelo.setValueAt(db.rs.getInt("telefono"), i, 7);
            modelo.setValueAt(db.rs.getString("direccion"), i, 8);
            modelo.setValueAt(db.rs.getString(dato), i, 9);
            i++;
        }
        db.Desconectar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("No.control");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Alumno", "Profesor" }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String dat = jComboBox1.getSelectedItem().toString();
        crear_modelo(dat);
        if (dat.equals("Seleccionar")) {
            JOptionPane.showMessageDialog(null, "Error, Seleccione si es alumno o profesor");
        } else {
            try {
                consultar(dat);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String ncontrol = jTable1.getValueAt(jTable1.getSelectedRow(),0).toString();
        String name = jTable1.getValueAt(jTable1.getSelectedRow(),1).toString();
        String lastP = jTable1.getValueAt(jTable1.getSelectedRow(),2).toString();
        String lastM = jTable1.getValueAt(jTable1.getSelectedRow(),3).toString();
        String edad = jTable1.getValueAt(jTable1.getSelectedRow(),4).toString();
        String sexo = jTable1.getValueAt(jTable1.getSelectedRow(),5).toString();
        String cod_post = jTable1.getValueAt(jTable1.getSelectedRow(),6).toString();
        String telefono = jTable1.getValueAt(jTable1.getSelectedRow(),7).toString();
        String direccion = jTable1.getValueAt(jTable1.getSelectedRow(),8).toString();
        String carrera_o_Grado = jTable1.getValueAt(jTable1.getSelectedRow(),9).toString();
       
        String dat = jComboBox1.getSelectedItem().toString();
        Editar act = new Editar(null, true , dat);
        act.txtNcontrol.setText(ncontrol);
        act.txtNombre.setText(name);
        act.txtApaterno.setText(lastP);
        act.txtAmaterno.setText(lastM);
        act.txtEdad.setText(edad);
        act.txtSexo.setText(sexo);
        act.txtPostal.setText(cod_post);
        act.txtTelefono.setText(telefono);
        act.txtDireccion.setText(direccion);
        act.txtCarreraOgrado.setText(carrera_o_Grado);
        act.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String dat = jComboBox1.getSelectedItem().toString();
        String ncontrol = jTable1.getValueAt(jTable1.getSelectedRow(),0).toString();
        new Eliminar(null, true , Integer.parseInt(ncontrol),dat).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
