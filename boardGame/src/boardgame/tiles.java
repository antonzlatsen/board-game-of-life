/*
 * this class will contain methods for manipulating the tiles 
 * on the board
 */
package boardgame;

import java.awt.Color;
import javax.swing.JPanel;
import java.util.Random;

/**
 *
 * @author Team Liquid
 */
public class tiles{
    
    public void randomiseTiles(JPanel [] tiles){
        
        //types of tiles that can replace the changable tiles
        String [] tileTypes ={"blank","redMarriage","getBaby","getPet","payday","paydayPromotion","spinToWin"};  
        Random rand = new Random();

        for(int i=0; i<tiles.length;i++){
            
            int num = rand.nextInt(tileTypes.length)+0;
            
            tiles[i].setName(tileTypes[num]);
        }
    }
    
    public void changeTileColors(JPanel[] tiles){
        
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
                //color is a dark green0
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
            //else exams are passed if spinnervalue is above 3 
        else{
                BoardGame.missionControl.players[BoardGame.missionControl.playerTurn].setExamActive(false);
                BoardGame.missionControl.MessageBoxShow("You passed your exams", "Exams Passed");}
        
        startScreen.myBoard.setButtons(false,true,false);
    }
}

        