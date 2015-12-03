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
public class Meeting {
    // Meeting attributes
    private String meetingName;
    private String meetingTime;
    private Room room;
    private ArrayList<Person> person;

    public String getMeetingName() {
        return meetingName;
    }

    public String getMeetingTime() {
        return meetingTime;

    }
    //meetings require the name, time, room, and people attending
    public Meeting(String meetingName, String meetingTime, Room room, ArrayList<Person> person){
        this.meetingName = meetingName;
        this.meetingTime = meetingTime;
        this.room = room;
        this.person = person;
    }
    public Meeting(String meetingName){
        this.meetingName = meetingName;
    }
    public Meeting(String meetingName, String meetingTime, Room room){
        this.meetingName = meetingName;
        this.meetingTime = meetingTime;
        this.room = room;
    }
    
    public Meeting(){
    }
    
    public void addPerson(Person person){
       this.person = new ArrayList<Person>();
       this.person.add(person);
    }
    public int getPersonSize(){
        return person.size();
    }
    
    public Person getPersonAtElement(int i){
        return person.get(i);
    }
   
    
    @Override
    public String toString(){
        return String.format("Meeting Name: %s %nMeeting Time: %s %n ", getMeetingName(), getMeetingTime());
    }
    
}
