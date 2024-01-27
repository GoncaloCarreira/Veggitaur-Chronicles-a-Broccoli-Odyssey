package org.gameweek.Animations;

import jdk.nashorn.internal.runtime.ECMAException;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.gameweek.Game0bjects.Direction;
import org.gameweek.Game0bjects.Platform;
import org.gameweek.Game0bjects.Player;
import org.gameweek.Game0bjects.Character;
import org.gameweek.Levels.Level;

public class CharacterAnimations extends Thread {


    public Character player;

    public boolean changedDirection = false;

    public CharacterAnimations(Character player) {
        this.player = player;


    }

    @Override
    public void run() {
        while (true) {
            if(player.isDeleted){
                player.rectangle.delete();
                return;
            }
            System.out.print("");
            try{
            switch (player.dir) {
                case RIGHT:
                    if(!changedDirection){
                        player.rectangle.translate(-15,3);
                        player.rectangle.grow(0,1);
                        changedDirection = true;
                    }
                    walkRight();
                    break;

                case LEFT:
                    if(!changedDirection){
                        player.rectangle.translate(-15,3);
                        player.rectangle.grow(0,1);
                        changedDirection = true;
                    }
                    walkLeft();
                    break;
                case UP:
                    if(player.isInStairs){
                        if(!changedDirection){
                            player.rectangle.translate(-15,3);
                            player.rectangle.grow(0,1);
                            changedDirection = true;
                        }
                        walkStairs();
                        break;
                    }
                case NONE:
                 /*   if(!changedDirection) {
                        player.rectangle.translate(-15, 3);
                        player.rectangle.grow(0, 1);
                        changedDirection = true;
                    }*/
                        player.rectangle.load("ezgif.com-crop (2).png");
                        break;
                    default:
                 /*   if(player.isInStairs || player.isOnStairs){
                        player.rectangle.load("GamesWeek/resources/Main character/stairs/stairs-5.png");
                        break;
                    }*/


            }
            }catch (Exception e){
                continue;
            }
        }
    }

