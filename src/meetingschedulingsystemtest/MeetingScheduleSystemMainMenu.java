/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meetingschedulingsystemtest;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;


/**
 *
 * @author hozaifa
 */
public class MeetingScheduleSystemMainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MeetingScheduleSystemMainMenu
     */
        static ArrayList<Person> personArray = new ArrayList<Person>();
        static ArrayList<Room> roomArray = new ArrayList<Room>();
        static ArrayList<Meeting> meetingArray = new ArrayList<Meeting>();

        
    public MeetingScheduleSystemMainMenu() {
        initComponents();
    }
    
    JFileChooser meetingsFileChooser = new JFileChooser();
    
    // returns meetings
    private void returnMeetings(){
        MeetingScheduleSystemMainMenu MSSMM = new MeetingScheduleSystemMainMenu();
        for(int i =0;i<MSSMM.meetingArray.size();i++){
            for(int j=0;j<MSSMM.meetingArray.get(i).getPersonArraySize();j++){
                
            }
        }
    }
    
    //serializes meetings and saves them to a .ser file in tmp folder
    private void serializeMeetings(){
      Data e = new Data();
//      e.meetingName = "Meeting Test";
//      e.meetingRoomNumber = 111;
//      e.meetingTime = 4;
//      Person person = new Person("Hozaifa", "Abdalla", "814-460-4252");
//      e.personArray.add(person); 
        for(int i=0;i<meetingArray.size();i++){
            e.meetingName = meetingArray.get(i).getMeetingName();
            e.meetingRoomNumber = meetingArray.get(i).getRoom().getRoomNumber();
            e.meetingTime = meetingArray.get(i).getMeetingTime();
            for(int j=0;j<meetingArray.get(i).getPersonArraySize();j++){
                e.personArray.add(meetingArray.get(i).getPersonArray().get(j));
            }
        }    
      try
      {
         FileOutputStream fileOut = new FileOutputStream("/tmp/Meeting.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in /tmp/Meeting.ser");
      }catch(IOException i)
      {
          i.printStackTrace();
      }
    }
    
    // deserializes meeting for when the a file is imported 
    public void deserializeMeetings(String fileName){
      Data e = null;
      try
      {
          // "/tmp/Meeting.ser"
         FileInputStream fileIn = new FileInputStream(fileName);
         ObjectInputStream in = new ObjectInputStream(fileIn);
         e = (Data) in.readObject();
         in.close();
         fileIn.close();
      }catch(IOException i)
      {
         i.printStackTrace();
         return;
      }catch(ClassNotFoundException c)
      {
         System.out.println("/tmp/Meeting.ser class not found");
         c.printStackTrace();
         return;
      }
      
      Room room = new Room(e.meetingRoomNumber);
      Meeting importedMeeting = new Meeting(e.meetingName,e.meetingTime,room, e.personArray);
      meetingArray.add(importedMeeting);
      
      System.out.println("Deserialized Employee...");
      System.out.println("Meeting Name: " + e.meetingName);
      System.out.println("Meeting Room: " + e.meetingRoomNumber);
      System.out.println("Meeting Time: " + e.meetingTime);
      for(int i=0;i<e.personArray.size();i++){
          System.out.printf("Person First Name: %s%n" , e.personArray.get(i).getFirstName());
          System.out.printf("Person Last Name: %s%n" , e.personArray.get(i).getLastName());
          System.out.printf("Person Phone Number: %s%n" , e.personArray.get(i).getPhoneNumber());
      }
    }
    
    private boolean fileSelected(){
        if(meetingsFileChooser.getSelectedFile() == null){
            return false;
        }
        return true;
    }
    
    private String getSelectedFileName(){
        String selectedFile = null;
        if(fileSelected()){
            selectedFile = meetingsFileChooser.getSelectedFile().getName();
        }
        return selectedFile;
    }
    
    private boolean validateFile(){
        String extension = null;
        
        if(fileSelected()){
            extension = getSelectedFileName().substring(getSelectedFileName().lastIndexOf(".") + 1, getSelectedFileName().length());
            String excel = "ser";
            if (!extension.equals(excel)) {
                JOptionPane.showMessageDialog(null, "Please select your meetings file!", "Error", JOptionPane.ERROR_MESSAGE);
                meetingsFileChooser.showDialog(new JFrame(""), null);
                return false;
            }
            else{
                JOptionPane.showMessageDialog(null, "Upload Successful!");    
            }
            return true;
        }
        else{
            return false;
        }
    }
    
    private void createJFileChooser(){
        JFileChooser meetingsFileChooser = new JFileChooser();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        applicationPanel = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jFileChooser1 = new javax.swing.JFileChooser();
        appTitle = new javax.swing.JLabel();
        mainMenuButtons = new javax.swing.JPanel();
        createMeeting = new javax.swing.JButton();
        deleteMeeting = new javax.swing.JButton();
        addPerson = new javax.swing.JButton();
        addRoom = new javax.swing.JButton();
        displayMeeting = new javax.swing.JButton();
        deletePerson = new javax.swing.JButton();
        displayRoom = new javax.swing.JButton();
        displayMeeting1 = new javax.swing.JButton();
        displayPerson = new javax.swing.JButton();
        DeletePersonFromMeeting = new javax.swing.JButton();
        AddPersonToMeeting = new javax.swing.JButton();
        deleteRoom = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        importMeetingsFile = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        saveButton = new javax.swing.JButton();

        javax.swing.GroupLayout applicationPanelLayout = new javax.swing.GroupLayout(applicationPanel);
        applicationPanel.setLayout(applicationPanelLayout);
        applicationPanelLayout.setHorizontalGroup(
            applicationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 231, Short.MAX_VALUE)
        );
        applicationPanelLayout.setVerticalGroup(
            applicationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 185, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        appTitle.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        appTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appTitle.setText("Meeting Scheduling System");
        appTitle.setToolTipText("Meeting Scheduling System");
        appTitle.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        appTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        mainMenuButtons.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Welcome to the Meeting Scheduling System", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Abyssinica SIL", 0, 14))); // NOI18N

        createMeeting.setText("Create Meeting");
        createMeeting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createMeetingActionPerformed(evt);
            }
        });

        deleteMeeting.setText("Delete Meeting");
        deleteMeeting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMeetingActionPerformed(evt);
            }
        });

        addPerson.setText("Add Person");
        addPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPersonActionPerformed(evt);
            }
        });

        addRoom.setText("Add Room");
        addRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRoomActionPerformed(evt);
            }
        });

        displayMeeting.setText("Display Meeting");
        displayMeeting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayMeetingActionPerformed(evt);
            }
        });

        deletePerson.setText("Delete Person");
        deletePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePersonActionPerformed(evt);
            }
        });

        displayRoom.setText("Display Room");
        displayRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayRoomActionPerformed(evt);
            }
        });

        displayMeeting1.setText("Display Meetings By Hour");
        displayMeeting1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayMeeting1ActionPerformed(evt);
            }
        });

        displayPerson.setText("Display Person");
        displayPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayPersonActionPerformed(evt);
            }
        });

        DeletePersonFromMeeting.setText("Delete Person from Meeting");
        DeletePersonFromMeeting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletePersonFromMeetingActionPerformed(evt);
            }
        });

        AddPersonToMeeting.setText("Add Person to Meeting");
        AddPersonToMeeting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPersonToMeetingActionPerformed(evt);
            }
        });

        deleteRoom.setText("Delete Room");
        deleteRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRoomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainMenuButtonsLayout = new javax.swing.GroupLayout(mainMenuButtons);
        mainMenuButtons.setLayout(mainMenuButtonsLayout);
        mainMenuButtonsLayout.setHorizontalGroup(
            mainMenuButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuButtonsLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(mainMenuButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(displayMeeting1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(displayMeeting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createMeeting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteMeeting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(59, 59, 59)
                .addGroup(mainMenuButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DeletePersonFromMeeting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(displayRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(mainMenuButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AddPersonToMeeting, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(deletePerson, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(displayPerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addPerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainMenuButtonsLayout.setVerticalGroup(
            mainMenuButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuButtonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainMenuButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mainMenuButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(createMeeting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(mainMenuButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuButtonsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(displayMeeting, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainMenuButtonsLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(mainMenuButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DeletePersonFromMeeting, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteMeeting, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddPersonToMeeting, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(mainMenuButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deletePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(mainMenuButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(displayPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(displayMeeting1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Import Meeting File", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Abyssinica SIL", 0, 14))); // NOI18N

        importMeetingsFile.setText("Import");
        importMeetingsFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importMeetingsFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(importMeetingsFile, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(importMeetingsFile, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Save Meetings ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Abyssinica SIL", 0, 14))); // NOI18N

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(appTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mainMenuButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(216, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(appTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(mainMenuButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createMeetingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createMeetingActionPerformed
        
        CreateMeetingMenu createMeetingMenu = new CreateMeetingMenu();
        createMeetingMenu.setVisible(true);
        String meetingName = createMeetingMenu.getMeetingNameTF();
        System.out.println(meetingName);

    }//GEN-LAST:event_createMeetingActionPerformed

    private void addRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRoomActionPerformed
        AddRoomMenu addRoomMenu = new AddRoomMenu();
        addRoomMenu.setVisible(true);
    }//GEN-LAST:event_addRoomActionPerformed

    private void addPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPersonActionPerformed
        AddPersonMenu addPersonMenu = new AddPersonMenu();
        addPersonMenu.setVisible(true);
    }//GEN-LAST:event_addPersonActionPerformed

    private void deleteMeetingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMeetingActionPerformed
        DeleteMeeting deleteMeetingMenu = new DeleteMeeting();
        deleteMeetingMenu.setVisible(true);
    }//GEN-LAST:event_deleteMeetingActionPerformed

    private void deleteRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRoomActionPerformed
        DeleteRoom deleteRoomMenu = new DeleteRoom();
        deleteRoomMenu.setVisible(true);
    }//GEN-LAST:event_deleteRoomActionPerformed

    private void deletePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePersonActionPerformed
        DeletePerson deletePersonMenu = new DeletePerson();
        deletePersonMenu.setVisible(true);
    }//GEN-LAST:event_deletePersonActionPerformed

    private void displayMeetingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayMeetingActionPerformed
        DisplayMeeting displayMeetingMenu = new DisplayMeeting();
        displayMeetingMenu.setVisible(true);
    }//GEN-LAST:event_displayMeetingActionPerformed

    private void displayRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayRoomActionPerformed
        DisplayRoom displayroomMenu = new DisplayRoom();
        displayroomMenu.setVisible(true);
    }//GEN-LAST:event_displayRoomActionPerformed

    private void displayPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayPersonActionPerformed
        DisplayPerson displayPerson = new DisplayPerson();
        displayPerson.setVisible(true);
    }//GEN-LAST:event_displayPersonActionPerformed

    private void displayMeeting1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayMeeting1ActionPerformed
        DisplayMeetingsByHour displayMeetingByHour = new DisplayMeetingsByHour();
        displayMeetingByHour.setVisible(true);
    }//GEN-LAST:event_displayMeeting1ActionPerformed

    private void DeletePersonFromMeetingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletePersonFromMeetingActionPerformed
        DeletePersonFromMeetingMenu deletePersonFromMeetingMenu = new DeletePersonFromMeetingMenu();
        deletePersonFromMeetingMenu.setVisible(true);
    }//GEN-LAST:event_DeletePersonFromMeetingActionPerformed

    private void AddPersonToMeetingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPersonToMeetingActionPerformed
        AddPersonToMeetingMenu addPersonToMeetngMenu = new AddPersonToMeetingMenu();
        addPersonToMeetngMenu.setVisible(true);
    }//GEN-LAST:event_AddPersonToMeetingActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
            String file_name = "C:\\Desktop\\NetBeanProjects\\MeetingSchedulingSystem\\src.txt";
            MeetingScheduleSystemMainMenu MSSMM = new MeetingScheduleSystemMainMenu();
            serializeMeetings();
            try{
                WriteFile data = new WriteFile(file_name,true);
                data.writeToFile("Meeting Name" + "        " + " Meeting Room" + "     " + "Meeting Time" + "   " + "Meeting Attendees");
                data.writeToFileEndLine();     
                for(int i =0;i<MSSMM.meetingArray.size();i++){
                    String meetingName = MSSMM.meetingArray.get(i).getMeetingName();
                    String meetingRoom = Integer.toString(MSSMM.meetingArray.get(i).getRoom().getRoomNumber());
                    String meetingTime = MSSMM.meetingArray.get(i).getMeetingTime() + ":00";
                    int count=0;
                    for(int k=0;k<21-meetingName.length();k++){
                        count++;
                    }
                    data.writeToFile(meetingName + data.writeToFileNumberOfSpaces(count) + meetingRoom + "              " + meetingTime);
                    for(int j=0;j<MSSMM.meetingArray.get(i).getPersonArraySize();j++){
                       String person = MSSMM.meetingArray.get(i).getFullName(j);
                       if(j>=1){
                           data.writeToFile("                                                     " + person);
                       }
                       else{
                           data.writeToFile("           " + person);
                       }
                       
                       data.writeToFileEndLine();
                    }
                    data.writeToFile("");
                    data.writeToFile("");
                }
                JOptionPane.showMessageDialog(null, "Your Meetings were successfully Saved!", "Successful", JOptionPane.INFORMATION_MESSAGE);
            }catch(IOException e){
                System.out.println(e.getMessage());
                dispose();
                JOptionPane.showMessageDialog(null, "Unfortunately there was in error in saving your meetings please try again!", "Error", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void importMeetingsFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importMeetingsFileActionPerformed
        MeetingScheduleSystemMainMenu MSSMM = new MeetingScheduleSystemMainMenu();
        meetingsFileChooser.showDialog(new JFrame(""), null);
        if(meetingsFileChooser.getSelectedFile() != null){
            File selectedFile = meetingsFileChooser.getSelectedFile();
            System.out.println(selectedFile.getParent());
            System.out.println(selectedFile.getName());
        }
        
        if(validateFile()){
            MSSMM.deserializeMeetings(meetingsFileChooser.getSelectedFile().getAbsolutePath());       
        }

    }//GEN-LAST:event_importMeetingsFileActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MeetingScheduleSystemMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MeetingScheduleSystemMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MeetingScheduleSystemMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MeetingScheduleSystemMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MeetingScheduleSystemMainMenu().setVisible(true);
               
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddPersonToMeeting;
    private javax.swing.JButton DeletePersonFromMeeting;
    private javax.swing.JButton addPerson;
    private javax.swing.JButton addRoom;
    private javax.swing.JLabel appTitle;
    private javax.swing.JPanel applicationPanel;
    private javax.swing.JButton createMeeting;
    private javax.swing.JButton deleteMeeting;
    private javax.swing.JButton deletePerson;
    private javax.swing.JButton deleteRoom;
    private javax.swing.JButton displayMeeting;
    private javax.swing.JButton displayMeeting1;
    private javax.swing.JButton displayPerson;
    private javax.swing.JButton displayRoom;
    private javax.swing.JButton importMeetingsFile;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel mainMenuButtons;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables

   
}


