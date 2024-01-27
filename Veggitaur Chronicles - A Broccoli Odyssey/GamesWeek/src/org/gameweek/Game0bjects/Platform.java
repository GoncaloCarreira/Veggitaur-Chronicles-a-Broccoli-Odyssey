package org.gameweek.Game0bjects;


import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.gameweek.Grid.Grid;
import org.gameweek.Grid.GridPosition;
import org.gameweek.Utils.Utils;

public class Platform {
   public Picture rectangle;
   public GridPosition pos;

   Grid grid;
    public Platform(Grid grid,int col,int row,String file){
        this.grid = grid;
        pos = new GridPosition(col,row,grid);
        this.rectangle = new Picture(pos.getColToX(),pos.getRowToY(),file);
        rectangle.draw();
    }

    public static int getPlatformArrayLength(int[] platforms){
        int j = 0;
        for(int i = 2; i < platforms.length; i += 3){
            j += platforms[i];
        }
        return j;
    }

    public static Platform[] makeplatforms(int[] platforms,Grid grid){
        int j = 0;
        Platform[] finalPlatforms = new Platform[getPlatformArrayLength(platforms)];
        for(int i = 2;i < platforms.length; i += 3){
            for(int l = 0; l < platforms[i]; l++){
                if(l == 0 || l == (platforms[i] - 1)){
                    finalPlatforms[j++] = new Platform(grid,platforms[i-2]+l,platforms[i-1],"Platforms/sideblock.png");
                    continue;
                }

            finalPlatforms[j++] = new Platform(grid,platforms[i-2]+l,platforms[i-1],"Platforms/middleblock.png");
            }
        }
        return finalPlatforms;
    }

    public boolean isInTheWay(GridPosition pos, Direction direction){
        if(pos.isOnTopOf(this.pos) && direction == Direction.DOWN){
            return true;
        }
        if(pos.isOnTheRightOf(this.pos) && direction == Direction.LEFT){
            return true;
        }
        if(pos.isOnLeftOf(this.pos) && direction == Direction.RIGHT){
            return true;
        }
        return false;
    }
}
