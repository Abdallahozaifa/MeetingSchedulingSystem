/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meetingschedulingsystemtest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author hozaifa
 */
public class SerializeDemo {
    public static void main(String [] args)
    {
      Data e = new Data();
      e.meetingName = "Meeting Test";
      e.meetingRoomNumber = 111;
      e.meetingTime = "4";
      Person person = new Person("Hozaifa", "Abdalla", "814-460-4252");
      e.personArray.add(person); 

      
      try
      {
         FileOutputStream fileOut = new FileOutputStream("/tmp/Meeting.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in /Desktop/NetBeanProjects/MeetingSchedulingSystem/src.ser");
      }catch(IOException i)
      {
          i.printStackTrace();
      }
    }
}
