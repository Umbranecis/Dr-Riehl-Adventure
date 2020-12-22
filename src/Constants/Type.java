package Constants;

public enum Type {
    EXPERIMENT("Eperiment"),
    QUESTION("Frage"),
    STORYELEMENT("Storyelement");


    public static Type getByString(String s){
        for (Type type: Type.values()){
            if(s.equalsIgnoreCase(type.callUp)){
                return type;
            }
        }
        return null;
    }

    String callUp;

    Type(String s){
        callUp = s;
    }


}
