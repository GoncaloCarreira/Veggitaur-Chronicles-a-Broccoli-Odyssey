package org.gameweek.Game0bjects;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.gameweek.Grid.Grid;
import org.gameweek.Grid.GridPosition;
import org.gameweek.Utils.Utils;

public class Objects {

    public GridPosition pos;
    public Picture rectangle;
    Grid grid;

    public Objects(int cols, int rows, Grid grid){
        pos = new GridPosition(cols,rows,grid);
        this.grid = grid;

    }


}
