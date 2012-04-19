
package boardgame;
import javax.swing.*;
/**
 *
 * @author Don
 */
public class Houston {
    
    // COMMENT LATER 
    public Player player_1 = new Player();
    public Player player_2 = new Player();
    public Player player_3 = new Player();
    public Player player_4 = new Player();
    public Player player_5 = new Player();
    public Player player_6 = new Player();
    
    // Variables used in calcs later
    //int mathVar
    
    /**
     *  Assigns each island array of tiles into arrays within the system -
     *  a bit dirty... 
     *  NB look into touching up later
     */
    //  Top Right Island on the board - assigned to an array
    public JPanel[] systemIslandTopRightArray = startScreen.myBoard.getTopRightIsland();
    
    //  Bottom Right Island on the board - assigned to an array
    public JPanel[] systemIslandBottomRightArray = startScreen.myBoard.getBottomRightIsland();
    
    //  Middle island on the board - assigned to and array
    //  NB this is the player staring Island.
    public JPanel[] systemIslanMiddleArray = startScreen.myBoard.getMiddleIsland();
    
    //  Bottom left Island on the board - assigned to an array
    public JPanel[] systemIslandBottomLeftArray = startScreen.myBoard.getBottomLeftIsland();
    
    //  Top Left Island on the board - assigned to and array.
    public JPanel[] systemIslandTopLeftArray = startScreen.myBoard.getTopLeftIsland();
    
    
    
    /*********************************************************
    *   @ DON - comment
    *   MOVES THE PLAYER POSITION ON SAID ISLAND  
    * 
    *   
    *   
    **********************************************************
    */
    
    public void movePlayer(int SpinnerValue)
    {
        //  Creates some variables
        //  two ints for use in position setting
        int oldPlayerPos; 
        int newPlayerPos; 
        int moreMathShit;
                
        //  grabs the current player position
        //  NB - Should be 1 on the first run
        oldPlayerPos = player_1.getPosition();
        
        //  Takes the SpinnerValue (a random number gen'ed from the board)
        //  adds it to the current player position
        newPlayerPos = SpinnerValue + oldPlayerPos;
        
        
        
        

                if (newPlayerPos > systemIslandTopRightArray.length)
                {
                int difference = systemIslandTopRightArray.length - oldPlayerPos;
                moreMathShit = SpinnerValue - difference;
                newPlayerPos = 0;
                newPlayerPos += moreMathShit;
                }
                
        
        //  then adds that new number to the player position.
        player_1.setPlayerPosition(newPlayerPos);
        
        System.out.println("Spinner Value = " + SpinnerValue);
        System.out.println("OLD player position = " + oldPlayerPos);
        System.out.println("New player position = " + newPlayerPos);
        
        
        //  takes the top right island tile = to the new player position
        //
        systemIslandTopRightArray[player_1.getPosition() -1].add(startScreen.myBoard.getLblPlayer1());
        
        
        startScreen.myBoard.repaint();
        
    }
    
}
