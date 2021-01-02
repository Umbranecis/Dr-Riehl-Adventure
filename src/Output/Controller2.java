package Output;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;

import Output.Main.*;


public class Controller2 {

    @FXML
    private javafx.scene.control.Button button;
    @FXML
    public void start(ActionEvent actionEvent) {
        try{
            Main.setMainStage(Visuals.lessons());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



}
