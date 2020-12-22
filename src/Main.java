import Constants.*;
import createEvents.*;
public class Main {
    public static void main(String[] args) {
        for(Event event: pushEvents.getEvents(Topic.LORENTZKRAFT)){
            System.out.println(event.getDescription());
            System.out.println(event.getSolutions()[1].getDescription());
        };
    }
}
