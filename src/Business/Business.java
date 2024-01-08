/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Person.PersonDirectory;
import Business.Profiles.EmployerDirectory;
import Business.Profiles.GraduationCertificationAuthorityDirectory;
import Business.Profiles.ProfessorDirectory;
import Business.Profiles.StudentDirectory;
import Business.UserAccount.UserAccountDirectory;

/**
 *
 * @author Bhagya
 */
public class Business {
    
    String name;
    PersonDirectory personDirectory;
    EmployerDirectory employeeDirectory;
    UserAccountDirectory userAccountDirectory;
    ProfessorDirectory professorDirectory;
    StudentDirectory studentDirectory;
    GraduationCertificationAuthorityDirectory graduationCertificationAuthorityDirectory;
    
    public Business(String name){
        this.name = name;
        
        personDirectory = new PersonDirectory();
        employeeDirectory = new EmployerDirectory();
        professorDirectory = new ProfessorDirectory();
        userAccountDirectory = new UserAccountDirectory();
        studentDirectory = new StudentDirectory();
        graduationCertificationAuthorityDirectory = new GraduationCertificationAuthorityDirectory();
    }

    public GraduationCertificationAuthorityDirectory getGraduationCertificationAuthorityDirectory() {
        return graduationCertificationAuthorityDirectory;
    }

    public void setGraduationCertificationAuthorityDirectory(GraduationCertificationAuthorityDirectory graduationCertificationAuthorityDirectory) {
        this.graduationCertificationAuthorityDirectory = graduationCertificationAuthorityDirectory;
    }
    
    
    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public void setEmployeeDirectory(EmployerDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public void setProfessorDirectory(ProfessorDirectory professorDirectory) {
        this.professorDirectory = professorDirectory;
    }
    
    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public EmployerDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public ProfessorDirectory getProfessorDirectory(){
        return professorDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public StudentDirectory getStudentDirectory() {
        return studentDirectory;
    }

    public void setStudentDirectory(StudentDirectory studentDirectory) {
        this.studentDirectory = studentDirectory;
    }
    
    
}
