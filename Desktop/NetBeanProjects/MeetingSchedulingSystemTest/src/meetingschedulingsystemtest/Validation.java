/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meetingschedulingsystemtest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author hozaifa
 */
public class Validation {
     // validate first name through regular expression so that the only input that it will take in is the format below
   public static boolean validateFirstName( String firstName )
   {
      return firstName.matches( "[A-Z][a-zA-Z]*" );
   } 
   
    // validate last name through regular expression so that the only input that it will take in is the format below
   public static boolean validateLastName( String lastName )
   {
      return lastName.matches( "[a-zA-z]+([ '-][a-zA-Z]+)*" );
   }
   
   // validates phone number through regular expression so that the format of the input is XXX-XXX-XXXX
   public static boolean validPhoneNumber(String phoneNumber){
        return phoneNumber.matches("\\d{3}-\\d{3}-\\d{4}");
    }
   
   //validates phone number through regular expression so that the only a 2 or 3 digit number can be entered
   public static boolean validateRoomNumber(String roomNumber){
       return roomNumber.matches("\\d{3}|d{2}");
   }
   
   //validates the meeting name so that only letters can be entered
   public static boolean validateMeetingName(String meetingName){
       return meetingName.matches("[a-zA-Z]");
   }
}
