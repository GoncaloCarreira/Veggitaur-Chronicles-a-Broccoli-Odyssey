package org.gameweek.Levels;

import org.gameweek.Animations.EnemyAnimationThread;
import org.gameweek.Game;
import org.gameweek.Game0bjects.*;
import org.gameweek.Grid.Grid;

public class Level8 extends Level {

    Grid grid;
    int[] platformNums = {4,2,11,
            16,2,1,
            19,2,3,
            23,2,1,
            26,2,1,
            28,2,2,
            0,6,9,
            12,6,7,
            21,6,1,
            23,6,7,
            4,10,7,
            12,10,1,
            18,10,1,
            20,10,4,
            2,14,3,
            6,14,3,
            10,14,5,
            16,14,5,
            18,14,3,
            22,14,3,
            26,14,3};

    int[] stairsNums = {3,5,4,
            15,5,4,
            27,5,4,
            5,9,4,
            22,9,8,
            11,13,4,
            19,13,4,
            5,17,4,
            15,17,4,
            25,17,4};

    int[] eggsNums = {2,13,
            10,13,
            28,13,
            4,9,
            29,1,
            18,9,
            12,5,
            8,5,
            7,1,
            19,1};

    int[] gooseNums = {24,17,
            4,13,
            14,13,
            10,9,
            21,9,
            0,5,
            14,5,
            28,5,
            21,1};


    Game game;
    public Level8(Game game) {
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
