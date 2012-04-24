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
    
    //this boolean array holds the availabilty of house 
    private boolean houseTaken [] = new boolean[4];
    //holds the prices of houses 
    private int housePrices [] = new int[4];

    
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
                String name = playerIslandArray[counter].getName();
                
                
                if (name.equals("redMarriage"))
                {
                    counter ++;
                    //check to see if the player has a spouse
                    //if not a spouse is added else money is given
                    if(!players[playerTurn].isSpouse())
                        players[playerTurn].setSpouse(true);
                    else
                        players[playerTurn].adjustMoney(10000);
                    
                    break;
                }
                
                else if (name.equals("payday")){
                            //debug statements
                            //System.out.println("You have this much money " + players[BoardGame.missionControl.playerTurn].getMoney());
                            players[playerTurn].adjustMoney(players[playerTurn].getSalary());
                            //debug statements
                            //System.out.println("Updated total = " + players[BoardGame.missionControl.playerTurn].getMoney());                      
                }
                
                else if(name.equals("paydayPromotion")){
                    players[playerTurn].adjustMoney(players[playerTurn].getSalary());
                    
                    if(players[playerTurn].getPromotionTokens()<3){
                        //this increases promotion tokens by one does not set 
                        players[playerTurn].setPromotionTokens(1);
                        //set the new salary
                        players[playerTurn].adjustSalary(10000);}      
                }
                
                else if(name.equals("boatPort")){
                    if(getUserIsland()){
                        
                        //check if player has a boat if not add one
                        if(!players[playerTurn].isBoat())
                            players[playerTurn].setBoat(true);
                        
                        counter=1;
                        break;}
                }
                    
                else if(name.equals("airPort")){
                    if(getUserIsland()){
                        
                        //check if player has a plane if not add one
                        if(!players[playerTurn].isPlane())
                            players[playerTurn].setPlane(true);
                        
                        counter=1;
                        break;
                }
                        
                }
                else if(name.equals("pathSwitch")){
                    if(getUserInput("Do you want to switch path? ", "Path Switch")){
                        int currentIsland = players[playerTurn].getIsland();
                        currentIsland+=1;
                        players[playerTurn].changeIsland(currentIsland);
                        setIsland(players[playerTurn].getIsland());
                        counter=0;
                    }
                }
                
                else if(name.substring(0,5).equals("house")){
                    //do house stuff
                    if(doHouseStuff(name)){
                        //get the house index in the house taken and house prices arrat
                        int houseIndex = Integer.parseInt(name.substring(name.length()-1));
                        //check that the player has enough money
                        if((players[playerTurn].getMoney()-housePrices[houseIndex]>0)){
                            //if they do adjust money, set that they have a house and set the house as taken
                            players[playerTurn].adjustMoney(-housePrices[houseIndex]);
                            players[playerTurn].setHouseIndex(houseIndex);
                            players[playerTurn].setHouse(true);
                            houseTaken[houseIndex]=true;
                            counter++;
                            break;}
                        else{
                            //error messge if they dont have enough money
                            MessageBoxShow("You do not have enough money to buy this house", "Your broke");}
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
            
            //code to set players salary 
            //****************************************************
            int [] careerJobsSalary = {10000,20000,30000};
            int [] collegeJobsSalary = {40000,50000,60000};
            
            for(int j=0; j<=startScreen.numberOfPlayers; j++){
                   
                //since rand number is inside loop it is calculated very quickly, index 2 is very rare if not impossible 
                //maybe look at a different way forward
                int randomIndexNumber = 0 + (int)(Math.random()*2);
                
                
                if(players[j].getIsland()==1){
                    players[j].setSalary(careerJobsSalary[randomIndexNumber]);
                }
                else{
                    players[j].setSalary(collegeJobsSalary[randomIndexNumber]);
                }
                
                //set the inital house prices
                setHousePrices();
                
                //give each player their starting salary 
                players[j].adjustMoney(players[j].getSalary());
            }
            //***************************************************** 
    }
    
    
    /*
     * this method "getUserPath is used for path switching in islands
     * when the player lands on a blue tile a dialog box appears
     * depending on the option selected the method returns a boolean
     * returns tru for yes and false for no 
     */
    public boolean getUserInput(String message, String title){
        
        //declare return boolean
        boolean switchPath=false;
        
        //create the dialog box with a yes no option 
        JOptionPane pane = new JOptionPane(message,
        JOptionPane.QUESTION_MESSAGE,
        JOptionPane.YES_NO_OPTION);
        JDialog info = pane.createDialog(title);
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
    
    /*
     * this method "getUserIsland" is used for island switching
     * when the user lands on a yellow tile the dialog box appears 
     * the method returns a boolean depending on the method selected
     */
    public boolean getUserIsland(){
        
        //the new playerIsland 
        int newplayerIsland=0; 
        
        //is the player continuing or changing island
        boolean playerChangeIsland =true;
        
        /*
         * this code spawns a new JOption pane and gets the users input 
         * retun value is set to an int to represent the island selection 
         * 1 - Top Left 2 - Top Right 3 - Bottom Left 4- Bottom Right 0 - no island (continue on)
         * the content of options depends on the players current island - some options will be removed
         */
        
        Object[] options = new Object[4];
            if(players[playerTurn].getIsland()==3){
                options[0]="Top Left"; options[1]="Top Right"; options[2]="Bottom Left"; options[3]="Bottom Right";}
           // options = {"Top Left","Top Right","Bottom Left","Bottom Right"};
            else{
               if(players[playerTurn].getIsland()==4){
               options[0]="Top Left"; options[1]="Bottom Left"; options[2]="Bottom Right"; options[3]="Continue";}
               else if(players[playerTurn].getIsland()==6){
                   options[0]="Top Left"; options[1]="Top Right"; options[2]="Bottom Left"; options[3]="Continue";}
               else if(players[playerTurn].getIsland()==8){
                   options[0]="Top Left"; options[1]="Top Right"; options[2]="Bottom Right"; options[3]="Continue";}
               else if(players[playerTurn].getIsland()==10){
                   options[0]="Top Right"; options[1]="Bottom Left"; options[2]="Bottom Right"; options[3]="Continue";}
                }
        
        int returnValue = JOptionPane.showOptionDialog(null, "Which Island would you like to travel to?", "Island Travel",

        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,

        null, options, options[0]);
        
        /* the variable returnValue holds the index of the selected value in the
         * array Object options
         */
        
        //change the object selected to a string so it can be compared 
        String selected = options[returnValue].toString();
        
        //find out what was selected and set the appropiate island and
        //set that the player has travelled to this island 
        switch(selected){
            case "Top Left":
                newplayerIsland=10;
                players[playerTurn].setBooleanIslandArray(0);
                break;
            case "Top Right":
                newplayerIsland=4;
                players[playerTurn].setBooleanIslandArray(1);
                break;
            case "Bottom Right":
                newplayerIsland=6;
                players[playerTurn].setBooleanIslandArray(2);
                break;
            case "Bottom Left":
                newplayerIsland=8;
                players[playerTurn].setBooleanIslandArray(3);
                break;
            case "Continue":
                playerChangeIsland=false;
                break;
        }
        
        /*If the user has selected to change island make the appropiate changes 
         * to the player class and variables in this class
         */
        if(playerChangeIsland){
        
        players[playerTurn].changeIsland(newplayerIsland);
        players[playerTurn].setPlayerPosition(1);
        setIsland(newplayerIsland);
        movePlayer(0);}
        
        //return true or false depending on if the player wants to switch islands
        return playerChangeIsland;
        
        
    }
    
    
    /*doHouseStuff checks that the player does not already have a house
     * the house is available and that they want to buy the house 
     */
    public boolean doHouseStuff(String theHouse){
        
        //get the house index first 
        int houseIndex = Integer.parseInt(theHouse.substring(theHouse.length()-1));
        //make sure the house is not already taken
        if(!houseTaken[houseIndex]&&!players[playerTurn].isHouse()){
            //check if the user wants to buy the house
            return (getUserInput("Would you like to buy this house? ", "Buy House"));}
        
        else
            return false;
    }
    
    public void setHousePrices(){
        int rand = 1 + (int)(Math.random()*4);
        
        int [] prices1 = {100000,200000,300000,400000};
        int [] prices2 = {200000,300000,400000,100000};
        int [] prices3 = {300000,400000,100000,200000};
        int [] prices4 = {400000,100000,200000,300000};
        
        switch(rand){
            case 1:
                housePrices = prices1;
                break;
            case 2: 
                housePrices = prices2;
                break;
            case 3: 
                housePrices = prices3;
                break;
            case 4:
                housePrices = prices4;
                break;
        }
    }
    
    public int getLifespan() {
        return lifespan;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }
    
    
    //getter and setter for houseTaken and housePrices

    public int getHousePrices(int index) {
        return housePrices[index];
    }

    public void setHouseTaken(int index,boolean value) {
        this.houseTaken[index] = value;
    }
    
    
    
    
    
}
