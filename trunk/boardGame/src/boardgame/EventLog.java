/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame;

import javax.swing.*;
/**
 *
 * 
 * @author TeamLiquid
 */


public class EventLog extends javax.swing.JFrame {

    
    /**
     * Creates new form EventLog
     */
    public EventLog() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PlayerDetailsText = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBounds(new java.awt.Rectangle(1300, 0, 300, 0));
        setMaximumSize(new java.awt.Dimension(500, 450));
        setMinimumSize(new java.awt.Dimension(500, 450));
        setPreferredSize(new java.awt.Dimension(500, 450));
        setResizable(false);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane1.setViewportView(jTextArea2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Event Log");

        PlayerDetailsText.setColumns(20);
        PlayerDetailsText.setRows(5);
        jScrollPane2.setViewportView(PlayerDetailsText);

        jButton1.setText("jButton1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("jButton3");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText("jButton4");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.setText("jButton5");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jButton6.setText("jButton6");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1)
                                    .addComponent(jButton2)
                                    .addComponent(jButton3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4)
                                    .addComponent(jButton5)
                                    .addComponent(jButton6)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton6))))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
          BoardGame.missionControl.pName1=startScreen.myBoard.getjLabel1().getText();
        BoardGame.missionControl.pName2=startScreen.myBoard.getjLabel2().getText();
         BoardGame.missionControl.pName3=startScreen.myBoard.getjLabel3().getText();
         BoardGame.missionControl.pName4=startScreen.myBoard.getjLabel4().getText();
          BoardGame.missionControl.pName5=startScreen.myBoard.getjLabel5().getText();
         BoardGame.missionControl.pName6=startScreen.myBoard.getjLabel6().getText();
         
         
       BoardGame.missionControl.pNames[0]=BoardGame.missionControl.pName1;
       BoardGame.missionControl.pNames[1]=BoardGame.missionControl.pName2;
       BoardGame.missionControl.pNames[2]=BoardGame.missionControl.pName3;
       BoardGame.missionControl.pNames[3]=BoardGame.missionControl.pName4;
       BoardGame.missionControl.pNames[4]=BoardGame.missionControl.pName5;
       BoardGame.missionControl.pNames[5]=BoardGame.missionControl.pName6;
       
       // int currentPlayer=BoardGame.missionControl.playerTurn;
        
        String PlayerDetails=Integer.toString(BoardGame.missionControl.players[0].getMoney());
        PlayerDetailsText.setText(BoardGame.missionControl.pNames[0] +" Total money = " + PlayerDetails);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
          BoardGame.missionControl.pName1=startScreen.myBoard.getjLabel1().getText();
        BoardGame.missionControl.pName2=startScreen.myBoard.getjLabel2().getText();
         BoardGame.missionControl.pName3=startScreen.myBoard.getjLabel3().getText();
         BoardGame.missionControl.pName4=startScreen.myBoard.getjLabel4().getText();
          BoardGame.missionControl.pName5=startScreen.myBoard.getjLabel5().getText();
         BoardGame.missionControl.pName6=startScreen.myBoard.getjLabel6().getText();
         
         
       BoardGame.missionControl.pNames[0]=BoardGame.missionControl.pName1;
       BoardGame.missionControl.pNames[1]=BoardGame.missionControl.pName2;
       BoardGame.missionControl.pNames[2]=BoardGame.missionControl.pName3;
       BoardGame.missionControl.pNames[3]=BoardGame.missionControl.pName4;
       BoardGame.missionControl.pNames[4]=BoardGame.missionControl.pName5;
       BoardGame.missionControl.pNames[5]=BoardGame.missionControl.pName6;
       
       // int currentPlayer=BoardGame.missionControl.playerTurn;
        
        String PlayerDetails=Integer.toString(BoardGame.missionControl.players[1].getMoney());
        PlayerDetailsText.setText(BoardGame.missionControl.pNames[1] +" Total money = " + PlayerDetails);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
          BoardGame.missionControl.pName1=startScreen.myBoard.getjLabel1().getText();
        BoardGame.missionControl.pName2=startScreen.myBoard.getjLabel2().getText();
         BoardGame.missionControl.pName3=startScreen.myBoard.getjLabel3().getText();
         BoardGame.missionControl.pName4=startScreen.myBoard.getjLabel4().getText();
          BoardGame.missionControl.pName5=startScreen.myBoard.getjLabel5().getText();
         BoardGame.missionControl.pName6=startScreen.myBoard.getjLabel6().getText();
         
         
       BoardGame.missionControl.pNames[0]=BoardGame.missionControl.pName1;
       BoardGame.missionControl.pNames[1]=BoardGame.missionControl.pName2;
       BoardGame.missionControl.pNames[2]=BoardGame.missionControl.pName3;
       BoardGame.missionControl.pNames[3]=BoardGame.missionControl.pName4;
       BoardGame.missionControl.pNames[4]=BoardGame.missionControl.pName5;
       BoardGame.missionControl.pNames[5]=BoardGame.missionControl.pName6;
       
       // int currentPlayer=BoardGame.missionControl.playerTurn;
        
        String PlayerDetails=Integer.toString(BoardGame.missionControl.players[2].getMoney());
        PlayerDetailsText.setText(BoardGame.missionControl.pNames[2] +" Total money = " + PlayerDetails);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
          BoardGame.missionControl.pName1=startScreen.myBoard.getjLabel1().getText();
        BoardGame.missionControl.pName2=startScreen.myBoard.getjLabel2().getText();
         BoardGame.missionControl.pName3=startScreen.myBoard.getjLabel3().getText();
         BoardGame.missionControl.pName4=startScreen.myBoard.getjLabel4().getText();
          BoardGame.missionControl.pName5=startScreen.myBoard.getjLabel5().getText();
         BoardGame.missionControl.pName6=startScreen.myBoard.getjLabel6().getText();
         
         
       BoardGame.missionControl.pNames[0]=BoardGame.missionControl.pName1;
       BoardGame.missionControl.pNames[1]=BoardGame.missionControl.pName2;
       BoardGame.missionControl.pNames[2]=BoardGame.missionControl.pName3;
       BoardGame.missionControl.pNames[3]=BoardGame.missionControl.pName4;
       BoardGame.missionControl.pNames[4]=BoardGame.missionControl.pName5;
       BoardGame.missionControl.pNames[5]=BoardGame.missionControl.pName6;
       
       // int currentPlayer=BoardGame.missionControl.playerTurn;
        
        String PlayerDetails=Integer.toString(BoardGame.missionControl.players[3].getMoney());
        PlayerDetailsText.setText(BoardGame.missionControl.pNames[3] +" Total money = " + PlayerDetails);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
          BoardGame.missionControl.pName1=startScreen.myBoard.getjLabel1().getText();
        BoardGame.missionControl.pName2=startScreen.myBoard.getjLabel2().getText();
         BoardGame.missionControl.pName3=startScreen.myBoard.getjLabel3().getText();
         BoardGame.missionControl.pName4=startScreen.myBoard.getjLabel4().getText();
          BoardGame.missionControl.pName5=startScreen.myBoard.getjLabel5().getText();
         BoardGame.missionControl.pName6=startScreen.myBoard.getjLabel6().getText();
         
         
       BoardGame.missionControl.pNames[0]=BoardGame.missionControl.pName1;
       BoardGame.missionControl.pNames[1]=BoardGame.missionControl.pName2;
       BoardGame.missionControl.pNames[2]=BoardGame.missionControl.pName3;
       BoardGame.missionControl.pNames[3]=BoardGame.missionControl.pName4;
       BoardGame.missionControl.pNames[4]=BoardGame.missionControl.pName5;
       BoardGame.missionControl.pNames[5]=BoardGame.missionControl.pName6;
       
       // int currentPlayer=BoardGame.missionControl.playerTurn;
        
        String PlayerDetails=Integer.toString(BoardGame.missionControl.players[4].getMoney());
        PlayerDetailsText.setText(BoardGame.missionControl.pNames[4] +" Total money = " + PlayerDetails);
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
          BoardGame.missionControl.pName1=startScreen.myBoard.getjLabel1().getText();
        BoardGame.missionControl.pName2=startScreen.myBoard.getjLabel2().getText();
         BoardGame.missionControl.pName3=startScreen.myBoard.getjLabel3().getText();
         BoardGame.missionControl.pName4=startScreen.myBoard.getjLabel4().getText();
          BoardGame.missionControl.pName5=startScreen.myBoard.getjLabel5().getText();
         BoardGame.missionControl.pName6=startScreen.myBoard.getjLabel6().getText();
         
         
       BoardGame.missionControl.pNames[0]=BoardGame.missionControl.pName1;
       BoardGame.missionControl.pNames[1]=BoardGame.missionControl.pName2;
       BoardGame.missionControl.pNames[2]=BoardGame.missionControl.pName3;
       BoardGame.missionControl.pNames[3]=BoardGame.missionControl.pName4;
       BoardGame.missionControl.pNames[4]=BoardGame.missionControl.pName5;
       BoardGame.missionControl.pNames[5]=BoardGame.missionControl.pName6;
       
       // int currentPlayer=BoardGame.missionControl.playerTurn;
        
        String PlayerDetails=Integer.toString(BoardGame.missionControl.players[5].getMoney());
        PlayerDetailsText.setText(BoardGame.missionControl.pNames[5] +" Total money = " + PlayerDetails);
    }//GEN-LAST:event_jButton6MouseClicked

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EventLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EventLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EventLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EventLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            
            
            public void run() {
                new EventLog().setVisible(true);
             
             
           
            }
        });
    }
          public JTextArea getjTextArea2() {
        return jTextArea2;
          }   
     
         
     
          
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea PlayerDetailsText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
 
    
    
    //Getters
   public JButton getjbutton1(){
   return jButton1;
   }
     public JButton getjbutton2(){
   return jButton2;
   }
       public JButton getjbutton3(){
   return jButton3;
   }
         public JButton getjbutton4(){
   return jButton4;
   }
           public JButton getjbutton5(){
   return jButton5;
   }
             public JButton getjbutton6(){
   return jButton6;
   }
   
   //Jbutton array
             public JButton[] getbuttons(){
        
        JButton[] buttons = {jButton1,jButton2,jButton3,jButton4,jButton5,jButton6};
        
        return buttons;
    }
   
}
