package Constants;

public enum Topic {
    MAGNETFELD("/Users/nils/Desktop/java/Dr Riehl Adventure/src/txtFiles/Magnetfeld"){},
    LORENTZKRAFT("/Users/nils/Desktop/java/Dr Riehl Adventure/src/txtFiles/Lorentzkraft"){},
    OHMSCHESGESETZ("/Users/nils/Desktop/java/Dr Riehl Adventure/src/txtFiles/OhmschesGesetz"){},
    ELEKTROMAGNETISMUS("/Users/nils/Desktop/java/Dr Riehl Adventure/src/txtFiles/Elektromagnetismus"){},
    MAGNETISCHEMONOPOLE("/Users/nils/Desktop/java/Dr Riehl Adventure/src/txtFiles/MagnetischeMonopole"){};


    Topic(String path){
        this.path = path;
    }
    public String path;



}
