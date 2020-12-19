
import javafx.application.Application;
        import javafx.fxml.FXMLLoader;
        import javafx.scene.Parent;
        import javafx.scene.Scene;
        import javafx.stage.Stage;

import java.util.Objects;
import Output.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("meister.fxml")));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 700, 900));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}