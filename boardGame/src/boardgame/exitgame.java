/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame;

import javax.swing.JLabel;
/**
 *
 * @author KingDave
 */
public class exitgame extends javax.swing.JFrame {

    /**
     * Creates new form exitgame
     */
    
    public exitgame() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        lblWinner = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblPlayer1Name = new javax.swing.JLabel();
        lblPlayer2Name = new javax.swing.JLabel();
        lblPlayer3Name = new javax.swing.JLabel();
        lblPlayer4Name = new javax.swing.JLabel();
        lblPlayer5Name = new javax.swing.JLabel();
        lblPlayer6Name = new javax.swing.JLabel();
        lblPlayer1 = new javax.swing.JLabel();
        lblPlayer2 = new javax.swing.JLabel();
        lblPlayer3 = new javax.swing.JLabel();
        lblPlayer4 = new javax.swing.JLabel();
        lblPlayer5 = new javax.swing.JLabel();
        lblPlayer6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblWinner.setFont(new java.awt.Font("Berlin Sans FB", 3, 14)); // NOI18N
        lblWinner.setText("Winner");
        getContentPane().add(lblWinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 260, 90));

        btnExit.setText("Exit Game");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, -1, -1));

        jPanel1.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(lblPlayer1Name, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        jPanel1.add(lblPlayer2Name, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        jPanel1.add(lblPlayer3Name, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        jPanel1.add(lblPlayer4Name, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        jPanel1.add(lblPlayer5Name, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        jPanel1.add(lblPlayer6Name, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 56, 0, 68);
        jPanel1.add(lblPlayer1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 56, 0, 68);
        jPanel1.add(lblPlayer2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 56, 0, 68);
        jPanel1.add(lblPlayer3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 56, 0, 68);
        jPanel1.add(lblPlayer4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 56, 0, 68);
        jPanel1.add(lblPlayer5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 56, 0, 68);
        jPanel1.add(lblPlayer6, gridBagConstraints);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 260, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/winning.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 10, 333, 332));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Game Of Life Scores");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-576)/2, (screenSize.height-405)/2, 576, 405);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(exitgame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(exitgame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(exitgame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(exitgame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        //BoardGame.missionControl.getClass()
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                
                new exitgame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPlayer1;
    private javax.swing.JLabel lblPlayer1Name;
    private javax.swing.JLabel lblPlayer2;
    private javax.swing.JLabel lblPlayer2Name;
    private javax.swing.JLabel lblPlayer3;
    private javax.swing.JLabel lblPlayer3Name;
    private javax.swing.JLabel lblPlayer4;
    private javax.swing.JLabel lblPlayer4Name;
    private javax.swing.JLabel lblPlayer5;
    private javax.swing.JLabel lblPlayer5Name;
    private javax.swing.JLabel lblPlayer6;
    private javax.swing.JLabel lblPlayer6Name;
    private javax.swing.JLabel lblWinner;
    // End of variables declaration//GEN-END:variables

public void setPlayerScores(int [] scores){
    
    JLabel [] playerScores = {lblPlayer1,lblPlayer2,lblPlayer3,lblPlayer4,lblPlayer5,lblPlayer6};
    JLabel [] playerScoresNames = {lblPlayer1Name,lblPlayer2Name,lblPlayer3Name,lblPlayer4Name,lblPlayer5Name,lblPlayer6Name};
    JLabel [] playerNames = startScreen.myBoard.getPlayerNames();
    
    for(int j=0;j<=startScreen.numberOfPlayers;j++){
        playerScores[j].setText(""+scores[j]);
    }
    
    
    
    int topScore = scores[0];
    String nameOfWinner=playerNames[0].getText();
    
    for(int i=0;i<=startScreen.numberOfPlayers;i++){
        
        playerScoresNames[i].setText(playerNames[i].getText());
        
        int tempHolder = scores[i];
        if(topScore<tempHolder){
            topScore = tempHolder;
            nameOfWinner = playerNames[i].getText();
        }
    }
    
    lblWinner.setText(nameOfWinner + " has won the game"); 
    
    
    
}
    
  public void calculateScores(){

      Player[] playerarray= BoardGame.missionControl.players;

        int[] Totals;
        Totals = new int[playerarray.length];
        
        //loop used to get the final amount of money for each individual player- david
        
        for(int i =0; i < playerarray.length; i++)
        {
            Totals[i] = playerarray[i].getMoney();
            
            if(playerarray[i].isBaby()==true&&playerarray[i].isSpouse()==true&&playerarray[i].isPet()==true)
            {
                Totals[i] = Totals[i] + 600000;
                
            }
            
            if(playerarray[i].isBaby()==true)
            {
                Totals[i] = Totals[i] + 100000;
                
            }
            
            if(playerarray[i].isSpouse()==true)
            {
                Totals[i] = Totals[i] + 100000;
                
            }
            
            if(playerarray[i].isPet()==true)
            {
                Totals[i] = Totals[i] + 100000;
                
            }
            if(playerarray[i].isBoat()==true&&playerarray[i].isPlane()==true)
            {
                Totals[i] = Totals[i] + 500000;
                
            }
            
            if(playerarray[i].isHouse()==true)
            {
                int temp = playerarray[i].getHouseIndex();
                //access array here for house value
                
                Totals[i] = Totals[i]  + BoardGame.missionControl.getHousePrices(temp);
            }
            
            if(playerarray[i].getPassPortTokens()==4)
            {
                Totals[i] = Totals[i] + 500000;
            }
            else if(playerarray[i].getPassPortTokens()<4)
            {
                Totals[i] = Totals[i] + (playerarray[i].getPassPortTokens() * 100000);
            }
            
            Totals[i] = Totals[i] - (playerarray[i].getBankLoans() * 60000);   
        }
        
        setPlayerScores(Totals);
    }

    
    
}

