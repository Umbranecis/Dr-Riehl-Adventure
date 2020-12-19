package lessons;

import createEvents.*;

import java.lang.reflect.Array;
import java.util.*;

public class lesson<Themaa> {
    private int counting;
    private String eventText;
    private String answerOne;
    private String answerTwo;
    private String answerThree;
    private ArrayList<Event> aLE;
//Start-Methode
    public lesson(){

        counting =0;
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

//eigene Methoden zum selbst benutzen in der Klasse
    private void pullEvents (String thema){

        //von Nils ArrayList pullen und speichern

    }

    private void prepForGUI(int counting){

        Event e = aLE.get(counting);
        //Attribute werden für GUI vorbereitet
    }

    public ArrayList<String> getEventTexts()
    {
        //update der Attribute
        return new ArrayList();
    }
}
