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
    private int island, position, money, spinToWin,salary,promotionTokens,houseIndex=-1,bankLoans; 
    private boolean pet=false; 
    private boolean baby=false;
    private boolean spouse=false;
    private boolean boat=false;
    private boolean plane=false;
    private boolean house=false;
    private boolean examActive=false; 
    private boolean[] islandTravelToArray = new boolean[4]; 
    
    
    /*********************************************************
    *   @ DON - comment
    *   CONSTRUCTOR
    *   
    *   Sets the various defaults that the player will need -
    *   
    *   @TODO Include other such items that the player will need such as
    *   Currency, pets, spouse and so on
    **********************************************************
    */
    public Player(){
        // not used at the moment                               
        island=1; 
        //  should set the player position to tile 1            
        //  ie - the first tile of the set                      
        position=1;
        
        //starting value 10K
        money = 10000;
        
        //starting promotion tokens 
        promotionTokens=0;
        
        bankLoans =0;
        
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
    *   Simple SETTERS & GETTERS.
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
    
    public void changeIsland(int value){
        this.island = value; 
    }

    public boolean isBoat() {
        return boat;
    }

    public void setBoat(boolean boat) {
        this.boat = boat;
    }

    public boolean isPlane() {
        return plane;
    }

    public void setPlane(boolean plane) {
        this.plane = plane;
    }

    public int getSalary() {
        return salary;
    }
    
    public void adjustSalary(int salary) {
        this.salary += salary;
    }
    
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getPromotionTokens() {
        return promotionTokens;
    }

    public void setPromotionTokens(int promotionTokens) {
        this.promotionTokens += promotionTokens;
    }
    
    public void setBooleanIslandArray(int index){
        islandTravelToArray[index]=true;
    }

    public boolean isHouse() {
        return house;
    }

    public void setHouse(boolean house) {
        this.house = house;
    }

    public int getHouseIndex() {
        return houseIndex;
    }

    public void setHouseIndex(int houseIndex) {
        this.houseIndex = houseIndex;
    }

    public boolean isExamActive() {
        return examActive;
    }

    public void setExamActive(boolean examActive) {
        this.examActive = examActive;
    }
    
    //returns the number of passport tokens the player has - for scoring
    public int getPassPortTokens(){
        int passportTokens=0;
        
        for(int i=0;i<islandTravelToArray.length;i++){
            if(islandTravelToArray[i]=true)
                passportTokens++;
        }
        
        return passportTokens;
    }

    public int getBankLoans() {
        return bankLoans;
    }

    public void adjustBankLoans(int value) {
        //value will either be 1 or -1
        this.bankLoans += value;
    }
    
    
    
    
    
    
    
    
}
