package org.gameweek.Levels;


import org.gameweek.Animations.EnemyAnimationThread;
import org.gameweek.Game;
import org.gameweek.Game0bjects.*;
import org.gameweek.Grid.Grid;

public class Level9 extends Level{

    Grid grid;
    int[] platformNums = {4,2,9,
            0,14,5,
            0,8,3,
            8,5,10,
            18,10,5,


    };

    int[] stairsNums = {5,17,4,
            3,13,12,
            13,5,4,
            18,9,5,
            23,17,8
    };

    int[] eggsNums = {3,13,
            1,7,
            8,1,
            11,4,
            28,17,
            20,9



    } ;

    int[] gooseNums = {6,17,
            12,17,
            20,17,
            1,13,
            1,3,
            8,4,
            15,9
    };


    Game game;
    public Level9(Game game) {
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
