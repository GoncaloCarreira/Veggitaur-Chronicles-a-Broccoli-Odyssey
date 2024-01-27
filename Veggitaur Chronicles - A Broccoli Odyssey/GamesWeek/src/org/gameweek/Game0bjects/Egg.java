package org.gameweek.Game0bjects;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.gameweek.Game;
import org.gameweek.Grid.Grid;
import org.gameweek.Grid.GridPosition;

import java.sql.SQLOutput;

public class Egg extends Objects {

    private boolean crashed = false;

    private boolean visited;
    Game game;

    public Egg(int cols,int rows, Grid grid) {
        super(cols,rows, grid);
        this.rectangle = new Picture(pos.getColToX() + 6,pos.getRowToY() + 6,"Broccoli.png");
        rectangle.draw();
    }

    public boolean crash(){
        try {
            if (!crashed) {

                rectangle.delete();
                crashed = true;
                return true;
            }
            return false;
        }catch (Exception e){
            return crash();
        }
    }



    public static Egg[] makeEggs(int[] eggs,Grid grid){
        int j = 0;
        Egg[] finalEggs = new Egg[eggs.length/2];
        for(int i = 1;i < eggs.length; i += 2){
                finalEggs[j++] = new Egg(eggs[i-1],eggs[i],grid);
        }
        return finalEggs;
    }

    public GridPosition getPosition() {
        return pos;
    }

    public boolean hasVisited() {
        return visited;

    }



}
