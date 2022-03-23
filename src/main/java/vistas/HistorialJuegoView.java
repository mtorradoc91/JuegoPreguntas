package vistas;

import datos.Conexion;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class HistorialJuegoView extends javax.swing.JFrame {

    public HistorialJuegoView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloHistorial = new javax.swing.JLabel();
        botonMenu = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        scrollPanelTabla = new javax.swing.JScrollPane();
        tablaHitorial = new javax.swing.JTable();
        botonCargarHistorial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloHistorial.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloHistorial.setForeground(new java.awt.Color(102, 102, 102));
        tituloHistorial.setText("Historial de juego");

        botonMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonMenu.setForeground(new java.awt.Color(0, 0, 0));
        botonMenu.setText("Volver a menu principal");
        botonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuActionPerformed(evt);
            }
        });

        botonSalir.setBackground(new java.awt.Color(204, 204, 204));
        botonSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(51, 51, 51));
        botonSalir.setText("x");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        tablaHitorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre del jugador", "Puntaje alcanzado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scrollPanelTabla.setViewportView(tablaHitorial);

        botonCargarHistorial.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonCargarHistorial.setForeground(new java.awt.Color(51, 51, 51));
        botonCargarHistorial.setText("Cargar historial");
        botonCargarHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarHistorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollPanelTabla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 169, Short.MAX_VALUE)
                                .addComponent(botonMenu)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(botonCargarHistorial))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tituloHistorial)
                                .addGap(87, 87, 87)
                                .addComponent(botonSalir))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloHistorial))
                    .addComponent(botonSalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonCargarHistorial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPanelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuActionPerformed
        PrincipalJF pantallaPrincipal = new PrincipalJF();
        pantallaPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonMenuActionPerformed

    private void botonCargarHistorialActionPerformed(ActionEvent evt) {//GEN-FIRST:event_botonCargarHistorialActionPerformed
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            tablaHitorial.setModel(modelo);

            PreparedStatement preparedStatement = null;
            ResultSet resultSet = null;
            Conexion conexion = new Conexion();
            Connection connectionClass = conexion.getConnection();

            String SQL_SELECT_JUGADORES = "SELECT nombre_jugador, puntaje FROM jugador";
            preparedStatement = connectionClass.prepareStatement(SQL_SELECT_JUGADORES);
            resultSet = preparedStatement.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) resultSet.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("Nombre del jugador");
            modelo.addColumn("Puntaje");

            int[] anchos = {200, 50};
            for (int i = 0; i < tablaHitorial.getColumnCount(); i++) {
                tablaHitorial.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }

            while (resultSet.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = resultSet.getObject(i + 1);
                }
                modelo.addRow(filas);
            }

        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(null,"Error mostrando historial: " + exception.getMessage());
        }
    }//GEN-LAST:event_botonCargarHistorialActionPerformed

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
            java.util.logging.Logger.getLogger(HistorialJuegoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistorialJuegoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistorialJuegoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistorialJuegoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistorialJuegoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCargarHistorial;
    private javax.swing.JButton botonMenu;
    private javax.swing.JButton botonSalir;
    private javax.swing.JScrollPane scrollPanelTabla;
    private javax.swing.JTable tablaHitorial;
    private javax.swing.JLabel tituloHistorial;
    // End of variables declaration//GEN-END:variables
}
