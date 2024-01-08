/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import Business.Course.Course;
import Business.Feedback.Feedback;
import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author Bhagya
 */
public class ProfessorProfile extends Profile {
    Person person;
    private String firstName;
    private String lastName;
    private String emailId;
    private String location;
    private String username;
    private String specialization;
    private String password;
    private String contactNumber;
    private String profId;
    ArrayList<Feedback> employerFeedbackList = new ArrayList<>();
    
    ArrayList<StudentProfile> studentList = new ArrayList<>();
    ArrayList<Course> coursesOffered = new ArrayList<>();

    public ArrayList<Feedback> getEmployerFeedbackList() {
        return employerFeedbackList;
    }

    public void setEmployerFeedbackList(ArrayList<Feedback> employerFeedbackList) {
        this.employerFeedbackList = employerFeedbackList;
    }

   
    
    public String getProfId() {
        return profId;
    }

    public void setProfId(String profId) {
        this.profId = profId;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
      
    public ArrayList<Course> getCoursesOffered() {
        return coursesOffered;
    }

    public void setCoursesOffered(ArrayList<Course> coursesOffered) {
        this.coursesOffered = coursesOffered;
    }
    
    public void addCourseOffered(Course course){
        coursesOffered.add(course);
        return;
    }
    public ProfessorProfile(Person person ){
        super(person);
    }
    
    @Override
    public String getRole(){
        return "Professor";
    }
    
    public boolean isMatch(String id){
        return person.getPersonId().equals(id);
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public ArrayList<StudentProfile> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<StudentProfile> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return firstName+" "+lastName;
    }
    
    
    
}
