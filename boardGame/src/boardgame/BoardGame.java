/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame;

/**
 *
 * @author Don
 */
public class BoardGame {

    /**
     * @param args the command line arguments
     */
        public static void main(String args[]) {
            
            System.out.println("hello world");
            
            
            
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new board().setVisible(true);
            }
        });
        }
}