package org.gameweek.Interfaces;

import org.gameweek.Game;
import org.gameweek.Game0bjects.*;


public class ColilsionDetector extends Thread{

    Game game;

    int i;

    boolean exit = false;

    EnemyColision enemyCollision;
    public ColilsionDetector(Game game){
        this.game = game;
        enemyCollision = new EnemyColision(game);
    }
    @Override
    public void run() {
        enemyCollision.start();
        while (!exit){
            if(game.level.gooses[0].isDeleted){
                return;
            }
            System.out.print("");
            checkEggsColision();
        }
    }

    public void checkEggsColision(){
        for(int i = 0; i <  game.level.eggs.length;i++){
            if(game.level.player.pos.isInSameSpace(game.level.eggs[i].pos)){
                    game.eggCrash(i);
                    return;
            }
        }
    }
    public void stops(){
        exit = true;
    }




}
