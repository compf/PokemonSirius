package compf.game;

public class Camera {
    private int cx,cy;
    public void setCameraPos(int x,int y){
        this.cx=x;
        this.cy=y;
    }
    public void setCameraPosBy(int byX,int byY){
        this.cx+=byX;
        this.cy+=byY;
    }
    public int getCameraX(){
        return cx;
    }
    public int getCameraY(){
        return cy;
    }
}
