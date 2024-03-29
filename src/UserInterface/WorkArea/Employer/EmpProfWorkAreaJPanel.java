/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkArea.Employer;

import Business.Business;
import Business.Feedback.Feedback;
import Business.Profiles.EmployerProfile;
import Business.Profiles.ProfessorProfile;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Bhagya
 */
public class EmpProfWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EmpProfWorkAreaJPanel
     */
    JPanel workArea;
    Business business;
    ProfessorProfile professorProfile;
    EmployerProfile ep;
    public EmpProfWorkAreaJPanel(JPanel workArea, Business business, ProfessorProfile professorProfile, EmployerProfile ep) {
        initComponents();
        this.workArea = workArea;
        this.business = business;
        this.professorProfile = professorProfile;
        this.ep = ep;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblFdbkProf = new javax.swing.JLabel();
        txtProfFdbk = new javax.swing.JTextField();
        btnFeedback = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Employer - Professor Work Area ");

        lblFdbkProf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblFdbkProf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFdbkProf.setText("Feedback for Professor: ");

        btnFeedback.setBackground(new java.awt.Color(204, 255, 204));
        btnFeedback.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnFeedback.setText("Send Feedback");
        btnFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFeedbackActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 984, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnFeedback))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFdbkProf)
                                .addGap(41, 41, 41)
                                .addComponent(txtProfFdbk, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBack, btnFeedback});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFdbkProf)
                    .addComponent(txtProfFdbk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(117, 117, 117)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFeedback)
                    .addComponent(btnBack))
                .addContainerGap(335, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBack, btnFeedback});

    }// </editor-fold>//GEN-END:initComponents

    private void btnFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFeedbackActionPerformed
        // TODO add your handling code here:
        String fdbk = txtProfFdbk.getText();
        Feedback feedback = new Feedback();
        feedback.setEmployer(ep.getEmployerName());
        feedback.setEmployerFeedback(fdbk);
        feedback.setProfId(professorProfile.getProfId());
        professorProfile.getEmployerFeedbackList().add(feedback);
        ep.getFeedbackGivenList().add(feedback);
        JOptionPane.showMessageDialog(null, "Feedback submitted to professor!");
    }//GEN-LAST:event_btnFeedbackActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workArea.remove(this);
        Component[] compArray = workArea.getComponents();
        Component comp = compArray[compArray.length - 1];
        ProfViewJPanel panel = (ProfViewJPanel) comp;
        panel.populateTable();
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnFeedback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblFdbkProf;
    private javax.swing.JTextField txtProfFdbk;
    // End of variables declaration//GEN-END:variables
}
