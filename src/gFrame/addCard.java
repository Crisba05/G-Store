
package gFrame;
import java.awt.Color;
import gclass.ventanas;
public class addCard extends javax.swing.JFrame {
    
    int mouseX, mouseY;
    
    public addCard() {
        initComponents();
    }

    //ventanas abrir = new ventanas();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMin = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        Profile = new javax.swing.JLabel();
        disconnectUser = new javax.swing.JLabel();
        btnBack = new javax.swing.JLabel();
        lblFV = new javax.swing.JLabel();
        lblCVV = new javax.swing.JLabel();
        lblTarjeta = new javax.swing.JLabel();
        txtFV = new javax.swing.JTextField();
        txtCVV = new javax.swing.JTextField();
        txtNumeroTarj = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        block = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMin.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        btnMin.setForeground(new java.awt.Color(102, 153, 255));
        btnMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMin.setText("-");
        btnMin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinMouseExited(evt);
            }
        });
        getContentPane().add(btnMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 40, 30));

        btnClose.setBackground(new java.awt.Color(0, 102, 255));
        btnClose.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnClose.setForeground(new java.awt.Color(102, 153, 255));
        btnClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnClose.setText("X");
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCloseMouseExited(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 40, 30));

        lblUsername.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("USERNAME");
        getContentPane().add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 40, 100, 30));

        Profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/profile.png"))); // NOI18N
        getContentPane().add(Profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 60, 70));

        disconnectUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/diconectUser.png"))); // NOI18N
        disconnectUser.setToolTipText("disconnect");
        disconnectUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(disconnectUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 70, -1, -1));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/back.png"))); // NOI18N
        btnBack.setToolTipText("Regresar");
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        lblFV.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblFV.setForeground(new java.awt.Color(0, 51, 204));
        lblFV.setText("F. V.");
        getContentPane().add(lblFV, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, -1, -1));

        lblCVV.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblCVV.setForeground(new java.awt.Color(0, 51, 204));
        lblCVV.setText("CVV");
        getContentPane().add(lblCVV, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, -1, -1));

        lblTarjeta.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblTarjeta.setForeground(new java.awt.Color(0, 51, 204));
        lblTarjeta.setText("Numero de Tarjeta");
        getContentPane().add(lblTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));

        txtFV.setBackground(new java.awt.Color(255, 255, 255));
        txtFV.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        txtFV.setForeground(new java.awt.Color(0, 51, 153));
        txtFV.setBorder(null);
        getContentPane().add(txtFV, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 120, 30));

        txtCVV.setBackground(new java.awt.Color(255, 255, 255));
        txtCVV.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        txtCVV.setForeground(new java.awt.Color(0, 51, 153));
        txtCVV.setBorder(null);
        getContentPane().add(txtCVV, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 540, 120, 30));

        txtNumeroTarj.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeroTarj.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        txtNumeroTarj.setForeground(new java.awt.Color(0, 51, 153));
        txtNumeroTarj.setBorder(null);
        getContentPane().add(txtNumeroTarj, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 330, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/card.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 710, 500));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/background2.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        block.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/login/block.png"))); // NOI18N
        block.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                blockMouseDragged(evt);
            }
        });
        block.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                blockMousePressed(evt);
            }
        });
        getContentPane().add(block, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseClicked
        this.setExtendedState(1); //ICONIFIED
    }//GEN-LAST:event_btnMinMouseClicked

    private void btnMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseEntered
        btnMin.setForeground(Color.gray);
    }//GEN-LAST:event_btnMinMouseEntered

    private void btnMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseExited
        btnMin.setForeground(new Color(102,153,255));
    }//GEN-LAST:event_btnMinMouseExited

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseEntered
        btnClose.setForeground(Color.red);
    }//GEN-LAST:event_btnCloseMouseEntered

    private void btnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseExited
        btnClose.setForeground(new Color(102,153,255));
    }//GEN-LAST:event_btnCloseMouseExited

    private void blockMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blockMouseDragged
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();

        this.setLocation(xx - mouseX, yy - mouseY);
    }//GEN-LAST:event_blockMouseDragged

    private void blockMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blockMousePressed
        mouseX = evt.getX();
        mouseX = evt.getY();
    }//GEN-LAST:event_blockMousePressed

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        //abrir.Vmain();
        this.dispose();
    }//GEN-LAST:event_btnBackMouseClicked

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
            java.util.logging.Logger.getLogger(mainStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainStore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Profile;
    private javax.swing.JLabel background;
    private javax.swing.JLabel block;
    private javax.swing.JLabel btnBack;
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnMin;
    private javax.swing.JLabel disconnectUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCVV;
    private javax.swing.JLabel lblFV;
    private javax.swing.JLabel lblTarjeta;
    public javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtCVV;
    private javax.swing.JTextField txtFV;
    private javax.swing.JTextField txtNumeroTarj;
    // End of variables declaration//GEN-END:variables
}
