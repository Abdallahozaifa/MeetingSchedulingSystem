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
public class Room {
    // room attributes
    private int roomNumber;
    private Meeting meeting;
    
    // a room only requires the room number and not the meetings in it
    public Room(int roomNumber){
        this.roomNumber = roomNumber;
    }
    
    public Room(int roomNumber, Meeting meeting){
        this.roomNumber = roomNumber;
        this.meeting = meeting;
    }
   
    
    public int getRoomNumber(){
        return roomNumber;
    }
    
    @Override
    public String toString(){
        return String.format("Room Number: %d", getRoomNumber());
    }
    
    
}
