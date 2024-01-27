package org.gameweek.Levels;

import org.gameweek.Animations.EnemyAnimationThread;
import org.gameweek.Game;
import org.gameweek.Game0bjects.*;
import org.gameweek.Grid.Grid;

public class Level4 extends Level{

    Grid grid;
    int[] platformNums = {8,2,5,
            14,2,14,
            3,6,10,
            14,5,11,
            1,10,12,
            14,10,13,
            0,14,2,
            3,14,10,
            14,14,15};

    int[] stairsNums = {2,17,4,
            2,9,4,
            29,17,4,
            25,9,5,
            13,17,16};

    int[] eggsNums = {9,17,
            26,17,
            8,13,
            20,13,
            1,9,
            26,9,
            6,5,
            22,4,
            10,1,
            20,1};

    int[] gooseNums = {6,17,
            22,17,
            12,13,
            23,9,
            6,5,
            21,4,
            9,1,
            19,1};


    Game game;
    public Level4(Game game) {
        this.game = game;
        this.grid = game.grid;
        this.makeStairs();
        this.eggs = Egg.makeEggs(this.eggsNums, grid);
        this.gooses = Goose.makeGooses(this.gooseNums, grid);
        this.platforms = Platform.makeplatforms(this.platformNums, grid);
        this.player = new Player(0, 17, grid, this.platforms, this.stairs);
        enemyAnimationThread = new EnemyAnimationThread(gooses);
        enemyAnimationThread.start();
    }


    public void makeStairs() {
        this.stairs = Stairs.makeStairs(this.stairsNums, this.grid);
    }
}