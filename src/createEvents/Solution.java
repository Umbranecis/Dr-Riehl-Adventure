
package createEvents;

public class Solution {
    public String getDescription() {
        return description;
    }




    String description;
    int changeKnowledge;
    int changeSatisfaction;

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


}
