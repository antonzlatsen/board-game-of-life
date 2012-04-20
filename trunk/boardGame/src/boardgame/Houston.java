package boardgame;

import javax.swing.*;
import java.awt.Color;

/**
 *
 * @author Team Liquid
 */
public class Houston {

    int lifespan = 0;
    // COMMENT LATER 
    public Player player_1 = new Player();
    public Player player_2 = new Player();
    public Player player_3 = new Player();
    public Player player_4 = new Player();
    public Player player_5 = new Player();
    public Player player_6 = new Player();
    public Player[] players = {player_1, player_2, player_3, player_4, player_5, player_6};
    private JLabel[] lblPlayers = startScreen.myBoard.getLblPlayers();
    //variables to determine turn
    public int playerTurn = 0;
    //variable to determine island 
    private int playerIsland;
    // Variables used in calcs later
    //int mathVar
    /**
     * Assigns each island array of tiles into arrays within the system - a bit
     * dirty... NB look into touching up later
     */
    //  Top Right Island on the board - assigned to an array
    public JPanel[] systemIslandTopRightArray = startScreen.myBoard.getTopRightIsland();
    //  Bottom Right Island on the board - assigned to an array
    public JPanel[] systemIslandBottomRightArray = startScreen.myBoard.getBottomRightIsland();
    //  Middle island on the board - assigned to and array
    public JPanel[] systemIslanMiddleArray = startScreen.myBoard.getMiddleIsland();
    //starting islands within the middle island 
        //college path
    public JPanel[] systemIslandMiddleCollegeArray = startScreen.myBoard.getMiddleIslandCollege();
        //career path 
    public JPanel[] systemIslandMiddleCareerArray = startScreen.myBoard.getMiddleIslandCareer();
    //  Bottom left Island on the board - assigned to an array
    public JPanel[] systemIslandBottomLeftArray = startScreen.myBoard.getBottomLeftIsland();
    //  Top Left Island on the board - assigned to and array.
    public JPanel[] systemIslandTopLeftArray = startScreen.myBoard.getTopLeftIsland();
    
    private JPanel playerIslandArray[] = systemIslanMiddleArray;

    
    
    /**
     * *******************************************************
     * @ DON - comment 
     *  MOVES THE PLAYER POSITION ON SAID ISLAND
     *
     *
     **********************************************************
     */
    public void movePlayer(int SpinnerValue) {
        //  Creates some variables
        //  two ints for use in position setting
        int oldPlayerPos, moreMathShit, newPlayerPos;
        newPlayerPos = 0;
        

        //  grabs the current player position
        //  NB - Should be 1 on the first run
        oldPlayerPos = players[playerTurn].getPosition();

        //get what island the player is on
        playerIsland = players[playerTurn].getIsland();
        
        //set the island array 
        setIsland(playerIsland);
        

        //  Takes the SpinnerValue (a random number gen'ed from the board)
        //  adds it to the current player position
        //  then sets the new player position variable
        newPlayerPos = SpinnerValue + oldPlayerPos;



        
        
        int counter = oldPlayerPos;
        int loopCounter = 0;

        while (loopCounter < SpinnerValue) {

            if (counter > playerIslandArray.length - 1) 
            {
                counter = 0;
                newPlayerPos=1;
                
                //change the players island once the end of the island is reached 
                    //code here is only for the middle island so far 
                        //might need a method like "adjust Island"
                
                if(playerIsland == 1){
                    players[playerTurn].changeIsland(3);
                    setIsland(players[playerTurn].getIsland());}
                else if (playerIsland == 2){
                    players[playerTurn].changeIsland(3);
                    setIsland(players[playerTurn].getIsland());
                }
                else if(playerIsland==3){
                    setIsland(players[playerTurn].getIsland());}
                }
                    
                
        
            else 
            {              
                if (playerIslandArray[counter].getBackground().equals(Color.red)) 
                {
                    newPlayerPos = counter + 1;
                    counter ++;
                    //loopCounter = 0;
                    break;
                }
                else if (playerIslandArray[counter].getBackground().equals(Color.green))
                        {
                            System.out.println("You have this much money " + players[BoardGame.missionControl.playerTurn].getMoney());
                            BoardGame.missionControl.players[BoardGame.missionControl.playerTurn].adjustMoney(10000);
                            System.out.println("Updated total = " + players[BoardGame.missionControl.playerTurn].getMoney());
                            //counter ++;                       
                        }
                else if(playerIslandArray[counter].getBackground().equals(Color.yellow)){
                    counter ++;
                    islandSelectGUI.main(null);
                    newPlayerPos=1;
                    break;
                }
                
                
                //else
               // {
                    counter++;
                    loopCounter++;
                    newPlayerPos++;
                //}
            }    
        }
        loopCounter = 0;
              
        
        // *************************************************
        // **Checks if a player is at the end of the tile set
        // see workings below
        
        //  if the updated position of the player wil bring him beyond the 
        //  length / ammount of tiles currently in said island / array
        if (newPlayerPos > playerIslandArray.length)
        {
            //  the difference is calculated 
            //  so - the old player position is subtracted from the length of the array
            //  E.G.    30 - 2 = 28
            int difference = playerIslandArray.length - oldPlayerPos;
            
            // Takes the spinner value and removes the difference from it.
            // E.G.    10 - 2 = 8
            moreMathShit = SpinnerValue - difference;
            
            //  set the players position to equal 0 
            newPlayerPos = 0;
            //  then add the previous variable onto the position 
            //  removing the previous two values (in the example)
            newPlayerPos += moreMathShit;
            //  NOTE - reading though this code - players can skip red tiles by the looks of things...
            
        }


        



        //  then adds that new number to the player position.
        players[playerTurn].setPlayerPosition(counter);

        System.out.println("Spinner Value = " + SpinnerValue);
        System.out.println("OLD player position = " + oldPlayerPos);
        System.out.println("New player position = " + newPlayerPos);
        System.out.println("Counter = " + counter);
        System.out.println("player class get position = " + playerIslandArray[players[playerTurn].getPosition() -1].add(lblPlayers[playerTurn]));

        //  takes the top right island tile = to the new player position
        //
        playerIslandArray[players[playerTurn].getPosition() -1].add(lblPlayers[playerTurn]);

        startScreen.myBoard.repaint();

    }
    
