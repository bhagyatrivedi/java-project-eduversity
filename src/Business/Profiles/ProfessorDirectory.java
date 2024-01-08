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
public class ProfessorDirectory {
    ArrayList<ProfessorProfile> professorList;
    
    public ProfessorDirectory(){
        professorList = new ArrayList();
       
    }
    
    public ProfessorProfile newProfessorProfile(Person person){
        ProfessorProfile professorProfile = new ProfessorProfile(person);
        professorList.add(professorProfile);
        return professorProfile;
    }
    
  
    public ProfessorProfile findProfessor(String id){
        for(ProfessorProfile profile : professorList){
            if(profile.isMatch(id)){
                return profile;
            }
        }
        return null;
    }

    public ArrayList<ProfessorProfile> getProfessorList() {
        return professorList;
    }

    public void setProfessorList(ArrayList<ProfessorProfile> professorList) {
        this.professorList = professorList;
    }
    
}
