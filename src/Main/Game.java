package Main;

import lessons.*;
public class Game {
    private static final Game theGame = new Game();
    private Lesson currentLesson;

    private Game(){

    }

    public static Game getInstance(){
        return theGame;
    }



}
