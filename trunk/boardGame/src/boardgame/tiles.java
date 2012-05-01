/*
 * this class will contain methods for manipulating the tiles 
 * on the board
 */
package boardgame;

import java.awt.Color;
import javax.swing.*;
import java.util.Random;

/**
 *
 * @author Team Liquid
 */
public class tiles{
    
    //Load in the images 
    private ImageIcon house = new ImageIcon("src/boardgame/tileIcons/house.png");
    private ImageIcon airPort = new ImageIcon("src/boardgame/tileIcons/airPort.png");
    private ImageIcon boatPort = new ImageIcon("src/boardgame/tileIcons/boatPort.png");
    private ImageIcon getBaby = new ImageIcon("src/boardgame/tileIcons/getBaby.png");
    private ImageIcon getPet = new ImageIcon("src/boardgame/tileIcons/getPet.png");
    private ImageIcon paydayPromotion = new ImageIcon("src/boardgame/tileIcons/paydayPromotion.png");
    private ImageIcon payday = new ImageIcon("src/boardgame/tileIcons/payday.png");
    private ImageIcon redMarriage = new ImageIcon("src/boardgame/tileIcons/redMarriage.png");
    private ImageIcon redExam = new ImageIcon("src/boardgame/tileIcons/redExam.png");
    private ImageIcon spinToWin = new ImageIcon("src/boardgame/tileIcons/spinToWin.png");
    private ImageIcon blank = new ImageIcon("src/boardgame/tileIcons/blank.png");
    
    
    public void randomiseTiles(JPanel [] tiles){
        
        //types of tiles that can replace the changable tiles
        String [] tileTypes ={"blank","getBaby","getPet","payday","paydayPromotion","spinToWin"};  
        Random rand = new Random();
        //randomly set the names of the tiles
        for(int i=0; i<tiles.length;i++){
            
            int num = rand.nextInt(tileTypes.length)+0;
            
            tiles[i].setName(tileTypes[num]);
        }
    }
    
    public void changeTileColors(JPanel[] tiles){
        
        //this method changes the color of the tile depending on the name of it
        for(int i=0;i<tiles.length;i++){
        String name = tiles[i].getName();
        
        switch(name){
            case "blank":
                //color is just the normal color for blank tiles
                tiles[i].setBackground(new Color(204,204,255));
                break;
            case "redMarriage":
                //color is red for stop and get married
                tiles[i].setBackground(new Color(255,0,0));
                break;
            case "getBaby":
                //color is baby blue or light blue
                tiles[i].setBackground(new Color(0,255,255));
                break;
            case "getPet":
                //color is orange
                tiles[i].setBackground(new Color(255,102,0));
                break;
            case "airPort":
                //color is light yellow
                tiles[i].setBackground(new Color(255,255,102));
                break;
            case "boatPort":
                //color is a dark yellow
                tiles[i].setBackground(new Color(255,255,0));
                break;
            case "payday":
                //color is a light green
                tiles[i].setBackground(new Color(102,255,102));
                break;
            case "paydayPromotion":
                //color is a dark green
                tiles[i].setBackground(new Color(0,255,0));
                break;
            case "spinToWin":
                //color is a very dark yellow
                tiles[i].setBackground(new Color(102,102,0));
                break;
            }
        }
    }
    
    public void redExamTile(int spinnerValue){
        
        //if they spin below 3 the player fails there exams
        if(spinnerValue<=3){
            if(BoardGame.missionControl.getUserInput("You failed your exams do you want to take out a loan to pass your exams \n note: if you dont you retake your exams next turn", "Exams Failed")){
                //check to see if the player already has max number of bank loans
                if(BoardGame.missionControl.players[BoardGame.missionControl.playerTurn].getBankLoans()<4){
                    BoardGame.missionControl.players[BoardGame.missionControl.playerTurn].setExamActive(false);
                    BoardGame.missionControl.players[BoardGame.missionControl.playerTurn].adjustBankLoans(1);}
                else
                    BoardGame.missionControl.MessageBoxShow("You already have the maximum number of loans", "Bank Loans");
            }
        }
            //else exams are passed if spinnervalue is above 3 they pass there exams
        else{
                BoardGame.missionControl.players[BoardGame.missionControl.playerTurn].setExamActive(false);
                BoardGame.missionControl.MessageBoxShow("You passed your exams", "Exams Passed");}
        
        startScreen.myBoard.setButtons(false,true,false);
    }
    
    public void setInfoTile(String tileType, String optionalStory){
        
        //depending on the tile output the relevant info to the information panel
        
        switch(tileType){
            
            case "blank":
                startScreen.myBoard.setInfoPanel(optionalStory,blank);
                break;
            case "redMarriage":
                startScreen.myBoard.setInfoPanel("You are getting married or celebrating your annivesary",redMarriage);
                break;
            case "airPort":
                startScreen.myBoard.setInfoPanel("You are on an airport, Take Off!!",airPort);
                break;
            case "boatPort":
                startScreen.myBoard.setInfoPanel("You are on a boat port, Set Sail!!",boatPort);
                break;
            case "getBaby":
                startScreen.myBoard.setInfoPanel("You are having a baby",getBaby);
                break;
            case "getPet":
                startScreen.myBoard.setInfoPanel("You have got a new dog",getPet);
                break;
            case "payday":
                startScreen.myBoard.setInfoPanel("Its payday collect you salary",payday);
                break;
            case "paydayPromotion":
                startScreen.myBoard.setInfoPanel("You have been promoted, congratz!!!",paydayPromotion);
                break;
            case "spinToWin":
                startScreen.myBoard.setInfoPanel("Someone has won the spin to win jackpot!!",spinToWin);
                break;
            case "redExam":
                startScreen.myBoard.setInfoPanel("Time to take your exams spin a 3 are above to pass",redExam);
                break;
        }
        //house is seperate because house name tiles have numbers at the end to indicate there index in the houseprices array and houseTaken array
        if(tileType.substring(0,5).equals("house")){
            startScreen.myBoard.setInfoPanel("You are on a house Tile",house);
        }
    }
    
}

        