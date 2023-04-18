package compf.game;

import compf.game.Geometry.Point;
import compf.game.Geometry.MyVector;;
public enum Direction {
    Up(0, 1), Right(1, 0), Down(0, -1), Left(-1, 0);

    private final int x, y;

    Direction(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public static MyVector add(Point pt, Direction dir){
        return new MyVector(pt.getX()+dir.x,pt.getY()+dir.y);
    }
    public  static Direction[] getDirections(Point src,Point dest){
        if(dest.getX()>src.getX() && dest.getY() > src.getY()){
            return new Direction[]{Up,Right};
        }
        else if(dest.getX()>src.getX() && dest.getY() < src.getY()){
            return new Direction[]{Down,Right};
        }
        else if(dest.getX()<src.getX() && dest.getY() < src.getY()){
            return new Direction[]{Down,Left};
        }
        else if(dest.getX()<src.getX() && dest.getY() > src.getY()){
            return new Direction[]{Up,Left};
        }
        else if(dest.getX()>src.getX() && dest.getY() == src.getY()){
            return new Direction[]{Right};
        }
        else if(dest.getX()<src.getX() && dest.getY() == src.getY()){
            return new Direction[]{Left};
        }
        else if(dest.getX()==src.getX() && dest.getY() > src.getY()){
            return new Direction[]{Up};
        }
        else{
            return new Direction[]{Down};
        }
    }
}
