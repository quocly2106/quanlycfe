/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cfe;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.AdminDao;

/**
 *
 * @author Admin
 */
public class ForgotPasswordFrame extends javax.swing.JFrame {

    int xx, xy;
    Color notEdit = new Color(204, 204, 204);
    Color edit = new Color(255, 255, 255);
    AdminDao dao = new AdminDao();

    public ForgotPasswordFrame() {
        initComponents();
        tfQuestion.setBackground(notEdit);
        tfAnswer.setBackground(notEdit);
        tfNewPassword.setBackground(notEdit);
        tfNewPassword.setEnabled(false);
        tfAnswer.setEditable(false);
        tfQuestion.setEditable(false);
        btnSave.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnForgotPassword = new javax.swing.JPanel();
        lbExit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfQuestion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfAnswer = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        tfNewPassword = new javax.swing.JPasswordField();
        lbHide = new javax.swing.JLabel();
        lbShow = new javax.swing.JLabel();
        lbSearch = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnForgotPassword.setBackground(new java.awt.Color(158, 111, 78));
        pnForgotPassword.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnForgotPasswordMouseDragged(evt);
            }
        });
        pnForgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnForgotPasswordMousePressed(evt);
            }
        });
        pnForgotPassword.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbExit.setFont(new java.awt.Font("Segoe UI", 1, 35)); // NOI18N
        lbExit.setForeground(new java.awt.Color(255, 255, 255));
        lbExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExit.setText("X");
        lbExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbExitMouseClicked(evt);
            }
        });
        pnForgotPassword.add(lbExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 24, 27));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Forgot Password");
        pnForgotPassword.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 39, 371, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username :");
        pnForgotPassword.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 333, -1));

        tfQuestion.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tfQuestion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfQuestionKeyTyped(evt);
            }
        });
        pnForgotPassword.add(tfQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 310, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Security Question :");
        pnForgotPassword.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 333, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("New Password :");
        pnForgotPassword.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 333, 20));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Answer :");
        pnForgotPassword.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 333, -1));

        tfAnswer.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        pnForgotPassword.add(tfAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 310, 40));

        btnSave.setBackground(new java.awt.Color(237, 226, 219));
        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        pnForgotPassword.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 130, 36));

        btnBack.setBackground(new java.awt.Color(237, 226, 219));
        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        pnForgotPassword.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 130, 36));

        tfNewPassword.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        pnForgotPassword.add(tfNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 310, 40));

        lbHide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hide.png"))); // NOI18N
        lbHide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbHideMouseClicked(evt);
            }
        });
        pnForgotPassword.add(lbHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 30, 40));

        lbShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/visible.png"))); // NOI18N
        lbShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbShowMouseClicked(evt);
            }
        });
        pnForgotPassword.add(lbShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, -1, 40));

        lbSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        lbSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbSearchMouseClicked(evt);
            }
        });
        pnForgotPassword.add(lbSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));

        tfUsername.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tfUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfUsernameKeyTyped(evt);
            }
        });
        pnForgotPassword.add(tfUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 310, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnForgotPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnForgotPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseClicked
        setVisible(false);
    }//GEN-LAST:event_lbExitMouseClicked

    private void lbHideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHideMouseClicked
        tfNewPassword.setEchoChar((char) 0);
        lbHide.setVisible(false);
        lbShow.setVisible(true);
    }//GEN-LAST:event_lbHideMouseClicked

    private void lbShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbShowMouseClicked
        tfNewPassword.setEchoChar('*');
        lbHide.setVisible(true);
        lbShow.setVisible(false);
    }//GEN-LAST:event_lbShowMouseClicked

    private void tfQuestionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfQuestionKeyTyped
        char input = evt.getKeyChar();
        if (!(input < '0' || input > '9') && input != '\b') {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Username doesn't contain any number!", "Warning", 2);
        }
    }//GEN-LAST:event_tfQuestionKeyTyped

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.1; i < 1.0; i += 0.1) {
            String s = "" + i;
            float f = Float.parseFloat(s);
            this.setOpacity(f);

            try {
                Thread.sleep(40);

            } catch (InterruptedException ex) {
                Logger.getLogger(ForgotPasswordFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new LoginJFrame().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void tfUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUsernameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsernameKeyTyped

    private void pnForgotPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnForgotPasswordMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_pnForgotPasswordMousePressed

    private void pnForgotPasswordMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnForgotPasswordMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_pnForgotPasswordMouseDragged

    private void lbSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSearchMouseClicked
        if (tfUsername.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username is required", "Warning", 2);
        } else {
            if (dao.getSecurity(tfUsername.getText())) {
                tfQuestion.setBackground(edit);
                tfAnswer.setBackground(edit);
                tfNewPassword.setBackground(edit);
                tfNewPassword.setEnabled(true);
                tfAnswer.setEditable(true);
                tfQuestion.setEditable(true);
                btnSave.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(this, "Username doesn't exist", "Warning", 2);
            }
        }
    }//GEN-LAST:event_lbSearchMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (isEmpty()) {
            String username = tfUsername.getText();
            String ans = tfAnswer.getText();

            if (dao.getAns(username, ans)) {
                String password = String.valueOf(tfNewPassword.getPassword());
                dao.setPassword(username, password);
                JOptionPane.showMessageDialog(this, "Password Updated");
                new LoginJFrame().setVisible(true);
                setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Security answer didn't match", "Warning", 2);

            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    public boolean isEmpty() {
        if (tfAnswer.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Answer is required", "Warning", 2);
            return false;
        }
        if (String.valueOf(tfNewPassword.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(this, "New Password doesn't exist", "Warning", 2);
            return false;
        }
        return true;
    }

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
            java.util.logging.Logger.getLogger(ForgotPasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPasswordFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbExit;
    private javax.swing.JLabel lbHide;
    private javax.swing.JLabel lbSearch;
    private javax.swing.JLabel lbShow;
    private javax.swing.JPanel pnForgotPassword;
    private javax.swing.JTextField tfAnswer;
    private javax.swing.JPasswordField tfNewPassword;
    public static javax.swing.JTextField tfQuestion;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
