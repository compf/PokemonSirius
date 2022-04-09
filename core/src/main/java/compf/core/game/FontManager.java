package compf.core.game;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

import java.util.HashMap;

public class FontManager {
    private FontManager(){}
    public static FontManager Instance=new FontManager();
    private HashMap<Color,BitmapFont> colorFontMap=new HashMap<>();
    public BitmapFont getFontByColor(Color color){
        if(colorFontMap.containsKey(color)){
            return colorFontMap.get(color);
        }
        else{
            BitmapFont font=new BitmapFont();
            font.setColor(color);
            colorFontMap.put(color,font);
            return  font;
        }
    }
}
