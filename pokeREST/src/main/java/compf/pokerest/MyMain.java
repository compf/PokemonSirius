package compf.pokerest;

import java.io.IOException;

import compf.core.engine.BattleRoundResult;
import compf.core.engine.BattleRule;
import compf.core.engine.BattleState;
import compf.core.engine.DetailedBattleState;
import compf.core.engine.Player;
import compf.core.engine.PlayerInput;
import compf.core.engine.PokemonBattle;
import compf.core.engine.pokemon.PokedexEntry;
import compf.core.engine.pokemon.Pokemon;
import compf.core.networking.BattleClient;
import compf.core.networking.BattleServer;
import compf.core.networking.BotInterface;
import compf.core.networking.IOInterface;
import compf.core.networking.SharedPipe;

public class MyMain {
    private static final int PLAYER_SERVER_PORT = 1997;
    private static final int BOT_SERVER_PORT = 1998;
    private static  BattleServer server;
    private static BattleClient playerClient,botClient;
    private BotInterface botInput;
    public static void main(String[] args) {

        server.waitForConnection(null);
        Thread serverThread = new Thread(() -> {
            server = new BattleServer();
            server.waitForConnection(SharedPipe.getOrCreatePipe(PLAYER_SERVER_PORT));
            server.log("First waiting finnished");
            server.waitForConnection(SharedPipe.getOrCreatePipe(BOT_SERVER_PORT));
            
        });
        Player botPlayer=new Player((short)1, "Bot",PokemonBattle.createRandomTeam());
        BotInterface botInput =new BotInterface(botPlayer);
        Player clientPlayer=new Player((short)0, "Player", PokemonBattle.createRandomTeam());
        IOInterface httpInput=new HttpInputOutputInterface(1997, BattleRule.DEFAULT_RULE);
        Thread playerThread = new Thread((() -> {
            try {
                playerClient = new BattleClient(BattleRule.DEFAULT_RULE, clientPlayer.getName(), clientPlayer.getTeam(),
                        SharedPipe.getOrCreatePipe(PLAYER_SERVER_PORT), httpInput);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }));
        playerThread.setName("Player thread");
        playerThread.start();
        Thread botThread = new Thread((() -> {
            try {
                botClient = new BattleClient(BattleRule.DEFAULT_RULE, "Bot", botPlayer.getTeam(),
                        SharedPipe.getOrCreatePipe(BOT_SERVER_PORT), botInput);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }));
        botThread.setName("Bot thread");
        botThread.start();
    }
}
