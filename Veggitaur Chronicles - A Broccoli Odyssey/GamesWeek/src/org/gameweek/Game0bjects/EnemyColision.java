package org.gameweek.Game0bjects;

import org.gameweek.Game;

public class EnemyColision extends Thread {
    Game game;
    public EnemyColision(Game game){
        this.game = game;
    }
    @Override
    public void run() {
        while (true) {
            if(game.level.gooses[0].isDeleted){
                return;
            }
            checkCollisions();

        }
    }

    public void checkCollisions() {
        for (int i = 0; i < game.level.gooses.length; i++) {
            if (game.level.player.pos.isInSameSpace(game.level.gooses[i].pos)) {
                game.looseLife();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    checkCollisions();
                }
                return;
            }
        }
    }
}
