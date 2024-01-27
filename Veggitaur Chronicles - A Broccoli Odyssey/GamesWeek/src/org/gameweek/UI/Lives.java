package org.gameweek.UI;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.gameweek.Grid.Grid;
import org.gameweek.Grid.GridPosition;
import org.gameweek.Utils.Utils;

public class Lives {

    private boolean isFull = true;
    public Picture picture;
    public Picture gray;

    public boolean isDeleted;

    private static int livesCounter;

    public Lives(GridPosition pos, Grid grid) {
        isDeleted = false;
        picture = new Picture(pos.getColToX() + livesCounter + Utils.PADDING, pos.getRowToY() + Utils.PADDING, "UI/hud_heartFull.png");
        picture.draw();
        gray = new Picture(pos.getColToX() + livesCounter + Utils.PADDING, pos.getRowToY() + Utils.PADDING, "UI/hud_heartEmpty.png");
        livesCounter += 10;
    }


    // Add a method to set the heart state
    public void setFull(boolean isFull) {
        this.isFull = isFull;
    }

    // Add a method to draw the heart with different colors based on the state
    public void draw() {
        if(isDeleted){
            picture.delete();
            livesCounter = 0;
            return;
        }
        if (isFull) {
            // Draw a gray heart
            picture.delete();
            gray.draw();
            isFull = false;
        }
    }
}
