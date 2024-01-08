/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkArea.Student;

import Business.Business;
import Business.Profiles.StudentProfile;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Bhagya
 */
public class StudentPortalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentPortalJPanel
     */
    
    /**
     * Creates new form StudentPortalJPanel
     */
    JPanel workArea ;
    Business business;
    StudentProfile studentProfile;
    public StudentPortalJPanel(JPanel workArea, Business business, StudentProfile studentProfile) {
        initComponents();
        this.workArea=workArea;
        this.business=business;
        this.studentProfile = studentProfile;
        txtName.setText(studentProfile.getFirstName()+ " " + studentProfile.getLastName());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblStudentPortal = new javax.swing.JLabel();
        btnCourseWork = new javax.swing.JButton();
        btnRegistration = new javax.swing.JButton();
        btnManageProfile = new javax.swing.JButton();
        btnGraduationAudit = new javax.swing.JButton();
        btnTranscript = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 204, 204));

        lblStudentPortal.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblStudentPortal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStudentPortal.setText("Welcome to Student Portal Dashboard!");

        btnCourseWork.setBackground(new java.awt.Color(204, 255, 204));
        btnCourseWork.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCourseWork.setText("Course Work");
        btnCourseWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseWorkActionPerformed(evt);
            }
        });

        btnRegistration.setBackground(new java.awt.Color(204, 255, 204));
        btnRegistration.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegistration.setText("Registration");
        btnRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrationActionPerformed(evt);
            }
        });

        btnManageProfile.setBackground(new java.awt.Color(204, 255, 204));
        btnManageProfile.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnManageProfile.setText("Manage Profile");
        btnManageProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageProfileActionPerformed(evt);
            }
        });

        btnGraduationAudit.setBackground(new java.awt.Color(204, 255, 204));
        btnGraduationAudit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGraduationAudit.setText("Graduation Audit");
        btnGraduationAudit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraduationAuditActionPerformed(evt);
            }
        });

        btnTranscript.setBackground(new java.awt.Color(204, 255, 204));
        btnTranscript.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTranscript.setText("Transcript");
        btnTranscript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTranscriptActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(204, 255, 204));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Hi,");

        txtName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblStudentPortal, javax.swing.GroupLayout.DEFAULT_SIZE, 933, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTranscript)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnBack)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnCourseWork)
                            .addGap(119, 119, 119)
                            .addComponent(btnManageProfile))))
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistration)
                    .addComponent(btnGraduationAudit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBack, btnCourseWork, btnGraduationAudit, btnManageProfile, btnRegistration, btnTranscript});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblStudentPortal)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistration)
                    .addComponent(btnCourseWork)
                    .addComponent(btnManageProfile))
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGraduationAudit)
                    .addComponent(btnTranscript))
                .addGap(83, 83, 83)
                .addComponent(btnBack)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBack, btnCourseWork, btnGraduationAudit, btnManageProfile, btnRegistration, btnTranscript});

    }// </editor-fold>//GEN-END:initComponents

    private void btnCourseWorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseWorkActionPerformed
        // TODO add your handling code here:
        StudentCourseJPanel panel=new StudentCourseJPanel(workArea,business, studentProfile);
        workArea.add("StudentCourseJPanel", panel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnCourseWorkActionPerformed

    private void btnManageProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageProfileActionPerformed
        // TODO add your handling code here:
        StudentProfileJPanel panel=new StudentProfileJPanel(workArea,business,studentProfile);
        workArea.add("StudentProfileJPanel", panel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
        
    }//GEN-LAST:event_btnManageProfileActionPerformed

    private void btnRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrationActionPerformed
        // TODO add your handling code here:
        StudentCourseRegistrationJPanel panel=new StudentCourseRegistrationJPanel(workArea,business,studentProfile);
        workArea.add("StudentCourseRegistrationJPanel", panel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);

        
    }//GEN-LAST:event_btnRegistrationActionPerformed

    private void btnTranscriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTranscriptActionPerformed
        // TODO add your handling code here:
        StudentTrancriptJPanel panel=new StudentTrancriptJPanel(workArea,business,studentProfile);
        workArea.add("StudentTrancriptJPanel", panel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
        
    }//GEN-LAST:event_btnTranscriptActionPerformed

    private void btnGraduationAuditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraduationAuditActionPerformed
        // TODO add your handling code here:
        StudentGradAuthorityJPanel panel=new StudentGradAuthorityJPanel(workArea,business,studentProfile);
        workArea.add("StudentGradAuthorityJPanel", panel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
        
    }//GEN-LAST:event_btnGraduationAuditActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workArea.remove(this);
        CardLayout layout= (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCourseWork;
    private javax.swing.JButton btnGraduationAudit;
    private javax.swing.JButton btnManageProfile;
    private javax.swing.JButton btnRegistration;
    private javax.swing.JButton btnTranscript;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblStudentPortal;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
