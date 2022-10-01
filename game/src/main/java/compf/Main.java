
package compf;
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

import java.util.ArrayList;
import java.util.Stack;


/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter  {
	private SpriteBatch batch;
	private Texture image;
	private DrawableObject currObject;
	private static Main instance;
	private static Stack<DrawableObject> frames=new Stack<>();
	public static void switchFrame(DrawableObject newObj){
		frames.push(instance.currObject);
		instance.currObject=newObj;
	}
	public static void goBack(){
		instance.currObject=frames.pop();
	}
	public static compf.core.engine.Player getPlayer(){
		return player;
	}
	public static Player getPlayerFrame(){
		return playerFrame;
	}
	private static compf.core.engine.Player player;
	private static Player playerFrame;
	@Override
	public void create()
	{
		Main.instance=this;
		batch = new SpriteBatch();
		image = new Texture("libgdx.png");
		compf.core.engine.SharedInformation.Instance.init();
		HierarchicalObject frame=new HierarchicalObject(0,0,1024,1024);
		ArrayList<PokemonZone.PokemonZoneEntry> entries=new ArrayList<>();
		entries.add(new PokemonZone.PokemonZoneEntry(25,10,15,60));
		entries.add(new PokemonZone.PokemonZoneEntry(50,5,8,127));
		entries.add(new PokemonZone.PokemonZoneEntry(25,30,38,314));


		frame.addChild(new PokemonZone(0,0,1024,1024,new Texture("grass.png"),entries,5));
		Player player=new Player(50,40,72,96,new Texture("trainers.png"), Direction.Right,6,0);
		Main.player=new compf.core.engine.Player((short)0,"Me",compf.core.engine.PokemonBattle.createRandomTeam());
		Main.playerFrame=player;
		frame.addChild(player);
		//MainMenu menu=new MainMenu();
		//frame.addChild(menu);
		short id=0;
		/*currObject=new PokemonBattleScreen(0,0,1024,1024,
				new compf.core.engine.Player(id,"Test", TestUtil.getSingleMoveRandomTeam()),
				TestUtil.createRandomPokemonSingleMove());*/
		currObject=frame;
		currObject.init();


	}
	private int[] allValidKeys= new int[]{Input.Keys.UP,Input.Keys.RIGHT,Input.Keys.DOWN,Input.Keys.LEFT,Input.Keys.SPACE,Input.Keys.B};
	@Override
	public void render() {

		Gdx.gl.glClearColor(1f, 1f, 1f, 1f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		boolean keyFound=false;
		for(int key:allValidKeys){
			if(Gdx.input.isKeyPressed(key) ){

				currObject.onKeyPress(key,key!=lastKey);
				lastKey=key;
				keyFound=true;
			}
		}
		if(!keyFound)lastKey=-1;
		currObject.update();
		currObject.render(batch);
		batch.end();

	}

	@Override
	public void dispose() {
		batch.dispose();
		image.dispose();
	}
	private int lastKey=-1;




}