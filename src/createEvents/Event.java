package createEvents;

public class Event {
    Type type;
    String description;
    Solution[] solutions;

    public Event(Type type, String description, Solution s1, Solution s2, Solution s3){
        this.type = type;
        this.description = description;
        solutions = new Solution[3];
        solutions[0] = s1;
        solutions[1] = s2;
        solutions[2] = s3;
    }
}
