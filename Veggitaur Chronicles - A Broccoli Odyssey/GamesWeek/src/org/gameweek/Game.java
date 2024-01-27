package org.gameweek;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.gameweek.Audio.GameAudio;
import org.gameweek.GameMenus.Background;
import org.gameweek.GameMenus.BadEndGame;
import org.gameweek.GameMenus.GoodEndGame;
import org.gameweek.Grid.Grid;
import org.gameweek.Interfaces.ColilsionDetector;
import org.gameweek.Levels.*;
import org.gameweek.Threads.GravityThread;
import org.gameweek.UI.Lives;
import org.gameweek.Utils.Utils;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.rmi.UnexpectedException;

public class Game {

    GameAudio gooseHit = new GameAudio();
    GameAudio eggHit = new GameAudio();
    GameAudio gameOver = new GameAudio();
    GameAudio gameWin = new GameAudio();
    public Grid grid;
    public Level level;
    public Lives[] lives;
    public static boolean gamewon = false;
    Text text;

    public int hp = 0;

    int remainingLives = 3;

    int score = 0;

    boolean isLevelOver = false;

    static int levelChooser = 0;

    public static boolean isGameOver = false;


    public ColilsionDetector collisionDetector;

    public GravityThread gravity;

    public Game(int levelChooser,Grid grid) {
        this.grid = grid;
        //UIHandler UI = new UIHandler();
        collisionDetector = new ColilsionDetector(this);
        gravity = new GravityThread(this);
        this.levelChooser = levelChooser;
        chooseLevel(this.levelChooser);

    }
    public Game(){
        BadEndGame.createEndMenu();
    }

    public void chooseLevel(int level){
        switch (level){
            case 1:
                this.level= new Level1(this);
                break;
            case 2:
                this.level = new Level2(this);
                break;
            case 3:
                this.level = new Level3(this);
                break;
            case 4:
                this.level = new Level4(this);
                break;
            case 5:
                this.level = new Level5(this);
                break;
            case 6:
                this.level = new Level6(this);
                break;
            case 7:
                this.level = new Level7(this);
                break;
            case 8:
                this.level = new Level8(this);
                break;
            case 9:
                this.level = new Level9(this);
                break;
            case 10:
                this.level = new Level9(this);
                Background.background.delete();
                GoodEndGame.createGoodEndGame();
                gameWin();
                isGameOver = true;
                gamewon = true;
                break;

        }
    }


    public void playBroccoliSound() {
        eggHit.filePath = "/Sounds/NOMBROCCOLI-FINAL.wav";
        eggHit.playSoundsOnce(eggHit.filePath);
    }
    public void playGameOverSound(){
        gameOver.filePath = "/Sounds/game-over-sound.wav";
        gameOver.playSoundsOnce(gameOver.filePath);
    }
    public void hitSound(){
        gooseHit.filePath = "/Sounds/death.wav";
        gooseHit.playSoundsOnce(gooseHit.filePath);
    }
    public void gameWin(){
        gameWin.filePath = "/Sounds/gameWin.wav";
        gameWin.playSoundsOnce(gameWin.filePath);
    }


    public void initScore() {
        text = new Text(850, 50, "Score: 0/" + level.eggs.length, "Serif", 2, 20);
        text.setColor(Color.YELLOW);
        text.draw();
    }

    public Lives[] initLives() {
        if (isGameOver) {
            return null;
        }
        lives = new Lives[3];
        lives[0] = new Lives(grid.makeGridPosition(0, 0, grid), grid);
        lives[1] = new Lives(grid.makeGridPosition(1, 0, grid), grid);
        lives[2] = new Lives(grid.makeGridPosition(2, 0, grid), grid);
        return lives;

    }

    public void eggCrash(int index) {
        if (level.eggs[index].crash()) {
            playBroccoliSound();
            score++;
            updateScoreDisplay();
        }
        if(score == level.eggs.length){
            nextLevel();
        }
    }

    public void looseLife() {
        if (hp < 2) {
            lives[hp].draw();
            hp++;
            hitSound();
            return;
        }
        gameOver();
    }

    public void nextLevel(){
        isLevelOver = true;
        deleteAll();
    }

    public void gameOver() {
        isGameOver = true;
        playGameOverSound();

        //GameAudio.playSounds("GamesWeek/resources/Sounds/game-over-sound.wav")
        isLevelOver = true;
        deleteAll();

    }

    public void updateScoreDisplay() {
        try {
            if (text != null) {
                text.delete();
            }

            text = new Text(850, 50, "Score: " + score + "/" + level.eggs.length, "Serif", 2, 20);

            text.setColor(Color.YELLOW);
            text.draw();
        } catch (Exception e) {
            updateScoreDisplay();
        }
    }
    public void deleteAll(){
        for(int i = 0; i < level.eggs.length; i++){
            level.eggs[i].rectangle.delete();
        }
        for (int i = 0; i < level.platforms.length; i++){
            level.platforms[i].rectangle.delete();
        }
        for(int i = 0; i< level.gooses.length; i++){
            level.gooses[i].rectangle.delete();
            level.gooses[i].died = true;
        }

        for (int i = 0; i < level.stairs.length;i++){
            level.stairs[i].rectangle.delete();
        }
        for(int i = 0; i < lives.length;i++){
            lives[i].isDeleted = true;
            lives[i].gray.delete();
            lives[i].draw();
        }
        level.player.isDeleted = true;
        text.delete();
        level.player.resetPlayer();
    }

    public int start() throws InterruptedException {
        //initScore();
        lives = initLives();
        collisionDetector.start();
        gravity.start();
        while (!isLevelOver) {
            Thread.sleep(500);
            moveEnemies();
        }
        return ++levelChooser;
    }

    public void moveEnemies() {
        for (int i = 0; i < level.gooses.length; i++) {
            level.gooses[i].move(level.gooses[i].dir);
        }
    }


    public static void restartGame(){
        if (!isGameOver){
            return;
        }
        isGameOver = false;
        BadEndGame.deleteEndMenu();

        System.out.println("RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR");

    }
}
