
package gFrame;
import gclass.ventanas;
import java.awt.Color;

public class dataProd extends javax.swing.JFrame {
    
    int mouseX, mouseY;
    
    public dataProd() {
        initComponents();
        carBuyACT.setVisible(false);
    }
    
    addCard card = new addCard();
    //ventanas abrir = new ventanas();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMin = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        carBuy = new javax.swing.JLabel();
        carBuyACT = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        Profile = new javax.swing.JLabel();
        disconnectUser = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        searchIcon = new javax.swing.JLabel();
        searchBoar = new javax.swing.JLabel();
        btnBack = new javax.swing.JLabel();
        btnADDCAR = new javax.swing.JLabel();
        btnBUY = new javax.swing.JLabel();
        descr = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
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

        carBuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/carrito.png"))); // NOI18N
        getContentPane().add(carBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 60, -1));

        carBuyACT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/carritoRED.png"))); // NOI18N
        getContentPane().add(carBuyACT, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 70, -1));

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

        txtSearch.setBackground(new java.awt.Color(213, 227, 255));
        txtSearch.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(0, 153, 255));
        txtSearch.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSearch.setBorder(null);
        txtSearch.setOpaque(false);
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 400, 20));

        searchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/searchIcon.png"))); // NOI18N
        searchIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(searchIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 40, 40));

        searchBoar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/searchBoar.png"))); // NOI18N
        getContentPane().add(searchBoar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, 40));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/back.png"))); // NOI18N
        btnBack.setToolTipText("Regresar");
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        btnADDCAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/panelADDCAR.png"))); // NOI18N
        getContentPane().add(btnADDCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 520, -1, -1));

        btnBUY.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/panelBUY.png"))); // NOI18N
        btnBUY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBUYMouseClicked(evt);
            }
        });
        getContentPane().add(btnBUY, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, -1, -1));

        descr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/panelDESC.png"))); // NOI18N
        getContentPane().add(descr, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/logo.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 170, 70));

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

    private void btnBUYMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBUYMouseClicked
        card.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBUYMouseClicked

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
    private javax.swing.JLabel btnADDCAR;
    private javax.swing.JLabel btnBUY;
    private javax.swing.JLabel btnBack;
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnMin;
    private javax.swing.JLabel carBuy;
    private javax.swing.JLabel carBuyACT;
    private javax.swing.JLabel descr;
    private javax.swing.JLabel disconnectUser;
    public javax.swing.JLabel lblUsername;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel searchBoar;
    private javax.swing.JLabel searchIcon;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
