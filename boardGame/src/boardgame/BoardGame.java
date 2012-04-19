package boardgame;
import javax.swing.*;

public class BoardGame {
public static Houston missionControl = new Houston();   
    
    
    
    
    
        //*********************************************************
        //                  MAIN METHOD
        //*********************************************************
    
        public static void main(String args[]) {
        
        //testing code     
        //boardgame.startScreen.myBoard.setVisible(true);
        //array[5].add(startScreen.myBoard.getLblPlayer1());
            
            
        //  Shows the Start screen - used for selecting players
        //  and adding names
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new startScreen().setVisible(true);
            }
        });
        }
        
        //*********************************************************
        //                 end MAIN METHOD
        //*********************************************************


}

