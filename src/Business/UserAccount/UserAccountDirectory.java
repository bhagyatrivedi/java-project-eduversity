/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import Business.Profiles.EmployerProfile;
import Business.Profiles.ProfessorProfile;
import Business.Profiles.Profile;
import Business.Profiles.StudentProfile;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bhagya
 */
public class UserAccountDirectory {
    
    ArrayList<UserAccount> userAccountList;
    
    public UserAccountDirectory(){
        userAccountList = new ArrayList();
    }
    
    public UserAccount newUserAccount(Profile profile, String username, String password){
        try {
            MessageDigest messageDigest =  MessageDigest.getInstance("SHA-256");
            byte[] md = messageDigest.digest(password.getBytes());
            BigInteger bigInt = new BigInteger(1, md);
            String hashedPassword = bigInt.toString(16);
            StudentProfile sp;
            ProfessorProfile pp;
            EmployerProfile ep;
            if(profile instanceof StudentProfile){
                sp = (StudentProfile) profile;
                sp.setUserName(username);
                sp.setPassword(hashedPassword);
            }
                
            if(profile instanceof ProfessorProfile){
                pp = (ProfessorProfile) profile;
                pp.setUsername(username);
                pp.setPassword(hashedPassword);
            }
            if(profile instanceof EmployerProfile){
                ep = (EmployerProfile) profile;
                ep.setUsername(username);
                ep.setPassword(hashedPassword);
            }
                
            UserAccount userAccount = new UserAccount(profile, username, hashedPassword);
            
            userAccountList.add(userAccount);
            return userAccount;
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(UserAccountDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
       return null; 
    }
    
    public UserAccount findUserAccount(String id){
        for(UserAccount userAccount : userAccountList){
            if(userAccount.isMatch(id)){
                return userAccount;
            }
        }
        return null;
    }
    
    public UserAccount AuthenticateUser(String username, String password){
        for(UserAccount userAccount : userAccountList){
            if(userAccount.isValidUser(username, password)){
                return userAccount;
            }
        }
        return null;
    }
    
    public ArrayList<UserAccount> getUserAccountList(){
        return userAccountList;
    }
    public void updateUserName(String username, Profile profile){
          StudentProfile sp;
          ProfessorProfile pp;
          EmployerProfile ep;
            if(profile instanceof StudentProfile){
                sp = (StudentProfile) profile;
                sp.setUserName(username);
                UserAccountDirectory uad = new UserAccountDirectory();
                UserAccount user = uad.findUserAccount("Stu-"+sp.getFirstName());
                user.setUserName(username);
                
            }
                
            if(profile instanceof ProfessorProfile){
                pp = (ProfessorProfile) profile;
                pp.setUsername(username);
                UserAccountDirectory uad = new UserAccountDirectory();
                UserAccount user = uad.findUserAccount("Prof-"+pp.getFirstName());
                user.setUserName(username);
            }
            if(profile instanceof EmployerProfile){
                ep = (EmployerProfile) profile;
                ep.setUsername(username);
                UserAccountDirectory uad = new UserAccountDirectory();
                UserAccount user = uad.findUserAccount("Emp-"+ep.getEmployerName());
                user.setUserName(username);
            }      
    }
    public void updatePassword(String password, Profile profile){
        try {
            MessageDigest messageDigest =  MessageDigest.getInstance("SHA-256");
            byte[] md = messageDigest.digest(password.getBytes());
            BigInteger bigInt = new BigInteger(1, md);
            String hashedPassword = bigInt.toString(16);
            StudentProfile sp;
            ProfessorProfile pp;
            EmployerProfile ep;
            if(profile instanceof StudentProfile){
                sp = (StudentProfile) profile;
                sp.setPassword(hashedPassword);
                UserAccountDirectory uad = new UserAccountDirectory();
                UserAccount user = uad.findUserAccount("Stu-"+sp.getFirstName());
                user.setPassword(hashedPassword);
                
            }
                
            if(profile instanceof ProfessorProfile){
                pp = (ProfessorProfile) profile;
                pp.setPassword(hashedPassword);
                UserAccountDirectory uad = new UserAccountDirectory();
                UserAccount user = uad.findUserAccount("Prof-"+pp.getFirstName());
                user.setPassword(hashedPassword);
            }
            if(profile instanceof EmployerProfile){
                ep = (EmployerProfile) profile;
                ep.setPassword(hashedPassword);
                UserAccountDirectory uad = new UserAccountDirectory();
                UserAccount user = uad.findUserAccount("Emp-"+ep.getEmployerName());
                user.setPassword(hashedPassword);
            }      
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(UserAccountDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
