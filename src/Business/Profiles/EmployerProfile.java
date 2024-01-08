/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import Business.Feedback.Feedback;
import Business.Person.Person;
import java.util.ArrayList;


/**
 *
 * @author Bhagya
 */
public class EmployerProfile extends Profile {
    
    Person person;
    private String username;
    private String password;
    private String employerName;

    ArrayList<Feedback> feedbackGivenList = new ArrayList<>();

    public ArrayList<Feedback> getFeedbackGivenList() {
        return feedbackGivenList;
    }

    public void setFeedbackGivenList(ArrayList<Feedback> feedbackGivenList) {
        this.feedbackGivenList = feedbackGivenList;
    }
    
    
    @Override
    public String getRole() {
        return "Employer";
    }
    public EmployerProfile(Person person){
        super(person);
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
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

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }
   
}
