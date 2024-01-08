/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Person;

import java.util.ArrayList;

/**
 *
 * @author Bhagya
 */
public class PersonDirectory {
    
    ArrayList<Person> personList;
    
    public PersonDirectory (){
        personList = new ArrayList();
    }
    
    public Person newPerson(String id){
        Person person = new Person(id);
        personList.add(person);
        return person;
    }
    
    public Person findPerson(String id){
        for(Person person : personList){
            if(person.isMatch(id)){
                return person;
            }
        }
        return null;
    }
}
