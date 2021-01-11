package createEvents;
import Constants.Topic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public abstract class ImageManager {
    //Ordner der Bilder
    static String imagePath = "src/images";
    // Datei für die Verwaltung
    static String connectionPath = "src/images/ImageConections";
    public static HashMap<String, String> images = new HashMap<String, String>();

    public static String getImagePath(Event e){
        fillMap();
        return images.getOrDefault(e.convertToString(), imagePath + "/meisterRiehlOnTheLose.png");
    }

    public static void fillMap(){
        Scanner imageConnections = null;
        Topic currentTopic = null;
        try {
            imageConnections = new Scanner(new File(connectionPath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while(imageConnections.hasNextLine()){
            String s = imageConnections.nextLine();
            if(s.equals("")){
                currentTopic = Topic.getByString(imageConnections.nextLine());
            }
            else{
            String[] split = s.split(":");
            images.put(pushEvents.getFromTxt(currentTopic).get(Integer.parseInt(split[0] ) - 1), imagePath + "/" + split[1]);
        }}

    }
}
