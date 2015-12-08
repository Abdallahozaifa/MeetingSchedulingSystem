/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meetingschedulingsystemtest;

import java.util.ArrayList;

/**
 *
 * @author hozaifa
 */
public class Data implements java.io.Serializable{
    public String meetingName;
    public int meetingRoomNumber;
    public String meetingTime;
    public ArrayList<Person> personArray = new ArrayList<>();
   
}
