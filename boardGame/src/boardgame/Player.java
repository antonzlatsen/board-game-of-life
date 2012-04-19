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
    private int island, position, money, spinToWin; 
    private boolean pet=false; 
    private boolean baby=false;
    private boolean spouse=false;
    
    
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
        island=2; 
        //  should set the player position to tile 1            
        //  ie - the first tile of the set                      
        position=1;
        
        //starting value 10K
        money = 10000;
        
        spinToWin=0;
       
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
    
    public void adjustMoney(int value){
        this.money+=value;
    }
    
    public int getMoney(){
        return this.money;
    }
    
    public void setSpinToWin(int value){
        this.spinToWin=value;
    }

    public boolean isBaby() {
        return baby;
    }

    public void setBaby(boolean baby) {
        this.baby = baby;
    }

    public boolean isPet() {
        return pet;
    }

    public void setPet(boolean pet) {
        this.pet = pet;
    }

    public boolean isSpouse() {
        return spouse;
    }

    public void setSpouse(boolean spouse) {
        this.spouse = spouse;
    }
    
    
    
}
