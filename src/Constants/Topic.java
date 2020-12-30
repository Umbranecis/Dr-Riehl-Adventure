package Constants;

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

    public static Topic getByString(String s){
        for (Topic topic: Topic.values()){
            if(s.equalsIgnoreCase(topic.callUpString)){
                return topic;
            }
        }
        return null;
    }



}
