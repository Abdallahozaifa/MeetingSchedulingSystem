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

    // gets the meeting name
    public String getMeetingName() {
        return meetingName;
    }
    
    // returns the meeting time
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
    
    // adds a person
    public void addPerson(Person person){
       this.person.add(person);
    }
    
    // removes a person at the selected index
    public void removePersonAt(int i){
        this.person.remove(i);
    }
    
    // returns the amount of people in the meeting
    public int getPersonArraySize(){
        return person.size();
    }
    
    // gets the person at the selected element
    public Person getPersonAtElement(int i){
        return person.get(i);
    }
    
    // returns the room associated with the meeting
    public Room getRoom(){
        return room;
    }
    
    //returns the array list of people attending the meeting
    public ArrayList<Person> getPersonArray(){
        return person;
    }

    // returns the full name of selected person
    public String getFullName(int i){
        String fName =  person.get(i).getFirstName();
        String lName = person.get(i).getLastName();
        String pNumber = person.get(i).getPhoneNumber();
        return fName + " " + lName + " " + pNumber;
    }

     
    @Override
    public String toString(){
        return String.format("Meeting Name: %s %nMeeting Time: %s %n ", getMeetingName(), getMeetingTime());
    }
    
}
