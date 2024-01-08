/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import Business.Person.Person;

/**
 *
 * @author Bhagya
 */
public class GraduationCertificationAuthorityProfile extends Profile{
    Person person;
    private String name;
    private String username;
    private String password;

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
    
    
    public GraduationCertificationAuthorityProfile(Person person){
        super(person);
    }

    @Override
    public Person getPerson() {
        return person;
    }
    
    @Override
    public boolean isMatch(String id){
        return person.getPersonId().equals(id);
    }
    public void setPerson(Person person) {
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    @Override
    public String getRole() {
        return "Graduation Certification Authority";
    }
    
}
