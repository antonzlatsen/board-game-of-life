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
        TODO    4.  Start naming controls as they are added - this will save a lot of time with renaming and creaking code later on
        TODO    - put pictures onto JPanel for a better looking and move informative board. For this don't use labels as it will mess up the player icons when
        * they are in that square instead look into overriding the JPanel paint method i think it is called
        TODO    - lots of testing and adding more tiles
        TODO    - create a key on what each tile means 
        TODO    -randomizing tiles needs tweaked so that popups are not showing up everywhere, e.g all tiles become a port (travel tile)
        TODO    - clean up the board.java code - very messy in there 
        TODO    - more outputs to tell us what is happening with each player
        TODO    -code for the exam red tile on the middle island
 */
