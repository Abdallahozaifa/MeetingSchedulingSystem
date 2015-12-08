/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meetingschedulingsystemtest;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author hozaifa
 */
class MyHourTableModel extends AbstractTableModel{
    MeetingScheduleSystemMainMenu MSSMM = new MeetingScheduleSystemMainMenu();

   Object[][] data =  {
            {"9:00 AM", null},
            {"10:00 AM", null},
            {"11:00 AM", null},
            {"12:00 PM", null},
            {"1:00 PM", null},
            {"2:00 PM", null},
            {"3:00 PM", null},
            {"4:00 PM", null}
        };
        String[] columnNames = {
            "Hour", "Meetings" 
        };
        
        @Override
        public void setValueAt(Object object, int row, int column){
            data[row][column] = object;
        }
   
        public void setMeetings(){
            if(!MSSMM.meetingArray.isEmpty()){
                for(int i=0; i<MSSMM.meetingArray.size();i++){
                    String meetingTime = MSSMM.meetingArray.get(i).getMeetingTime();
                    int meetingHour = Integer.parseInt(meetingTime);
                    String meetingName = MSSMM.meetingArray.get(i).getMeetingName();
                    switch(meetingHour){
                        case 9: data[i][1] = meetingName;
                                break;
                        case 10: data[i][1] = meetingName;
                                break;
                        case 11: data[i][1] = meetingName;
                                break;
                        case 12: data[i][1] = meetingName;
                                break;
                        case 1: data[i][1] = meetingName;
                                break;
                        case 2: data[i][1] = meetingName;
                                break;
                        case 3: data[i][1] = meetingName;
                                break;
                        case 4: data[i][1] = meetingName;
                                break;        
                    }  
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
