package org.gameweek.Levels;

import org.gameweek.Animations.EnemyAnimationThread;
import org.gameweek.Game;
import org.gameweek.Game0bjects.*;
import org.gameweek.Grid.Grid;

public class Level2 extends Level{

    Grid grid;
    int[] platformNums = {10,2,1,
            10,3,1, 10,4,1, 10,5,1, 10,6,1, 10,7,1, 10,8,1,
            10,9,1, 10,10,1, 10,11,1, 10,12,1, 10,13,1, 10,14,1,
            12,3,1, 12,4,1, 12,5,1, 12,6,1, 12,7,1, 12,8,1,
            12,9,1, 12,10,1, 12,11,1, 12,12,1, 12,13,1, 12,14,1,
            13,3,10,7,1,20,13,14,17,18,8,6,13,12,2,16,12,2,
            0,14,3,4,14,6,2,5,3,6,5,4,27,12,1};

    int[] stairsNums = {
            23,7,5,
                17,11,4,
                    15,13,2,
                        3,17,4,
                            5,13,9,
                                6,4,4
          };

    int[] eggsNums = {
            25,17,
            0,13,
            9,4,
            11,12,
            13,11,
            17,0
          };

    int[] gooseNums = {
            23,17,
                1,4,
                    1,13,
                        20,4,
                            20,14,
                                21,13,
            14,11
    };


    Game game;
    public Level2(Game game) {
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


