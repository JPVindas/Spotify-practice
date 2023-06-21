
package newpackage;

import java.util.Random;
import javax.swing.JOptionPane;


public class Cancion {
    //ATRIBUTOS
    int ID,duration,date;
    String autor,title,songname;
    
    //Here we read some important information of the song
    public void read_data(){
        songname=JOptionPane.showInputDialog("Enter the Name of the song");
        autor=JOptionPane.showInputDialog("Enter de name of the artist");
        date=Integer.parseInt(JOptionPane.showInputDialog("Enter de date the song was released"));
    }
   //In this part of the code we used an import, because we needed to create a new id for the song
    public int idofthesong(){
        Random rand = new Random();
        ID = rand.nextInt(1000);
        return ID;

        
        
    }
    //In this this part we set the information of the song
    public int date(){
       return date; 
    }
     public int setDuration() {
        Random rand = new Random();
        duration = rand.nextInt(300) + 60; // Generates a random duration between 1 minute (60 seconds) and 5 minutes (300 seconds)
        return duration;

     }
}
        

