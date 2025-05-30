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
import com.badlogic.gdx.utils.JsonReader;
import com.badlogic.gdx.utils.JsonValue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import compf.core.engine.SharedInformation;

public class ScrollableTilesets extends MouseReceptibleDrawableObject {
    public ScrollableTilesets() {
        super(0, 0, tileWidth, 2000);
    }

    private static final int tileWidth = 64;
    private static final int tileHeight = tileWidth;

    @Override
    public void init() {
        int y = getX();
        int x = getY();
        var dir = new java.io.File("./tiles/");
        JsonValue json=getTileData();
        for (var jsonChild:json.iterator()) {

            String id=jsonChild.name;
            CollidableObject obj = new CollidableObject(x, y, tileWidth, tileHeight, id);
            y += tileHeight;
            tiles.add(obj);
        }
    }
    private JsonValue getTileData(){
        try(InputStream is=new FileInputStream("tileData.json"))
        {
            var reader=new JsonReader();
            var json=reader.parse(is);
            return json;
        }
       
        catch(FileNotFoundException ex){
            throw new Error("TileData.json could not be found");
        }
        catch(IOException ex) {
            throw new Error("TileData.json could not be read");
        }
       
    }
    private ArrayList<CollidableObject> tiles = new ArrayList<>();

    @Override
    public void render(SpriteBatch batch) {
        for (CollidableObject coll : tiles) {
            coll.render(batch);
        }
    }

    @Override
    public void mouseScroll(float amount) {
        final int dy = 10;
        for (var obj : tiles) {
            obj.setY(obj.getY() + (int) (dy * amount));
        }
    }
}
