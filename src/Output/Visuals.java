package Output;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public abstract class Visuals {

    public static Scene lessons(){
        Parent root = null;
        try {
            root = FXMLLoader.load(Main.class.getResource("meister.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene s = new Scene(root, 700, 900);
        s.getStylesheets().add(Main.class.getResource("style.css").toExternalForm());
        return s;
    }

    public static Scene start(){
        return null;
    }
}
