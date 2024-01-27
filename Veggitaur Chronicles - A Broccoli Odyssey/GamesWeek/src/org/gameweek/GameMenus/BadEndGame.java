package org.gameweek.GameMenus;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.gameweek.Utils.Utils;

public class BadEndGame implements Menu {
    public static Picture background;

    public static Picture backgroundText;

    public static Text text;

    public BadEndGame(){
        createEndMenu();
    }


    public static void createEndMenu(){
        background = new Picture(Utils.PADDING, Utils.PADDING, "GameMenus/GameOverFinal.jpg");
        background.draw();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        backgroundText = new Picture(350,150, "GameMenus/GameOverText.png");
        backgroundText.draw();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        text = new Text(1060,750, "PRESS R TO RETRY");
        text.setColor(Color.YELLOW);
        text.grow(110,21);
        text.draw();



    }
    public static void deleteEndMenu(){
        background.delete();
        backgroundText.delete();
        text.delete();
    }
}