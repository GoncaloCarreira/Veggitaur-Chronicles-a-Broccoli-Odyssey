package org.gameweek.Levels;

import org.gameweek.Animations.EnemyAnimationThread;
import org.gameweek.Game;
import org.gameweek.Game0bjects.*;
import org.gameweek.Grid.Grid;

public class Level5 extends Level{

    Grid grid;
    int[] platformNums = {
            8,2,18,
            0,6,10,
            26,5,4,
            0,10,10,
            22,6,4,
            18,7,4,
            14,8,4,
            0,14,2,
            3,14,10,
            14,14,15,
            14,10,4,
            18,11,4,
            22,12,4};

    int[] stairsNums = {2,17,4,
            7,5,4,
            29,17,4,
            10,13,8,
            13,17,10};

    int[] eggsNums = {20,17,
            8,13,
            20,10,
            27,13,
            0,5,
            23,5,
            20,1,
            0,9};

    int[] gooseNums = {6,17,
            22,17,
            12,13,
            18,9,
            6,5,
            26,1};


    Game game;
    public Level5(Game game) {
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
