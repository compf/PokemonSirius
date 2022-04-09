package compf.core.game;

public class Textbox extends DrawableObject{
    protected Textbox(int x, int y, int width, int height) {
        super(x, y, width, height);
    }
    private String text;
    public void writeString(String str){
        this.text=str;
    }
}
