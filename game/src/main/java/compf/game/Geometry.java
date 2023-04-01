package compf.game;

public class Geometry {
    public static interface Point{
        public int getX();
        public int getY();
    }
    public static interface Rectangle extends Point{
        public int getWidth();
        public int getHeight();
        public  default boolean doesCollide(Rectangle other){
            return false;
        }
    }
    public static class MyPoint implements Point{
        private final int x, y;

        public MyPoint(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public int getX(){
            return x;
        }
        public int getY(){
            return y;
        }
    }
    public static class MyRect implements Rectangle{
        private int width,height,x,y;

        public MyRect(int x, int y,int w,int h) {
            this.x = x;
            this.y = y;
            this.width=w;
            this.height=h;
        }
        public int getX(){
            return x;
        }
        public int getY(){
            return y;
        }
        public int getWidth(){
            return width;
        }
        public int getHeight(){
            return height;
        }
        public boolean doesCollide(Rectangle r){
            return  doesCollide(this,r) || doesCollide(r,this);
        }
        private static boolean doesCollide(Rectangle r1,Rectangle r2){
            return r1.getX() <= r2.getX() && r1.getX() +r1.getWidth() >= r2.getX()  && r1.getY() <= r2.getY() && r1.getY() +r1.getHeight() >= r2.getY() ;
        }
    }

   
}
