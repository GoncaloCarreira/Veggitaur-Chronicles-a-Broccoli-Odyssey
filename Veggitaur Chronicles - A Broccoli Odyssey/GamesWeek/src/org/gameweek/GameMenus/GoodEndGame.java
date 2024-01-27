package org.gameweek.GameMenus;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.gameweek.Utils.Utils;

public class GoodEndGame implements Menu {
    public static Picture background;
    public static Picture backgroundText;

    public static Picture backgroundText2;

    public static void createGoodEndGame() {

        background = new Picture(Utils.PADDING, Utils.PADDING, "GameMenus/GameGoodEndBig.png");
        background.draw();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        backgroundText = new Picture(450, 100, "GameMenus/NatureWinText.png");
        backgroundText.grow(130, 40);
        backgroundText.draw();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        backgroundText2 = new Picture(388, 650, "GameMenus/WinText.png");
        backgroundText2.grow(140, 30);
        backgroundText2.draw();

    }
}

