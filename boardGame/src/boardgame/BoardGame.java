package boardgame;

import  sun.audio.*;    //import the sun.audio package
import  java.io.*;
import javax.sound.sampled.FloatControl;


public class BoardGame {


    
    //  creates a new instance of the system class (Houston)
    //  named missionControl
public static Houston missionControl = new Houston();
public static tiles boardTiles = new tiles();
    
    
    

    
        //*********************************************************
        //                  MAIN METHOD
    
        public static void main(String args[]) throws FileNotFoundException, IOException{
        
          
                //  Shows the Start screen - used for selecting players
                //  and adding names
                new startScreen().setVisible(true);
                
                
                
                allNightLong();

                        
               

        }
        //                 end MAIN METHOD
        //*********************************************************

        
        public static void allNightLong()throws FileNotFoundException, IOException{
                
            
            
                    
            
                        //  volume crazy loud...
                    InputStream musicFile = new FileInputStream("audio.wav");
                    AudioStream musicStream = new AudioStream(musicFile); 
                    
                   
                    AudioPlayer.player.start(musicStream);

        }


}



//      This will now be the place to add to-do's 
//      When you click on tasks - you can see what there is still left to do
//      Hopefully will keep us up to date on things instead of having to look at the logs on SVN
//      TODOS ARE DONE! :)
