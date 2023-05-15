package compf.prototype;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

import javax.net.ServerSocketFactory;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

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

public class MyHttpServer {

   static class StartBattleHandler implements HttpHandler{

        private BotInterface botInput;
        @Override
        public void handle(HttpExchange arg0) throws IOException {
            // TODO Auto-generated method stub
         
        }
        
    }
    public MyHttpServer() {
        HttpServer server;
        try {
            server = HttpServer.create(new InetSocketAddress(1998), 0);
            server.createContext("/startBattle", new StartBattleHandler());
            server.setExecutor(null); // creates a default executor
            server.start();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
     
    }
}
