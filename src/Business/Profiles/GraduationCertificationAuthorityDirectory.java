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
public class GraduationCertificationAuthorityDirectory {
    ArrayList<GraduationCertificationAuthorityProfile> gradAuthorityList;
    
     public GraduationCertificationAuthorityDirectory(){
        gradAuthorityList = new ArrayList();
    }
    
    public GraduationCertificationAuthorityProfile newGraduationCertificationAuthority(Person person){
        GraduationCertificationAuthorityProfile graduationCertificationAuthorityProfile = new GraduationCertificationAuthorityProfile(person);
        gradAuthorityList.add(graduationCertificationAuthorityProfile);
        return graduationCertificationAuthorityProfile;
    }
    
    public GraduationCertificationAuthorityProfile findGradAuthority(String id){
        for(GraduationCertificationAuthorityProfile graduationCertificationAuthorityProfile : gradAuthorityList) {
            if(graduationCertificationAuthorityProfile.isMatch(id)){
                return graduationCertificationAuthorityProfile;
            }
        }
        return null;
    }
}
