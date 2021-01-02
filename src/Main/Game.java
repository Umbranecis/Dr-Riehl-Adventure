package Main;

import Constants.Topic;
import Output.Main;
import Output.Visuals;
import createEvents.ImageManager;
import lessons.*;

import java.util.Arrays;
import java.util.HashMap;

import static Constants.Topic.getPosition;

public class Game {
    private static final Game theGame = new Game();
    private Lesson currentLesson;
    private Topic currentTopic;

    public int getSatisfaction() {
        return satisfaction;
    }

    public void setSatisfaction(int satisfaction) {
        this.satisfaction = satisfaction;
    }

    public int getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(int knowledge) {
        this.knowledge = knowledge;
    }

    private int satisfaction;
    private int knowledge;

    private Game() {
        int i = 0;
        currentTopic = Topic.getByInt(0);
        currentLesson = new Lesson(currentTopic);
    }
    public static Game getInstance() {
        return theGame;
    }

    public void changeKnowledge(int i) {
        knowledge += i;
    }

    public void changeSatisfaction(int i) {
        satisfaction += i;
    }

    private void loadNextEvent(int answer) {
        currentLesson.getAnswers(answer);
        if (!(currentLesson.getCounting() == currentLesson.getEventArrayList().size() - 1)) {
            currentLesson.reload();
            return;
        }


        int position = getPosition(currentTopic);
        if (!(position + 1 == Topic.getAmount())){
            currentTopic = Topic.getByInt(position + 1);
            currentLesson = new Lesson(currentTopic);
            return;
        }


        Main.setMainStage(Visuals.endGUI());
        return;
    }









    // Updating methode (Observer Pattern)

    public void update(int answer){
        loadNextEvent(answer);
    }

    //getter für GUI

    public String getQuestion(){
        return currentLesson.getEventText();
    }

    public String getAnswer1(){
        return currentLesson.getAnswerOne();
    }

    public String getAnswer2(){
        return currentLesson.getAnswerTwo();
    }

    public String getAnswer3(){
        return currentLesson.getAnswerThree();
    }

    public String getImage(){
        return ImageManager.getImagePath(currentLesson.getCurrentEvent());
    }

    public int getEndGrade(){
        int x = (knowledge * satisfaction + 2) / 4;
        int value = (int) (15 * (x/ Math.sqrt( x * x + 1)));
        if (value >= 0){return value;}
        else {return 0;}
    }





}
