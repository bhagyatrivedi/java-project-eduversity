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
public class AdminDirectory {
    
    ArrayList<AdminProfile> adminList;
    
    public AdminDirectory(){
        adminList = new ArrayList();
    }
    
    public AdminProfile newAdminProfile(Person person){
        AdminProfile adminProfile = new AdminProfile(person);
        adminList.add(adminProfile);
        return adminProfile;
    }
    
    public AdminProfile findAdmin(String id){
        for(AdminProfile adminProfile : adminList) {
            if(adminProfile.isMatch(id)){
                return adminProfile;
            }
        }
        return null;
    }
}
