/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkArea.Admin;

import Business.Business;
import Business.Profiles.AdminProfile;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Bhagya
 */
public class AdminDashboardJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminDashboardJPanel
     */
    JPanel workArea;
    Business business;
    AdminProfile ap;
    public AdminDashboardJPanel(JPanel workArea, Business business, AdminProfile ap) {
        initComponents();
        this.workArea = workArea;
        this.business = business;
        this.ap = ap;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        btnViewProf = new javax.swing.JButton();
        btnViewStudent = new javax.swing.JButton();
        headingJLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));

        backButton.setBackground(new java.awt.Color(204, 255, 204));
        backButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        btnViewProf.setBackground(new java.awt.Color(204, 255, 204));
        btnViewProf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnViewProf.setText("View Professors");
        btnViewProf.setBorder(new javax.swing.border.MatteBorder(null));
        btnViewProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProfActionPerformed(evt);
            }
        });

        btnViewStudent.setBackground(new java.awt.Color(204, 255, 204));
        btnViewStudent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnViewStudent.setText("View Students");
        btnViewStudent.setBorder(new javax.swing.border.MatteBorder(null));
        btnViewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewStudentActionPerformed(evt);
            }
        });

        headingJLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        headingJLabel.setText("Admin Panel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(headingJLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(394, 394, 394)
                        .addComponent(backButton)))
                .addContainerGap(466, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(btnViewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnViewProf, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(headingJLabel)
                .addGap(150, 150, 150)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewStudent)
                    .addComponent(btnViewProf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
                .addComponent(backButton)
                .addGap(210, 210, 210))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        workArea.remove(this);
        CardLayout layout= (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_backButtonActionPerformed

    private void btnViewProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProfActionPerformed
        // TODO add your handling code here:
        ProfAdminViewJPanel panel=new ProfAdminViewJPanel(workArea,business, ap);
        workArea.add("ProfAdminViewJPanel", panel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);

    }//GEN-LAST:event_btnViewProfActionPerformed

    private void btnViewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewStudentActionPerformed
        // TODO add your handling code here:
        StudentAdminViewJPanel panel=new StudentAdminViewJPanel(workArea,business,ap);
        workArea.add("viewStudentJPanel", panel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnViewStudentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton btnViewProf;
    private javax.swing.JButton btnViewStudent;
    private javax.swing.JLabel headingJLabel;
    // End of variables declaration//GEN-END:variables
}