/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import Business.Business;
import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author Bhagya
 */
public class EmployerDirectory {
    
    ArrayList<EmployerProfile> employerList;
    
    public EmployerDirectory(){
        employerList = new ArrayList();
    }
    
    public EmployerProfile newEmployeeProfile(Person person){
        EmployerProfile employerProfile = new EmployerProfile(person);
        employerList.add(employerProfile);
        return employerProfile;
    }
    
    public EmployerProfile findEmployee(String id){
        for(EmployerProfile employeeProfile : employerList) {
            if(employeeProfile.isMatch(id)){
                return employeeProfile;
            }
        }
        return null;
    }
}
