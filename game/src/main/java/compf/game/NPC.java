package compf.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import java.util.HashMap;

public class NPC extends CollidableObject {
    private final Texture spritesheet;
    protected Direction lookDirection;
    protected int walkIndex=0;
     HashMap<Direction,TextureRegion[]> lookDirectionRegions=new HashMap<>();

    public NPC(int x,int y,int width,int height,Texture texture,Direction dir,int spriteSheetX,int spriteSheetY){
        super(x,y,width,height);
        this.spritesheet=texture;
        this.lookDirection=dir;
        Direction[] directionOrderSpritesheet={Direction.Down,Direction.Left,Direction.Right,Direction.Up};
        for(int i=0;i<4;i++){

                this.lookDirectionRegions.put(directionOrderSpritesheet[i],new TextureRegion[]{
                        new TextureRegion(texture,(spriteSheetX+0)*width,(spriteSheetY+i)*height,width,height),
                        new TextureRegion(texture,(spriteSheetX+1)*width,(spriteSheetY+i)*height,width,height),
                        new TextureRegion(texture,(spriteSheetX+2)*width,(spriteSheetY+i)*height,width,height),
                });

        }

    }


    @Override
    public void render(SpriteBatch batch) {
        batch.draw(lookDirectionRegions.get(lookDirection)[walkIndex],x,y,getWidth(),getHeight());

    }

    protected void moveBy(final int dx,final int dy){
        this.x+=dx;
        this.y+=dy;

    }
    protected void walk(){
        walkIndex=(walkIndex+1)%3;

    }
}
