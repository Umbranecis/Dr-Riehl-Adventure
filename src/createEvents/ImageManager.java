package createEvents;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public abstract class ImageManager {
    //Ordner der Bilder
    String imagePath = "/images";
    // Datei für die Verwaltung
    String connectionPath = "";
    static HashMap<String, String> images = new HashMap<String, String>();

    public static String getImagePath(Event e){
        return images.get(e.convertToString());
    }

    public static void fillMap(){
        Scanner imageConnections = null;
        try {
            imageConnections = new Scanner(new File("/images/ImageConections"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
