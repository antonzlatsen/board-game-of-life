/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame;

import javax.swing.JTextField;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author Don
 */
public class startScreen extends javax.swing.JFrame {

    //declare variables 
    public static board myBoard = new board();
    public static int numberOfPlayers = 2;
    
    //eventLog & helpPage declarations.
    public static EventLog myEventLog= new EventLog();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("\"Game Of Life\"");

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

        jLabel3.setText("Players");

        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

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

        lblRetirementInfo.setText("50");

        jButton2.setText("Need some help?");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblPlayer1.setText("Player 1");

        jLabel4.setText("Player 2");

        jLabel5.setText("Player 3");

        jLabel6.setText("Player 4");

        jLabel7.setText("Player 5");

        jLabel8.setText("Player 6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sldrRetirement, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblRetirementInfo)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spnNumberOfPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chkPlayer1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblPlayer1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chkPlayer2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chkPlayer3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chkPlayer4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chkPlayer5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chkPlayer6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(sldrRetirement, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spnNumberOfPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPlayer1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkPlayer1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkPlayer2)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel4)))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkPlayer3)
                            .addComponent(jLabel5))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkPlayer4)
                            .addComponent(jLabel6))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkPlayer5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkPlayer6)
                            .addComponent(jLabel8))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(lblRetirementInfo)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37))
        );

        pack();
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

                JLabel labels[] = {myBoard.getjLabel1(), myBoard.getjLabel2(), myBoard.getjLabel3(), myBoard.getjLabel4(), myBoard.getjLabel5(), myBoard.getjLabel6()};
                JTextField textFields[] = {jTextField1, jTextField2, jTextField3, jTextField4, jTextField5, jTextField6};
                JCheckBox collegeCheck[] = {chkPlayer1, chkPlayer2, chkPlayer3, chkPlayer4, chkPlayer5, chkPlayer6};
                    
                //set players to college or not 
                for (int i = 0; i < collegeCheck.length; i++) {

                    if (collegeCheck[i].isSelected()) {
                        BoardGame.missionControl.players[i].changeIsland(2);
                    }
                }

                //sets the names on the board 
                if (!(jTextField1.getText().equals("")) && !(jTextField2.getText().equals(""))) {
                    
                    int spinnerValue = (int) spnNumberOfPlayers.getValue();
                    for (int i = 0; i < spinnerValue; i++) {
                        labels[i].setText(textFields[i].getText());
                    }
                    BoardGame.missionControl.setLifespan(sldrRetirement.getValue());
                    numberOfPlayers = ((int) spnNumberOfPlayers.getValue() - 1);
                    BoardGame.missionControl.setUp();
                    myBoard.setVisible(true);
                    
                    ///Event Log Window set to visible
                    myEventLog.setVisible(true);
                    //  BoardGame.missionControl.MessageBoxShow(Integer.toString(BoardGame.missionControl.getLifespan()), "Validation Error");


                    dispose(); //  disposes the current form - in this case it is the start form when the user selects players and such.
                } 
                else //validation if textbox is empty
                {
                    //TODO remove this curse word lol 
                    BoardGame.missionControl.MessageBoxShow("Please enter two or more names you stupid prick", "Validation Error");
                }

            }
        });

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
        
        //System.out.println("number of players =" + numberOfPlayers);
        
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
        }
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
        
        //System.out.println("number of players =" + numberOfPlayers);
        
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
        } 
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




}




