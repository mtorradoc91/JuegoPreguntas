package vistas;

public class NuevoJugadorJF extends javax.swing.JFrame {
    
    public NuevoJugadorJF() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloRegistroJugador = new javax.swing.JLabel();
        descripcionNuevoJugador = new javax.swing.JLabel();
        nombreJugador = new javax.swing.JTextField();
        botonIniciarJuego = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloRegistroJugador.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloRegistroJugador.setForeground(new java.awt.Color(102, 102, 102));
        tituloRegistroJugador.setText("Registro de jugador");

        descripcionNuevoJugador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        descripcionNuevoJugador.setForeground(new java.awt.Color(102, 102, 102));
        descripcionNuevoJugador.setText("Hola, por favor ingresa tu nombre y apellido");

        botonIniciarJuego.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonIniciarJuego.setForeground(new java.awt.Color(51, 51, 51));
        botonIniciarJuego.setText("Iniciar Juego");
        botonIniciarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarJuegoActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(descripcionNuevoJugador))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreJugador)
                            .addComponent(botonIniciarJuego, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(tituloRegistroJugador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonSalir))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloRegistroJugador))
                    .addComponent(botonSalir))
                .addGap(60, 60, 60)
                .addComponent(descripcionNuevoJugador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(botonIniciarJuego)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonIniciarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarJuegoActionPerformed
        JuegoJF pantallaJuego = new JuegoJF();
        pantallaJuego.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonIniciarJuegoActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoJugadorJF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIniciarJuego;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel descripcionNuevoJugador;
    private javax.swing.JTextField nombreJugador;
    private javax.swing.JLabel tituloRegistroJugador;
    // End of variables declaration//GEN-END:variables
}
