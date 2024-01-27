package org.gameweek.Grid;

import org.gameweek.Game0bjects.Direction;
import org.gameweek.Utils.Utils;

public class GridPosition {

    public int col;

    public int row;

    public Grid grid;

    public GridPosition(int col, int row,Grid grid){
        this.col = col;
        this.row = row;
        this.grid = grid;
    }

    public int getColToX(){
        return col * Utils.CELL_SIZE + Utils.PADDING;
    }

    public int getRowToY(){
        return row * Utils.CELL_SIZE + Utils.PADDING;
    }
    public int getCol(){
        return col;
    }

    public int getRow(){
        return row;
    }

    public Grid getGrid(){
        return grid;
    }
    public void moveGridPos(Direction direction){
        switch (direction){
            case UP:
                    row--;
                break;
            case DOWN:
                    row++;
                break;
            case LEFT:
                    col--;
                break;
            case RIGHT:
                    col++;
                break;
        }
    }
    public boolean isInSameSpace(GridPosition pos){
        if(pos.getRow() == row && pos.getCol() == col){
            return true;
        }
        return false;
    }

    public boolean isOnTopOf(GridPosition position){
        if(row == position.row - 1 && col == position.col){
            return true;
        }
        return false;
    }

    public boolean isOnTheRightOf(GridPosition position){
        if(col == position.col + 1 && row == position.row){
            return true;
        }
        return false;
    }

    public boolean isOnLeftOf(GridPosition position){
        if(col == position.col - 1 && row == position.row){
            return true;
        }
        return false;
    }

}
