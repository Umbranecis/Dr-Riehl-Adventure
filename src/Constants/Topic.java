package Constants;

public enum Topic {
    MAGNETFELD("/Users/nils/Desktop/java/Dr Riehl Adventure/src/txtFiles/Magnetfeld", "Magnetfeld"){},
    LORENTZKRAFT("/Users/nils/Desktop/java/Dr Riehl Adventure/src/txtFiles/Lorentzkraft", "Lorentzkraft"){},
    OHMSCHESGESETZ("/Users/nils/Desktop/java/Dr Riehl Adventure/src/txtFiles/OhmschesGesetz","Ohmsches Gesetz"){},
    ELEKTROMAGNETISMUS("/Users/nils/Desktop/java/Dr Riehl Adventure/src/txtFiles/Elektromagnetismus", "Elektromagnetismus"){},
    MAGNETISCHEMONOPOLE("/Users/nils/Desktop/java/Dr Riehl Adventure/src/txtFiles/MagnetischeMonopole", "Magnetische Monopole"){};


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
