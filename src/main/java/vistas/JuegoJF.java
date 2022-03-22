package vistas;

public class JuegoJF extends javax.swing.JFrame {
    
    public JuegoJF() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloHistorial = new javax.swing.JLabel();
        descripcionPregunta = new javax.swing.JLabel();
        numeroPregunta = new javax.swing.JTextField();
        descripcionPremio = new javax.swing.JLabel();
        valorPremio = new javax.swing.JTextField();
        descripcionAcumulado = new javax.swing.JLabel();
        valorAcumulado = new javax.swing.JTextField();
        botonRetiroVoluntario = new javax.swing.JButton();
        opcionRespuestaUno = new javax.swing.JRadioButton();
        textoPregunta = new javax.swing.JTextField();
        opcionRespuestaDos = new javax.swing.JRadioButton();
        opcionRespuesta3 = new javax.swing.JRadioButton();
        opcionRespuestaCuatro = new javax.swing.JRadioButton();
        botonValidarRepuesta = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloHistorial.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloHistorial.setForeground(new java.awt.Color(102, 102, 102));
        tituloHistorial.setText("Juego de preguntas");

        descripcionPregunta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        descripcionPregunta.setForeground(new java.awt.Color(102, 102, 102));
        descripcionPregunta.setText("Pregunta No. ");

        numeroPregunta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        descripcionPremio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        descripcionPremio.setForeground(new java.awt.Color(102, 102, 102));
        descripcionPremio.setText("por $");

        valorPremio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        descripcionAcumulado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        descripcionAcumulado.setForeground(new java.awt.Color(102, 102, 102));
        descripcionAcumulado.setText("Acumulado:");

        botonRetiroVoluntario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonRetiroVoluntario.setForeground(new java.awt.Color(51, 51, 51));
        botonRetiroVoluntario.setText("Retiro voluntario");
        botonRetiroVoluntario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRetiroVoluntarioActionPerformed(evt);
            }
        });

        opcionRespuestaUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionRespuestaUnoActionPerformed(evt);
            }
        });

        opcionRespuestaDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionRespuestaDosActionPerformed(evt);
            }
        });

        opcionRespuesta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionRespuesta3ActionPerformed(evt);
            }
        });

        opcionRespuestaCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionRespuestaCuatroActionPerformed(evt);
            }
        });

        botonValidarRepuesta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonValidarRepuesta.setText("Validar respuesta");
        botonValidarRepuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonValidarRepuestaActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(descripcionAcumulado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorAcumulado, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(descripcionPregunta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numeroPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(descripcionPremio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorPremio, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(botonRetiroVoluntario, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(textoPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(opcionRespuestaCuatro, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                    .addComponent(opcionRespuesta3, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                    .addComponent(opcionRespuestaDos, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                    .addComponent(opcionRespuestaUno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonValidarRepuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(tituloHistorial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonSalir))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloHistorial)
                    .addComponent(botonSalir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descripcionPregunta)
                    .addComponent(numeroPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descripcionPremio)
                    .addComponent(valorPremio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(textoPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionRespuestaUno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opcionRespuestaDos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opcionRespuesta3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opcionRespuestaCuatro)
                .addGap(18, 18, 18)
                .addComponent(botonValidarRepuesta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descripcionAcumulado)
                    .addComponent(valorAcumulado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRetiroVoluntario))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcionRespuestaUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionRespuestaUnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionRespuestaUnoActionPerformed

    private void opcionRespuestaDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionRespuestaDosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionRespuestaDosActionPerformed

    private void opcionRespuesta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionRespuesta3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionRespuesta3ActionPerformed

    private void opcionRespuestaCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionRespuestaCuatroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionRespuestaCuatroActionPerformed

    private void botonValidarRepuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonValidarRepuestaActionPerformed
        ValidarRespuestaJF pantallaValidarRespuesta = new ValidarRespuestaJF();
        pantallaValidarRespuesta.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonValidarRepuestaActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonRetiroVoluntarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRetiroVoluntarioActionPerformed
        dispose();
    }//GEN-LAST:event_botonRetiroVoluntarioActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JuegoJF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRetiroVoluntario;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonValidarRepuesta;
    private javax.swing.JLabel descripcionAcumulado;
    private javax.swing.JLabel descripcionPregunta;
    private javax.swing.JLabel descripcionPremio;
    private javax.swing.JTextField numeroPregunta;
    private javax.swing.JRadioButton opcionRespuesta3;
    private javax.swing.JRadioButton opcionRespuestaCuatro;
    private javax.swing.JRadioButton opcionRespuestaDos;
    private javax.swing.JRadioButton opcionRespuestaUno;
    private javax.swing.JTextField textoPregunta;
    private javax.swing.JLabel tituloHistorial;
    private javax.swing.JTextField valorAcumulado;
    private javax.swing.JTextField valorPremio;
    // End of variables declaration//GEN-END:variables
}