    public void walkLeft() {


        player.rectangle.load("Main character/walk left/walkleft-0.png");
        try {
            Thread.sleep(50);
            if (player.dir != Direction.LEFT){
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }
            Thread.sleep(50);
            if (player.dir != Direction.LEFT){
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }
            Thread.sleep(50);
            if (player.dir != Direction.LEFT){
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }
            Thread.sleep(50);
            if (player.dir != Direction.LEFT){
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }
            player.rectangle.load("Main character/walk left/walkleft-1.png");

            if (player.dir != Direction.LEFT){
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }
            Thread.sleep(50);
            if (player.dir != Direction.LEFT){
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }
            Thread.sleep(50);
            if (player.dir != Direction.LEFT){
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.LEFT){
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.LEFT){
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            player.rectangle.load("Main character/walk left/walkleft-2.png");

            if (player.dir != Direction.LEFT){
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.LEFT){
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }
            Thread.sleep(50);
            if (player.dir != Direction.LEFT){
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }


            Thread.sleep(50);
            if (player.dir != Direction.LEFT){
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.LEFT){
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }


            player.rectangle.load("Main character/walk left/walkleft-3-0.png");
            if (player.dir != Direction.LEFT){
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }
            Thread.sleep(50);
            if (player.dir != Direction.LEFT){
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.LEFT){
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }


            Thread.sleep(50);
            if (player.dir != Direction.LEFT){
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }


            Thread.sleep(50);
            if (player.dir != Direction.LEFT){
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }


            player.rectangle.load("Main character/walk left/walkleft-4.png");
            if (player.dir != Direction.LEFT){
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }
            Thread.sleep(50);
            if (player.dir != Direction.LEFT){
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.LEFT){
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.LEFT){
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.LEFT){
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            player.rectangle.load("Main character/walk left/walkleft-5.png");
            if (player.dir != Direction.LEFT){
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.LEFT){
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }
            Thread.sleep(50);
            if (player.dir != Direction.LEFT){
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.LEFT){
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.LEFT){
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            player.rectangle.load("Main character/walk left/walkleft-6.png");
            if (player.dir != Direction.LEFT){
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.LEFT){
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }


            Thread.sleep(50);
            if (player.dir != Direction.LEFT){
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }


            Thread.sleep(50);
            if (player.dir != Direction.LEFT){
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.LEFT){
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }


            player.rectangle.load("Main character/walk left/walkleft-7.png");
            if (player.dir != Direction.LEFT){
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }
            Thread.sleep(50);
            if (player.dir != Direction.LEFT){
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.LEFT){
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.LEFT){
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.LEFT){
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }


            player.rectangle.load("Main character/walk left/walkleft-8.png");
            if (player.dir != Direction.LEFT){
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

        } catch (InterruptedException e) {


        }
    }

    public void walkRight() {


        player.rectangle.load("Main character/walkright/walkright-0.png");
        try {
            Thread.sleep(50);
            if (player.dir != Direction.RIGHT) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }
            Thread.sleep(50);
            if (player.dir != Direction.RIGHT) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }
            Thread.sleep(50);
            if (player.dir != Direction.RIGHT) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }
            Thread.sleep(50);
            if (player.dir != Direction.RIGHT) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }
            player.rectangle.load("Main character/walkright/walkright-1.png");

            if (player.dir != Direction.RIGHT) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }
            Thread.sleep(50);
            if (player.dir != Direction.RIGHT) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }
            Thread.sleep(50);
            if (player.dir != Direction.RIGHT) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.RIGHT) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.RIGHT) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            player.rectangle.load("Main character/walkright/walkright-2.png");

            if (player.dir != Direction.RIGHT) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.RIGHT) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }
            Thread.sleep(50);
            if (player.dir != Direction.RIGHT) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }


            Thread.sleep(50);
            if (player.dir != Direction.RIGHT) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.RIGHT) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }


            player.rectangle.load("Main character/walkright/walkright-3.png");
            if (player.dir != Direction.RIGHT) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }
            Thread.sleep(50);
            if (player.dir != Direction.RIGHT) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.RIGHT) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }


            Thread.sleep(50);
            if (player.dir != Direction.RIGHT) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }


            Thread.sleep(50);
            if (player.dir != Direction.RIGHT) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }


            player.rectangle.load("Main character/walkright/walkright-4.png");
            if (player.dir != Direction.RIGHT) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }
            Thread.sleep(50);
            if (player.dir != Direction.RIGHT) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.RIGHT) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.RIGHT) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.RIGHT) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            player.rectangle.load("Main character/walkright/walkright-5.png");
            if (player.dir != Direction.RIGHT) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.RIGHT) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }
            Thread.sleep(50);
            if (player.dir != Direction.RIGHT) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.RIGHT) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.RIGHT) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            player.rectangle.load("Main character/walkright/walkright-6.png");
            if (player.dir != Direction.RIGHT) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.RIGHT) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }


            Thread.sleep(50);
            if (player.dir != Direction.RIGHT) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }


            Thread.sleep(50);
            if (player.dir != Direction.RIGHT) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.RIGHT) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }


            player.rectangle.load("Main character/walkright/walkright-7.png");
            if (player.dir != Direction.RIGHT) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }
            Thread.sleep(50);
            if (player.dir != Direction.RIGHT) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.RIGHT) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.RIGHT) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.RIGHT) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }


            player.rectangle.load("Main character/walkright/walkright-8.png");
            if (player.dir != Direction.RIGHT) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

        } catch (InterruptedException e) {


        }
    }

    public void walkStairs() {


        player.rectangle.load("Main character/stairs/stairs-0.png");
        try {
            Thread.sleep(50);
            if (player.dir != Direction.UP) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }
            Thread.sleep(50);
            if (player.dir != Direction.UP) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }
            Thread.sleep(50);
            if (player.dir != Direction.UP) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }
            Thread.sleep(50);
            if (player.dir != Direction.UP) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }
            player.rectangle.load("Main character/stairs/stairs-1.png");

            if (player.dir != Direction.UP) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }
            Thread.sleep(50);
            if (player.dir != Direction.UP) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }
            Thread.sleep(50);
            if (player.dir != Direction.UP) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.UP) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.UP) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            player.rectangle.load("Main character/stairs/stairs-2.png");

            if (player.dir != Direction.UP) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.UP) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }
            Thread.sleep(50);
            if (player.dir != Direction.UP) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }


            Thread.sleep(50);
            if (player.dir != Direction.UP) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.UP) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }


            player.rectangle.load("Main character/stairs/stairs-3.png");
            if (player.dir != Direction.UP) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }
            Thread.sleep(50);
            if (player.dir != Direction.UP) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.UP) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }


            Thread.sleep(50);
            if (player.dir != Direction.UP) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }


            Thread.sleep(50);
            if (player.dir != Direction.UP) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }


            player.rectangle.load("Main character/stairs/stairs-4.png");
            if (player.dir != Direction.UP) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }
            Thread.sleep(50);
            if (player.dir != Direction.UP) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.UP) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.UP) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.UP) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            player.rectangle.load("Main character/stairs/stairs-5.png");
            if (player.dir != Direction.UP) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.UP) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }
            Thread.sleep(50);
            if (player.dir != Direction.UP) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.UP) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.UP) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            player.rectangle.load("Main character/stairs/stairs-6.png");
            if (player.dir != Direction.UP) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.UP) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }


            Thread.sleep(50);
            if (player.dir != Direction.UP) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }


            Thread.sleep(50);
            if (player.dir != Direction.UP) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.UP) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }


            player.rectangle.load("Main character/stairs/stairs-7.png");
            if (player.dir != Direction.UP) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }
            Thread.sleep(50);
            if (player.dir != Direction.UP) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.UP) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.UP) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

            Thread.sleep(50);
            if (player.dir != Direction.UP) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }


            player.rectangle.load("Main character/stairs/stairs-8.png");
            if (player.dir != Direction.UP) {
                changedDirection = false;
                player.rectangle.translate(15,-3);
                player.rectangle.grow(0,-1);
                return;
            }

        } catch (InterruptedException e) {


        }
    }
}