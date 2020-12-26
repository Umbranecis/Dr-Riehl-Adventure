package createEvents;

import Constants.Type;

public class Event {
    Type type;



    String description;
    Solution[] solutions;

    public Event(Type type, String description, Solution s1, Solution s2, Solution s3) {
        this.type = type;
        this.description = description;
        solutions = new Solution[3];
        solutions[0] = s1;
        solutions[1] = s2;
        solutions[2] = s3;
    }

    public String convertToString(Event e) {
        String s = "";
        s += s + e.type.getCallUp();
        s += s + e.getDescription();
        for (int i = 0; i <= 2; i++) {
            Solution tmp = e.solutions[i];
            s += tmp.description + tmp.getChangeKnowledge() + tmp.getChangeSatisfaction();
        }
        return s;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Solution[] getSolutions() {
        return solutions;
    }

    public void setSolutions(Solution[] solutions) {
        this.solutions = solutions;
    }
}
