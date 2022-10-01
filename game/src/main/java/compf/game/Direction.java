package compf.game;

public enum Direction {
    Up(0,1),Right(1,0),Down(0,-1),Left(-1,0)
    ;
    private final int x,y;

    Direction(int x, int y){
        this.x=x;
        this.y=y;
    }
}
