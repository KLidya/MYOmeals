/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.com;

/**
 *
 * @author User
 */
public class Contact {
    private String firstname;
    private String lastname;
    private String email;
    private String massage;

    @Override
    public String toString() {
        return "Contact{" + "firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", massage=" + massage + '}';
    }
    
    

    public Contact(String firstname, String lastname, String email, String massage) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.massage = massage;
    }
    
    

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }
    
    

   
    
    

    
}
