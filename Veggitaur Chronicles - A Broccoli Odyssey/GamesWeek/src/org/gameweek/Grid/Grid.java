package org.gameweek.Grid;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.gameweek.Utils.Utils;

public class Grid {

    private int cols;

    private int rows;



    public Grid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
        makeGrid();
    }
    //Ta trocado não sabemos porque, mas não investigamos
    //Afinal resolvemos
    public int getWidth() {
        return cols * Utils.CELL_SIZE;
    }
    //Nos  dois btw
    public int getHeight() {
        return rows * Utils.CELL_SIZE;
    }

    public int getCellsize() {
        return Utils.CELL_SIZE;
    }

    public int getCols() {
        return cols;
    }

    ;

    public int getRows() {
        return rows;
    }

    public GridPosition makeGridPosition(int cols, int rows, Grid grid){
        return new GridPosition(cols,rows,grid);
    }

    ;

    public void makeGrid() {
        int x = Utils.PADDING;
        int y = Utils.PADDING;
        int side = Utils.CELL_SIZE;

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                Rectangle rectangle = new Rectangle(x, y, side, side);
               // rectangle.setColor(Color.BLACK);
                //rectangle.draw();
                //rectangle.fill();
                y += Utils.CELL_SIZE;
            }
            y = Utils.PADDING;
            x+= Utils.CELL_SIZE;
        }
    }


}
