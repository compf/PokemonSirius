package compf.core.game;

import com.badlogic.gdx.math.Rectangle;

public  class CollidableTexture extends DrawableObject {
    public CollidableTexture(int x, int y, int width, int height) {
        super(x, y, width, height);
    }
    public boolean doesCollide(DrawableObject other){
        Rectangle meRect=new Rectangle(x,y,getWidth(),getHeight());
        Rectangle otherRect=new Rectangle(other.x,other.y,other.getWidth(),other.getHeight());
        return meRect.overlaps(otherRect);
    }
    private boolean solid;
    public boolean isSolid(){
        return solid;
    }
}
