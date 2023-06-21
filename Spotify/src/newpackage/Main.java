package newpackage;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Cancion cancion1 = new Cancion();
        cancion1.read_data();
        cancion1.idofthesong();
        cancion1.date();
        cancion1.setDuration();
        
        JOptionPane.showMessageDialog(null, "SPOTIFY\n" +
                "Name: " + cancion1.songname + "\n" +
                "Author: " + cancion1.autor + "\n" +
                "ID: " + cancion1.ID + "\n" +
                "Date: " + cancion1.date + "\n" +
                "Duration: " + cancion1.duration + " seconds");
    }
}
