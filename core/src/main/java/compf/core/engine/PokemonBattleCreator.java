package compf.core.engine;

import compf.core.networking.*;

import java.io.IOException;

public class PokemonBattleCreator {
    private static final int PLAYER_SERVER_PORT = 1997;
    private static final int BOT_SERVER_PORT = 1998;

    public static void startPrototyp(Player clientPlayer,Player botPlayer, IOInterface myIO){
        Pipe playerPipeServer = SharedPipe.getOrCreatePipe(PLAYER_SERVER_PORT);
        Pipe botPipeServer = SharedPipe.getOrCreatePipe(BOT_SERVER_PORT);
        Thread serverThread = new Thread(() -> {
           BattleServer  server = new BattleServer();
            server.waitForConnection(playerPipeServer);
            server.log("First waiting finnished");
            server.waitForConnection(botPipeServer);

        });

        Pipe playerPipeClient = SharedPipe.getOrCreatePipe(PLAYER_SERVER_PORT);
        Pipe botPipeClient = SharedPipe.getOrCreatePipe(BOT_SERVER_PORT);
        serverThread.start();
        BotInterface botInput =new BotInterface(botPlayer,new RandomBotAI());


        Thread playerThread = new Thread((() -> {
            try {
               BattleClient playerClient = new BattleClient(BattleRule.DEFAULT_RULE, clientPlayer.getName(), clientPlayer.getTeam(),
                        playerPipeClient, myIO);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }));
        playerThread.setName("Player thread");
        playerThread.start();
        Thread botThread = new Thread((() -> {
            try {
               BattleClient botClient = new BattleClient(BattleRule.DEFAULT_RULE, "Bot", botPlayer.getTeam(),
                        botPipeClient, botInput);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }));

        botThread.setName("Bot thread");
        botThread.start();
    }
}
