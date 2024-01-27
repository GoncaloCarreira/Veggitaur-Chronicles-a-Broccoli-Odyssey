package org.gameweek.Game0bjects;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.gameweek.Grid.Grid;
import org.gameweek.Grid.GridPosition;
import org.gameweek.Utils.Utils;

public class Stairs {
    public GridPosition pos;
    private Grid grid;
    public Picture rectangle;
    private int length = Utils.CELL_SIZE * Utils.STAIRS_CELLS;

    public Stairs(Grid grid, int col, int row) {
        this.grid = grid;
        pos = new GridPosition(col, row, grid);
        rectangle = new Picture(pos.getColToX(), pos.getRowToY(), "ladder.png");
        rectangle.draw();
        //rectangle.setColor(Color.ORANGE);
        //rectangle.fill();
    }

    public int getFinalY() {
        return pos.getRowToY() + length;
    }

    /*public int[] rowsOccupied() {
        int length = Utils.STAIRS_CELLS;
        int rows[] = new int[length];
        for (int i = 0; i < length; i++) {
            rows[i] = pos.row;
            pos.row++;
        }
        return rows;
    } */
    /*public boolean joinedStairs(GridPosition pos) {
        if (pos.isInSameSpace(this.pos)) {
            return true;
        }
        return false;
    }*/

    public int colOccupied() {
        return pos.col;
    }

    public static int getStairsArrayLength(int[] stairs) {
        int j = 0;
        for (int i = 2; i < stairs.length; i += 3) {
            j += stairs[i];
        }
        return j;
    }

    public static Stairs[] makeStairs(int[] stairs, Grid grid) {
        int j = 0;
        Stairs[] finalStairs = new Stairs[getStairsArrayLength(stairs)];
        for (int i = 2; i < stairs.length; i += 3) {
            for (int l = 0; l < stairs[i]; l++) {
                System.out.println(l);
                finalStairs[j++] = new Stairs(grid, stairs[i - 2], stairs[i - 1] - l);

            }
        }
        return finalStairs;
    }
}

    /*public boolean lockedIntoStairs(GridPosition pos, Direction direction) {
        if (pos.isOnTopOf(this.pos) && direction == Direction.DOWN) {
            return true;
        }
        if (pos.isOnTheRightOf(this.pos) && direction == Direction.LEFT) {
            return true;
        }
        if (pos.isOnLeftOf(this.pos) && direction == Direction.RIGHT) {
            return true;
        }
        return false;


    }

}*/
