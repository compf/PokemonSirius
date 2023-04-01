package compf.game;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class CollidableObject extends DrawableObject {
    public CollidableObject(int x, int y, int width, int height, String textureId) {
        super(x, y, width, height);
        this.textureId = textureId;
    }

    protected String textureId;

    public boolean doesCollide(Rectangle other) {
        Rectangle meRect = new Rectangle(x, y, getWidth(), getHeight());
        Rectangle otherRect = new Rectangle(other.x, other.y, other.getWidth(), other.getHeight());
        return meRect.overlaps(otherRect);
    }

    private boolean solid;

    public boolean isSolid() {
        return solid;
    }

    @Override
    public void render(SpriteBatch batch) {
        batch.draw(TextureManager.Instance.getTextureRegion(textureId), x, y, width, height);
    }
}
