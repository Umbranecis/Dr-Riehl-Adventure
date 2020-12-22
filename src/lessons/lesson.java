package lessons;

import Constants.*;
import createEvents.*;
//import Output.*;

import java.util.*;

public class lesson {
    private int counting;
    private String eventText;
    private String answerOne;
    private String answerTwo;
    private String answerThree;
    private ArrayList<Event> aLE;
    private Type type;
    private Solution[] s;
//Start-Methode
    public lesson(){

        //pullEvents(Topic);
        prepForGUI(counting);
    }

//schön aussehende getter- und setter-Methoden
    public String getEventText() {
        return eventText;
    }

    public void setEventText(String eventText) {
        this.eventText = eventText;
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

//eigene Methoden zum selbst benutzen in der Klasse
    private void pullEvents (Topic t){
        aLE=pushEvents.getEvents((Topic) t);
        prepForGUI(0);
    }

    private void prepForGUI(int counting){

        Event e = aLE.get(counting);
        setType(e.getType());
        setEventText(e.getDescription());
        s=e.getSolutions();
        setAnswerOne((String) s[0].getDescription());
        setAnswerTwo((String) s[1].getDescription());
        setAnswerThree((String) s[2].getDescription());
        counting++;
    }
    public void buttonPressed(int a){

        int knowledge = s[a].getChangeKnowledge();
        int satisfaction = s[a].getChangeSatisfaction();
        //Punktzahl in Oberklasse erhöhen aus Werten der Antwort

    }

}
