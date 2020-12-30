package Output;

import javafx.application.Application;
        import javafx.fxml.FXMLLoader;
        import javafx.scene.Parent;
        import javafx.scene.Scene;
        import javafx.stage.Stage;

import java.io.IOException;
import static Output.Visuals.lessons;

public class Main extends Application {

    Stage mainStage = new Stage();

    @Override
    public void start(Stage primaryStage) throws Exception{
        setMainStage(Visuals.start());
        mainStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }


    public void setMainStage(Scene scene) {
        mainStage.setScene(scene);
    }


}