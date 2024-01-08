/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkArea.Employer;

import Business.Business;
import Business.Profiles.EmployerProfile;
import UserInterface.WorkArea.Student.StudentProfileJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author sanatpopli
 */
public class EmployerPortalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EmployerPortalJPanel
     */
    

    /**
     * Creates new form EmployerPortalJPanel
     */
    JPanel workArea;
    Business business;
    EmployerProfile employerProfile;
    public EmployerPortalJPanel(JPanel workArea, Business business, EmployerProfile employerProfile) {
        initComponents();
        this.workArea=workArea;
        this.business=business;
        this.employerProfile = employerProfile;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headingJLabel = new javax.swing.JLabel();
        btnViewStudent = new javax.swing.JButton();
        btnViewProf = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));

        headingJLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        headingJLabel.setText("Employer Portal");

        btnViewStudent.setBackground(new java.awt.Color(204, 255, 204));
        btnViewStudent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnViewStudent.setText("View Student");
        btnViewStudent.setBorder(new javax.swing.border.MatteBorder(null));
        btnViewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewStudentActionPerformed(evt);
            }
        });

        btnViewProf.setBackground(new java.awt.Color(204, 255, 204));
        btnViewProf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnViewProf.setText("View Prof");
        btnViewProf.setBorder(new javax.swing.border.MatteBorder(null));
        btnViewProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProfActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(204, 255, 204));
        backButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(btnViewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 456, Short.MAX_VALUE)
                .addComponent(btnViewProf, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(headingJLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(394, 394, 394)
                        .addComponent(backButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {backButton, btnViewProf, btnViewStudent});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(headingJLabel)
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewStudent)
                    .addComponent(btnViewProf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 241, Short.MAX_VALUE)
                .addComponent(backButton)
                .addGap(210, 210, 210))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {backButton, btnViewProf, btnViewStudent});

    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        workArea.remove(this);
        CardLayout layout= (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_backButtonActionPerformed

    private void btnViewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewStudentActionPerformed
        // TODO add your handling code here:
        StudentViewJPanel panel=new StudentViewJPanel(workArea,business);
        workArea.add("viewStudentJPanel", panel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnViewStudentActionPerformed

    private void btnViewProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProfActionPerformed
        // TODO add your handling code here:
        ProfViewJPanel panel=new ProfViewJPanel(workArea,business, employerProfile);
         workArea.add("viewProfJPanel", panel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
        
    }//GEN-LAST:event_btnViewProfActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton btnViewProf;
    private javax.swing.JButton btnViewStudent;
    private javax.swing.JLabel headingJLabel;
    // End of variables declaration//GEN-END:variables
}
