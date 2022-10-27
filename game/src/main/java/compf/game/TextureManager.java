package compf.game;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.JsonReader;
import com.badlogic.gdx.utils.JsonValue;

public class TextureManager {
    private TextureManager(){}
    private HashMap<String,TextureRegion> id_textureRegion=new HashMap<>();
    private HashMap<String,Texture> id_texture=new HashMap<>();
    public static final TextureManager Instance=new TextureManager();
    public  TextureRegion getTextureRegion(String id){
        if(!id_textureRegion.containsKey(id)){
            loadData(id);
        }
        return id_textureRegion.get(id);
    }
    private void loadData(String id){
        var json=getTileData(id);
          int ox=json.getInt("ox");
          int oy=json.getInt("oy");
          int wh=json.getInt("wh");
          String spritePath=json.getString("file");
          if(!id_texture.containsKey(id)){
            id_texture.put(id, new Texture(spritePath));
          }
          Texture texture=id_texture.get(id);
          if(!id_textureRegion.containsKey(id)){
            id_textureRegion.put(id, new TextureRegion(texture,ox,oy,wh,wh));
          }
    }
    private JsonValue getTileData(String id){
        try(InputStream is=new FileInputStream("tileData.json"))
        {
            var reader=new JsonReader();
            var json=reader.parse(is);
            return json.get(id);
        }
       
        catch(FileNotFoundException ex){
            throw new Error("TileData.json could not be found");
        }
        catch(IOException ex) {
            throw new Error("TileData.json could not be read");
        }
       
    }
}
