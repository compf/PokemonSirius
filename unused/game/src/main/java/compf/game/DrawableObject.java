package compf.game;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class DrawableObject implements Geometry.Rectangle{
    protected int x, y;
    protected final int width, height;
    private DrawableObject parent;
    public static final Texture RectTexture = getPixmapTexture(Color.WHITE);;

    public void init() {
    }

    public void update() {
    }

    public void render(SpriteBatch batch) {
    }

    public void onKeyPress(int keyCode, boolean newPress) {
    }

    protected DrawableObject(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static int adjustX(int x) {
        return x - Player.MyCamera.getCameraX() / 2;
    }

    public static int adjustY(int y) {
        return y - Player.MyCamera.getCameraY() / 2;
    }

    public int getWidth() {
        return width;
    }

    public static Texture getPixmapTexture(Color color) {
        return new Texture(getPixmapRectangle(1, 1, color));
    }

    public int getHeight() {
        return height;
    }

    public static Pixmap getPixmapRectangle(int width, int height, Color color) {
        Pixmap pixmap = new Pixmap(width, height, Pixmap.Format.RGBA8888);
        pixmap.setColor(color);
        pixmap.fillRectangle(0, 0, pixmap.getWidth(), pixmap.getHeight());
        return pixmap;
    }

    public DrawableObject getParent() {
        return parent;
    }

    public void setParent(DrawableObject parent) {
        this.parent = parent;
    }
}
