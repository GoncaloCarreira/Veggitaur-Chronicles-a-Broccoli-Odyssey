package org.gameweek.Threads;

import org.gameweek.Game;
import org.gameweek.Game0bjects.Direction;
import org.gameweek.Game0bjects.Player;

public class GravityThread extends Thread {

    Game game;

    private boolean shouldFall = true;

    private boolean exit = false;

    public GravityThread(Game game) {
        this.game = game;
    }

     public void stops(){
        exit = true;
     }
     public static int counter1;

    @Override
    public void run() {
        while (!exit) {

            shouldFall = true;

            for (int i = 0; i < game.level.stairs.length; i++) {
                if (game.level.player.pos.isOnTopOf(game.level.stairs[i].pos)) {
                    shouldFall = false;
                }
                if (game.level.player.pos.getRow() == game.grid.getRows() - 1) {
                    shouldFall = false;
                }
            }
            for (int i = 0; i < game.level.platforms.length; i++) {
                if ((game.level.player.pos.isOnTopOf(game.level.platforms[i].pos))) {
                    shouldFall = false;
                }
            }
            game.level.player.isFalling = shouldFall;
            if (shouldFall) {
                System.out.println("Fall");
                game.level.player.fallFromGravity();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    continue;
                }
            }


        }
    }
}


