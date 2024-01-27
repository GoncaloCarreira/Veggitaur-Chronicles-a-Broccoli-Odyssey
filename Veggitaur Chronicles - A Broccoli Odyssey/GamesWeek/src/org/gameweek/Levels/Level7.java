package org.gameweek.Levels;

import org.gameweek.Animations.EnemyAnimationThread;
import org.gameweek.Game;
import org.gameweek.Game0bjects.*;
import org.gameweek.Grid.Grid;

public class Level7 extends Level {

    Grid grid;
    int[] platformNums = {4,2,9,
            14,2,3,
            22,2,3,
            26,2,4,
            20,3,3,
            18,4,3,
            16,5,3,
            0,6,9,
            12,6,5,
            3,10,6,
            10,10,3,
            12,11,3,
            14,12,3,
            16,13,3,
            18,14,4,
            0,10,2,
            20,10,2,
            23,10,2,
            26,10,2,
            1,14,1,
            3,14,2,
            7,14,5,
            26,14,2};

    int[] stairsNums = {3,5,4,
            13,5,4,
            9,13,8,
            2,17,8,
            22,17,8,
            25,17,16};

    int[] eggsNums = {1,13,
            11,13,
            27,13,
            3,9,
            16,11,
            20,9,
            12,5,
            8,5,
            7,1,
            16,4};

    int[] gooseNums = {21,17,
            8,9,
            24,9,
            0,5,
            24,5,
            12,1,
            29,1};


    Game game;
    public Level7(Game game) {
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
