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
    //  Top Right Island on the board alternative path - assigned to an array 
    public JPanel[] systemIslandTopRightAltArray = startScreen.myBoard.getTopRightIslandPath1();
    //  Bottom Right Island on the board - assigned to an array
    public JPanel[] systemIslandBottomRightArray = startScreen.myBoard.getBottomRightIsland();
    // Bottom right Island on the board alternative path - assigned to an array
    public JPanel[] systemIslandBottomRightAltArray = startScreen.myBoard.getBottomRightIslandPath1();
    //  Middle island on the board - assigned to and array
    public JPanel[] systemIslanMiddleArray = startScreen.myBoard.getMiddleIsland();
    //starting islands within the middle island 
        //college path
    public JPanel[] systemIslandMiddleCollegeArray = startScreen.myBoard.getMiddleIslandCollege();
        //career path 
    public JPanel[] systemIslandMiddleCareerArray = startScreen.myBoard.getMiddleIslandCareer();
    //  Bottom left Island on the board - assigned to an array
    public JPanel[] systemIslandBottomLeftArray = startScreen.myBoard.getBottomLeftIsland();
     //  Bottom Left Island on the board alternative path - assigned to an array
    public JPanel[] systemIslandBottomLeftAltArray = startScreen.myBoard.getBottomLeftIslandPath1();
    //  Top Left Island on the board - assigned to and array.
    public JPanel[] systemIslandTopLeftArray = startScreen.myBoard.getTopLeftIsland();
   
    
    private JPanel playerIslandArray[] = systemIslanMiddleArray;

    
    // Array that holds player names used in event log
     String pName1,pName2,pName3,pName4,pName5,pName6;
     String [] pNames = new String[6];
    //
     
     //Array of Jbuttons for event log
    JButton[] hideButtons= startScreen.myEventLog.getbuttons();
     
    
    /**
     * *******************************************************
     * @ DON - comment 
     *  MOVES THE PLAYER POSITION ON SAID ISLAND
     **********************************************************
     */
    public void movePlayer(int SpinnerValue) {

        //get what island the player is on
        playerIsland = players[playerTurn].getIsland();
        
        //set the island array 
        setIsland(playerIsland);       
        
        int counter = players[playerTurn].getPosition();
        int loopCounter = 0;

        while (loopCounter < SpinnerValue) {
            
            //this if is to avoid an out of bounds exception 
            if (counter > playerIslandArray.length - 1) 
            {
                //reset counter, note counter can change on down depending on the island
                counter = 0;
                
                //change the players island once the end of the island is reached 
                //this block is just for the middle island 
                if(playerIsland == 1){
                    players[playerTurn].changeIsland(3);
                    setIsland(players[playerTurn].getIsland());}
                else if (playerIsland == 2){
                    players[playerTurn].changeIsland(3);
                    setIsland(players[playerTurn].getIsland());}

                /*these checks or for the alternative paths, it decreases the island by one
                *and sets the players position depending on the island they are on
                *******************************************************/
                else if(BoardGame.missionControl.players[BoardGame.missionControl.playerTurn].getIsland() == 5){
                    players[playerTurn].changeIsland(4);
                    setIsland(players[playerTurn].getIsland());
                    counter=10;}
                else if(BoardGame.missionControl.players[BoardGame.missionControl.playerTurn].getIsland() == 7){
                    players[playerTurn].changeIsland(6);
                    setIsland(players[playerTurn].getIsland());
                    counter=19;}
                else if(BoardGame.missionControl.players[BoardGame.missionControl.playerTurn].getIsland() == 9){
                    players[playerTurn].changeIsland(8);
                    setIsland(players[playerTurn].getIsland());
                    counter=13;
                }
                //*****************************************************
                    
            }
            
            
            //this whole else is checking the color of tiles and performing actions based on that tile
            else 
            {              
                if (playerIslandArray[counter].getBackground().equals(Color.red)) 
                {
                    counter ++;
                    break;
                }
                else if (playerIslandArray[counter].getBackground().equals(Color.green))
                        {
                            System.out.println("You have this much money " + players[BoardGame.missionControl.playerTurn].getMoney());
                            BoardGame.missionControl.players[BoardGame.missionControl.playerTurn].adjustMoney(10000);
                            System.out.println("Updated total = " + players[BoardGame.missionControl.playerTurn].getMoney());                      
                        }
                else if(playerIslandArray[counter].getBackground().equals(Color.yellow)){
                    //counter ++;
                    //islandSelectGUI.main(null);
                    if(getUserIsland()){
                        counter=1;
                        System.out.println("ITS IN HERE");
                        break;}
                        
                }
                else if(playerIslandArray[counter].getBackground().equals(Color.blue)){
                    if(getUserPath()){
                        int currentIsland = players[playerTurn].getIsland();
                        currentIsland+=1;
                        players[playerTurn].changeIsland(currentIsland);
                        setIsland(players[playerTurn].getIsland());
                        counter=0;
                    }
                }
                
                //increment the loop counter and the counter which represents the players position
                    counter++;
                    loopCounter++;
            }    
        }
        loopCounter = 0;
        
        

        //  then adds that new number to the player position.
        players[playerTurn].setPlayerPosition(counter);

        System.out.println("Spinner Value = " + SpinnerValue);
        System.out.println("Counter = " + counter);


        //  moves the label aka the player icon to the new position on the board
        playerIslandArray[players[playerTurn].getPosition() -1].add(lblPlayers[playerTurn]);
           
        //redraw the board to update the graphics 
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
        } else if(playerIsland ==5){
            playerIslandArray = systemIslandTopRightAltArray;
        } else if (playerIsland == 6) {
            playerIslandArray = systemIslandBottomRightArray;
        } else if (playerIsland ==7){
            playerIslandArray = systemIslandBottomRightAltArray;
        } else if (playerIsland == 8) {
            playerIslandArray = systemIslandBottomLeftArray;
        } else if(playerIsland ==9){
            playerIslandArray = systemIslandBottomLeftAltArray;
        } else if(playerIsland ==10)   {
            playerIslandArray = systemIslandTopLeftArray;
        }
    }
    
    
    //*************************************
   //Text Log Events and stuff 
   //PlayerTurn should be the player name
    
        public void rollLog(int spinnerValue){
            //Variables*******************************
         JTextArea TextLog=startScreen.myEventLog.getjTextArea2();
        String log=TextLog.getText();
       
 pName1=startScreen.myBoard.getjLabel1().getText();
        pName2=startScreen.myBoard.getjLabel2().getText();
         pName3=startScreen.myBoard.getjLabel3().getText();
         pName4=startScreen.myBoard.getjLabel4().getText();
          pName5=startScreen.myBoard.getjLabel5().getText();
         pName6=startScreen.myBoard.getjLabel6().getText();

       pNames[0]=pName1;
       pNames[1]=pName2;
       pNames[2]=pName3;
       pNames[3]=pName4;
       pNames[4]=pName5;
       pNames[5]=pName6;
       
            TextLog.setText(log+"\n" + pNames[playerTurn] + " rolled a " + spinnerValue);
           log=TextLog.getText();
           TextLog.setText(log+"\n"+ pNames[playerTurn] + " is on Square "+players[playerTurn].getPosition());
          
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
            
            //Buttons on event log correspond to number of players
             hideButtons[i].setVisible(false);
        }

    }
    
    
    /*
     * this method "getUserPath is used for path switching in islands
     * when the player lands on a blue tile a dialog box appears
     * depending on the option selected the method returns a boolean
     */
    public boolean getUserPath(){
        
        //declare return boolean
        boolean switchPath=false;
        
        //create the dialog box with a yes no option 
        JOptionPane pane = new JOptionPane("Do You want to switch paths? ",
        JOptionPane.QUESTION_MESSAGE,
        JOptionPane.YES_NO_OPTION);
        JDialog info = pane.createDialog("Path Switch");
        info.setVisible(true);


        Object val = pane.getValue();
        // Check for yes or no button pressed
        if(val != null) {
        if(val instanceof Integer) {
        int intVal = ((Integer)val).intValue();
        if(intVal == JOptionPane.OK_OPTION) {
        // set switchPath to true if yes is pressed
            switchPath=true;
        } else {
        // set switchPath to false if no is pressed
            switchPath=false;
                }   
            }
        }
        //return the boolean
        return switchPath;
    }
    
    public boolean getUserIsland(){
        
        //the new playerIsland 
        int newplayerIsland=0; 
        
        //is the player continuing or changing island
        boolean playerChangeIsland =true;
        
        /*
         * this code spawns a new JOption pane and gets the users input 
         * retun value is set to an int to represent the island selection 
         * 1 - Top Left 2 - Top Right 3 - Bottom Left 4- Bottom Right 0 - no island (continue on)
         */
        Object[] options = {"Top Left","Top Right","Bottom Left","Bottom Right", "Continue"};
        
        int returnValue = JOptionPane.showOptionDialog(null, "Which Island would you like to travel to?", "Island Travel",

        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,

        null, options, options[0]);
        
        switch(returnValue){
            case 0:
                returnValue =1;
                break;
            case 1:
                returnValue =2;
                break;
            case 2:
                returnValue =3; 
                break;
           case 3:
                returnValue =4;
                break;
           case 4: 
                returnValue =0;
                System.out.println("this is the return value = " + returnValue);
               break;
        }
        
        if(returnValue==0)
            playerChangeIsland=false;
        
        
        /*Depending on the users selection, we need to change the island and position is the player class
         * and run setIsland in this class and movePlayer with a parameter of zero to update the board
         */
        if(playerChangeIsland){
        if(returnValue==1)
            newplayerIsland=10;
        else if(returnValue==2)
            newplayerIsland=4;
        else if(returnValue==3)
            newplayerIsland=8;
        else if(returnValue==4)
            newplayerIsland=6;
        
        players[playerTurn].changeIsland(newplayerIsland);
        players[playerTurn].setPlayerPosition(1);
        setIsland(newplayerIsland);
        movePlayer(0);}
        
        return playerChangeIsland;
        
        
    }
    

    public int getLifespan() {
        return lifespan;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }
    
}
