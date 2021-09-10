package clases;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Problema1 extends javax.swing.JFrame {

    Cuadrado cua = new Cuadrado();

    public Problema1() {
        initComponents();
        formulario();
        setIconImage(new ImageIcon(getClass().getResource("/IMAGENES/usuario.png")).getImage());
    }

    private void formulario() {
        this.setTitle("AREA DE UN CUADRADO");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setSize(new Dimension(330, 160));
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(255, 255, 255));
        this.PanelIngreso.setBackground(new Color(255, 255, 255));
        this.PanelOperaciones.setBackground(new Color(255, 255, 255));
    }

    private void valIniciales() {
        PanelIngreso.setVisible(true);
        PanelOperaciones.setVisible(true);
        PanelResultado.setVisible(false);
        btnCalcular.setEnabled(false);
        btnNuevo.setEnabled(false);
        btnSalir.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelResultado = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        PanelIngreso = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtLado = new javax.swing.JTextField();
        PanelOperaciones = new javax.swing.JPanel();
        btnCalcular = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("AREA:");

        javax.swing.GroupLayout PanelResultadoLayout = new javax.swing.GroupLayout(PanelResultado);
        PanelResultado.setLayout(PanelResultadoLayout);
        PanelResultadoLayout.setHorizontalGroup(
            PanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelResultadoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(txtArea, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        PanelResultadoLayout.setVerticalGroup(
            PanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelResultadoLayout.createSequentialGroup()
                .addGroup(PanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jLabel1.setText("INGRESE LADO:");

        txtLado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLadoActionPerformed(evt);
            }
        });
        txtLado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLadoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLadoKeyTyped(evt);
            }
        });

        btnCalcular.setBackground(new java.awt.Color(0, 102, 255));
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(0, 0, 153));
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 0, 0));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelOperacionesLayout = new javax.swing.GroupLayout(PanelOperaciones);
        PanelOperaciones.setLayout(PanelOperacionesLayout);
        PanelOperacionesLayout.setHorizontalGroup(
            PanelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOperacionesLayout.createSequentialGroup()
                .addComponent(btnCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNuevo)
                .addGap(14, 14, 14)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelOperacionesLayout.setVerticalGroup(
            PanelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnCalcular)
                .addComponent(btnNuevo)
                .addComponent(btnSalir))
        );

        javax.swing.GroupLayout PanelIngresoLayout = new javax.swing.GroupLayout(PanelIngreso);
        PanelIngreso.setLayout(PanelIngresoLayout);
        PanelIngresoLayout.setHorizontalGroup(
            PanelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIngresoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtLado, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelIngresoLayout.createSequentialGroup()
                .addComponent(PanelOperaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelIngresoLayout.setVerticalGroup(
            PanelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelIngresoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLadoActionPerformed
        btnCalcular.doClick();
        txtLado.setText("");
        txtLado.requestFocus();
        btnCalcular.setEnabled(false);
        btnNuevo.setEnabled(true);
    }//GEN-LAST:event_txtLadoActionPerformed


    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        txtLado.setText("");
        txtArea.setText("");
        this.setSize(new Dimension(330, 170));
        PanelResultado.setVisible(false);
        txtLado.requestFocus();
        btnNuevo.setEnabled(false);
        btnCalcular.setEnabled(false);
    }//GEN-LAST:event_btnNuevoActionPerformed


    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int r = JOptionPane.showOptionDialog(this, "Estas Seguro de salir...?", "Area Cuadrado", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Si Salgo", "No Salgo"}, "No Salgo");
        if (r == 0) {
            System.exit(0);
        }


    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtLadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLadoKeyTyped
        btnCalcular.setEnabled(true);
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtLadoKeyTyped

    private void formWindowActivated(java.awt.event.WindowEvent evt) {
        valIniciales();
    }


    private void txtLadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLadoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnCalcular.doClick();
        }
    }//GEN-LAST:event_txtLadoKeyPressed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        float lado;
        if (txtLado.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "INGRESE UN VALOR");
        } else {
            lado = Float.parseFloat(txtLado.getText().trim());
            cua.setLado(lado);
            cua.hallarArea();
            txtArea.setText(String.valueOf(cua.mostrarArea()));
            this.setSize(new Dimension(330, 220));
            PanelResultado.setVisible(true);
            btnNuevo.setEnabled(true);
            this.PanelResultado.setBackground(new Color(255, 255, 255));
        }
        txtLado.requestFocus();
        btnCalcular.setEnabled(false);
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Problema1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Problema1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Problema1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Problema1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Problema1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelIngreso;
    private javax.swing.JPanel PanelOperaciones;
    private javax.swing.JPanel PanelResultado;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtLado;
    // End of variables declaration//GEN-END:variables
}
