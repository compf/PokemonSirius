package compf.game.menu;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import compf.game.DrawableObject;
import compf.game.Settings;

import java.util.ArrayList;
import java.util.Collections;

public abstract class BaseMenu<T> extends DrawableObject {
    private int currIndex;

    protected BaseMenu(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    public T getCurrItem() {
        return getItems()[currIndex];
    }

    public abstract T[] getItems();

    public void setCurrIndex(int currIndex) {
        if (currIndex >= getItems().length) {
            currIndex = 0;
        } else if (currIndex < 0) {
            currIndex = getItems().length - 1;
        }
        this.currIndex = currIndex;
    }

    public void increaseCurrIndex(int by) {
        setCurrIndex(getCurrIndex() + by);
    }

    public void incrementCurrIndex() {
        increaseCurrIndex(1);
    }

    public void decrementCurrIndex() {
        increaseCurrIndex(-1);
    }

    public abstract void itemSelected();

    public int getCurrIndex() {
        return currIndex;
    }

    @Override
    public void onKeyPress(int key, boolean newPress) {
        if (!newPress)
            return;
        if (key == Settings.KEY_DOWN) {
            incrementCurrIndex();
        } else if (key == Settings.KEY_UP) {
            decrementCurrIndex();
        } else if (key == Settings.KEY_ACCEPT) {
            this.itemSelected();
        }
    }
}
