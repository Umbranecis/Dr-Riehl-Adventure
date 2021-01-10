package createEvents;

import Constants.Topic;
import Constants.Type;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class pushEvents {
    public static ArrayList<Event> getEvents(Topic t) {
        ArrayList<Event> events = new ArrayList<Event>();
        for (String s : getFromTxt(t)) {
            events.add(getFromString(s));
        }
        return events;
    }


    public static Event getFromString(String s) {
        String[] split = s.split(":");
        Type t = Type.getByString(split[0]);
        String description = split[1];
        ArrayList<Solution> solutions = new ArrayList<Solution>();
        for (int i = 2; i <= 4; i++) {
            String tmp = split[i - 1];
            String[] solution = tmp.split("!");
            solutions.add(new Solution(solution[0], solution[1], solution[2]));
        }

        return new Event(t, description, solutions.get(0), solutions.get(1), solutions.get(2));

    }



    public static ArrayList<String> getFromTxt(Topic topic) {
        ArrayList<String> tmp = new ArrayList<String>();
        Scanner s = null;
        try {
            s = new Scanner(new File(topic.path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        while (s.hasNextLine()) {
            String string = s.nextLine();
            tmp.add(string);
        }
        return tmp;
    }
}
