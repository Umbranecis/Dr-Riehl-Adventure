package Output;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.*;

public class Controller {

    @FXML
    // fxml ids
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
    }

    @FXML
    public void clickedA(MouseEvent event) {
        System.out.println("a wurde geklicked");
        returnInt(0);
        timer.schedule(() -> reload(), 2,TimeUnit.SECONDS);
    }
    @FXML
    public void clickedB(MouseEvent event) {
        System.out.println("b wurde geklicked");
        returnInt(1);
        timer.schedule(() -> reload(), 2,TimeUnit.SECONDS);
    }
    @FXML
    public void clickedC(MouseEvent event) {
        System.out.println("c wurde geklicked");
        returnInt(2);
        setImage(getImage());

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

    public void reload() {
        setQuestion(getEventText());
        setAnswerA(genA());
        setAnswerB(genB());
        setAnswerC(genC());
    }

    // Daten generation
    public String generateQuest() {
        return "Das ist eine Frage";
    }
    public String getImage(){
        return "images/herrRiehlusBornLegend.jpg";
    }
    public String genA(){
        return "Antwort dA as ist richtig";
    }
    public String genB(){
        return "Antwort B das ist richtig";
    }
    public String genC(){
        return "Antwort C das ist richtig";
    }
    public void right(){


    }
}