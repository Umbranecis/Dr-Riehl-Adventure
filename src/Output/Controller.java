package Output;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import Main.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.*;

public class Controller {

    Game game = Game.getInstance();

    @FXML
    private Text question;
    @FXML
    private ImageView image;
    @FXML
    private Text answerA;
    @FXML
    private Text answerB;
    @FXML
    private Text answerC;
    @FXML
    private HBox bgA;
    @FXML
    private  HBox bgB;
    @FXML
    private  HBox bgC;
    @FXML
    private ImageView logo;

    ScheduledThreadPoolExecutor timer;

    public Controller(){
        timer = new ScheduledThreadPoolExecutor(1);
        load();
    }

    @FXML
    public void clickedA(MouseEvent event) {
        System.out.println("a wurde geklicked");
        returnInt(0);
        timer.schedule(() -> reload(), 1,TimeUnit.SECONDS);
    }
    @FXML
    public void clickedB(MouseEvent event) {
        System.out.println("b wurde geklicked");
        returnInt(1);
        timer.schedule(() -> reload(), 1,TimeUnit.SECONDS);
    }
    @FXML
    public void clickedC(MouseEvent event) {
        System.out.println("c wurde geklicked");
        returnInt(2);
        timer.schedule(() -> reload(), 1,TimeUnit.SECONDS);
    }
    public void setBgColor(StackPane sP){
        sP.getStylesheets();

    }

    public int returnInt(int i) {
        return i;
    }

    public void setQuestion(String s) {
        question.setText(s);
    }

    public void setAnswerA(String s) {
        answerA.setText(s);
    }

    public void setAnswerB(String s) {
        answerB.setText(s);
    }

    public void setAnswerC(String s) {
        answerC.setText(s);
    }

    public void setImage(String s){
        FileInputStream input = null;
        try {
            input = new FileInputStream(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error");
        }
        Image i = new Image(input);
        image.setImage(i);
    }
    public void load(){
        timer.schedule(() -> reload(),100 ,TimeUnit.MILLISECONDS);
    }

    public void reload() {
        setQuestion(game.getQuestion());
        setAnswerA(game.getAnswer1());
        setAnswerB(game.getAnswer2());
        setAnswerC(game.getAnswer3());
        setImage(game.getImage());
    }

}