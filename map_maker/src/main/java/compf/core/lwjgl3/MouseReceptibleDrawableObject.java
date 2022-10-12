package compf.core.map_maker;
import compf.game.Direction;
import compf.game.DrawableObject;
import compf.game.HierarchicalObject;
import compf.game.Player;
import compf.game.PokemonZone;
import java.util.ArrayList;
import java.util.Stack;
import compf.game.CollidableObject;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import  compf.core.engine.SharedInformation;
public class MouseReceptibleDrawableObject extends DrawableObject {
    public MouseReceptibleDrawableObject(int x,int y,int width,int height){
        super(x,y,width,height);
    }
    public void mouseScroll(float amount){

    }
    public void mouseDown(int x,int y,int button){
        
    }
   
}
