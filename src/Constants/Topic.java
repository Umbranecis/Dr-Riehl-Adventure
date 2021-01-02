package Constants;

import java.util.HashMap;

public enum Topic {
    MAGNETFELD("src/txtFiles/Magnetfeld", "Magnetfeld"){},
    LORENTZKRAFT("src/txtFiles/Lorentzkraft", "Lorentzkraft"){},
    OHMSCHESGESETZ("src/txtFiles/OhmschesGesetz","Ohmsches Gesetz"){},
    ELEKTROMAGNETISMUS("src/txtFiles/Elektromagnetismus", "Elektromagnetismus"){},
    MAGNETISCHEMONOPOLE("src/txtFiles/MagnetischeMonopole", "Magnetische Monopole"){};






    Topic(String path, String callUpString){
        this.path = path;
        this.callUpString = callUpString;
    }
    public String path;
    public String callUpString;


    private static HashMap<Topic, Integer> positionMap = new HashMap<Topic, Integer>();
    private static HashMap<Integer, Topic> positionMap2 = new HashMap<Integer, Topic>();


    public static Topic getByString(String s){
        for (Topic topic: Topic.values()){
            if(s.equalsIgnoreCase(topic.callUpString)){
                return topic;
            }
        }
        return null;
    }

    static{
        int i = 0;
        for(Topic topic: Topic.values()){
            positionMap.put(topic, i);
            positionMap2.put(i, topic);
            i++;
        }
    }

    public static Topic getByInt(int i){
        return positionMap2.get(i);
    }

    public static int getPosition(Topic t){
        return positionMap.get(t);
    }

    public static int getAmount(){
        return positionMap.size();
    }



}
