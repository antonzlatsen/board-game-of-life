package boardgame;

import javax.swing.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random;

/**
 *
 * @author Team Liquid
 */
public class Houston {

    int lifespan = 0;
    //creating new players and adding them to a player array
    public Player player_1 = new Player();
    public Player player_2 = new Player();
    public Player player_3 = new Player();
    public Player player_4 = new Player();
    public Player player_5 = new Player();
    public Player player_6 = new Player();
    public Player[] players = {player_1, player_2, player_3, player_4, player_5, player_6};
    //array that hold the players icons this allows player movement on the board
    private JLabel[] lblPlayers = startScreen.myBoard.getLblPlayers();
    //variables to determine turn
    public int playerTurn = 0;
    //variable to determine island 
    private int playerIsland;
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
    // initialize the player island array
    private JPanel playerIslandArray[] = systemIslanMiddleArray;
    //this boolean array holds the availabilty of house 
    private boolean houseTaken [] = new boolean[4];
    //holds the prices of houses 
    private int housePrices [] = new int[4];
    
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
        //counter will tell us the players new position
        int counter = players[playerTurn].getPosition();
        //controls how many times the loop is run 
        int loopCounter = 0;

outerloop:
        while (loopCounter < SpinnerValue) {
            
            //this if is to avoid an out of bounds exception 
            if (counter > playerIslandArray.length - 1) 
            {
                //reset counter, note counter can change on down depending on the island
                counter = 0;
                
                //change the players island on the combined one
                //only the case for the middle island 
                switch(playerIsland){
                    
                    case 1:
                        players[playerTurn].changeIsland(3);
                        setIsland(players[playerTurn].getIsland());
                        break;
                    case 2:
                        players[playerTurn].changeIsland(3);
                        setIsland(players[playerTurn].getIsland());
                        break;
                }
                
                //holds what island the player is currently on
                int playerIslandPathSwitch = BoardGame.missionControl.players[BoardGame.missionControl.playerTurn].getIsland();
                
                //changes the players island when they get to the end of a path within a island
                //the counter value is depended on what island they are on
                switch(playerIslandPathSwitch){
                    
                    case 5:
                        players[playerTurn].changeIsland(4);
                        setIsland(players[playerTurn].getIsland());
                        counter=10;
                        break;
                    case 7:
                        players[playerTurn].changeIsland(6);
                        setIsland(players[playerTurn].getIsland());
                        counter=19;
                        break;
                    case 9:
                        players[playerTurn].changeIsland(8);
                        setIsland(players[playerTurn].getIsland());
                        counter=13;
                        break;
                }
     
            }
             
            //this whole else is checking the name of tiles and performing actions based on that tile
            else 
            {   
                //get the name of tile the player is moving onto
                String name = playerIslandArray[counter].getName();
                
                switch(name){
                    
                    case "redMarriage":
                        counter ++;
                        //check to see if the player has a spouse
                        //if not a spouse is added else money is given
                        if(!players[playerTurn].isSpouse())
                            players[playerTurn].setSpouse(true);
                        else
                            players[playerTurn].adjustMoney(10000);
                        break outerloop;
                    
                    case "redExam":                        
                        counter++;
                        startScreen.myBoard.setButtons(true, false, false);
                        players[playerTurn].setExamActive(true);
                        MessageBoxShow("Take your exams, spin over a 3 to pass", "Exam Info");
                        break outerloop;
                        
                    case "payday":
                        players[playerTurn].adjustMoney(players[playerTurn].getSalary());
                        break;
                        
                    case "paydayPromotion":
                        players[playerTurn].adjustMoney(players[playerTurn].getSalary());
                    
                        if(players[playerTurn].getPromotionTokens()<3){
                            //this increases promotion tokens by one does not set 
                            players[playerTurn].setPromotionTokens(1);
                            //set the new salary
                            players[playerTurn].adjustSalary(10000);}
                        break;
                        
                    case "boatPort":
                        if(getUserIsland()){
                            //check if player has a boat if not add one
                            if(!players[playerTurn].isBoat())
                            players[playerTurn].setBoat(true);
                        
                            counter=1;
                            break outerloop;}
                        break;
                        
                        
                    case "airPort":
                        if(getUserIsland()){
                        //check if player has a plane if not add one
                            if(!players[playerTurn].isPlane())
                                players[playerTurn].setPlane(true);
                            
                            counter=1;
                            break outerloop;}
                        break;
                        
                        
                    case "pathSwitch":
                        //get the players input if they want to switch path or continue
                        if(getUserInput("Do you want to switch path? ", "Path Switch")){
                            //if they want to change, add one to their island and set their island in the player class
                            int currentIsland = players[playerTurn].getIsland();
                            currentIsland+=1;
                            players[playerTurn].changeIsland(currentIsland);
                            setIsland(players[playerTurn].getIsland());
                            counter=0;}
                        break;
                        
                        
                    case "payCollege":
                        //add a bank loan but dont give the player money
                        MessageBoxShow("You have to take out a loan to pay college fees\n you have one bank loan","Bank Loan");
                        players[playerTurn].adjustBankLoans(1);
                        break;
                }
                
                if(name.substring(0,5).equals("house")){
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
            }
                    
                    counter++;
                    loopCounter++;
                
                //increment the loop counter and the counter which represents the players position
                       
        }
        loopCounter = 0;
        
        //this is the tile the player has landed on
        String name = playerIslandArray[counter-1].getName();
        //call the setInfoTile method to display info about the tile on the board
        BoardGame.boardTiles.setInfoTile(name,"");
        
        /*
         * these if statements below are to check what tile the player 
         * has landed on as apposed to past through */
        
        if (name.equals("spinToWin"))
        {   
            //spin to win select a random player to recieve the jackpot
            Random randy = new Random();
            int random = randy.nextInt(startScreen.numberOfPlayers+1);
            JLabel[] playerNames = startScreen.myBoard.getPlayerNames();
            MessageBoxShow(playerNames[random].getText()+" has won $75,000 ", "Spin To Win");
            players[random].adjustMoney(75000);
        }
        
        if (name.equals("blank")){
            
            int randNumb = 0;
            try {
                randNumb = 1 + (int)(Math.random()* returnLineCount());
            } catch (IOException ex) {
                Logger.getLogger(Houston.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            int checker = randNumb % 2;
            
            //if odd number, the text file selects a bad story
            if (checker != 0) {
                {
                    try {
                        BoardGame.boardTiles.setInfoTile(name,BoardGame.missionControl.readFile(randNumb));
                    } catch (IOException ex) {
                        Logger.getLogger(Houston.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            //if even number select a good story from the text file
            else{
                randNumb --;                  
                try {
                        BoardGame.boardTiles.setInfoTile(name,BoardGame.missionControl.readFile(randNumb));
                } catch (IOException ex) {
                    Logger.getLogger(Houston.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        //  then adds that new number to the player position.
        players[playerTurn].setPlayerPosition(counter);

        //  moves the label aka the player icon to the new position on the board
        playerIslandArray[players[playerTurn].getPosition() -1].add(lblPlayers[playerTurn]);
           
        //redraw the board to update the graphics
        playerstats(playerTurn);
        startScreen.myBoard.repaint();
        
        //************************************ finish the movePlayer method **************************

    }
    
    public void MessageBoxShow(String BODY, String TITLE){
        //method is used to output meesages to the user
                    JFrame frame = null;
                    JOptionPane.showMessageDialog(frame,
                    BODY,
                    TITLE,
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

public void playerstats(int playerturn){
    
    //Displays player stats
        
        JLabel [] playerNames = startScreen.myBoard.getPlayerNames();
        String output;
        //start constructing a string for output 
        
        //add players name to output 
        output ="\t" + playerNames[playerTurn].getText();
        
        //add players money to output
        output += "\nYou have $" + BoardGame.missionControl.players[playerturn].getMoney();
        //output the players salary
        output+="\nYour salary is $" + BoardGame.missionControl.players[playerturn].getSalary();
        //add if the player has a wife 
        if(BoardGame.missionControl.players[playerturn].isSpouse())
            output+="\nYou have a wife";
        //add if the player has a baby
        if(BoardGame.missionControl.players[playerturn].isBaby())
            output+="\nYou have a baby";
        //add if the player has a pet
        if(BoardGame.missionControl.players[playerturn].isPet())
            output+="\nYou have a pet";
        //add if the player has a house
        if(BoardGame.missionControl.players[playerturn].isHouse())
            output+="\nYou have a house and it is worth $"+ housePrices[BoardGame.missionControl.players[playerturn].getHouseIndex()];
        //add if the player has anybank loans
        if(BoardGame.missionControl.players[playerturn].getBankLoans()>0)
            output+="\nYou have " + BoardGame.missionControl.players[playerturn].getBankLoans() + " bank loans and owe $" + BoardGame.missionControl.players[playerturn].getBankLoans()*60000;
        //add if the player has any passport tokens
        if(BoardGame.missionControl.players[playerturn].getPassPortTokens()>0)
            output+="\nYou have " + BoardGame.missionControl.players[playerturn].getPassPortTokens() + " passport tokens";
        //add if the player has a boat
        if(BoardGame.missionControl.players[playerturn].isBoat())
            output+="\nYou own a Boat";
        //add if the player has a plane
        if(BoardGame.missionControl.players[playerturn].isPlane())
            output+="\nYou own a Plane";
        //output the text to the screen
        startScreen.myBoard.getjTextArea1().setText(output); 
}

    public void setUp() {
        
        //method is run when the board is being setup
        
        //  Sets the lifespan value to the progress bar on the board
        board.jProgressBar2.setMaximum(lifespan);
        board.jProgressBar2.setValue(lifespan);
        
        //sets the players icons invisible depending on the amount of players 
        for (int i = 5; i != startScreen.numberOfPlayers; i--) {
            lblPlayers[i].setVisible(false);
            }
            
            //code to set players salary 
            //****************************************************
            int [] careerJobsSalary = {10000,20000,30000};
            int [] collegeJobsSalary = {40000,50000,60000};
            Random randSeed = new Random();
            
            for(int j=0; j<=startScreen.numberOfPlayers; j++){
                
                int randomIndexNumber = randSeed.nextInt(3);
                
                
                if(players[j].getIsland()==1){
                    players[j].setSalary(careerJobsSalary[randomIndexNumber]);
                }
                else{
                    players[j].setSalary(collegeJobsSalary[randomIndexNumber]);
                } 
                //set the inital house prices
                setHousePrices();
                //playerstats(0);
                //give each player their starting salary 
                players[j].adjustMoney(players[j].getSalary());
            }
            //***************************************************** 
            
            //code to set the buttons at the start of the game, buttons are spinner, endTurn and volcano button
            startScreen.myBoard.setButtons(false,false,true);
            
            //outputs the status of the first player
            playerstats(playerTurn);       
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
        
        //create options for the JOption pane
        Object[] options = new Object[4];
        
        //options for the JOption pane change depending on what island the player is on, this ensures the player cannot
        //select the same island they are on hence moving illegally around the board.
            if(players[playerTurn].getIsland()==3){
                options[0]="Top Left"; options[1]="Top Right"; options[2]="Bottom Left"; options[3]="Bottom Right";}
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
        
        // check to see if the user clicks the x button, this avoids out of bounds exception error and randomly selects their island
        if(returnValue==-1)
            returnValue=0;
        
        // change the object selected to a string so it can be compared 
        String selected = options[returnValue].toString();
        
        // find out what was selected and set the appropiate island and
        // set that the player has travelled to this island 
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
        
        /* If the user has selected to change island make the appropiate changes 
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
            return (getUserInput("Would you like to buy this house for $"+housePrices[houseIndex] +"?", "Buy House"));}
            
        else
            return false;
    }
    
    public void setHousePrices(){
        //setHousePrices selects a random array and sets the house prices
        //equal to it
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
    
    public int getLifespan()    {
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
    
    
    
    public int returnLineCount() throws IOException{
        //  line counter vars

        String file_name = "/src/boardgame/story.txt";
        //File inputFile = new File("time.txt");
        FileReader counterFile = new FileReader("story.txt");

        //String file_name ="C:/story.txt";
        //FileReader counterFile = new FileReader(file_name);

        BufferedReader bufferReader = new BufferedReader (counterFile);
        
        
         //******************************************************************
        //  gets the number of lines in the text file
        int i;
        String line;
         //  the number of lines to read into the buffer
        int numberOfLines = 0;       
        while ((line = bufferReader.readLine()) != null) {
	    numberOfLines ++;
	}
        
        //  validation
       // MessageBoxShow(Integer.toString(numberOfLines),"number of lines");
        //******************************************************************
        bufferReader.close();
        return numberOfLines;  
    }
    
    
    
    
    
    /**
     *  this method will read in text files and allow stuff to happen
     */
    
    public String readFile(int randomNumber) throws IOException{
        
        int i;
        int workingVar = randomNumber;
        
        String file_name = "/src/boardgame/story.txt";
        
        //  story buffers;
        
        FileReader myStoryFile = new FileReader("story.txt");
        BufferedReader myStoryBuffer= new BufferedReader(myStoryFile);
             
        
        int numberOfLines = returnLineCount();
        
        
        
        //  creates an array to hold the lines from the text file
        String[] txtOUTPUT = new String[numberOfLines];

        // for loop to populate the array
        for (i=0; i < numberOfLines; i ++) {
            
        txtOUTPUT[i] = myStoryBuffer.readLine();

        }
        
        // takes the values and ajusts the current players money
        System.out.println("random number = " + workingVar);
        //randomNumber ++;
        int makeSomeMoney = Integer.parseInt(txtOUTPUT[workingVar]);
        
        
        
        players[playerTurn].adjustMoney(makeSomeMoney);
        
        //closes the buffers
        
        myStoryBuffer.close();
        
        // returns the text for output later
        String zoneOfEnders = "You " + txtOUTPUT[workingVar - 1] + "\nA change of $" + txtOUTPUT[workingVar] + " to your account";
        return zoneOfEnders;
    }   
}
