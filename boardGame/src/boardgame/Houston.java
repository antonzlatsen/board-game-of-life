
package boardgame;
import javax.swing.*;
import java.awt.Color;
/**
 *
 * @author Team Liquid
 */
public class Houston {
    
    // COMMENT LATER 
    public Player player_1 = new Player();
    public Player player_2 = new Player();
    public Player player_3 = new Player();
    public Player player_4 = new Player();
    public Player player_5 = new Player();
    public Player player_6 = new Player();
    
    public Player [] players = {player_1,player_2,player_3,player_4,player_5,player_6};
    
    private JLabel[] lblPlayers = startScreen.myBoard.getLblPlayers();
    
    //variables to determine turn
    public int playerTurn =0;
    
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
        int oldPlayerPos, moreMathShit,newPlayerPos,playerIsland;
        newPlayerPos=0;
        JPanel playerIslandArray [] = systemIslanMiddleArray;
                
        //  grabs the current player position
        //  NB - Should be 1 on the first run
        oldPlayerPos = players[playerTurn].getPosition();
        
        //get what island the player is on
        playerIsland = players[playerTurn].getIsland();
        
        //depending on what island the player is on set the array to be modified
        if(playerIsland==1)
            playerIslandArray = systemIslanMiddleArray;
        else if(playerIsland==2)
            playerIslandArray = systemIslandTopRightArray;
        else if(playerIsland==3)
            playerIslandArray = systemIslandBottomRightArray;
        else if(playerIsland==4)
            playerIslandArray= systemIslandBottomLeftArray;
        else if(playerIsland==5)
            playerIslandArray=systemIslandTopLeftArray;
            
        
        //  Takes the SpinnerValue (a random number gen'ed from the board)
        //  adds it to the current player position
        newPlayerPos = SpinnerValue + oldPlayerPos;
        
                if (newPlayerPos > playerIslandArray.length)
                {
                int difference = playerIslandArray.length - oldPlayerPos;
                moreMathShit = SpinnerValue - difference;
                newPlayerPos = 0;
                newPlayerPos += moreMathShit;
                }
                
        
        //  then adds that new number to the player position.
        players[playerTurn].setPlayerPosition(newPlayerPos);
        
        System.out.println("Spinner Value = " + SpinnerValue);
        System.out.println("OLD player position = " + oldPlayerPos);
        System.out.println("New player position = " + newPlayerPos);
        
        
        //  takes the top right island tile = to the new player position
        //
        playerIslandArray[players[playerTurn].getPosition() -1].add(lblPlayers[playerTurn]);
        playerTurn++;
        
        if (playerTurn>startScreen.numberOfPlayers)
            playerTurn=0;
        
        startScreen.myBoard.repaint();
        
    }
    
    public void setUp(){
        
        //sets the players icons invisible depending on the amount of players
        
        for(int i=6-startScreen.numberOfPlayers;i>startScreen.numberOfPlayers;i--){
            lblPlayers[i].setVisible(false);
        }
        
    }
    
    public void checkTile(int spinnerValue){
        
        int oldPlayerPos,newPlayerPos,playerIsland;
        newPlayerPos=0;
        JPanel playerIslandArray [] = systemIslanMiddleArray;
                
        //  grabs the current player position
        //  NB - Should be 1 on the first run
        oldPlayerPos = players[playerTurn].getPosition();
        
        //get what island the player is on
        playerIsland = players[playerTurn].getIsland();
        
        //depending on what island the player is on set the array to be modified
        if(playerIsland==1)
            playerIslandArray = systemIslanMiddleArray;
        else if(playerIsland==2)
            playerIslandArray = systemIslandTopRightArray;
        else if(playerIsland==3)
            playerIslandArray = systemIslandBottomRightArray;
        else if(playerIsland==4)
            playerIslandArray= systemIslandBottomLeftArray;
        else if(playerIsland==5)
            playerIslandArray=systemIslandTopLeftArray;
                
        for(int i = oldPlayerPos;i<newPlayerPos;i++){
            if(playerIslandArray[i].getBackground().equals(Color.red))
                spinnerValue = i; 
                break;
        }
        
        movePlayer(spinnerValue);
        
    }
}
