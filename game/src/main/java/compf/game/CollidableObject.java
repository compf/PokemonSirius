package compf.game;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
public  class CollidableObject extends DrawableObject {
    public CollidableObject(int x, int y, int width, int height,Texture texture) {
        super(x, y, width, height);
        this.texture=texture;
    }
    protected Texture texture;
    public boolean doesCollide(DrawableObject other){
        Rectangle meRect=new Rectangle(x,y,getWidth(),getHeight());
        Rectangle otherRect=new Rectangle(other.x,other.y,other.getWidth(),other.getHeight());
        return meRect.overlaps(otherRect);
    }
    private boolean solid;
    public boolean isSolid(){
        return solid;
    }
    @Override
    public void render(SpriteBatch batch){
        batch.draw(texture,x,y,width,height);
    }
}
