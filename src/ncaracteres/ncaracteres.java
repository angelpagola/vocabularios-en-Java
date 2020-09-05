/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ncaracteres;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author ANGEL
 */
public class ncaracteres extends javax.swing.JFrame {

    /**
     * Creates new form ncaracteres
     */
    public ncaracteres() {
        initComponents();
        this.setLocationRelativeTo(null);
        txtvocal.setVisible(false);
        lbvocal.setVisible(false);
        btn2.setVisible(false);
        cbo.setVisible(false);
        alertaOculto();
    }

    public void alertaOculto() {
        lbas.setVisible(false);
        lbsms.setText(null);
    }

    public void alertaVisibleError(String sms) {
        lbas.setVisible(true);
        lbas.setForeground(Color.red);
        lbsms.setForeground(Color.red);
        lbsms.setText(sms);
    }

    public void alertaVisibleSuccess(String sms) {
        lbas.setVisible(true);
        lbas.setForeground(Color.green);
        lbsms.setForeground(Color.green);
        lbsms.setText(sms);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbnum = new javax.swing.JLabel();
        txtnum = new javax.swing.JTextField();
        lbvocal = new javax.swing.JLabel();
        txtvocal = new javax.swing.JTextField();
        cbo = new javax.swing.JComboBox<>();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        lbsms = new javax.swing.JLabel();
        lbas = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbnum.setBackground(new java.awt.Color(0, 0, 0));
        lbnum.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbnum.setText("Longitud:");
        jPanel1.add(lbnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 100, 30));

        txtnum.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtnum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumActionPerformed(evt);
            }
        });
        jPanel1.add(txtnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 150, 30));

        lbvocal.setBackground(new java.awt.Color(0, 0, 0));
        lbvocal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbvocal.setText("Vocal:");
        jPanel1.add(lbvocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 100, 30));

        txtvocal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtvocal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtvocal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtvocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvocalActionPerformed(evt);
            }
        });
        jPanel1.add(txtvocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 132, 30));

        cbo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboActionPerformed(evt);
            }
        });
        jPanel1.add(cbo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 20, 30));

        btn1.setBackground(new java.awt.Color(255, 153, 51));
        btn1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("Longitud");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 100, 30));

        btn2.setBackground(new java.awt.Color(0, 102, 255));
        btn2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("Agregar");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 100, 30));

        lbsms.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbsms.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(lbsms, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 300, 30));

        lbas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbas.setForeground(new java.awt.Color(204, 0, 0));
        lbas.setText("*");
        jPanel1.add(lbas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Volver ->");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 100, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumActionPerformed
    int num = 0;
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        num = Integer.parseInt(txtnum.getText());
        alertaOculto();
        if (num > 0 && num <= 6) {
            txtnum.setVisible(false);
            lbnum.setVisible(false);
            btn1.setVisible(false);
            txtvocal.setVisible(true);
            lbvocal.setVisible(true);
            btn2.setVisible(true);
            txtvocal.grabFocus();
            cbo.setVisible(true);
            alertaOculto();
            alertaVisibleSuccess("Correcto");
        } else {
            txtnum.grabFocus();
            txtnum.selectAll();
            alertaVisibleError("La longitud máxima es 6 y mínima 1");
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void txtvocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvocalActionPerformed
    String vocal = "";
    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        vocal = txtvocal.getText();
        alertaOculto();
        if (vocal.length() > 1) {
            txtvocal.grabFocus();
            txtvocal.selectAll();
            lbas.setVisible(true);
            alertaVisibleError("Solo se permiten una vocal");
        } else {
            alertaOculto();
            int contCbo = cbo.getItemCount();
            if (contCbo < num) {
                if (esVocal(vocal)) {
                    if (!buscarVocal(vocal, cbo)) {
                        cbo.addItem(vocal);
                        txtvocal.grabFocus();
                        txtvocal.setText(null);

                        alertaVisibleSuccess("Vocal agregado, te quedan "+((num-1)-contCbo)+" intentos");
                    } else {
                        txtvocal.grabFocus();
                        txtvocal.selectAll();
                        alertaVisibleError("El vocal ya fue agregado!");
                    }
                }else{
                alertaVisibleError("Solo se admite una vocal");
                }
            } else {
                alertaVisibleError("Ya completaste el numero de vocales");
            }

        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void cboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        txtvocal.setVisible(false);
        lbvocal.setVisible(false);
        cbo.setVisible(false);
        btn2.setVisible(false);
        txtnum.setVisible(true);
        lbnum.setVisible(true);
        btn1.setVisible(true);
        cbo.removeAllItems();
        alertaOculto();
        txtnum.setText(null);
        txtvocal.setText(null);

    }//GEN-LAST:event_jLabel3MouseClicked
    public boolean esVocal(String vocal) {
        if (vocal.equalsIgnoreCase("a") || vocal.equalsIgnoreCase("e")
                || vocal.equalsIgnoreCase("i") || vocal.equalsIgnoreCase("o") || vocal.equalsIgnoreCase("u")) {
            return true;
        } else {
            return false;
        }
    }
    boolean exists;

    public boolean buscarVocal(String vocal, JComboBox cbo) {
        exists = false;
        for (int index = 0; index < cbo.getItemCount() && !exists; index++) {
            if (vocal.equals(cbo.getItemAt(index))) {
                exists = true;
            }
        }
        return exists;
    }

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
                if ("window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ncaracteres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ncaracteres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ncaracteres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ncaracteres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ncaracteres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JComboBox<String> cbo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbas;
    private javax.swing.JLabel lbnum;
    private javax.swing.JLabel lbsms;
    private javax.swing.JLabel lbvocal;
    private javax.swing.JTextField txtnum;
    private javax.swing.JTextField txtvocal;
    // End of variables declaration//GEN-END:variables
}
