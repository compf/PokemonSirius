package compf.game;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Player extends NPC {
    public static final Camera MyCamera=new Camera();
    public Player(int x, int y, int width, int height, Texture texture, Direction dir, int spriteSheetX,
            int spriteSheetY) {
        super(x, y, width, height, texture, dir, spriteSheetX, spriteSheetY);
    }


    @Override
    public void onKeyPress(int keycode, boolean newPress) {
        final int MoveSpeed = 5;
        switch (keycode) {
            case Settings.KEY_UP:
                moveBy(0, MoveSpeed);
                if (lookDirection != Direction.Up) {
                    walkIndex = 0;
                    lookDirection = Direction.Up;
                } else {
                    walk();
                }

                break;
            case Settings.KEY_LEFT:
                moveBy(-MoveSpeed, 0);

                if (lookDirection != Direction.Left) {
                    walkIndex = 0;
                    lookDirection = Direction.Left;
                } else {
                    walk();
                }

                break;
            case Settings.KEY_DOWN:
                moveBy(0, -MoveSpeed);
                if (lookDirection != Direction.Down) {
                    walkIndex = 0;
                    lookDirection = Direction.Down;
                } else {
                    walk();
                }
                break;
            case Settings.KEY_RIGHT:
                moveBy(MoveSpeed, 0);
                if (lookDirection != Direction.Right) {
                    walkIndex = 0;
                    lookDirection = Direction.Right;
                } else {
                    walk();
                }

                break;
        }
        MyCamera.setCameraPos(x, y);

    }

    @Override
    public void render(SpriteBatch batch) {

        batch.draw(lookDirectionRegions.get(lookDirection)[walkIndex], 256, 256, getWidth(), getHeight());

    }
}
