package compf.core;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import compf.core.engine.PokemonBattle;
import compf.core.engine.SharedInformation;
import compf.core.engine.pokemon.Pokemon;
import compf.core.game.*;
import compf.core.game.menu.MainMenu;

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

	@Override
	public void create()
	{
		Main.instance=this;
		batch = new SpriteBatch();
		image = new Texture("libgdx.png");
		SharedInformation.Instance.init();
		HierarchicalObject frame=new HierarchicalObject(0,0,1024,1024);
		frame.addChild(new RepeatableTexture(0,0,100,100,new Texture("grass.png")));
		Player player=new Player(50,40,72,96,new Texture("trainers.png"), Direction.Right,6,0);
		frame.addChild(player);
		//MainMenu menu=new MainMenu();
		//frame.addChild(menu);
		short id=0;
		currObject=new PokemonBattleScreen(0,0,1024,1024,new compf.core.engine.Player(id,"Test", PokemonBattle.createRandomTeam()),
				new Pokemon(25));
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