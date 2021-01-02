package Output;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import static Main.Game.getInstance;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Controller3 {
    @FXML
    Text average;
    @FXML
    Text satisfaction;
    @FXML
    Text comprehansion;
    ScheduledThreadPoolExecutor timer;

    public Controller3(){
        timer = new ScheduledThreadPoolExecutor(1);
        load();
    }
    @FXML
    public void quitGame(ActionEvent actionEvent) {
        System.exit(0);
    }
    public void setAverage(int i){
        average.setText(String.valueOf(i));
    }
    public void setSatisfaction(int i){
        satisfaction.setText(String.valueOf(i));
    }
    public void setComprehansion(int i){
        comprehansion.setText(String.valueOf(i));
    }
    public void load(){
        timer.schedule(() -> reload(),100 , TimeUnit.MILLISECONDS);
    }
    public void reload(){
        setAverage(getInstance().getEndGrade());
        setComprehansion(getInstance().getKnowledge());
        setSatisfaction(getInstance().getSatisfaction());
    }

}
