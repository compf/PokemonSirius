package compf.core.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HierarchicalObject extends DrawableObject {
    private LinkedList<DrawableObject> children=new LinkedList<>();

    public HierarchicalObject(int x, int y, int width, int height) {
        super(x, y, width, height);
    }
    public void addChild(DrawableObject obj){
        children.add(obj);
        obj.setParent(this);

    }
    public Iterable<DrawableObject> getChildren(){
        return children;
    }
    @Override
    public void init() {
        for(var c:children){
            c.init();
        }
    }

    @Override
    public void update() {
        for(var c:children){
            c.update();
        }
    }

    @Override
    public void render(SpriteBatch batch) {
        for(var c:children){
            c.render(batch);
        }
    }

    @Override
    public void onKeyPress(int keyCode,boolean newPress) {
        for(var c:children){
            c.onKeyPress(keyCode,newPress);
        }
    }
}
