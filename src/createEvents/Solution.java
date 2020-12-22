
package createEvents;

public class Solution {
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getChangeKnowledge() {
        return changeKnowledge;
    }

    public void setChangeKnowledge(int changeKnowledge) {
        this.changeKnowledge = changeKnowledge;
    }

    public int getChangeSatisfaction() {
        return changeSatisfaction;
    }

    public void setChangeSatisfaction(int changeSatisfaction) {
        this.changeSatisfaction = changeSatisfaction;
    }

    String description = "description";
    int changeKnowledge = 3;
    int changeSatisfaction = -1;

    public Solution(String description, int changeKnowledge, int changeSatisfaction){
        this.description = description;
        this.changeKnowledge = changeKnowledge;
        this.changeSatisfaction = changeSatisfaction;
    }

    public Solution( String description, String changeKnowledge, String changeSatisfaction){
        this.description = description;
        this.changeKnowledge = Integer.parseInt(changeKnowledge);
        this.changeSatisfaction = Integer.parseInt(changeSatisfaction);
    }
}
