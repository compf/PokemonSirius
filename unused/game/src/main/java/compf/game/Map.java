package compf.game;

import compf.game.menu.MainMenu;

public class Map extends FocusableHierarchicalObject {
    public Map() {
        super(0, 0, 1024, 1024);
    }

    @Override
    public void onKeyPress(int keycode, boolean newPress) {
        super.onKeyPress(keycode, newPress);
        if (getFocused() == null && keycode == Settings.KEY_START) {
            setFocused(new MainMenu());
        } else if (getFocused() != null && keycode == Settings.KEY_CANCEL) {
            setFocused(null);
        }
        if (getFocused() == null) {
            if (keycode == Settings.KEY_UP || keycode == Settings.KEY_DOWN || keycode == Settings.KEY_LEFT
                    || keycode == Settings.KEY_RIGHT) {

            }
        }
    }
}
