package compf.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.awt.*;

public class RepeatableTexture extends CollidableObject {

    public RepeatableTexture(int x, int y, int width, int height, Texture texture) {
        super(x, y, width, height, texture);
    }

    Point p;

    @Override
    public void render(SpriteBatch batch) {
        int tileWidth = texture.getWidth();
        int tileHeight = texture.getHeight();
        for (int x = this.x; x < getWidth(); x += tileWidth) {
            for (int y = this.y; y < getHeight(); y += tileHeight) {
                int x1 = adjustX(x);
                int y1 = adjustY(y);
                batch.draw(texture, x1, y1);
            }
        }
    }
}
