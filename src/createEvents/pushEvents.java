package createEvents;
import Constants.*;
import com.sun.java.accessibility.util.EventQueueMonitor;

import java.util.ArrayList;

public class pushEvents {
    public static ArrayList<Event> getEvents(Topic t){
        ArrayList<Event> events = new ArrayList<Event>();
        events.add(new Event(Type.EXPERIMENT, "description", new Solution(), new Solution(), new Solution()));
        events.add(new Event(Type.QUESTION, "description2", new Solution(), new Solution(), new Solution()));
        events.add(new Event(Type.STORYELEMENT, "description3", new Solution(), new Solution(), new Solution()));
        return new ArrayList<Event>();
    }
}
