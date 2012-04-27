package boardgame;
import java.io.IOException;
import javax.swing.*;

public class BoardGame {
    
    
    //  creates a new instance of the system class (Houston)
    //  named missionControl
public static Houston missionControl = new Houston();
public static tiles boardTiles = new tiles();
    
    
    
    
    
        //*********************************************************
        //                  MAIN METHOD
    
        public static void main(String args[]){
        
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
        TODO    - Scoring for when game is finished
        TODO    - StartScreen needs a label to inform the player what the check boxes are for
        TODO    - College pay add a green tile that is pay college fees
        TODO    - Add spin to win functionality

        TODO    - Lots of testing and adding more tiles -Ruairi
        TODO    - Randomizing tiles needs tweaked so that pop ups are not showing up everywhere, e.g all tiles become a port (travel tile) -Ruairi
        TODO    - Clean up the board.java code - very messy in there -Ruairi
        TODO    - More outputs to tell us what is happening with each player -Ruairi
        TODO    - Code for the exam red tile on the middle island -Ruairi
        TODO    - Add code to find what tile the player has landed on -Ruairi
        TODO    - Progress bar decreases when a 10 is rolled -Ruairi
        TODO    - Scoring for when game is finished -Ruairi
        TODO    - Player icons need slight formatting -Ruairi
        TODO    - College pay add a green tile that is pay college fees -Ruairi
        TODO    - Add spin to win functionality -Ruairi
        TODO    - add pet tile -Ruairi
        TODO    - Rename class files with capital letters for first character
        TODO    - START screen text box char limit
        TODO    - exams volcano cant go off when uyou are doing exams
        
 */
