/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meetingschedulingsystemtest;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author hozaifa
 */
class MyPersonHandler extends MouseAdapter{
    
    public void mouseClicked(MouseEvent evt) {
        MeetingScheduleSystemMainMenu MSSMM = new MeetingScheduleSystemMainMenu();
        JList list = (JList)evt.getSource();
        MeetingsForEachPersonMenu meetingsForEachPersonMenu = new MeetingsForEachPersonMenu();
        
        if (evt.getClickCount() == 1) {
            // Double-click detected
            int index = list.locationToIndex(evt.getPoint());
            String selectedValue = list.getSelectedValue().toString();
            int selectedIndex = list.getSelectedIndex();
            System.out.printf("Selected Value: %s%n", selectedValue);
            for(int i=0;i<MSSMM.meetingArray.size();i++){
                for(int j=0;j<MSSMM.meetingArray.get(i).getPersonArraySize();j++){
                    String fullName = MSSMM.meetingArray.get(i).getFullName(j);
                    System.out.printf("Full Name: %s%n", fullName);
                    if(fullName.equals(selectedValue)){
                        System.out.println("This Person Exists in this Meeting!");
                        DefaultListModel data = new DefaultListModel();                 
                        data.add(j,MSSMM.meetingArray.get(j).getMeetingName());
                        meetingsForEachPersonMenu.meetingsPeopleList.setModel(data);
                    }
                }
                meetingsForEachPersonMenu.setVisible(true);
            }
        } 
    }
}
