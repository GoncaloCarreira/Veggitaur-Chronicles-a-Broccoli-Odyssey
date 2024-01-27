package org.gameweek.Game0bjects;

import jdk.nashorn.internal.runtime.ECMAException;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.gameweek.Animations.EnemyAnimationThread;
import org.gameweek.Grid.Grid;
import org.gameweek.Grid.GridPosition;
import org.gameweek.Utils.Utils;


public class Goose extends Character implements Enemies {
    private int stepsToChangeDir;
    private boolean changeDir = false;
    int movementCount;

    public boolean died = false;



    public Goose(int cols, int rows, Grid grid) {
        super(cols, rows, grid);
        movementCount = 7;
        this.rectangle = new Picture((double)this.pos.getColToX(), (double)this.pos.getRowToY(), "Goose.png");
        this.rectangle.draw();
        this.dir = Direction.RIGHT;
    }

    public static Goose[] makeGooses(int[] gooses, Grid grid) {
        int j = 0;
        Goose[] finalGooses = new Goose[gooses.length / 2];

        for(int i = 1; i < gooses.length; i += 2) {
            finalGooses[j++] = new Goose(gooses[i - 1], gooses[i], grid);
        }

        return finalGooses;
    }

    public void animate(String file) {
        try{
            this.rectangle.load(file);
            this.rectangle.draw();
        }catch (Exception e){
            animate(file);
        }
    }

    public void translate(int x, int y) {
        try{
            this.rectangle.translate((double)x, (double)y);
        }catch (Exception e){
            translate(x, y);
        }
    }

    public void move(Direction direction) {
        super.move(this.dir);
        try {
        ++this.stepsToChangeDir;
        if (this.stepsToChangeDir >= movementCount) {
            this.dir = this.oppositeDirection(this.dir);
            if (this.changeDir) {
                this.rectangle.grow(48.0, 0.0);
                this.changeDir = false;
            } else {
                this.rectangle.grow(-48.0, 0.0);
                this.changeDir = true;
            }

            this.stepsToChangeDir = 0;
        }
        }catch (Exception e){
            move(direction);
        }

    }

    public void resetDuck() {
        this.rectangle.delete();
    }

    public Direction oppositeDirection(Direction dir) {
        switch (dir) {
            case UP:
                return Direction.DOWN;
            case DOWN:
                return Direction.UP;
            case RIGHT:
                return Direction.LEFT;
            case LEFT:
                return Direction.RIGHT;
            default:
                return dir;
        }
    }

}
