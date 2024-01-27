package org.gameweek.Animations;

import org.gameweek.Game0bjects.Goose;

public class EnemyAnimationThread extends Thread {
    int i = 0;

    Goose[] duck;

    public EnemyAnimationThread(Goose[] duck){
        super();
        this.duck = duck;
    }
    @Override
    public void run() {
       while(true){
           for(int j = 0;j < duck.length;j++) {
               if(duck[j].died){
                   return;
               }
               i++;
               switch (i) {
                   case 1:
                       duck[j].animate("Animation Sprites/EnemyFlight-1.png");
                       break;
                   case 2:
                       duck[j].animate("Animation Sprites/EnemyFlight-2.png");
                       duck[j].translate(0, 3);
                       break;
                   case 3:
                       duck[j].animate("Animation Sprites/EnemyFlight-3.png");
                       duck[j].translate(0, 3);
                       break;
                   case 4:
                       duck[j].animate("Animation Sprites/EnemyFlight-4.png");
                       duck[j].translate(0, -3);
                       break;
                   case 5:
                       duck[j].animate("Animation Sprites/EnemyFlight-5.png");
                       duck[j].translate(0, -3);
                       i = 0;
                       break;
               }
           }
           try{
               Thread.sleep(100);
           }catch (Exception e){;
           }
       }
    }
}
