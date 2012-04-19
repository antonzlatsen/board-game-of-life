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
    
    //  declare variables 
    
    /*********************************************************
    *   @ DON - comment
    *   island will show which section of the board they are in 
    *   e.g. - Middle, top right etc                              
    *   position will show where the player is on his/her island
    **********************************************************
    */
    private int island, position; 
    
    
    /*********************************************************
    *   @ DON - comment
    *   CONSTRUCTOR
    *   
    *   Sets the various defaults that the player will need -
    *   
    *   @TODO
    *   Include other such items that the player will need such as
    *   Currency, pets, spouse and so on
    **********************************************************
    */
    public Player(){
        // not used at the moment                               
        island=1; 
        //  should set the player position to tile 1            
        //  ie - the first tile of the set                      
        position=1;
       
    }
    
    /*********************************************************
    *   @ DON - comment
    *   
    *   Simple getters.
    *   Nothing to see here - move along.
    **********************************************************
    */
    public int getIsland(){
        return island;
    } 
    public int getPosition(){
        return position;
    }
    
    /*********************************************************
    *   @ DON - comment
    *   
    *   END GETTE BLOCK
    **********************************************************
    
    /*********************************************************
    *   @ DON - comment
    *   
    *   Simple SETTERS.
    *   Nothing to see here - move along.
    **********************************************************
    */
    
    public void setPlayerPosition(int updatedPosition)
    {
        this.position = updatedPosition;
    }
    
    
}
