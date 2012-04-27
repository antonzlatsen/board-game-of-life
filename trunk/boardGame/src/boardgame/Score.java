/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author KingDave
 */
public class Score {
    
    //to do- need to output to appropriate labels in exitgame.java
   public Player[] playerarray= BoardGame.missionControl.players;
   
    public void MessageBoxShow(String warning, String title){
                    JFrame frame = null;
                    
                    JOptionPane.showMessageDialog(frame,
                    warning,
                    title,
                    JOptionPane.WARNING_MESSAGE);
    }
   
    public void test(){
        
<<<<<<< .mine
        //for(i=playerarray.length()){
=======
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
>>>>>>> .r89
    }
    
    
    
}
