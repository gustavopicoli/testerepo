/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class imcJFRAME extends javax.swing.JFrame {

    /**
     * Creates new form imcJFRAME
     */
    public imcJFRAME() {
        initComponents();
    }
    
    float peso, altura, imc;
   
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelIMC = new javax.swing.JPanel();
        PESO = new javax.swing.JLabel();
        ALTURA = new javax.swing.JLabel();
        jTextFieldPeso = new javax.swing.JTextField();
        jTextFieldAltura = new javax.swing.JTextField();
        RESULTADO = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        jResultado = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PESO.setText("PESO");

        ALTURA.setText("ALTURA");

        jTextFieldPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesoActionPerformed(evt);
            }
        });

        RESULTADO.setText("Resultado");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jResultado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelIMCLayout = new javax.swing.GroupLayout(jPanelIMC);
        jPanelIMC.setLayout(jPanelIMCLayout);
        jPanelIMCLayout.setHorizontalGroup(
            jPanelIMCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIMCLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanelIMCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelIMCLayout.createSequentialGroup()
                        .addComponent(btnLimpar)
                        .addGap(108, 108, 108)
                        .addComponent(btnCalcular)
                        .addGap(77, 77, 77))
                    .addGroup(jPanelIMCLayout.createSequentialGroup()
                        .addGroup(jPanelIMCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelIMCLayout.createSequentialGroup()
                                .addComponent(RESULTADO)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelIMCLayout.createSequentialGroup()
                                .addGroup(jPanelIMCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ALTURA)
                                    .addComponent(PESO))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelIMCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldPeso)
                                    .addComponent(jTextFieldAltura, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelIMCLayout.setVerticalGroup(
            jPanelIMCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIMCLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanelIMCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PESO)
                    .addComponent(jTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanelIMCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ALTURA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanelIMCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular)
                    .addComponent(btnLimpar))
                .addGap(20, 20, 20)
                .addGroup(jPanelIMCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RESULTADO)
                    .addComponent(jResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelIMC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelIMC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesoActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        peso = Float.parseFloat(jTextFieldPeso.getText());
        altura = Float.parseFloat(jTextFieldAltura.getText());
        
        imc = peso / (altura * altura);
        jResultado.setText(String.valueOf(imc));
        
        if (imc >= 26) {
            JOptionPane.showMessageDialog(null, "Sobrepeso");
            
        }
        if (imc < 26) {
            JOptionPane.showMessageDialog(null, "Saúdavel");
        }
        
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        jTextFieldPeso.setText("");
        jTextFieldAltura.setText("");
        jResultado.setText("");
        
    }//GEN-LAST:event_btnLimparActionPerformed

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
            java.util.logging.Logger.getLogger(imcJFRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(imcJFRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(imcJFRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(imcJFRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new imcJFRAME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ALTURA;
    private javax.swing.JLabel PESO;
    private javax.swing.JLabel RESULTADO;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JPanel jPanelIMC;
    private javax.swing.JLabel jResultado;
    private javax.swing.JTextField jTextFieldAltura;
    private javax.swing.JTextField jTextFieldPeso;
    // End of variables declaration//GEN-END:variables
}
