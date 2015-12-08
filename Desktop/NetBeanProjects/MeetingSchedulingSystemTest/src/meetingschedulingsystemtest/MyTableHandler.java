/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meetingschedulingsystemtest;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListModel;
import javax.swing.JTable;

/**
 *
 * @author hozaifa
 */
class MyTableHandler extends MouseAdapter{
    MeetingScheduleSystemMainMenu MSSMM = new MeetingScheduleSystemMainMenu();
    int row;
    
    public void mousePressed(MouseEvent e) {
                JTable target = (JTable)e.getSource();
                row = target.getSelectedRow();
                
                //System.out.printf("Real Selected Row: %d%n", row);
                int column = target.getSelectedColumn();
                PeopleInMeetingMenu peopleInMeetingMenu = new PeopleInMeetingMenu();
                MeetingsInRoomsMenu meetingsInRoomMenu = new MeetingsInRoomsMenu();
                DefaultListModel data = new DefaultListModel();
                peopleInMeetingMenu.attendeesList.setModel(data);
                meetingsInRoomMenu.meetingsRoomList.setModel(data);
                //check to see where they click 
                for(int i=0; i<MSSMM.meetingArray.size();i++){
                    if (e.getClickCount() == 1 && row == i && column == 0) {
                        peopleInMeetingMenu.setVisible(true);
                        System.out.printf("Value is: %s%n", target.getValueAt(row, 0));
                        for(int j=0;j<MSSMM.meetingArray.get(row).getPersonArraySize();j++){
                             String firstName = MSSMM.meetingArray.get(row).getPersonArray().get(j).getFirstName();
                             String lastName = MSSMM.meetingArray.get(row).getPersonArray().get(j).getLastName();
                             String fullName = firstName + " " + lastName;
                             data.add(j, fullName);
                        }
                    System.out.println("Mouse Listener works!");
                    }
                    else if(e.getClickCount() == 1 && row == i && column == 1){
                        for(int j=0;j<MSSMM.meetingArray.size();j++){
                            meetingsInRoomMenu.setVisible(true);
                            String roomNum = target.getValueAt(row, 1).toString();
                            String meetingRoomNum = Integer.toString(MSSMM.meetingArray.get(j).getRoom().getRoomNumber());
                             if(meetingRoomNum.equals(roomNum)){
                                 data.add(j,MSSMM.meetingArray.get(j).getMeetingName());
                             }
                        }
                    }
                    
                }
    }  
}
