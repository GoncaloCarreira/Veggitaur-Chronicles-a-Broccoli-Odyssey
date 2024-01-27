package org.gameweek;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.gameweek.Audio.GameAudio;
import org.gameweek.Game0bjects.Direction;
import org.gameweek.Game0bjects.Player;
import org.gameweek.GameMenus.StartMenu;


public class Controller implements KeyboardHandler {
    public Player player;
    public Keyboard keyboard;

    public int counter = 5;

    public KeyboardEvent keyboardEventRight = new KeyboardEvent();
    public KeyboardEvent keyboardEventLeft = new KeyboardEvent();
    public KeyboardEvent keyboardEventUp = new KeyboardEvent();
    public KeyboardEvent keyboardEventDown = new KeyboardEvent();
    public KeyboardEvent keyboardEventExit = new KeyboardEvent();
    public KeyboardEvent keyboardReleaseRight = new KeyboardEvent();
    public KeyboardEvent keyboardReleaseLeft = new KeyboardEvent();
    public KeyboardEvent keyboardReleaseUp = new KeyboardEvent();
    public KeyboardEvent keyboardReleaseDown = new KeyboardEvent();

    public KeyboardEvent keyboardEventEnter = new KeyboardEvent();

    public KeyboardEvent keyboardEventRestart = new KeyboardEvent();
    public GameAudio startGame = new GameAudio();

    public Controller(Player player) {
        this.player = player;
        keyboard = new Keyboard(this);
        createKeyboardEvents();
    }
    public Controller(){
        keyboard = new Keyboard(this);
        createKeyboardEvents2();
    }
    public void playStartGameSound() {
        startGame.filePath = "/Sounds/Start - Growl.wav";
        startGame.playSoundsOnce(startGame.filePath);
    }


    public void createKeyboardEvents() {
        keyboardEventRight.setKey(KeyboardEvent.KEY_D);
        keyboardEventLeft.setKey(KeyboardEvent.KEY_A);
        keyboardEventDown.setKey(KeyboardEvent.KEY_S);
        keyboardEventUp.setKey(KeyboardEvent.KEY_W);
        keyboardEventExit.setKey(KeyboardEvent.KEY_Q);
        keyboardReleaseRight.setKey(KeyboardEvent.KEY_D);
        keyboardReleaseLeft.setKey(KeyboardEvent.KEY_A);
        keyboardReleaseDown.setKey(KeyboardEvent.KEY_S);
        keyboardReleaseUp.setKey(KeyboardEvent.KEY_W);
        keyboardEventRestart.setKey(KeyboardEvent.KEY_R);



        keyboardEventRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboardEventLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboardEventDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboardEventUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboardEventExit.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboardReleaseUp.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        keyboardReleaseDown.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        keyboardReleaseLeft.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        keyboardReleaseRight.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        keyboardEventEnter.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboardEventRestart.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);



        keyboard.addEventListener(keyboardEventRight);
        keyboard.addEventListener(keyboardEventDown);
        keyboard.addEventListener(keyboardEventUp);
        keyboard.addEventListener(keyboardEventLeft);
        keyboard.addEventListener(keyboardEventExit);
        keyboard.addEventListener(keyboardReleaseDown);
        keyboard.addEventListener(keyboardReleaseUp);
        keyboard.addEventListener(keyboardReleaseLeft);
        keyboard.addEventListener(keyboardReleaseRight);
        keyboard.addEventListener(keyboardEventRestart);

    }

    public void createKeyboardEvents2(){
        keyboardEventEnter.setKey(KeyboardEvent.KEY_ENTER);
        keyboardEventEnter.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(keyboardEventEnter);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if(counter < 5){
            counter++;
            return;
        }
        counter = 0;
        try {
            switch (keyboardEvent.getKey()) {
                case KeyboardEvent.KEY_D:
                    player.move(Direction.RIGHT);
                    break;
                case KeyboardEvent.KEY_A:
                    player.move(Direction.LEFT);
                    break;
                case KeyboardEvent.KEY_S:
                    player.move(Direction.DOWN);
                    break;
                case KeyboardEvent.KEY_W:
                    player.move(Direction.UP);
                    break;
                case KeyboardEvent.KEY_Q:
                    System.exit(1);
                    break;


                case KeyboardEvent.KEY_ENTER:
                    if (StartMenu.startedGame) {
                        System.out.println("Ilegal enter");
                        break;

                    }
                    playStartGameSound();
                    StartMenu.setStartedGame();
                    System.out.println("B");
                    break;

                case KeyboardEvent.KEY_R:
                    if (Game.isGameOver){
                        Game.restartGame();
                    }else{
                        System.out.println("Cannot retry as game is not over");
                    }
            }
        } catch (Exception e) {
            System.out.println("Oops key pressed is dead");
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        counter = 5;
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_D:
                player.dir = Direction.NONE;
                break;
            case KeyboardEvent.KEY_A:
                player.dir = Direction.NONE;
                break;
            case KeyboardEvent.KEY_S:
                player.dir = Direction.NONE;
                break;
            case KeyboardEvent.KEY_W:
                player.dir = Direction.NONE;
                break;
        }
    }
}
