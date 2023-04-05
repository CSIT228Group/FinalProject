/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.finalproject;
import javax.swing.JOptionPane;
import java.awt.CardLayout;
/**
 *
 * @author Ivan
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMainCardLayout = new javax.swing.JPanel();
        pnlLoginMenu = new javax.swing.JPanel();
        lblHospitalManagementSystem = new javax.swing.JLabel();
        lblLoginArea = new javax.swing.JLabel();
        tfStaffID = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        lblStaffID = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        btnBackdoor = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        pnlMainMenu = new javax.swing.JPanel();
        pnlMenuCardLayout = new javax.swing.JPanel();
        pnlAdmitPatient = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        pnlCheckPatientRecord = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        pnlDischargePatient = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        pnlCheckPatientBalance = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        pnlSettlePatientBalance = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        pnlMenuButtons = new javax.swing.JPanel();
        btnAdmitPatient = new javax.swing.JButton();
        btnCheckPatientRecord = new javax.swing.JButton();
        btnDischargePatient = new javax.swing.JButton();
        btnCheckPatientBalance = new javax.swing.JButton();
        btnSettlePatientBalance = new javax.swing.JButton();
        btnSignOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hospital Management System");
        setSize(new java.awt.Dimension(800, 600));

        pnlMainCardLayout.setPreferredSize(new java.awt.Dimension(750, 600));
        pnlMainCardLayout.setLayout(new java.awt.CardLayout());

        pnlLoginMenu.setPreferredSize(new java.awt.Dimension(750, 600));

        lblHospitalManagementSystem.setFont(new java.awt.Font("Lucida Console", 0, 24)); // NOI18N
        lblHospitalManagementSystem.setText("Hospital Management System");

        lblLoginArea.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblLoginArea.setText("LOGIN AREA");

        tfStaffID.setName("tfstaffID"); // NOI18N

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        lblStaffID.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblStaffID.setText("STAFF ID");

        lblPassword.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPassword.setText("PASSWORD");

        btnBackdoor.setText("Backdoor");
        btnBackdoor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackdoorActionPerformed(evt);
            }
        });

        btnLogin.setText("Login");
        btnLogin.setName("btnLogin"); // NOI18N
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLoginMenuLayout = new javax.swing.GroupLayout(pnlLoginMenu);
        pnlLoginMenu.setLayout(pnlLoginMenuLayout);
        pnlLoginMenuLayout.setHorizontalGroup(
            pnlLoginMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginMenuLayout.createSequentialGroup()
                .addGroup(pnlLoginMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlLoginMenuLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblHospitalManagementSystem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addComponent(lblLoginArea)
                        .addGap(16, 16, 16))
                    .addGroup(pnlLoginMenuLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlLoginMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlLoginMenuLayout.createSequentialGroup()
                                .addGroup(pnlLoginMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblStaffID)
                                    .addComponent(lblPassword))
                                .addGap(29, 29, 29)
                                .addGroup(pnlLoginMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfStaffID, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                    .addComponent(passwordField)))
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBackdoor, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(53, 53, 53))
        );
        pnlLoginMenuLayout.setVerticalGroup(
            pnlLoginMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginMenuLayout.createSequentialGroup()
                .addGroup(pnlLoginMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginMenuLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(lblHospitalManagementSystem))
                    .addGroup(pnlLoginMenuLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblLoginArea)))
                .addGap(111, 111, 111)
                .addGroup(pnlLoginMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStaffID))
                .addGap(49, 49, 49)
                .addGroup(pnlLoginMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addGap(33, 33, 33)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnBackdoor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        pnlMainCardLayout.add(pnlLoginMenu, "card2");

        pnlMainMenu.setPreferredSize(new java.awt.Dimension(750, 600));

        pnlMenuCardLayout.setLayout(new java.awt.CardLayout());

        jLabel10.setText("Admit Patient");

        javax.swing.GroupLayout pnlAdmitPatientLayout = new javax.swing.GroupLayout(pnlAdmitPatient);
        pnlAdmitPatient.setLayout(pnlAdmitPatientLayout);
        pnlAdmitPatientLayout.setHorizontalGroup(
            pnlAdmitPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdmitPatientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(392, Short.MAX_VALUE))
        );
        pnlAdmitPatientLayout.setVerticalGroup(
            pnlAdmitPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdmitPatientLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel10)
                .addContainerGap(538, Short.MAX_VALUE))
        );

        pnlMenuCardLayout.add(pnlAdmitPatient, "card6");

        jLabel11.setText("Check Patient's Record");

        javax.swing.GroupLayout pnlCheckPatientRecordLayout = new javax.swing.GroupLayout(pnlCheckPatientRecord);
        pnlCheckPatientRecord.setLayout(pnlCheckPatientRecordLayout);
        pnlCheckPatientRecordLayout.setHorizontalGroup(
            pnlCheckPatientRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCheckPatientRecordLayout.createSequentialGroup()
                .addContainerGap(346, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );
        pnlCheckPatientRecordLayout.setVerticalGroup(
            pnlCheckPatientRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCheckPatientRecordLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel11)
                .addContainerGap(538, Short.MAX_VALUE))
        );

        pnlMenuCardLayout.add(pnlCheckPatientRecord, "card2");

        pnlDischargePatient.setPreferredSize(new java.awt.Dimension(471, 588));
        pnlDischargePatient.setRequestFocusEnabled(false);

        jLabel12.setText("Discharge Patient");

        javax.swing.GroupLayout pnlDischargePatientLayout = new javax.swing.GroupLayout(pnlDischargePatient);
        pnlDischargePatient.setLayout(pnlDischargePatientLayout);
        pnlDischargePatientLayout.setHorizontalGroup(
            pnlDischargePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDischargePatientLayout.createSequentialGroup()
                .addContainerGap(372, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );
        pnlDischargePatientLayout.setVerticalGroup(
            pnlDischargePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDischargePatientLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel12)
                .addContainerGap(538, Short.MAX_VALUE))
        );

        pnlMenuCardLayout.add(pnlDischargePatient, "card3");

        pnlCheckPatientBalance.setPreferredSize(new java.awt.Dimension(471, 588));

        jLabel13.setText("Check Patient's Balance");

        javax.swing.GroupLayout pnlCheckPatientBalanceLayout = new javax.swing.GroupLayout(pnlCheckPatientBalance);
        pnlCheckPatientBalance.setLayout(pnlCheckPatientBalanceLayout);
        pnlCheckPatientBalanceLayout.setHorizontalGroup(
            pnlCheckPatientBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCheckPatientBalanceLayout.createSequentialGroup()
                .addContainerGap(342, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );
        pnlCheckPatientBalanceLayout.setVerticalGroup(
            pnlCheckPatientBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCheckPatientBalanceLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel13)
                .addContainerGap(538, Short.MAX_VALUE))
        );

        pnlMenuCardLayout.add(pnlCheckPatientBalance, "card4");

        jLabel14.setText("Settle Patient's Balance");

        javax.swing.GroupLayout pnlSettlePatientBalanceLayout = new javax.swing.GroupLayout(pnlSettlePatientBalance);
        pnlSettlePatientBalance.setLayout(pnlSettlePatientBalanceLayout);
        pnlSettlePatientBalanceLayout.setHorizontalGroup(
            pnlSettlePatientBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSettlePatientBalanceLayout.createSequentialGroup()
                .addContainerGap(343, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addContainerGap())
        );
        pnlSettlePatientBalanceLayout.setVerticalGroup(
            pnlSettlePatientBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSettlePatientBalanceLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel14)
                .addContainerGap(538, Short.MAX_VALUE))
        );

        pnlMenuCardLayout.add(pnlSettlePatientBalance, "card5");

        btnAdmitPatient.setText("Admit Patient");
        btnAdmitPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdmitPatientActionPerformed(evt);
            }
        });

        btnCheckPatientRecord.setText("Check Patient's Record");
        btnCheckPatientRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckPatientRecordActionPerformed(evt);
            }
        });

        btnDischargePatient.setText("Discharge Patient ");
        btnDischargePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDischargePatientActionPerformed(evt);
            }
        });

        btnCheckPatientBalance.setText("Check Patient's Balance");
        btnCheckPatientBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckPatientBalanceActionPerformed(evt);
            }
        });

        btnSettlePatientBalance.setText("Settle Patient's Balance");
        btnSettlePatientBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettlePatientBalanceActionPerformed(evt);
            }
        });

        btnSignOut.setText("Sign out");
        btnSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuButtonsLayout = new javax.swing.GroupLayout(pnlMenuButtons);
        pnlMenuButtons.setLayout(pnlMenuButtonsLayout);
        pnlMenuButtonsLayout.setHorizontalGroup(
            pnlMenuButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMenuButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuButtonsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSignOut, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAdmitPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCheckPatientRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDischargePatient, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCheckPatientBalance, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addComponent(btnSettlePatientBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlMenuButtonsLayout.setVerticalGroup(
            pnlMenuButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuButtonsLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnAdmitPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnCheckPatientRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnDischargePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnCheckPatientBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnSettlePatientBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSignOut, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );

        javax.swing.GroupLayout pnlMainMenuLayout = new javax.swing.GroupLayout(pnlMainMenu);
        pnlMainMenu.setLayout(pnlMainMenuLayout);
        pnlMainMenuLayout.setHorizontalGroup(
            pnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainMenuLayout.createSequentialGroup()
                .addComponent(pnlMenuButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlMenuCardLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlMainMenuLayout.setVerticalGroup(
            pnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainMenuLayout.createSequentialGroup()
                .addGroup(pnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMenuButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlMenuCardLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlMainCardLayout.add(pnlMainMenu, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlMainCardLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMainCardLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        String staffID = tfStaffID.getText();
        String password = passwordField.getText();
        tfStaffID.setText("");
        passwordField.setText("");
        
        System.out.println("StaffID is " + staffID);
        System.out.println("Password is: " + password);
        
        if(staffID.equals("admin") && password.equals("1234")) {
            CardLayout cardLayout = (CardLayout) pnlMainCardLayout.getLayout();
            cardLayout.show(pnlMainCardLayout, "card3");
        }
        else{
            JOptionPane.showMessageDialog(null, "Sorry, that password isn't right!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnBackdoorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackdoorActionPerformed
        CardLayout cardLayout = (CardLayout) pnlMainCardLayout.getLayout();
        cardLayout.show(pnlMainCardLayout, "card3");
    }//GEN-LAST:event_btnBackdoorActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        String staffID = tfStaffID.getText();
        String password = passwordField.getText();
        tfStaffID.setText("");
        passwordField.setText("");
        
        System.out.println("StaffID is " + staffID);
        System.out.println("Password is: " + password);
        
        if(staffID.equals("admin") && password.equals("1234")) {
            CardLayout cardLayout = (CardLayout) pnlMainCardLayout.getLayout();
            cardLayout.show(pnlMainCardLayout, "card3"); 
        }
        else{
            JOptionPane.showMessageDialog(null, "Sorry, that password isn't right!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void btnAdmitPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdmitPatientActionPerformed
        CardLayout cardLayout = (CardLayout) pnlMenuCardLayout.getLayout();
        cardLayout.show(pnlMenuCardLayout, "card6");
    }//GEN-LAST:event_btnAdmitPatientActionPerformed

    private void btnCheckPatientRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckPatientRecordActionPerformed
        CardLayout cardLayout = (CardLayout) pnlMenuCardLayout.getLayout();
        cardLayout.show(pnlMenuCardLayout, "card2");
    }//GEN-LAST:event_btnCheckPatientRecordActionPerformed

    private void btnDischargePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDischargePatientActionPerformed
        CardLayout cardLayout = (CardLayout) pnlMenuCardLayout.getLayout();
        cardLayout.show(pnlMenuCardLayout, "card3");
    }//GEN-LAST:event_btnDischargePatientActionPerformed

    private void btnCheckPatientBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckPatientBalanceActionPerformed
        CardLayout cardLayout = (CardLayout) pnlMenuCardLayout.getLayout();
        cardLayout.show(pnlMenuCardLayout, "card4");
    }//GEN-LAST:event_btnCheckPatientBalanceActionPerformed

    private void btnSettlePatientBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettlePatientBalanceActionPerformed
        CardLayout cardLayout = (CardLayout) pnlMenuCardLayout.getLayout();
        cardLayout.show(pnlMenuCardLayout, "card5");
    }//GEN-LAST:event_btnSettlePatientBalanceActionPerformed

    private void btnSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignOutActionPerformed
        CardLayout cardLayout = (CardLayout) pnlMainCardLayout.getLayout();
        cardLayout.show(pnlMainCardLayout, "card2");
    }//GEN-LAST:event_btnSignOutActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login login = new Login();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmitPatient;
    private javax.swing.JButton btnBackdoor;
    private javax.swing.JButton btnCheckPatientBalance;
    private javax.swing.JButton btnCheckPatientRecord;
    private javax.swing.JButton btnDischargePatient;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSettlePatientBalance;
    private javax.swing.JButton btnSignOut;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel lblHospitalManagementSystem;
    private javax.swing.JLabel lblLoginArea;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblStaffID;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPanel pnlAdmitPatient;
    private javax.swing.JPanel pnlCheckPatientBalance;
    private javax.swing.JPanel pnlCheckPatientRecord;
    private javax.swing.JPanel pnlDischargePatient;
    private javax.swing.JPanel pnlLoginMenu;
    private javax.swing.JPanel pnlMainCardLayout;
    private javax.swing.JPanel pnlMainMenu;
    private javax.swing.JPanel pnlMenuButtons;
    private javax.swing.JPanel pnlMenuCardLayout;
    private javax.swing.JPanel pnlSettlePatientBalance;
    private javax.swing.JTextField tfStaffID;
    // End of variables declaration//GEN-END:variables
}
