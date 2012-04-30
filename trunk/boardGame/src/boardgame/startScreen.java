/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame;

import javax.swing.JTextField;
import javax.swing.*;
import java.io.*;

/**
 *
 * @author Don
 */
public class startScreen extends javax.swing.JFrame {

    // declare variables 
    public static board myBoard = new board();
    
    public static int numberOfPlayers = 2;
    
    // helpPage declarations.
 
    public static helpPage myHelpPage = new helpPage(); 
    
    /**
     * Creates new form startScreen
     */
    public startScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        spnNumberOfPlayers = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        chkPlayer1 = new javax.swing.JCheckBox();
        chkPlayer2 = new javax.swing.JCheckBox();
        chkPlayer3 = new javax.swing.JCheckBox();
        chkPlayer4 = new javax.swing.JCheckBox();
        chkPlayer5 = new javax.swing.JCheckBox();
        chkPlayer6 = new javax.swing.JCheckBox();
        sldrRetirement = new javax.swing.JSlider();
        lblRetirementInfo = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lblPlayer1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Game Of Life");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 64)); // NOI18N
        jLabel1.setText("Game of Life");

        spnNumberOfPlayers.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        spnNumberOfPlayers.setModel(new javax.swing.SpinnerNumberModel(2, 2, 6, 1));
        spnNumberOfPlayers.setMaximumSize(new java.awt.Dimension(0, 0));
        spnNumberOfPlayers.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                onChangeNumber2(evt);
            }
        });
        spnNumberOfPlayers.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                onChangeNumber1(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel3.setText("Players");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton1.setText("Start Game");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        sldrRetirement.setMajorTickSpacing(10);
        sldrRetirement.setMinimum(10);
        sldrRetirement.setMinorTickSpacing(10);
        sldrRetirement.setOrientation(javax.swing.JSlider.VERTICAL);
        sldrRetirement.setSnapToTicks(true);
        sldrRetirement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                printLabel(evt);
            }
        });

        lblRetirementInfo.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblRetirementInfo.setText("50");

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton2.setText("Help");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblPlayer1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblPlayer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player_5.png"))); // NOI18N
        lblPlayer1.setText("Player 1");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player_1.png"))); // NOI18N
        jLabel4.setText("Player 2");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player_2.png"))); // NOI18N
        jLabel5.setText("Player 3");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player_3.png"))); // NOI18N
        jLabel6.setText("Player 4");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player_4.png"))); // NOI18N
        jLabel7.setText("Player 5");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player_6.png"))); // NOI18N
        jLabel8.setText("Player 6");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel2.setText("Check to go to College");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sldrRetirement, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblRetirementInfo)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spnNumberOfPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(chkPlayer2)
                                                    .addComponent(chkPlayer1, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(chkPlayer3, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(chkPlayer4, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(chkPlayer5, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblPlayer1)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel7)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(chkPlayer6)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel8)))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(spnNumberOfPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkPlayer1)
                            .addComponent(lblPlayer1))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkPlayer2)
                            .addComponent(jLabel4))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkPlayer3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkPlayer4)
                            .addComponent(jLabel6))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(chkPlayer5)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkPlayer6)
                            .addComponent(jLabel8)))
                    .addComponent(sldrRetirement, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(lblRetirementInfo))
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-385)/2, (screenSize.height-352)/2, 385, 352);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    /**  
    |-----------------------------------------------|
    | jButton1ActionPerformed                       |
    |-----------------------------------------------|
    |                                               |
    |  [x] Purpose                                  |
    |      runs a few bits and pieces when the      |
    |      button at the bottom of the form is      |
    |      clicked - setting up the board and game  |
    |                                               |
    |  [x] Controls Affected/Used                   |
    |      StartButton at the bottom of the form    |
    |                                               |
    |                                               |
    |                                               |
    |-----------------------------------------------|
    */

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                JLabel labels[] = myBoard.getPlayerNames();
                JTextField textFields[] = {jTextField1, jTextField2, jTextField3, jTextField4, jTextField5, jTextField6};
                JCheckBox collegeCheck[] = {chkPlayer1, chkPlayer2, chkPlayer3, chkPlayer4, chkPlayer5, chkPlayer6};
                    
                //set players to college or not 
                for (int i = 0; i < collegeCheck.length; i++) {

                    if (collegeCheck[i].isSelected()) {
                        BoardGame.missionControl.players[i].changeIsland(2);
                    }
                }
                

                numberOfPlayers = (int) spnNumberOfPlayers.getValue();

                boolean namesEntered =  false;
                
                for(int i=0;i<numberOfPlayers;i++){
                    if(textFields[i].getText().equals("")){
                        BoardGame.missionControl.MessageBoxShow("Please ensure all names are entered", "Validation Error");
                        namesEntered=false;
                        break;
                    }
                    else
                        namesEntered=true;
                }
                
                if (namesEntered==true)
                {
                   int spinnerValue = (int) spnNumberOfPlayers.getValue();
                   for (int i = 0; i < spinnerValue; i++) {
                        labels[i].setText(textFields[i].getText());
                        }
                   BoardGame.missionControl.setLifespan(sldrRetirement.getValue());
                   numberOfPlayers = ((int) spnNumberOfPlayers.getValue() - 1);
                   BoardGame.missionControl.setUp();
                   myBoard.setVisible(true);
                    

                   //Event Log Window set to visible
                   //BoardGame.missionControl.MessageBoxShow(Integer.toString(BoardGame.missionControl.getLifespan()), "Validation Error");
                   //BoardGame.missionControl.MessageBoxShow(Integer.toString(BoardGame.missionControl.getLifespan()), "Validation Error");
                   dispose(); //  disposes the current form - in this case it is the start form when the user selects players and such.
                
                }
        }});

    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    
    /**  
    |-----------------------------------------------|
    | onChangeNumber2                               |
    |-----------------------------------------------|
    |                                               |
    |  [x] Purpose                                  |
    |      Sets the initial amount of text boxes    |
    |      enabled for the user to type             |
    |      player names                             | 
    |                                               |
    |  [x] Controls Affected/Used                   |
    |      Spinner Control on the Start Form        |
    |                                               |
    |      spnNumberOfPlayers                       |
    |                                               |
    |                                               |
    |-----------------------------------------------|
    */
    private void onChangeNumber2(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_onChangeNumber2
        int numberOfPlayers = (int) spnNumberOfPlayers.getValue();
        
        JTextField[] fields = getTextFields();
        
        for(int i =numberOfPlayers-1; i!=0; i--){
            fields[i].setEnabled(true); 
         for(int j=5;j!=numberOfPlayers-1;j--){
            fields[j].setEnabled(false);
        }
        }
        
        /*
        if (numberOfPlayers == 2)
        {
            jTextField6.setEnabled(false);
            jTextField5.setEnabled(false);
            jTextField4.setEnabled(false);
            jTextField3.setEnabled(false);
        }
        
        if (numberOfPlayers == 3)
        {
            jTextField6.setEnabled(false);
            jTextField5.setEnabled(false);
            jTextField4.setEnabled(false);
            jTextField3.setEnabled(true);
        }
        
        if (numberOfPlayers == 4)
        {
            jTextField6.setEnabled(false);
            jTextField5.setEnabled(false);
            jTextField4.setEnabled(true);
            jTextField3.setEnabled(true);
        }
        
        if (numberOfPlayers == 5)
        {
            jTextField6.setEnabled(false);
            jTextField5.setEnabled(true);
            jTextField4.setEnabled(true);
            jTextField3.setEnabled(true);
        }
        
        if (numberOfPlayers == 6)
        {
            jTextField6.setEnabled(true);
            jTextField5.setEnabled(true);
            jTextField4.setEnabled(true);
            jTextField3.setEnabled(true);
        }*/
    }//GEN-LAST:event_onChangeNumber2

    
    
    /**  
    |-----------------------------------------------|
    | onChangeNumber1                               |
    |-----------------------------------------------|
    |                                               |
    |  [x] Purpose                                  |
    |      Sets the textboxes on the form to        | 
    |      enabled or Disabled after each           |
    |      Change made to the spinner               |
    |  
    | [x] Controls Affected/Used                    |
    |      Spinner Control on the Start Form        |
    |                                               |
    |      spnNumberOfPlayers                       |
    |                                               |
    |                                               |
    |-----------------------------------------------|
    */
    private void onChangeNumber1(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_onChangeNumber1
        int numberOfPlayers = (int) spnNumberOfPlayers.getValue();
          
        JTextField[] fields = getTextFields();
        
        for(int i=5;i!=numberOfPlayers-1;i--){
            fields[i].setEnabled(false);
        }
        
        
        /*
        if (numberOfPlayers == 2)
        {
            jTextField6.setEnabled(false);
            jTextField5.setEnabled(false);
            jTextField4.setEnabled(false);
            jTextField3.setEnabled(false);
        }
        
        if (numberOfPlayers == 3)
        {
            jTextField6.setEnabled(false);
            jTextField5.setEnabled(false);
            jTextField4.setEnabled(false);
            jTextField3.setEnabled(true);
        }
        
        if (numberOfPlayers == 4)
        {
            jTextField6.setEnabled(false);
            jTextField5.setEnabled(false);
            jTextField4.setEnabled(true);
            jTextField3.setEnabled(true);
        }
        
        if (numberOfPlayers == 5)
        {
            jTextField6.setEnabled(false);
            jTextField5.setEnabled(true);
            jTextField4.setEnabled(true);
            jTextField3.setEnabled(true);
        }
        
        if (numberOfPlayers == 6)
        {
            jTextField6.setEnabled(true);
            jTextField5.setEnabled(true);
            jTextField4.setEnabled(true);
            jTextField3.setEnabled(true);
        } */
    }//GEN-LAST:event_onChangeNumber1

    
    /**  
    |-----------------------------------------------|
    | printLabel                                    |
    |-----------------------------------------------|
    |                                               |
    |  [x] Purpose                                  |
    |      prints the current value taken from the  |
    |      Slider (bottom right) - to the label     |
    |                                               |
    | [x] Controls Affected/Used                    |
    |      label on bottom right                    |
    |      Slider on bottom right                   |
    |                                               |
    |                                               |
    |-----------------------------------------------|
    */
    private void printLabel(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printLabel
        lblRetirementInfo.setText(Integer.toString(sldrRetirement.getValue()));
    }//GEN-LAST:event_printLabel

    /* jButton2ActionPerformed()
     * When clicked this will open up a help page, giving the players information about the game.
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
       myHelpPage.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    
    
    
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkPlayer1;
    private javax.swing.JCheckBox chkPlayer2;
    private javax.swing.JCheckBox chkPlayer3;
    private javax.swing.JCheckBox chkPlayer4;
    private javax.swing.JCheckBox chkPlayer5;
    private javax.swing.JCheckBox chkPlayer6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lblPlayer1;
    private javax.swing.JLabel lblRetirementInfo;
    private javax.swing.JSlider sldrRetirement;
    private javax.swing.JSpinner spnNumberOfPlayers;
    // End of variables declaration//GEN-END:variables
//

private JTextField[] getTextFields(){
    
    JTextField textFields[] = {jTextField1, jTextField2, jTextField3, jTextField4, jTextField5, jTextField6};
    
    return textFields;
}

}




