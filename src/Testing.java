import Constants.Topic;
import createEvents.ImageManager;
import createEvents.pushEvents;
import org.w3c.dom.ls.LSOutput;

public class Testing {
    public static void main(String[] args) {
        ImageManager.fillMap();
        System.out.println(ImageManager.images);
    }
}
