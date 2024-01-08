/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkArea.Student;

import Business.Business;
import Business.Course.Course;
import Business.Course.CourseGrading;
import Business.Profiles.StudentProfile;
import com.lowagie.text.Element;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.ColumnText;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
//import com.itextpdf.layout.property.TextAlignment;
import java.awt.CardLayout;
import java.awt.Rectangle;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bhagya
 */
public class StudentTrancriptJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentTrancriptJPanel
     */
    

    /**
     * Creates new form StudentTrancriptJPanel
     */
    JPanel workArea;
    Business business;
    StudentProfile studentProfile;
    public StudentTrancriptJPanel(JPanel workArea, Business business, StudentProfile studentProfile) {
        initComponents();
        this.workArea=workArea;
        this.business=business;
        this.studentProfile = studentProfile;
        populateTranscript();
        System.out.println("Trans.");
        Double a = calculateGPA();
        txtGpa.setText(String.format("%.2f",a));
        populateTable();
        if(studentProfile.isIsGraduated()==true){
            btnDwnldTranscript.setEnabled(true);
        }else{
            btnDwnldTranscript.setEnabled(false);
        }
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tblGradesList.getModel();
        model.setRowCount(0);
        
        ArrayList<Course> coursesTaken = studentProfile.getCoursesTaken();
        for(Course c : coursesTaken){
            for(CourseGrading cg : c.getCourseGradeList()){
                if(studentProfile.getNuid().equals(cg.getStudentId())){
                    Object [] row = new Object[3];
                    row[0] = c.getCourseName();
                    row[1] = cg.getFinalGrade();
                    row[2] = c.getCredits();
                    model.addRow(row);
                }
            }
            
        }
    }
    
    public Double calculateGPA(){
        Double finalGPA=0.0;
        int count=0;
        for(Course c : studentProfile.getCoursesTaken()){
            for(CourseGrading cg : c.getCourseGradeList()){
                if(studentProfile.getNuid().equals(cg.getStudentId())){
                    finalGPA+= cg.getGpa();
                 count++;
                }
                 
            }
           
        }
        return (finalGPA/count);
    }
    public void populateTranscript(){
        ArrayList<Course> coursesTaken = studentProfile.getCoursesTaken();
        int lengthOfCourses = coursesTaken.size();
        int i=0;
        ArrayList<String> courseNames = new ArrayList<>();
        String cName="";
        for(i=0;i<coursesTaken.size();i++){
            cName =coursesTaken.get(i).getCourseName();
            courseNames.add(cName);
            cName="";
        }
//        while(i<lengthOfCourses){
//            String cName = coursesTaken.get(i).getCourseName();
//            courseNames.add(cName);
//            i++;
//        }
        int k = (8-lengthOfCourses);
        while(k>0){
            courseNames.add("Course not available");
            k--;
        }
        txtCourse1.setText(courseNames.get(0));
        txtCourse2.setText(courseNames.get(1));
        txtCourse3.setText(courseNames.get(2));
        txtCourse4.setText(courseNames.get(3));
        txtCourse5.setText(courseNames.get(4));
        txtCourse6.setText(courseNames.get(5));
        txtCourse7.setText(courseNames.get(6));
        txtCourse8.setText(courseNames.get(7));
//        
//        
        ArrayList<String> gradesList = new ArrayList<>();
        for(Course c : coursesTaken){
            for(CourseGrading cg : c.getCourseGradeList()){
                if(studentProfile.getNuid().equals(cg.getStudentId()))
                gradesList.add(cg.getFinalGrade());
            }
            
        }
        
        int lengthOfGradesList = gradesList.size();
        
        int len = 8-lengthOfGradesList; 
        while(len>0){
            gradesList.add("Grade not available!");
            len--;
        }
        txtGrade1.setText(gradesList.get(0));
        txtGrade2.setText(gradesList.get(1));
        txtGrade3.setText(gradesList.get(2));
        txtGrade4.setText(gradesList.get(3));
        txtGrade5.setText(gradesList.get(4));
        txtGrade6.setText(gradesList.get(5));
        txtGrade7.setText(gradesList.get(6));
        txtGrade8.setText(gradesList.get(7));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lnlTranscript = new javax.swing.JLabel();
        lblCourse = new javax.swing.JLabel();
        lblGrades = new javax.swing.JLabel();
        lblGPA = new javax.swing.JLabel();
        lblTotCredit = new javax.swing.JLabel();
        txtCourse1 = new javax.swing.JTextField();
        txtCourse2 = new javax.swing.JTextField();
        txtCourse3 = new javax.swing.JTextField();
        txtCourse4 = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        txtCourse5 = new javax.swing.JTextField();
        txtCourse6 = new javax.swing.JTextField();
        txtCourse7 = new javax.swing.JTextField();
        txtCourse8 = new javax.swing.JTextField();
        txtGrade6 = new javax.swing.JTextField();
        txtGrade5 = new javax.swing.JTextField();
        txtGrade4 = new javax.swing.JTextField();
        txtGrade3 = new javax.swing.JTextField();
        txtGrade2 = new javax.swing.JTextField();
        txtGrade1 = new javax.swing.JTextField();
        txtGrade8 = new javax.swing.JTextField();
        txtGrade7 = new javax.swing.JTextField();
        txtGpa = new javax.swing.JTextField();
        txtCredits = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGradesList = new javax.swing.JTable();
        btnDwnldTranscript = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));

        lnlTranscript.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lnlTranscript.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnlTranscript.setText("Transcript");

        lblCourse.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCourse.setText("Courses: ");

        lblGrades.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblGrades.setText("Grades : ");

        lblGPA.setText("GPA : ");

        lblTotCredit.setText("Total Credits Taken :");

        txtCourse1.setEnabled(false);

        txtCourse2.setEnabled(false);

        txtCourse3.setEnabled(false);

        txtCourse4.setEnabled(false);

        btnBack.setBackground(new java.awt.Color(204, 255, 204));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtCourse5.setEnabled(false);

        txtCourse6.setEnabled(false);

        txtCourse7.setEnabled(false);

        txtCourse8.setEnabled(false);

        txtGrade6.setEnabled(false);

        txtGrade5.setEnabled(false);

        txtGrade4.setEnabled(false);

        txtGrade3.setEnabled(false);

        txtGrade2.setEnabled(false);

        txtGrade1.setEnabled(false);

        txtGrade8.setEnabled(false);

        txtGrade7.setEnabled(false);

        txtGpa.setEnabled(false);
        txtGpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGpaActionPerformed(evt);
            }
        });

        txtCredits.setEnabled(false);

        tblGradesList.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tblGradesList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Course", "Grade", "Credits"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblGradesList);

        btnDwnldTranscript.setBackground(new java.awt.Color(204, 255, 204));
        btnDwnldTranscript.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDwnldTranscript.setText("Download Transcript");
        btnDwnldTranscript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDwnldTranscriptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lnlTranscript, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTotCredit, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblGPA, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtGpa, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(176, 176, 176)
                                .addComponent(btnDwnldTranscript))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCourse7)
                            .addComponent(lblCourse)
                            .addComponent(txtCourse1)
                            .addComponent(txtCourse2)
                            .addComponent(txtCourse3)
                            .addComponent(txtCourse4)
                            .addComponent(txtCourse5)
                            .addComponent(txtCourse6)
                            .addComponent(txtCourse8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtGrade7)
                            .addComponent(txtGrade1)
                            .addComponent(txtGrade2)
                            .addComponent(txtGrade3)
                            .addComponent(txtGrade4)
                            .addComponent(txtGrade5)
                            .addComponent(txtGrade6)
                            .addComponent(txtGrade8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGrades, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lnlTranscript)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(88, 88, 88))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCourse)
                                    .addComponent(lblGrades))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCourse1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCourse2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCourse3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(txtGrade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtGrade2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtGrade3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCourse4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCourse5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCourse6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCourse7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCourse8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtGrade4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtGrade5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtGrade6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtGrade7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtGrade8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBack)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblGPA)
                                    .addComponent(txtGpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDwnldTranscript, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTotCredit)
                                    .addComponent(txtCredits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(189, 189, 189))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        StudentPortalJPanel panel = new StudentPortalJPanel(workArea, business, studentProfile);
        workArea.add("StudentPortalJPanel", panel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtGpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGpaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGpaActionPerformed

    private void btnDwnldTranscriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDwnldTranscriptActionPerformed
        // TODO add your handling code here:
        String path = "";
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = j.showSaveDialog(this);
        
        if(x==JFileChooser.APPROVE_OPTION){
            path = j.getSelectedFile().getPath();
        }
        
        Document doc = new Document();
        
        try {
            PdfWriter instance = PdfWriter.getInstance(doc, new FileOutputStream(path+"/transcript.pdf"));
            
            doc.open();
//            Rectangle rect = PdfWriter.getBoxSize("rectangle");
            Phrase header = new Phrase("Northeastern University Transcript - "+ studentProfile.getFirstName() + " " +studentProfile.getLastName());
//            ColumnText.showTextAligned(instance.getDirectContent(), Element.ALIGN_CENTER, header, 100, 800, 0);
            doc.add(header);
      
//            Phrase header = new Phrase("Header Text");
//            header.setFont(FontFactory.getFont(FontFactory.HELVETICA, 12));
//            ColumnText.showTextAligned(instance.getDirectContent(), Element.ALIGN_CENTER, header, 300, 800, 0);
            PdfPTable tbl = new PdfPTable(3);
            
            tbl.addCell("Course");
            tbl.addCell("Grade");
            tbl.addCell("Credits");
            
            for(int i=0;i<tblGradesList.getRowCount();i++){
                String course = tblGradesList.getValueAt(i, 0).toString();
                String grade = tblGradesList.getValueAt(i, 1).toString();
                String credits = tblGradesList.getValueAt(i, 2).toString();
                tbl.addCell(course);
                tbl.addCell(grade);
                tbl.addCell(credits);
            }
            
            doc.add(tbl);
            
            doc.add(new Phrase("Attested by Examination Department Northeastern University"));
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentTrancriptJPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(StudentTrancriptJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        doc.close();

    }//GEN-LAST:event_btnDwnldTranscriptActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDwnldTranscript;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCourse;
    private javax.swing.JLabel lblGPA;
    private javax.swing.JLabel lblGrades;
    private javax.swing.JLabel lblTotCredit;
    private javax.swing.JLabel lnlTranscript;
    private javax.swing.JTable tblGradesList;
    private javax.swing.JTextField txtCourse1;
    private javax.swing.JTextField txtCourse2;
    private javax.swing.JTextField txtCourse3;
    private javax.swing.JTextField txtCourse4;
    private javax.swing.JTextField txtCourse5;
    private javax.swing.JTextField txtCourse6;
    private javax.swing.JTextField txtCourse7;
    private javax.swing.JTextField txtCourse8;
    private javax.swing.JTextField txtCredits;
    private javax.swing.JTextField txtGpa;
    private javax.swing.JTextField txtGrade1;
    private javax.swing.JTextField txtGrade2;
    private javax.swing.JTextField txtGrade3;
    private javax.swing.JTextField txtGrade4;
    private javax.swing.JTextField txtGrade5;
    private javax.swing.JTextField txtGrade6;
    private javax.swing.JTextField txtGrade7;
    private javax.swing.JTextField txtGrade8;
    // End of variables declaration//GEN-END:variables
}
