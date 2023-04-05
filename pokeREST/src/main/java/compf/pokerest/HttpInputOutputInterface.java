package compf.pokerest;

import compf.core.engine.BattleAction;
import compf.core.engine.BattleRoundResult;
import compf.core.engine.BattleRule;
import compf.core.engine.BattleState;
import compf.core.engine.PlayerInput;
import compf.core.networking.IOInterface;
import compf.core.networking.Pipe;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient.Builder;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.BodyHandlers;
import java.net.http.HttpResponse.BodySubscriber;
import java.net.http.HttpResponse.ResponseInfo;
import java.time.Duration;
import java.util.LinkedList;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class HttpInputOutputInterface implements IOInterface {
    private int port;
    private BattleRule rule;

    public HttpInputOutputInterface(int port,BattleRule rule) {
        this.port=port;
        this.rule=rule;
    }

    private HttpResponse<String> sendHTTP(String endpoint, String body, boolean wait) {
        HttpClient client = HttpClient.newHttpClient();
        try {
            HttpRequest req = HttpRequest.newBuilder(new URI("http:127.0.0.1:"+port+"" + endpoint))
                    .POST(BodyPublishers.ofString(body)).timeout(Duration.ofMinutes(3)).build();

            if (wait) {
                return client.send(req, BodyHandlers.ofString());
            } else {
                client.sendAsync(req, BodyHandlers.ofString());
                
            }

        } catch (IOException | InterruptedException | URISyntaxException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void message(String msg) {
        sendHTTP("/message", msg, false);
    }

    private class UpdateWriter {
        static String update(BattleRoundResult state,BattleRule rule) {
            StringWriter writer = new StringWriter();
            var jsonWriter = new JsonWriter(writer);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("kind").value(state.Kind.toString());
                writeAllActions(state.Actions, jsonWriter);
                writeState(state.State,jsonWriter,rule);

                jsonWriter.endObject();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return writer.toString();
        }
         static void writeState(BattleState state,JsonWriter jsonWriter,BattleRule rule) throws IOException{
            jsonWriter.name("State");
            jsonWriter.beginObject();
            jsonWriter.name("BattleEnded").value(state.getDefeatedPlayer().orElse(-1));
            for(int playerId:state.getPlayerIds()){
                jsonWriter.name(String.valueOf(playerId));
                jsonWriter.beginObject();
                jsonWriter.name("name").value( state.getPlayerName(playerId));
                
                for(int pkmn=0;pkmn<rule.PokemonPerPlayerOnField;pkmn++){
                    jsonWriter.name(String.valueOf(pkmn));
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(state.getPokemonName(playerId, pkmn));
                    jsonWriter.name("stateCondition").value(state.getStateConditionString(playerId, pkmn));
                    jsonWriter.name("currHP").value(state.getCurrHp(playerId, pkmn));
                    jsonWriter.name("maxHP").value(state.getMaxHP(playerId, pkmn));

                    jsonWriter.endObject();
                }
                jsonWriter.endObject();
            }
            jsonWriter.endObject();
        }
        private static void writeAllActions(Iterable<BattleAction> actions, JsonWriter jsonWriter) throws IOException {
            jsonWriter.name("Actions");
            jsonWriter.beginArray();
            for (var action : actions) {
                writeSingleAction(action, jsonWriter);
            }
            jsonWriter.endArray();
        }

        private static void writeSingleAction(BattleAction action, JsonWriter jsonWriter) throws IOException {
            jsonWriter.beginObject();
            jsonWriter.name("ActionId").value(action.ActionId);
            jsonWriter.name("Kind").value(action.Kind.toString());
            jsonWriter.name("Data").value(action.Data == null ? "null" : action.Data.toString());
            jsonWriter.name("Messages").beginArray();
            for(String msg:action.Messages){
                jsonWriter.value(msg);
            }
            jsonWriter.endArray();
            jsonWriter.endObject();
        }
    }

    @Override
    public void update(BattleRoundResult state) {
        String request=UpdateWriter.update(state,rule);
        sendHTTP("/Update", request, false);

    }

    @Override
    public PlayerInput requestPlayerInput(short pkmnIndex, BattleState state)  {
       
        try {
            StringWriter writer=new StringWriter();
            JsonWriter jsonWriter=new JsonWriter(writer);
            jsonWriter.beginObject();
            jsonWriter.name("pokemonIndex").value(pkmnIndex);
            UpdateWriter.writeState(state, jsonWriter, rule);
            jsonWriter.endObject();


            String response=sendHTTP("/RequestPlayerInput", writer.toString(), true).body();
            
            TypeToken<Map<String,String>> mapType= new  TypeToken<Map<String,String>>(){};
            Gson gson=new Gson();
            Map<String, String> stringMap = gson.fromJson(response, mapType);
            if(stringMap.get("Kind").contentEquals("PlayerInput")){
                short pokemonIndex=Short.parseShort(stringMap.get("PokemonIndex"));
                short playerId=Short.parseShort(stringMap.get("PlayerId"));
                short moveIndex=Short.parseShort(stringMap.get("MoveIndex"));
                short targetPlayer=Short.parseShort(stringMap.get("TargetPlayer"));
                short targetPokemonIndex=Short.parseShort(stringMap.get("TargetPokemonIndex"));

                return new PlayerInput.AttackInput(pkmnIndex, moveIndex, targetPlayer, targetPokemonIndex,playerId);
            }
            else if(stringMap.get("Kind").contentEquals("SwitchPokemonInput")){
                return new PlayerInput.SwitchPokemonInput(Short.parseShort(stringMap.get("PlayerId")),Short.parseShort(stringMap.get("PokemonIndex")));
            }



        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;

    }

    @Override
    public void battleEnded(int player) {
        sendHTTP("/battleEnded", String.valueOf(player), false);
    }

    @Override
    public short switchPokemon(BattleState state, short oldIndex) {
        try {
            StringWriter writer=new StringWriter();
            JsonWriter jsonWriter=new JsonWriter(writer);
            jsonWriter.beginObject();
            jsonWriter.name("oldIndex").value(oldIndex);
            UpdateWriter.writeState(state, jsonWriter, rule);
            jsonWriter.endObject();


            String response=sendHTTP("/SwitchPokemon", writer.toString(), true).body();
            return Short.valueOf(response);
           


        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return -1;
    }

}
