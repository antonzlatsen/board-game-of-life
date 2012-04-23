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
 *      TODO    0.  Start populating this area with things that need done
 *      TODO    1.  new form for path switching 
        TODO    2.  Validate the eruption button and the end turn button
        TODO    3.  make islands within island (islandception)
        TODO  3.1.  warning Islands have different paths - but movement is now broken (or working as expected depending on how you look at it).
        TODO    3.2 make messagebox to allow for path switching
        TODO    4.  Start naming controls as they are added - this will save a lot of time with renaming and creaking code later on
        TODO    5. validation needs put into buttons, player can end turn without choosing an island when they land on a yellow tile
 */
