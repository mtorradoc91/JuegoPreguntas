package vistas;

public class ValidarRespuestaJF extends javax.swing.JFrame {
    
    public ValidarRespuestaJF() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonSalir = new javax.swing.JButton();
        tituloValidacionRespuesta = new javax.swing.JLabel();
        descripcionValidacionRespuesta = new javax.swing.JLabel();
        resultadoRespuesta = new javax.swing.JTextField();
        botonSiguientePregunta = new javax.swing.JButton();
        descripcionPremioAcumulado = new javax.swing.JLabel();
        valorPremioAcumulado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonSalir.setBackground(new java.awt.Color(204, 204, 204));
        botonSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(51, 51, 51));
        botonSalir.setText("x");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        tituloValidacionRespuesta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloValidacionRespuesta.setForeground(new java.awt.Color(102, 102, 102));
        tituloValidacionRespuesta.setText("Validacion de respuesta");

        descripcionValidacionRespuesta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        descripcionValidacionRespuesta.setForeground(new java.awt.Color(102, 102, 102));
        descripcionValidacionRespuesta.setText("La respuesta seleccionada es");

        resultadoRespuesta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        resultadoRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoRespuestaActionPerformed(evt);
            }
        });

        botonSiguientePregunta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonSiguientePregunta.setForeground(new java.awt.Color(51, 51, 51));
        botonSiguientePregunta.setText("Siguiente pregunta");
        botonSiguientePregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguientePreguntaActionPerformed(evt);
            }
        });

        descripcionPremioAcumulado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        descripcionPremioAcumulado.setForeground(new java.awt.Color(102, 102, 102));
        descripcionPremioAcumulado.setText("Premio acumulado: $");

        valorPremioAcumulado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        valorPremioAcumulado.setForeground(new java.awt.Color(204, 204, 204));
        valorPremioAcumulado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorPremioAcumuladoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcionValidacionRespuesta)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tituloValidacionRespuesta)
                        .addGap(53, 53, 53)
                        .addComponent(botonSalir))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonSiguientePregunta)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(resultadoRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(descripcionPremioAcumulado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorPremioAcumulado, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonSalir)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloValidacionRespuesta)
                        .addGap(49, 49, 49)
                        .addComponent(descripcionValidacionRespuesta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultadoRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descripcionPremioAcumulado)
                    .addComponent(valorPremioAcumulado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(botonSiguientePregunta)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSiguientePreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguientePreguntaActionPerformed
        JuegoJF pantallaJuego = new JuegoJF();
        pantallaJuego.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonSiguientePreguntaActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void resultadoRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoRespuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultadoRespuestaActionPerformed

    private void valorPremioAcumuladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorPremioAcumuladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorPremioAcumuladoActionPerformed

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
            java.util.logging.Logger.getLogger(ValidarRespuestaJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ValidarRespuestaJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ValidarRespuestaJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ValidarRespuestaJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ValidarRespuestaJF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonSiguientePregunta;
    private javax.swing.JLabel descripcionPremioAcumulado;
    private javax.swing.JLabel descripcionValidacionRespuesta;
    private javax.swing.JTextField resultadoRespuesta;
    private javax.swing.JLabel tituloValidacionRespuesta;
    private javax.swing.JTextField valorPremioAcumulado;
    // End of variables declaration//GEN-END:variables
}
