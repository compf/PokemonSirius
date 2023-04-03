package compf.game;

import compf.core.etc.MyObject;
import compf.game.Geometry.MyVector;
import java.util.HashMap;
public class TileBasedHierachicalObject extends HierarchicalObject {
    private HashMap<MyVector,String> tiles=new HashMap<>();
    private int TEXTURE_SIZE=16;
    public TileBasedHierachicalObject(int x, int y, int width, int height) {
        super(x, y, width, height);
        
    }
    public boolean isEmpty(int x, int y){
        return isEmpty(new MyVector(x, y));
    }
    public boolean isUsed(int x,int y){
        return  !isEmpty(x,y);
    }
    public void set(int x,int y, String type){
      set(new MyVector(x, y),type);
    }
    public String get(int x,int y){
        return get(new MyVector(x, y));
    }

    public boolean isEmpty(MyVector pos){
        return !tiles.containsKey(pos);
    }
    public boolean isUsed(MyVector pos){
        return  !isEmpty(pos);
    }
    public void set(MyVector pos, String type){
        tiles.put(pos, type);
        this.addChild(new CollidableObject(this.getX()+pos.getX()*TEXTURE_SIZE, this.getY()+pos.getY()*TEXTURE_SIZE, TEXTURE_SIZE, TEXTURE_SIZE, type));
    }
    public String get(MyVector pos){
        return   tiles.get(pos);
    }

  
}
