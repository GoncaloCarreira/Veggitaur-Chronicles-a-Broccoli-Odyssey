package org.gameweek.Levels;

import org.gameweek.Animations.EnemyAnimationThread;
import org.gameweek.Game;
import org.gameweek.Game0bjects.*;
import org.gameweek.Grid.Grid;

public class Level3 extends Level{

    Grid grid;
    int[] platformNums = {0,2,2,
            3,2,6,
            10,2,6,
            0,14,2,
            0,5,2,
            3,5,6,


            3,14,9,
            0,8,2,
            3,8,6,
            10,8,6,
            10,5,10,
            18,10,5,
            18,14,5,
            24,14,4,
            24,10,4


    };

    int[] eggsNums = {0,13,
            1,7,
            6,7,
            7,4,
            8,1,
            11,4,
            28,17,
            20,9,
            24,9,
            3,13,
            8,13




    } ;
    int[] stairsNums = {2,17,16,
            9,13,12,
            12,17,4,
            23,17,8
            //3,13,12,
            //13,5,4,
            //18,9,5,
            //23,17,8

    };



    int[] gooseNums = {6,17,
            12,17,
            20,17,
            1,13,
            1,16,
            1,10,
            1,3,
            8,4,
            15,9,




    };


    Game game;
    public Level3(Game game) {
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