    public void MessageBoxShow(String warning, String title){
                    JFrame frame = null;
                    
                    JOptionPane.showMessageDialog(frame,
                    warning,
                    title,
                    JOptionPane.WARNING_MESSAGE);
    }
    
    public void setIsland(int playerIsland){
        
        //depending on what island the player is on set the array to be modified
        if (playerIsland == 1) {
            playerIslandArray = systemIslandMiddleCareerArray;
        } else if (playerIsland == 2) {
            playerIslandArray = systemIslandMiddleCollegeArray;
        } else if (playerIsland == 3) {
            playerIslandArray = systemIslanMiddleArray;
        } else if(playerIsland == 4){
            playerIslandArray = systemIslandTopRightArray;
        } else if (playerIsland == 6) {
            playerIslandArray = systemIslandBottomRightArray;
        } else if (playerIsland == 8) {
            playerIslandArray = systemIslandBottomLeftArray;
        } else if(playerIsland ==10)   {
            playerIslandArray = systemIslandTopLeftArray;
        }
        
    }
    
    
    //*************************************
   //Text Log Events and stuff 
   //PlayerTurn should be the player name
    
        public void rollLog(int spinnerValue){
         JTextArea TextLog=startScreen.myEventLog.getjTextArea2();
        String log=TextLog.getText();
            TextLog.setText(log+"\n" + playerTurn + " rolled a " + spinnerValue);
           log=TextLog.getText();
           TextLog.setText(log+"\n"+ playerTurn + " is on Square "+players[playerTurn].getPosition());

        }
     
        //*************************************




    public void setUp() {

        
        //setLifespan(startScreen.sldrRetirement.getValue());
        
        //  Sets the lifespan value to the progress bar on the board
        board.jProgressBar2.setMaximum(lifespan);
        board.jProgressBar2.setValue(lifespan);
        //MessageBoxShow(Integer.toString(lifespan), "validation");
        
        //sets the players icons invisible depending on the amount of players
        
        for (int i = 5; i != startScreen.numberOfPlayers; i--) {
            lblPlayers[i].setVisible(false);
        }

    }
    

   /* 
    * the graveyard of code 
    * 
    * public void checkTile(int spinnerValue) {

        int oldPlayerPos, newPlayerPos, playerIsland;
        newPlayerPos = 0;
        JPanel playerIslandArray[] = systemIslanMiddleArray;

        //  grabs the current player position
        //  NB - Should be 1 on the first run
        oldPlayerPos = players[playerTurn].getPosition();

        //get what island the player is on
        playerIsland = players[playerTurn].getIsland();

        //depending on what island the player is on set the array to be modified
        if (playerIsland == 1) {
            playerIslandArray = systemIslanMiddleArray;
        } else if (playerIsland == 2) {
            playerIslandArray = systemIslandTopRightArray;
        } else if (playerIsland == 3) {
            playerIslandArray = systemIslandBottomRightArray;
        } else if (playerIsland == 4) {
            playerIslandArray = systemIslandBottomLeftArray;
        } else if (playerIsland == 5) {
            playerIslandArray = systemIslandTopLeftArray;
        }

        for (int i = oldPlayerPos; i < newPlayerPos; i++) {
            if (playerIslandArray[i].getBackground().equals(Color.red)) {
                spinnerValue = i;
            }
            break;
        }

        movePlayer(spinnerValue);

    }*/

    public int getLifespan() {
        return lifespan;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }
    
}
