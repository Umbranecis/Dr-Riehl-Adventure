package lessons;

import Constants.Topic;
import Constants.Type;
import Main.Game;
import createEvents.*;
//import Output.*;

import java.util.*;

public class Lesson {


    private int counting;
    private Topic topic;
    private String eventText;
    private String answerOne;
    private String answerTwo;
    private String answerThree;
    private ArrayList<Event> eventArrayList;
    private Type type;
    private Solution[] solutions;
    private String imagePath;
    private Event currentEvent;

    //Start-Methode
    public Lesson(Topic topic) {
        counting = 0;
        this.topic = topic;
        pullEvents(topic);
        prepForGUI();
    }

    //schön aussehende getter- und setter-Methoden

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Solution[] getSolutions() {
        return solutions;
    }

    public void setSolutions(Solution[] solutions) {
        this.solutions = solutions;
    }

    public Event getCurrentEvent() {
        return currentEvent;
    }

    public void setCurrentEvent(Event currentEvent) {
        this.currentEvent = currentEvent;
    }

    public String getEventText() {
        return eventText;
    }

    public void setEventText(String eventText) {
        this.eventText = eventText;
    }

    public ArrayList<Event> getEventArrayList() {
        return eventArrayList;
    }

    public void setEventArrayList(ArrayList<Event> eventArrayList) {
        this.eventArrayList = eventArrayList;
    }

    public String getAnswerOne() {
        return answerOne;
    }

    public void setAnswerOne(String answerOne) {
        this.answerOne = answerOne;
    }

    public String getAnswerTwo() {
        return answerTwo;
    }

    public void setAnswerTwo(String answerTwo) {
        this.answerTwo = answerTwo;
    }

    public String getAnswerThree() {
        return answerThree;
    }

    public void setAnswerThree(String answerThree) {
        this.answerThree = answerThree;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getCounting() {
        return counting;
    }

    public void setCounting(int counting) {
        this.counting = counting;
    }

    //eigene Methoden zum selbst benutzen in der Klasse
    private void pullEvents(Topic t) {
        eventArrayList = pushEvents.getEvents(this.topic);
        prepForGUI();
    }

    private void prepForGUI() {
        currentEvent = eventArrayList.get(counting);
        setType(currentEvent.getType());
        setEventText(currentEvent.getDescription());
        solutions = currentEvent.getSolutions();
        setAnswerOne((String) solutions[0].getDescription());
        setAnswerTwo((String) solutions[1].getDescription());
        setAnswerThree((String) solutions[2].getDescription());
        setImagePath((String) ImageManager.getImagePath(currentEvent));
        counting++;
    }

    public void buttonPressed(int a) {

        int knowledge = solutions[a].getChangeKnowledge();
        int satisfaction = solutions[a].getChangeSatisfaction();


        //Punktzahl in Oberklasse erhöhen aus Werten der Antwort
        Game.getInstance().changeKnowledge(knowledge);
        Game.getInstance().changeSatisfaction(satisfaction);
        prepForGUI();

    }

}