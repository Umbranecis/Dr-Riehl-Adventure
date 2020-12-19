package Output;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private Text question;

    @FXML
    private ImageView image;

    @FXML
    private StackPane answerA;

    @FXML
    private Text answerB;

    @FXML
    private Text answerC;

    @FXML
    public int clickedA(MouseEvent event) {
        return 0;
    }

    @FXML
    public int clickedB(MouseEvent event) {
        return 1;
    }

    @FXML
    public int clickedC(MouseEvent event) {
        return 2;
    }
    public void setQuestion(String s){


    }
    public void setAnswerA(String s){


    }
    public void setAnswerB(String s){


    }
    public void setAnswerC(String s){


    }
    public void reload(){


    }
}



