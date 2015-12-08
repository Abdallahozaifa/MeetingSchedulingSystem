/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meetingschedulingsystemtest;

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author hozaifa
 */
public class MeetingSchedulingSystemTest extends JFrame{

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        MeetingScheduleSystemMainMenu MSSMM = new MeetingScheduleSystemMainMenu();
        MSSMM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MSSMM.setSize(1200,950);
        MSSMM.setResizable(false);
        MSSMM.setVisible(true);
        MSSMM.setLocation(370, 40);
        MSSMM.setTitle("Meeting Scheduling System");
    }
    
}
