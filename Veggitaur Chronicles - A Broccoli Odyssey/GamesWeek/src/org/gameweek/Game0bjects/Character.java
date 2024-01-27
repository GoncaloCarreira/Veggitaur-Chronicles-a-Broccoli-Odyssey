package org.gameweek.Game0bjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.gameweek.Grid.Grid;
import org.gameweek.Grid.GridPosition;
import org.gameweek.Utils.Utils;

public abstract class Character {
    public GridPosition pos;
    public Picture rectangle;
    Grid grid;
    public boolean isDeleted;
    public Direction dir;
    public boolean isInStairs;
    public boolean isOnStairs;

    public Character(int cols, int rows, Grid grid) {
        this.pos = new GridPosition(cols, rows, grid);
        this.grid = grid;
    }

    public Picture getImage() {
        return this.rectangle;
    }

    public void move(Direction direction) {
        try {
            switch (direction) {
                case UP:
                    this.dir = Direction.UP;
                    if (this.pos.getRowToY() > 10) {
                        this.pos.moveGridPos(Direction.UP);
                        this.rectangle.translate(0.0, -48.0);
                    }
                    break;
                case DOWN:
                    this.dir = Direction.DOWN;
                    if (this.pos.getRowToY() < this.grid.getHeight() - 48) {
                        this.pos.moveGridPos(Direction.DOWN);
                        this.rectangle.translate(0.0, 48.0);
                    }
                    break;
                case RIGHT:
                    this.dir = Direction.RIGHT;
                    if (this.pos.getColToX() < this.grid.getWidth() - 48) {
                        this.pos.moveGridPos(Direction.RIGHT);
                        this.rectangle.translate(48.0, 0.0);
                    }
                    break;
                case LEFT:
                    this.dir = Direction.LEFT;
                    if (this.pos.getColToX() > 10) {
                        this.pos.moveGridPos(Direction.LEFT);
                        this.rectangle.translate(-48.0, 0.0);
                    }
            }
        }catch (Exception e){
            move(direction);
        }

    }
}
