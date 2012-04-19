/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame;

/**
 *
 * @author Team Liquid
 */
public class Player {
    
    //declare variables 
    private int island, position; 
    
    
    public Player(){
    
        island=1; 
        position=0;
       
    }
    
    public int getIsland(){
        return island;
    }
    
    public int getPosition(){
        return position;
    }
    
    
}
