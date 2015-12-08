/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meetingschedulingsystemtest;
import java.io.*;
/**
 *
 * @author hozaifa
 */
public class DeSerializeDemo {
    public static void main(String [] args)
   {
      Data e = null;
      try
      {
         FileInputStream fileIn = new FileInputStream("/tmp/Meeting.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         e = (Data) in.readObject();
         in.close();
         fileIn.close();
      }catch(IOException i)
      {
         i.printStackTrace();
         return;
      }catch(ClassNotFoundException c)
      {
         System.out.println(" /tmp/Meeting.ser class not found");
         c.printStackTrace();
         return;
      }
      System.out.println("Deserialized Employee...");
      System.out.println("Meeting Name: " + e.meetingName);
      System.out.println("Meeting Room: " + e.meetingRoomNumber);
      System.out.println("Meeting Time: " + e.meetingTime);
      for(int i=0;i<e.personArray.size();i++){
          System.out.printf("Person First Name: %s%n" , e.personArray.get(i).getFirstName());
          System.out.printf("Person Last Name: %s%n" , e.personArray.get(i).getLastName());
          System.out.printf("Person Phone Number: %s%n" , e.personArray.get(i).getPhoneNumber());
      }
      
    }
}
