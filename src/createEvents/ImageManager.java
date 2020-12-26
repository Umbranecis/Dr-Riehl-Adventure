package createEvents;
import java.util.HashMap;

public abstract class ImageManager {
    static HashMap<String, String> images = new HashMap<String, String>();

    public static String getImagePath(Event e){
        return images.get(e.convertToString());
    }
}
