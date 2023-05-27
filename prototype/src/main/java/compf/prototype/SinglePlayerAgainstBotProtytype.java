package compf.prototype;

import java.io.IOException;

import compf.core.engine.BattleRule;
import compf.core.engine.Player;
import compf.core.engine.PokemonBattle;
import compf.core.etc.services.*;
import compf.core.etc.services.learnset.StubLearnsetService;
import compf.core.etc.services.logging.DefaultLoggerService;
import compf.core.etc.services.move.DefaultMoveService;
import compf.core.etc.services.pokemon.DefaultPokedexEntryService;
import compf.core.etc.services.random.RealRandomGeneratorService;
import compf.core.networking.*;

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
        SharedInformation.Instance.init(new DefaultPokedexEntryService("pokedex.json"), new DefaultMoveService("moves.json"), new RealRandomGeneratorService(),
        new StubLearnsetService(),new DefaultLoggerService());

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
        BotInterface botInput =new BotInterface(botPlayer,new RandomBotAI());
       
      
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
    }
}
