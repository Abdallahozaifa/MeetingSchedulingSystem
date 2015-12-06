/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meetingschedulingsystemtest;

/**
 *
 * @author hozaifa
 */
public class Person implements java.io.Serializable{
    // Person's attributes
    private String firstName;
    private String lastName;
    private String phoneNumber;
    
     public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    //created a constructor that requires the person's first name, last name, and phonenumber
    public Person(String firstName, String lastName, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }
    
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    @Override
    public String toString(){
        return String.format("%s %n%s %n", getFirstName(), getLastName(), getPhoneNumber());
    }
    
    
    
}
