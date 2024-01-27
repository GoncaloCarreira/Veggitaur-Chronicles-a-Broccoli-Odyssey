package org.gameweek.GameMenus;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.gameweek.Utils.Utils;

public class Background {
    public static Picture background;

    public static void createBackground(){
        background = new Picture(Utils.PADDING, Utils.PADDING, "GameMenus/cavern - final.jpg");
        background.draw();
    }
}
