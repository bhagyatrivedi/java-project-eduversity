/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkArea.Student;

import Business.Business;
import Business.Course.Course;
import Business.Profiles.ProfessorDirectory;
import Business.Profiles.ProfessorProfile;
import Business.Profiles.StudentProfile;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bhagya
 */
public class StudentCourseRegistrationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentCourseRegisterationJPanel
     */
    JPanel workArea;
    Business business;
    StudentProfile studentProfile;
    public StudentCourseRegistrationJPanel(JPanel workArea, Business business, StudentProfile studentProfile) {
        initComponents();
        this.workArea = workArea;
        this.business = business;
        this.studentProfile = studentProfile;
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tblViewAndRegisterAvailCourse.getModel();
        model.setRowCount(0);
        
        ProfessorDirectory pd = business.getProfessorDirectory();
        ArrayList<ProfessorProfile> professorList = pd.getProfessorList();
        for(ProfessorProfile pp : professorList){
            for(Course course : pp.getCoursesOffered()){
                Object[] row = new Object[6];
                row[0] = course;
                row[1] = course.getCourseId();
                row[2] = course.getProfName();
                row[3] = course.getProfRating();
                row[4] = course.getRoomAndBuildingLocation();
                row[5] = course.getCredits();
                
                model.addRow(row);
            }
        }
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblViewAndRegisterAvailCourse = new javax.swing.JTable();
        btnRegisterCourse = new javax.swing.JButton();
        btnViewCourseDetails = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View and Register Available Course Here");

        tblViewAndRegisterAvailCourse.setBackground(new java.awt.Color(204, 204, 204));
        tblViewAndRegisterAvailCourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Course", "Course Id", "Professor Name", "Professor Rating", "Professor Location", "Credits"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblViewAndRegisterAvailCourse);

        btnRegisterCourse.setBackground(new java.awt.Color(204, 255, 204));
        btnRegisterCourse.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegisterCourse.setText("Register Course");
        btnRegisterCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterCourseActionPerformed(evt);
            }
        });

        btnViewCourseDetails.setBackground(new java.awt.Color(204, 255, 204));
        btnViewCourseDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnViewCourseDetails.setText("View Course Details");
        btnViewCourseDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCourseDetailsActionPerformed(evt);
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
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(88, 88, 88)
                        .addComponent(btnViewCourseDetails)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegisterCourse))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBack, btnRegisterCourse, btnViewCourseDetails});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(68, 68, 68)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegisterCourse)
                    .addComponent(btnViewCourseDetails)
                    .addComponent(btnBack))
                .addContainerGap(241, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBack, btnRegisterCourse, btnViewCourseDetails});

    }// </editor-fold>//GEN-END:initComponents

    private void btnViewCourseDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCourseDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblViewAndRegisterAvailCourse.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(null, "Information not available for selected Course!");
           
            }else{
            DefaultTableModel model = (DefaultTableModel) tblViewAndRegisterAvailCourse.getModel();
            Course selectedCourse = (Course) model.getValueAt(selectedRowIndex, 0);
            if(selectedCourse!=null){
                ViewSelectedAvailableCourseDetailJPanel panel = new ViewSelectedAvailableCourseDetailJPanel(workArea, business, selectedCourse, studentProfile);
                workArea.add("ViewSelectedAvailableCourseDetailJPanel", panel);
                CardLayout layout = (CardLayout) workArea.getLayout();
                layout.next(workArea);
            }
        }
    }//GEN-LAST:event_btnViewCourseDetailsActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    workArea.remove(this);
    Component[] componentArray = workArea.getComponents();
    Component component = componentArray[componentArray.length - 1];
    if(component.toString().contains("StudentCourseJPanel")){
        StudentCourseJPanel panel = (StudentCourseJPanel) component;
        panel.populateTable();
    }else{
        StudentPortalJPanel panel = (StudentPortalJPanel) component;
    }
    
    CardLayout layout = (CardLayout) workArea.getLayout();
    layout.previous(workArea);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRegisterCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterCourseActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblViewAndRegisterAvailCourse.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(null, "Please select a course to register!");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblViewAndRegisterAvailCourse.getModel();
        Course selectedCourse = (Course) model.getValueAt(selectedRowIndex,0);
        
        studentProfile.addCoursesTaken(selectedCourse);
        ProfessorDirectory professorDirectory = business.getProfessorDirectory();
        for(ProfessorProfile pp : professorDirectory.getProfessorList()){
            if(selectedCourse.getProfId().equals(pp.getProfId())){
                boolean add = pp.getStudentList().add(studentProfile);
                if(add == true){
                    JOptionPane.showMessageDialog(null, "Student "+studentProfile.getFirstName() +" " +
                            studentProfile.getLastName()+" is registered for course "+
                            selectedCourse.getCourseName()+ " under professor "+ pp.getFirstName()+ " "+
                            pp.getLastName());
                    return;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Student could not register the course!");
    }//GEN-LAST:event_btnRegisterCourseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRegisterCourse;
    private javax.swing.JButton btnViewCourseDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblViewAndRegisterAvailCourse;
    // End of variables declaration//GEN-END:variables
}
