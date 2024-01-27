package org.gameweek.GameMenus;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.gameweek.Utils.Utils;

public class StartMenu implements Menu {


    public static Picture background;

    public static Picture backgroundText;

    public static Text text;

    public static void setStartedGame() {
        StartMenu.startedGame = true;
    }

    public static boolean startedGame = false;





    public static void createStartingMenu(){
        background = new Picture(Utils.PADDING, Utils.PADDING, "GameMenus/GameStartFinal.jpg");
        background.draw();
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        backgroundText = new Picture(270,350, "GameMenus/img.png");
        backgroundText.draw();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        backgroundText.grow(92,16);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        backgroundText.grow(92,16);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        text = new Text(410,650, "PRESS ENTER TO START");
        text.setColor(Color.YELLOW);
        text.grow(100,20);
        text.draw();






    }
    public static void deleteStartingMenu(){
        background.delete();
        backgroundText.delete();
        text.delete();
    }





}
