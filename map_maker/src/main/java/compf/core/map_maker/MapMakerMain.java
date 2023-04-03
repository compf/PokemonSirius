
package compf.core.map_maker;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import compf.game.Direction;
import compf.game.DrawableObject;
import compf.game.HierarchicalObject;
import compf.game.Player;
import compf.game.PokemonZone;
import compf.game.Settings;
import compf.game.TileBasedHierachicalObject;

import java.util.ArrayList;
import java.util.Stack;
import compf.core.engine.SharedInformation;
import compf.core.map_maker.random_map_generator.TileBasedAreaGenerator;

/**
 * {@link com.badlogic.gdx.ApplicationListener} implementation shared by all
 * platforms.
 */
public class MapMakerMain extends ApplicationAdapter implements InputProcessor {
	private SpriteBatch batch;
	private Texture image;
	private HierarchicalObject currObject;
	private static MapMakerMain instance;
	private static Stack<DrawableObject> frames = new Stack<>();
	private static compf.core.engine.Player player;
	private static Player playerFrame;

	@Override
	public void create() {
		MapMakerMain.instance = this;
		batch = new SpriteBatch();
		image = new Texture("libgdx.png");
		SharedInformation.Instance.init();
		Gdx.input.setInputProcessor(this);
		TileBasedHierachicalObject frame = new TileBasedHierachicalObject(0, 0, 1024, 1024);
		TileBasedAreaGenerator gen = new TileBasedAreaGenerator(frame, "grass");
		gen.generate();
		ArrayList<PokemonZone.PokemonZoneEntry> entries = new ArrayList<>();
		entries.add(new PokemonZone.PokemonZoneEntry(25, 10, 15, 60));
		entries.add(new PokemonZone.PokemonZoneEntry(50, 5, 8, 127));
		entries.add(new PokemonZone.PokemonZoneEntry(25, 30, 38, 314));

		// frame.addChild(new PokemonZone(0,0,1024,1024,new
		// Texture("tiles/grass.png"),entries,5));
		// frame.addChild(new ScrollableTilesets());
		short id = 0;
		/*
		 * currObject=new PokemonBattleScreen(0,0,1024,1024,
		 * new compf.core.engine.Player(id,"Test", TestUtil.getSingleMoveRandomTeam()),
		 * TestUtil.createRandomPokemonSingleMove());
		 */
		currObject = frame;
		currObject.init();

	}

	private boolean dragging = false;

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// we can also handle mouse movement without anything pressed
		// camera.unproject(tp.set(screenX, screenY, 0));

		return false;
	}

	@Override
	public boolean keyDown(int keycode) {
		final int BY=20;

		if(keycode==Settings.KEY_LEFT){
			Player.MyCamera.setCameraPosBy(-BY, 0);
		}
		else if(keycode==Settings.KEY_RIGHT){
			Player.MyCamera.setCameraPosBy(+BY, 0);
		}
		else if(keycode==Settings.KEY_UP){
			Player.MyCamera.setCameraPosBy(0, +BY);
		}
		else if(keycode==Settings.KEY_DOWN){
			Player.MyCamera.setCameraPosBy(0, -BY);
		}
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		return false;
	}

	@Override
	public boolean scrolled(float amountX, float amountY) {

		for (var obj : currObject.getChildren()) {
			if (obj instanceof MouseReceptibleDrawableObject) {
				MouseReceptibleDrawableObject mObj = (MouseReceptibleDrawableObject) obj;

				mObj.mouseScroll(amountY);
			}
		}
		return false;
	}

	int lastMouseX, lastMouseY;

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		for (var obj : currObject.getChildren()) {
			if (obj instanceof MouseReceptibleDrawableObject) {
				MouseReceptibleDrawableObject mObj = (MouseReceptibleDrawableObject) obj;
				mObj.mouseDown(screenX, screenY, button);
			}
		}
		lastMouseX = screenX;
		lastMouseY = screenY;
		dragging = true;
		return true;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		if (!dragging)
			return false;
		final int factor = 1;

		int dx = lastMouseX - screenX;
		int dy = lastMouseY - screenY;
		final int AtLeast=10;


			Player.MyCamera.setCameraPosBy(dx, dy);
			lastMouseX=screenX;
			lastMouseY=screenY;

		
		return true;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		if (button != Input.Buttons.LEFT || pointer > 0)
			return false;
		dragging = false;
		return true;
	}

	@Override
	public void render() {

		Gdx.gl.glClearColor(1f, 1f, 1f, 1f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();

		currObject.update();
		currObject.render(batch);
		batch.end();

	}

	@Override
	public void dispose() {
		batch.dispose();
		image.dispose();
		System.exit(0);
	}

}