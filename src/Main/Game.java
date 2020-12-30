package Main;

import Constants.Topic;
import createEvents.ImageManager;
import lessons.*;

import java.util.Arrays;

public class Game {
    private static final Game theGame = new Game();
    private Lesson currentLesson;
    private Topic currentTopic;
    private Topic[] topics = Topic.values();
    private int satisfaction;
    private int knowledge;

    private Game(){
        currentLesson = new Lesson(topics[0]);
    }

    public static Game getInstance(){
        return theGame;
    }

    public void changeKnowledge(int i){
        knowledge += i;
    }

    public void changeSatisfaction(int i){
        satisfaction += i;
    }

    private void loadNextEvent(int answer){
        if(currentLesson.getCounting() >= currentLesson.getEventArrayList().size() - 1){
            currentTopic = topics[Arrays.asList(topics).indexOf(currentTopic) + 1];
            currentLesson = new Lesson(currentTopic);
        }
        else{
            currentLesson.buttonPressed(answer);
        }

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





}
