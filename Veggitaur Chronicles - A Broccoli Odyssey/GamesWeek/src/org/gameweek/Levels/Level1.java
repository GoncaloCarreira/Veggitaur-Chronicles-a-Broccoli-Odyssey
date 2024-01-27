package org.gameweek.Levels;

import org.gameweek.Animations.EnemyAnimationThread;
import org.gameweek.Game;
import org.gameweek.Game0bjects.Egg;
import org.gameweek.Game0bjects.Goose;
import org.gameweek.Game0bjects.Platform;
import org.gameweek.Game0bjects.Stairs;
import org.gameweek.Grid.Grid;
import org.gameweek.Game0bjects.Player;

public class Level1 extends Level {
    Grid grid;
    int[] platformNums = {4,2,9,
            14,2,14,
            0,6,8,
            12,6,5,
            18,6,11,
            2,10,6,
            13,10,9,
            23,10,7,
            0,14,2,
            3,14,9,
            13,14,9,
            23,14,7};

    int[] stairsNums = {2,17,4,
            3,5,4,
            8,13,8,
            12,17,4,
            22,17,8,
            17,9,4,
            13,5,4,
            28,5,4};

    int[] eggsNums = {9,17,
            26,17,
            0,13,
            15,13,
            27,13,
            2,9,
            13,9,
            29,9,
            0,5,
            22,5,
            7,1,
            20,1};

    int[] gooseNums = {6,17,
            20,17,
            10,13,
            29,13,
            20,9,
            6,5,
            21,5,
            9,1,
            22,1};

    public EnemyAnimationThread enemyAnimationThread;
    Game game;
    public Level1(Game game) {
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

