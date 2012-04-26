package boardgame;
import javax.swing.*;

public class BoardGame {
    
    
    //  creates a new instance of the system class (Houston)
    //  named missionControl
public static Houston missionControl = new Houston();
public static tiles boardTiles = new tiles();
    
    
    
    
    
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
        TODO    - Lots of testing and adding more tiles
        TODO    - Randomizing tiles needs tweaked so that popups are not showing up everywhere, e.g all tiles become a port (travel tile)
        TODO    - Clean up the board.java code - very messy in there
        TODO    - More outputs to tell us what is happening with each player
        TODO    - Code for the exam red tile on the middle island
        TODO    - Add code to find what tile the player has landed on
        TODO    - Progress bar decreases when a 10 is rolled
        TODO    - Scoring for when game is finished
        TODO    - Clean up volcano board buttons and look 
        TODO    - Player icons need slight formatting
        TODO    - Validation for entering player names 3,4,5,6 can be left blank
        TODO    - StartScreen needs a label to inform the player what the check boxes are for
        TODO    - Set help screen to non-re-sizable
        TODO    - College pay add a green tile that is pay college fees
        TODO    - Add spin to win functionality
        
 */
