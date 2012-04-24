package boardgame;
import javax.swing.*;

public class BoardGame {
    
    
    //  creates a new instance of the system class (Houston)
    //  named missionControl
public static Houston missionControl = new Houston();   
    
    
    
    
    
        //*********************************************************
        //                  MAIN METHOD
    
        public static void main(String args[]) {
        
                //testing code     
                //boardgame.startScreen.myBoard.setVisible(true);
                //array[5].add(startScreen.myBoard.getLblPlayer1());
            

            /**
             *      WASTED CODE - LOOK INTO LATER - FOR NOW THIS WILL SHOW THE 
             *      START SCREEN - THE BUTTON HAS ALL THE CODE NEEDED TO SET UP THE GAME
             * 
             *
             *      // java.awt.EventQueue.invokeLater(new Runnable() {
             *      //public void run() {}});
             */
            
                //  Shows the Start screen - used for selecting players
                //  and adding names
                new startScreen().setVisible(true);

        }
        //                 end MAIN METHOD
        //*********************************************************


}



//      This will now be the place to add to-do's 
//      When you click on tasks - you can see what there is still left to do
//      Hopefully will keep us up to date on things instead of having to look at the logs on SVN


/**     
        TODO    4.  Start naming controls as they are added - this will save a lot of time with renaming and creaking code later on
        TODO    - When volcano erupts change tiles on board 
        TODO    - Bank Loans ability to pay and repay 
        TODO    - to start the game the volcano must erupt setting the board and the house prices method in place to set prices setHousePrice();
        TODO    - need a method to randomize the board 
        TODO    - the method for checking tiles now checks their name not their color
        TODO    - house prices change when volcano erupts (I have also spelled volcano wrong everywhere lol i spelt it valcano so that might need changed)
        TODO    - put pictures onto JPanel for a better looking and move informative board. For this don't use labels as it will mess up the player icons when
        * they are in that square instead look into overriding the JPanel paint method i think it is called
        TODO    - lots of testing and adding more tiles
 */
