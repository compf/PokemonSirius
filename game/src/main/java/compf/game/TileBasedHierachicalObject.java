package compf.game;

import compf.core.etc.MyObject;
import compf.game.Geometry.MyVector;

public class TileBasedHierachicalObject extends HierarchicalObject {
    private String[][] tiles;
    private int TEXTURE_SIZE=16;
    public TileBasedHierachicalObject(int x, int y, int width, int height) {
        super(x, y, width, height);
        tiles=new String[height][width];
    }
    public boolean isEmpty(int x, int y){
        return tiles[y][x]==null;
    }
    public boolean isUsed(int x,int y){
        return tiles[y][x]!=null;
    }
    public void set(int x,int y, String type){
        tiles[y][x]=type;
        System.out.println(type);
        this.addChild(new CollidableObject(this.getX()+x*TEXTURE_SIZE, this.getY()+y*TEXTURE_SIZE, TEXTURE_SIZE, TEXTURE_SIZE, tiles[y][x]));
    }
    public String get(int x,int y){
        return tiles[y][x];
    }

    public boolean isEmpty(MyVector pos){
        return isEmpty(pos.getX(),pos.getY());
    }
    public boolean isUsed(MyVector pos){
        return  isUsed(pos.getX(), pos.getY());
    }
    public void set(MyVector pos, String type){
       set(pos.getX(),pos.getY(),type);
    }
    public String get(MyVector pos){
        return  get(pos.getX(),pos.getY());
    }

  
}
