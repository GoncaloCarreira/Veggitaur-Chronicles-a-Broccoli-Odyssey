package org.gameweek.Game0bjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.gameweek.*;
import org.gameweek.Animations.CharacterAnimations;
import org.gameweek.Animations.EnemyAnimationThread;
import org.gameweek.Grid.Grid;
import org.gameweek.Grid.GridPosition;

public class Player extends Character {
    private Platform[] platforms;
    public int score = 0;
    Stairs[] stairs;

    public boolean isFalling = false;
    public CharacterAnimations animation;
    public int lives = 3;

    public Player(int cols, int rows, Grid grid, Platform[] platforms, Stairs[] stairs) {
        super(cols, rows, grid);
        this.platforms = platforms;
        this.stairs = stairs;
        this.dir = Direction.NONE;
        isDeleted = false;
        new Controller(this);
        this.rectangle = new Picture((double)this.pos.getColToX() + 7.5, (double)(this.pos.getRowToY() - 6), "ezgif.com-crop (2).png");
        this.rectangle.draw();
        this.animation = new CharacterAnimations(this);
        this.animation.start();
    }

    public void resetPlayer() {
        rectangle.delete();
    }

    public GridPosition getPosition() {
        return this.pos;
    }

    public void score() {
        ++this.score;
        System.out.println("Your score is" + this.score);
    }

    public void move(Direction direction) {
        if(isDeleted){
            rectangle.delete();
            return;
        }
        if(isFalling){
            return;
        }
        this.isInStairs = false;
        this.isOnStairs = false;
        this.dir = direction;

        int j;
        for(j = 0; j < this.stairs.length; ++j) {
            if (this.pos.isInSameSpace(this.stairs[j].pos)) {
                this.isInStairs = true;
            }

            if (this.pos.isOnTopOf(this.stairs[j].pos)) {
                this.isOnStairs = true;
            }
        }

        for(j = 0; j < this.platforms.length; ++j) {
            if (this.platforms[j].isInTheWay(this.pos, direction)) {
                return;
            }
        }

        if ((this.isInStairs || direction != Direction.UP) && (this.isOnStairs || direction != Direction.DOWN)) {
            super.move(direction);
        }
    }

    public void fallFromGravity(){
        for(int i = 0; i < platforms.length;i++){
            if (pos.isOnTopOf(platforms[i].pos)){
                return;
            }
        }
        for(int i = 0; i < stairs.length;i++){
            if (pos.isOnTopOf(stairs[i].pos)){
                return;
            }
        }
        super.move(Direction.DOWN);
    }

    public void hit() {
    }

    public boolean isDead() {
        return false;
    }

}
