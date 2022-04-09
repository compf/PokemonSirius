package compf.core.game.menu;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import compf.core.game.FontManager;
import compf.core.game.Settings;

public class MainMenu extends BaseMenu<String> {
    static String[] menuItems={"Pokemon","Bag","Save"};
    private ShapeRenderer renderer;
    public MainMenu() {
        super(MAIN_MENU_X,MAIN_MENU_Y,MAIN_MENU_WIDTH,MAIN_MENU_HEIGHT);
        renderer=new ShapeRenderer();
    }
    static final  int  MAIN_MENU_X=300,MAIN_MENU_Y=300,MAIN_MENU_WIDTH=100,MAIN_MENU_HEIGHT=300;
    final
    @Override
    public void itemSelected() {
        // do nothing
    }
    @Override
    public String[] getItems(){
        return menuItems;
    }
    @Override
    public void render(SpriteBatch batch) {

       batch.draw(RectTexture,getX(),getY(),getWidth(),getHeight());
        int x=getX()+10;
        int y=getY()+getWidth()+30;
        final int dy=+50;
        for(String item:menuItems){
            BitmapFont font;
            if(item.equals(getCurrItem())){
               font= FontManager.Instance.getFontByColor(Color.RED);
            }
            else{
                font=FontManager.Instance.getFontByColor(Color.BLACK);
            }


            font.draw(batch,item,x,y);
            y-=dy;

        }

        super.render(batch);
    }

}
