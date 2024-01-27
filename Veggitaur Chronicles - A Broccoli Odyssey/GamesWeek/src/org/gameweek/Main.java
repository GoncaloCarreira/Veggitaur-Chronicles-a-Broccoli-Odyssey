package org.gameweek;

import org.gameweek.Audio.GameAudio;
import org.gameweek.GameMenus.Background;
import org.gameweek.GameMenus.GoodEndGame;
import org.gameweek.GameMenus.StartMenu;
import org.gameweek.Grid.Grid;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class Main {
    static GameAudio inquietude = new GameAudio();

    static int levelChooser = 1;

    public static void main(String[] args) {
        Grid grid = new Grid(30, 18);
        Controller startMenuController = new Controller();
        StartMenu.createStartingMenu();

        while (!(StartMenu.startedGame)) {
            System.out.print("");
        }
        StartMenu.deleteStartingMenu();
        Background.createBackground();

        inquietude.filePath = "/Sounds/inquietude.wav";

        while (true) {
            Game newGame;
            System.out.println("Actually starting level" + levelChooser);
            Game.isGameOver = false;
            System.out.println("sfgsfg");

            while (!Game.isGameOver) {
                try {
                    try {
                        inquietude.playSoundtrack(inquietude.filePath);
                    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
                    }

                    newGame = new Game(levelChooser, grid);
                    levelChooser = newGame.start();
                    inquietude.clip.stop();
                    inquietude.clip.close();

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (Game.isGameOver) {

                    newGame = new Game();
                    while (Game.isGameOver) {
                        System.out.print("");
                    }
                    levelChooser = 1;
                    while (Game.gamewon) {
                    }
                }
            }
        }

    }
}

