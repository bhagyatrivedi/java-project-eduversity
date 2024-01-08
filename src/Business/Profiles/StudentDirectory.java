/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author Bhagya
 */
public class StudentDirectory {
    ArrayList<StudentProfile> studentList;
    
    public StudentDirectory(){
        studentList = new ArrayList();
    }

    public ArrayList<StudentProfile> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<StudentProfile> studentList) {
        this.studentList = studentList;
    }
    
    public StudentProfile newStudentProfile(Person person){
        StudentProfile studentProfile = new StudentProfile(person);
        studentList.add(studentProfile);
        return studentProfile;
    }
    
    public StudentProfile findStudent(String id){
        for(StudentProfile studentProfile : studentList){
            if(studentProfile.isMatch(id)){
                return studentProfile;
            }
        }
        return null;
    }
}
