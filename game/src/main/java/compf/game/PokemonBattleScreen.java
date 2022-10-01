package compf.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import compf.Main;
import compf.core.engine.*;
import compf.core.engine.Player;
import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.moves.Move;
import compf.game.menu.BaseMenu;
import compf.game.menu.MainMenu;
import compf.core.networking.*;

import java.awt.*;
import java.awt.geom.Point2D;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Semaphore;
import java.util.function.BiPredicate;


public class PokemonBattleScreen extends HierarchicalObject {
    public enum MenuMode {MainMenu, Battle, Pokemon, Bag}
    private Thread serverThread,playerThread,botThread;
    public PokemonBattleScreen(int x, int y, int width, int height, Player player, Player enemy) {
        super(x, y, width, height);
        this.player = player;
        hpBarTextures = new Texture[]{getPixmapTexture(Color.GREEN), getPixmapTexture(Color.YELLOW), getPixmapTexture(Color.RED)};
        myInfo = new PokemonInfo(400, 120, player.getCurrPokemon());
        enemyInfo = new PokemonInfo(200, 400, enemy.getCurrPokemon());
        addChild(myInfo);
        addChild(enemyInfo);

        var battleRule = new BattleRule(2, 1, 6, 1);
        battle = new PokemonBattle(battleRule);
        battle.init();
        serverThread=new Thread(()->{
            server=new BattleServer();
            server.waitForConnection(SharedPipe.getOrCreatePipe(PLAYER_SERVER_PORT));
            System.out.println("First waiting finnished");
            server.waitForConnection(SharedPipe.getOrCreatePipe(BOT_SERVER_PORT));
        });
        serverThread.setName(("Server base thread"));

        serverThread.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Sleep finnished");
        botPlayer=enemy;
        playerInput = new BattleControl(60, 60, 250, 150);
        botInput=new BotInterface(botPlayer);

        playerThread=new Thread((()-> {
            try {
                playerClient = new BattleClient(battleRule, player.getName(), player.getTeam(), SharedPipe.getOrCreatePipe(PLAYER_SERVER_PORT), playerInput);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }));
        playerThread.setName("Player thread");
        playerThread.start();
        botThread=new Thread((()-> {
            try {
                botClient = new BattleClient(battleRule, "Bot",botPlayer.getTeam(), SharedPipe.getOrCreatePipe(BOT_SERVER_PORT), botInput);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }));
        botThread.setName("Bot thread");
        botThread.start();
        this.addChild(playerInput);
    }
    public PokemonBattleScreen(int x, int y, int width, int height, Player player, Pokemon enemy) {
       this(x,y,width,height,player,new Player((short)1,"Wild " + enemy.getName(),new Pokemon[]{enemy,null,null,null,null,null}));



    }

    private Player player,botPlayer;
    private IOInterface botInput;
    private  BattleControl playerInput;
    private BattleServer server;
    private BattleClient playerClient, botClient;

    private static String[] menuItems = {"Battle", "Pokemon", "Bag", "Run"};


    public static final int PLAYER_SERVER_PORT = 1997;
    public static  final int BOT_SERVER_PORT=1998;
    private PokemonBattle battle;
    private PokemonInfo myInfo, enemyInfo;
    private final Texture[] hpBarTextures;
    private Textbox promptBox = new Textbox(80, 80, 150, 80);

    public class BattleControl extends BaseMenu<String> implements IOInterface {

        private String[] moveItems=new String[4];
        @Override
        public String[] getItems(){
            if(menuMode== MenuMode.MainMenu){
                return menuItems;
            }
            else {
                return moveItems;
            }
        }
        public void endBattle(){
            Main.goBack();
        }
        protected BattleControl(int x, int y, int width, int height) {
            super(x, y, width, height);
            for(int i=0;i<4;i++){
                Move mv=player.getCurrPokemon().getMoves()[i];
                if(mv!=null){
                    moveItems[i]=mv.getName();
                }

            }
            try {
                blockObject.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }


        private final UpperLimitedSemaphore  blockObject = new UpperLimitedSemaphore(1);
        private MenuMode menuMode = MenuMode.MainMenu;

        @Override
        public  void itemSelected() {
            System.out.println("Item selected "+menuMode);
            if (menuMode == MenuMode.MainMenu && getCurrIndex() == 0) {
                this.menuMode=MenuMode.Battle;

            } else if (menuMode == MenuMode.Battle) {
                System.out.println("Releasing sem by " +Thread.currentThread().getName() );
                blockObject.release();
                menuMode=MenuMode.MainMenu;
                setCurrIndex(0);

            }
        }

        @Override
        public void message(String msg) {
            promptBox.writeString(msg);
        }


        public void update(BattleRoundResult state) {

           // System.out.println("Battle control update");

        }
        final int Diff=160;
        private MyPoint[] menuItemPos=new MyPoint[] {
                new MyPoint(getX() + 10, getY() + 10),
                new MyPoint(getX() + Diff, getY() + 10),
                new MyPoint(getX() + 10, getY() + Diff),
                new MyPoint(getX() + Diff, getY() + Diff)
        };
        @Override
        public void render(SpriteBatch batch){
            batch.draw(RectTexture,getX(),getY(),getWidth(),getHeight());

            final int dy=+50;
            for(int i=0;i<4;i++){
                String item=getItems()[i];
                if(item==null){
                    continue;
                }
                var pos=menuItemPos[i];
                BitmapFont font;
                if(item.equals(getCurrItem())){
                    font= FontManager.Instance.getFontByColor(Color.RED);
                }
                else{
                    font=FontManager.Instance.getFontByColor(Color.BLACK);
                }


                font.draw(batch,item,pos.x,pos.y);
                y-=dy;

            }
        }

        @Override
        public void setLock(boolean val) {

        }


        public synchronized PlayerInput requestPlayerInput(short pkmnIndex, BattleState state) {
            try {
                System.out.println(Thread.currentThread().getName()+ "waiting for sema");
                blockObject.acquire();
                short moveIndex = (short) getCurrIndex(), targetPlayer = 1, targetPokemon = 0;
                System.out.println("Player id released "+player.getPlayerId());
                return new PlayerInput.AttackInput(pkmnIndex, moveIndex, targetPlayer, targetPokemon, player.getPlayerId());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }


        public short switchPokemon(BattleState state, short oldIndex) {
            return 0;
        }
    }

    public class PokemonInfo extends DrawableObject {
        private static final int INFO_WIDTH = 400, INFO_HEIGHT = 300;
        private BitmapFont blackFont = FontManager.Instance.getFontByColor(Color.BLACK);
        private Pokemon pokemon;

        protected PokemonInfo(int x, int y, Pokemon pkmn) {
            super(x, y, INFO_WIDTH, INFO_HEIGHT);
            this.pokemon = pkmn;
        }

        @Override
        public void render(SpriteBatch batch) {
            drawHPBar(batch);
            blackFont.draw(batch, pokemon.getName(), getX(),getY()+40);
        }

        private void drawHPBar(SpriteBatch batch) {

            final int height = 10;
            final int maxWidth = 100;
            int textureIndex = 0;
            float perc = ((float) pokemon.getCurrHP()) / (pokemon.getMaxHP());
            if (perc < 0.25) textureIndex = 2;
            else if (perc < 0.5) textureIndex = 1;
            batch.draw(hpBarTextures[textureIndex], getX() + 10, getY() + 10, maxWidth * perc, height);
            blackFont.draw(batch, pokemon.getCurrHP() + "/" + pokemon.getMaxHP(), getX() + maxWidth + 30, getY() +40);

        }
    }
}
