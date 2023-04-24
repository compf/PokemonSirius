package compf.prototype;

import java.io.IOException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import javax.net.ServerSocketFactory;
import compf.core.engine.BattleRoundResult;
import compf.core.engine.BattleRule;
import compf.core.engine.BattleState;
import compf.core.engine.DetailedBattleState;
import compf.core.engine.Player;
import compf.core.engine.PlayerInput;
import compf.core.engine.PokemonBattle;
import compf.core.engine.pokemon.PokedexEntry;
import compf.core.engine.pokemon.Pokemon;
import compf.core.etc.services.DefaultMoveService;
import compf.core.etc.services.DefaultPokedexEntryService;
import compf.core.etc.services.RealRandomGeneratorService;
import compf.core.etc.services.SharedInformation;
import compf.core.networking.BattleClient;
import compf.core.networking.BattleServer;
import compf.core.networking.BotInterface;
import compf.core.networking.ConsolePrompt;
import compf.core.networking.IOInterface;
import compf.core.networking.SharedPipe;

public class SinglePlayerAgainstBotProtytype {
    static int getPort(){
        final int CLIENT_IO_PORT=1997;
        return CLIENT_IO_PORT;
    }
    private static final int PLAYER_SERVER_PORT = 1997;
    private static final int BOT_SERVER_PORT = 1998;
    private static  BattleServer server;
    private static BattleClient playerClient,botClient;
    public static void main(String[] args) throws IOException {
        SharedInformation.Instance.init(new DefaultPokedexEntryService("pokedex.json"), new DefaultMoveService("moves.json"), new RealRandomGeneratorService());

      if(args.length==0 || args[0].contentEquals("consoleRandom")){
        Player botPlayer=new Player((short)1, "Bot",PokemonBattle.createRandomTeam());
        Player clientPlayer=new Player((short)0, "Player", PokemonBattle.createRandomTeam());

        startPrototyp(clientPlayer,botPlayer,new ConsolePrompt(BattleRule.DEFAULT_RULE,clientPlayer));
      }
    }
    private static void startPrototyp(Player clientPlayer,Player botPlayer, IOInterface myIO){
        Thread serverThread = new Thread(() -> {
            server = new BattleServer();
            server.waitForConnection(SharedPipe.getOrCreatePipe(PLAYER_SERVER_PORT));
            server.log("First waiting finnished");
            server.waitForConnection(SharedPipe.getOrCreatePipe(BOT_SERVER_PORT));
            
        });
        serverThread.start();
        BotInterface botInput =new BotInterface(botPlayer);
       
      
        Thread playerThread = new Thread((() -> {
            try {
                playerClient = new BattleClient(BattleRule.DEFAULT_RULE, clientPlayer.getName(), clientPlayer.getTeam(),
                        SharedPipe.getOrCreatePipe(PLAYER_SERVER_PORT), myIO);
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
        System.out.println("Hello World");
    }
}
