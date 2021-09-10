package Aplicación;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class AplicaAlumno extends javax.swing.JFrame {

    private final int limite = 2;
    CAlumno a1 = new CAlumno();

    public AplicaAlumno() {
        initComponents();
        formulario();
        setIconImage(new ImageIcon(getClass().getResource("/IMAGENES/usuario.png")).getImage());
    }

    private void formulario() {
        this.setTitle("PROMEDIO NOTAS");
        this.getContentPane().setBackground(new Color(255, 255, 255));
        this.pnlOpciones.setBackground(new Color(255, 255, 255));
        this.setLocationRelativeTo(this);
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(null);
        pnlNotas.setOpaque(false);
        this.txtNombre.requestFocus();
    }

    private void borrar() {
        txtNombre.setText("");
        txtNota1.setText("");
        txtNota2.setText("");
        txtNota3.setText("");
        txtSalida.setText("");
        txtNombre.requestFocus();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSalida = new javax.swing.JTextArea();
        pnlNotas = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNota1 = new javax.swing.JTextField();
        txtNota2 = new javax.swing.JTextField();
        txtNota3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pnlOpciones = new javax.swing.JPanel();
        btnCalcular = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtSalida.setColumns(20);
        txtSalida.setRows(5);
        jScrollPane1.setViewportView(txtSalida);

        pnlNotas.setBorder(javax.swing.BorderFactory.createTitledBorder("Notas:"));

        jLabel3.setText("Nota de Practica:");

        jLabel4.setText("Primer Parcial :");

        jLabel5.setText("Segundo Parcial:");

        txtNota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNota1ActionPerformed(evt);
            }
        });
        txtNota1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNota1KeyTyped(evt);
            }
        });

        txtNota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNota2ActionPerformed(evt);
            }
        });
        txtNota2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNota2KeyTyped(evt);
            }
        });

        txtNota3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNota3KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlNotasLayout = new javax.swing.GroupLayout(pnlNotas);
        pnlNotas.setLayout(pnlNotasLayout);
        pnlNotasLayout.setHorizontalGroup(
            pnlNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNotasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(pnlNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNota1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(txtNota2)
                    .addComponent(txtNota3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlNotasLayout.setVerticalGroup(
            pnlNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNotasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Promedio de notas");

        btnCalcular.setBackground(new java.awt.Color(0, 0, 153));
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/calcular.png"))); // NOI18N
        btnCalcular.setText("Registrar");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(0, 0, 153));
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/nuevo.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(0, 0, 153));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlOpcionesLayout = new javax.swing.GroupLayout(pnlOpciones);
        pnlOpciones.setLayout(pnlOpcionesLayout);
        pnlOpcionesLayout.setHorizontalGroup(
            pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        pnlOpcionesLayout.setVerticalGroup(
            pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcionesLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(110, 110, 110))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(45, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlNotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlNotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtNota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNota1ActionPerformed

    }//GEN-LAST:event_txtNota1ActionPerformed

    private void txtNota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNota2ActionPerformed

    }//GEN-LAST:event_txtNota2ActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double prom;
        a1.setNombre(txtNombre.getText());
        a1.setNota1(Integer.parseInt(txtNota1.getText()));
        a1.setNota2(Integer.parseInt(txtNota2.getText()));
        a1.setNota3(Integer.parseInt(txtNota3.getText()));
        
        prom = a1.promedio();

        txtSalida.setText("\tResultados\n");
        txtSalida.append("\t=========\n");
        txtSalida.append("Nombre: ");
        txtSalida.append("\t" + a1.getNombre() + "\n");
        txtSalida.append("Notas : ");
        txtSalida.append("\t" + a1.getNota1() + ",  ");
        txtSalida.append(a1.getNota2() + ", ");
        txtSalida.append(a1.getNota3() + "\n");
        txtSalida.append("Promedio :");
        txtSalida.append("\t" + String.valueOf(prom) + "\n");

    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtNota1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNota1KeyTyped

        char car = evt.getKeyChar();
        if (car < '0' || car > '9') 
            evt.consume();
        
        if (txtNota1.getText().length() == limite) 
            evt.consume();
        


    }//GEN-LAST:event_txtNota1KeyTyped

    private void txtNota2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNota2KeyTyped
        char car = evt.getKeyChar();
        if (car < '0' || car > '9') 
            evt.consume();
        
        if (txtNota2.getText().length() == limite) 
            evt.consume();
        
    }//GEN-LAST:event_txtNota2KeyTyped

    private void txtNota3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNota3KeyTyped

        char car = evt.getKeyChar();
        if (car < '0' || car > '9') 
            evt.consume();
        
        if (txtNota3.getText().length() == limite) 
            evt.consume();
        


    }//GEN-LAST:event_txtNota3KeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped

        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'z') && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        borrar();
    }//GEN-LAST:event_btnNuevoActionPerformed

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
            java.util.logging.Logger.getLogger(AplicaAlumno.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplicaAlumno.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplicaAlumno.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplicaAlumno.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplicaAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlNotas;
    private javax.swing.JPanel pnlOpciones;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNota1;
    private javax.swing.JTextField txtNota2;
    private javax.swing.JTextField txtNota3;
    private javax.swing.JTextArea txtSalida;
    // End of variables declaration//GEN-END:variables
}
