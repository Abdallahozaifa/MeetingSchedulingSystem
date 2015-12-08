/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meetingschedulingsystemtest;

import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author hozaifa
 */
public class MyTableModel extends AbstractTableModel{
    MeetingScheduleSystemMainMenu MSSMM = new MeetingScheduleSystemMainMenu();
    // the data of the table
        Object[][] data =  {
            {null, null},
            {null, null},
            {null, null},
            {null, null},
            {null, null},
            {null, null},
            {null, null},
            {null, null},
            {null, null},
            {null, null},
            {null, null},
            {null, null},
            {null, null},
            {null, null},
            {null, null},
            {null, null},
            {null, null},
            {null, null},
            {null, null},
            {null, null},
            {null, null},
            {null, null}
        };
        String[] columnNames = {
            "Meeting", "Rooms" 
        };
        
        @Override
        public void setValueAt(Object object, int row, int column){
            data[row][column] = object;
        }
         
        // sets the meeting name and room number in the table
        public void setMeetingName(){
            if(!MSSMM.meetingArray.isEmpty()){
                for(int i=0; i<MSSMM.meetingArray.size();i++){
                    data[i][0] = MSSMM.meetingArray.get(i).getMeetingName();
                    data[i][1] = Integer.toString(MSSMM.meetingArray.get(i).getRoom().getRoomNumber());       
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
