/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meetingschedulingsystemtest;

import javax.swing.JOptionPane;

/**
 *
 * @author hozaifa
 */
public class AddPersonMenu extends javax.swing.JFrame {

    /**
     * Creates new form AddPersonMenu
     */
    public AddPersonMenu() {
        initComponents();
        initPlaceHolderText();
        
    }

    public String getFirstName(){
        return firstNamePersonMenuTF.getText();
    }
    public String getLastName(){
        return lastNamePersonMenuTF.getText();
    }
    public String getPhoneNumber(){
        return phoneNumberPersonMenuTF.getText();
    }
    MeetingScheduleSystemMainMenu MSSMM = new MeetingScheduleSystemMainMenu();
    Meeting meeting = new Meeting();
    
    private void initPlaceHolderText(){
        firstNamePersonMenuTF.setText("Dave");
        lastNamePersonMenuTF.setText("Johnson");
        phoneNumberPersonMenuTF.setText("XXX-XXX-XXXX");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addPersonPanel = new javax.swing.JPanel();
        firstNamePersonLabel = new javax.swing.JLabel();
        lastNamePersonLabel = new javax.swing.JLabel();
        phoneNumberPersonLabel = new javax.swing.JLabel();
        firstNamePersonMenuTF = new javax.swing.JTextField();
        lastNamePersonMenuTF = new javax.swing.JTextField();
        phoneNumberPersonMenuTF = new javax.swing.JTextField();
        submitPersonMenuPanel = new javax.swing.JPanel();
        submitPersonMenuButton = new javax.swing.JButton();

        addPersonPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Person", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Abyssinica SIL", 0, 14))); // NOI18N

        firstNamePersonLabel.setText("First Name:");

        lastNamePersonLabel.setText("Last Name:");

        phoneNumberPersonLabel.setText("Phone Number: ");

        firstNamePersonMenuTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                firstNamePersonMenuTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstNamePersonMenuTFFocusLost(evt);
            }
        });

        lastNamePersonMenuTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lastNamePersonMenuTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lastNamePersonMenuTFFocusLost(evt);
            }
        });

        phoneNumberPersonMenuTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phoneNumberPersonMenuTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                phoneNumberPersonMenuTFFocusLost(evt);
            }
        });

        submitPersonMenuPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Submit", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Abyssinica SIL", 0, 14))); // NOI18N

        submitPersonMenuButton.setText("Submit");
        submitPersonMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitPersonMenuButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout submitPersonMenuPanelLayout = new javax.swing.GroupLayout(submitPersonMenuPanel);
        submitPersonMenuPanel.setLayout(submitPersonMenuPanelLayout);
        submitPersonMenuPanelLayout.setHorizontalGroup(
            submitPersonMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, submitPersonMenuPanelLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(submitPersonMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        submitPersonMenuPanelLayout.setVerticalGroup(
            submitPersonMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(submitPersonMenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(submitPersonMenuButton)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout addPersonPanelLayout = new javax.swing.GroupLayout(addPersonPanel);
        addPersonPanel.setLayout(addPersonPanelLayout);
        addPersonPanelLayout.setHorizontalGroup(
            addPersonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPersonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addPersonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(addPersonPanelLayout.createSequentialGroup()
                        .addComponent(lastNamePersonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lastNamePersonMenuTF, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addPersonPanelLayout.createSequentialGroup()
                        .addComponent(firstNamePersonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(firstNamePersonMenuTF, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addPersonPanelLayout.createSequentialGroup()
                        .addComponent(phoneNumberPersonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(phoneNumberPersonMenuTF, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(submitPersonMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        addPersonPanelLayout.setVerticalGroup(
            addPersonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPersonPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(addPersonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPersonPanelLayout.createSequentialGroup()
                        .addGroup(addPersonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstNamePersonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNamePersonMenuTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(addPersonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastNamePersonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastNamePersonMenuTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(submitPersonMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(addPersonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberPersonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumberPersonMenuTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addPersonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addPersonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitPersonMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitPersonMenuButtonActionPerformed
        Validation validation = new Validation();
        boolean validFirstName = validation.validateFirstName(getFirstName());
        boolean validLastName = validation.validateLastName(getLastName());
        boolean validPhoneNumber = validation.validPhoneNumber(getPhoneNumber());
        String firstNumber = getPhoneNumber().substring(0, 1);
        System.out.printf("First Number: %s%n", firstNumber);
        if(!validFirstName || ! validLastName || !validPhoneNumber || firstNumber.equals("0")){
            dispose();
            JOptionPane.showMessageDialog(null, "Please Enter a valid first name, last name, and phone number in the correct format!", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            AddPersonMenu addPersonMenu = new AddPersonMenu();
            // for testing purposes only
//            if(!validFirstName){
//                System.out.println(("First Name InValid"));
//            }
//            if(!validLastName){
//                System.out.println(("Last Name InValid"));
//            }
//             if(!validPhoneNumber){
//                System.out.println(("Phone Number InValid"));
//            }
            
            addPersonMenu.setVisible(true);
        }
        else{
            System.out.printf("First Name: %s%n",getFirstName());
            System.out.printf("Last Name: %s%n", getLastName());
            System.out.printf("Phone Number: %s%n" ,getPhoneNumber());
            Person person = new Person(getFirstName(), getLastName(), getPhoneNumber());
            MSSMM.personArray.add(person);
            System.out.printf("Person Array: %d%n%n%n", MSSMM.personArray.size()); 
            dispose();
        }
    }//GEN-LAST:event_submitPersonMenuButtonActionPerformed

    private void firstNamePersonMenuTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNamePersonMenuTFFocusGained
        firstNamePersonMenuTF.setText("");
    }//GEN-LAST:event_firstNamePersonMenuTFFocusGained

    private void lastNamePersonMenuTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNamePersonMenuTFFocusGained
        lastNamePersonMenuTF.setText("");
    }//GEN-LAST:event_lastNamePersonMenuTFFocusGained

    private void phoneNumberPersonMenuTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneNumberPersonMenuTFFocusGained
        phoneNumberPersonMenuTF.setText("");
    }//GEN-LAST:event_phoneNumberPersonMenuTFFocusGained

    private void firstNamePersonMenuTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNamePersonMenuTFFocusLost
      
    }//GEN-LAST:event_firstNamePersonMenuTFFocusLost

    private void lastNamePersonMenuTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNamePersonMenuTFFocusLost
        
    }//GEN-LAST:event_lastNamePersonMenuTFFocusLost

    private void phoneNumberPersonMenuTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneNumberPersonMenuTFFocusLost
       
    }//GEN-LAST:event_phoneNumberPersonMenuTFFocusLost

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
            java.util.logging.Logger.getLogger(AddPersonMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPersonMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPersonMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPersonMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPersonMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addPersonPanel;
    private javax.swing.JLabel firstNamePersonLabel;
    private javax.swing.JTextField firstNamePersonMenuTF;
    private javax.swing.JLabel lastNamePersonLabel;
    private javax.swing.JTextField lastNamePersonMenuTF;
    private javax.swing.JLabel phoneNumberPersonLabel;
    private javax.swing.JTextField phoneNumberPersonMenuTF;
    private javax.swing.JButton submitPersonMenuButton;
    private javax.swing.JPanel submitPersonMenuPanel;
    // End of variables declaration//GEN-END:variables
}
