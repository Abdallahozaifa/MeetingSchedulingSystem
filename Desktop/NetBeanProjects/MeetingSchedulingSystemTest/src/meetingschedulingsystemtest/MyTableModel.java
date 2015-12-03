/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meetingschedulingsystemtest;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author hozaifa
 */
public class MyTableModel extends AbstractTableModel{
    MeetingScheduleSystemMainMenu MSSMM = new MeetingScheduleSystemMainMenu();
        Object[][] data =  {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        };
        String[] columnNames = {
            "Meeting", "Rooms", "Attendees", "Title 4"
        };

        
        
        public void setMeetingName(){
            if(!MSSMM.meetingArray.isEmpty()){
                for(int i=0; i<MSSMM.meetingArray.size();i++){
                    data[i][0] = MSSMM.meetingArray.get(i).getMeetingName();
                }
            }
        }
        
        public void setRoomNumber(){
            if(!MSSMM.roomArray.isEmpty()){
                for(int i=0; i<MSSMM.roomArray.size();i++){
                    data[i][1] = Integer.toString(MSSMM.roomArray.get(i).getRoomNumber());
                    System.out.printf("%nRoom Number: %s", MSSMM.roomArray.get(i).getRoomNumber());
                }
            }
        }
        
       
        
            
        @Override
        public int getRowCount() {
            return data.length;
        }

        @Override
        public int getColumnCount() {
            return columnNames.length; 
        }

        @Override
        public Object getValueAt(int i, int i1) {
            return data[i][i1]; 
        }
        
        @Override
        public boolean isCellEditable(int row, int col)
        {
            return false; 
        }
        
        @Override
        public String getColumnName(int columnIndex){
            return columnNames[columnIndex];
        }
        
    
}
