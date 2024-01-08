/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Feedback;

/**
 *
 * @author Bhagya
 */
public class Feedback {
    
    String employer;
    String employerFeedback;
    String profId;

    public String getProfId() {
        return profId;
    }

    public void setProfId(String profId) {
        this.profId = profId;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getEmployerFeedback() {
        return employerFeedback;
    }

    public void setEmployerFeedback(String employerFeedback) {
        this.employerFeedback = employerFeedback;
    }

    @Override
    public String toString() {
        return employer;
    }
    
    
}
