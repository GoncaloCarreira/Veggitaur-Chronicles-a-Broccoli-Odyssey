package org.gameweek.Levels;

import org.gameweek.Animations.EnemyAnimationThread;
import org.gameweek.Game;
import org.gameweek.Game0bjects.*;
import org.gameweek.Grid.Grid;

public class Level6 extends Level {

    Grid grid;
    int[] platformNums = {4,2,9,
            14,2,3,
            20,2,5,
            26,2,4,
            0,6,9,
            12,6,5,
            18,6,4,
            3,10,6,
            15,10,5,
            23,10,7,
            0,14,2,
            3,14,2,
            8,14,4,
            13,14,4,
            23,14,5};

    int[] stairsNums = {3,5,4,
            13,5,4,
            19,5,4,
            25,9,8,
            17,9,4,
            9,13,8,
            2,17,4,
            12,17,4,
            22,17,8};

    int[] eggsNums = {0,13,
            8,13,
            27,13,
            3,9,
            15,9,
            19,9,
            12,5,
            21,5,
            7,1,
            20,1};

    int[] gooseNums = {21,17,
            11,13,
            24,9,
            0,5,
            21,5,
            12,1,
            28,1};


    Game game;
    public Level6(Game game) {
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
