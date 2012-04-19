/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame;

/**
 *
 * @author Don
 */
import javax.swing.*;
public class BoardGame {
    
    public static Player player1 = new Player();
    public static JPanel [] array = startScreen.myBoard.getTopRightIsland();
   
    public static void playerMove(){
        
        
        int spacesToMove = Integer.parseInt(startScreen.myBoard.getSpinner());
        int island = player1.getIsland();
        int positionIndex = player1.getPosition();
        int zero=0;
        zero+=spacesToMove;
        
        System.out.println("position= "+ positionIndex);
        System.out.println("Spaces= "+ spacesToMove);
        
        array[zero].add(startScreen.myBoard.getLblPlayer1());
        
        System.out.println(array[zero]);
        
    }
    
    
    /**
     * @param args the command line arguments
     */
        public static void main(String args[]) {
        
        //testing code     
        boardgame.startScreen.myBoard.setVisible(true);
        
        
        
        //array[5].add(startScreen.myBoard.getLblPlayer1());
            
            
            
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new startScreen().setVisible(true);
            }
        });
        }
}