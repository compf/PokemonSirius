package compf.prototype;

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
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.nio.ByteBuffer;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.Duration;
import java.util.LinkedList;
import java.util.Map;

import javax.net.ServerSocketFactory;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/*public class MyClient implements IOInterface {

    private BattleRule rule;
    private Socket socket;

    public MyClient( BattleRule rule, Socket socket) {

        this.rule = rule;
        // this.serverSocket=
        // ServerSocketFactory.getDefault().createServerSocket(port,1,InetAddress.getLocalHost());
        this.socket = socket;

    }

    private String sendData(String endpoint, String body, boolean wait) {
        final int ENDPOINT_LENGTH_SIZE=2;
        final int BODY_LENGTH_SIZE=4;
        ByteBuffer buffer=ByteBuffer.allocate(endpoint.length()+body.length()+ENDPOINT_LENGTH_SIZE+BODY_LENGTH_SIZE);
        buffer.putShort((short)endpoint.length());
        buffer.put(endpoint.getBytes());
        buffer.putInt(body.length());
        buffer.put(body.getBytes());
        try {
            socket.getOutputStream().write(buffer.array());
            if(wait){
                return new String( socket.getInputStream().readAllBytes());
            }
           
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
     return null;
    }

    @Override
    public void message(String msg) {
        sendData("/message", msg, false);
    }

    private class UpdateWriter {
        static String update(BattleRoundResult state, BattleRule rule) {
            StringWriter writer = new StringWriter();
            var jsonWriter = new JsonWriter(writer);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("kind").value(state.Kind.toString());
                writeAllActions(state.Actions, jsonWriter);
                writeState(state.State, jsonWriter, rule);

                jsonWriter.endObject();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return writer.toString();
        }

        static void writeState(BattleState state, JsonWriter jsonWriter, BattleRule rule) throws IOException {
            jsonWriter.name("State");
            jsonWriter.beginObject();
            jsonWriter.name("BattleEnded").value(state.getDefeatedPlayer().orElse(-1));
            for (int playerId : state.getPlayerIds()) {
                jsonWriter.name(String.valueOf(playerId));
                jsonWriter.beginObject();
                jsonWriter.name("name").value(state.getPlayerName(playerId));

                for (int pkmn = 0; pkmn < rule.PokemonPerPlayerOnField; pkmn++) {
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
            for (String msg : action.Messages) {
                jsonWriter.value(msg);
            }
            jsonWriter.endArray();
            jsonWriter.endObject();
        }
    }

    @Override
    public void update(BattleRoundResult state) {
        String request = UpdateWriter.update(state, rule);
        sendData("/Update", request, false);

    }

    @Override
    public PlayerInput requestPlayerInput(short pkmnIndex, BattleState state) {

        try {
            StringWriter writer = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(writer);
            jsonWriter.beginObject();
            jsonWriter.name("pokemonIndex").value(pkmnIndex);
            UpdateWriter.writeState(state, jsonWriter, rule);
            jsonWriter.endObject();

            String response = sendData("/RequestPlayerInput", writer.toString(), true);

            TypeToken<Map<String, String>> mapType = new TypeToken<Map<String, String>>() {
            };
            Gson gson = new Gson();
            Map<String, String> stringMap = gson.fromJson(response, mapType);
            if (stringMap.get("Kind").contentEquals("PlayerInput")) {
                short pokemonIndex = (short) Float.parseFloat(stringMap.get("PokemonIndex"));
                short playerId = (short) Float.parseFloat(stringMap.get("PlayerId"));
                short moveIndex = (short) Float.parseFloat(stringMap.get("MoveIndex"));
                short targetPlayer = (short) Float.parseFloat(stringMap.get("TargetPlayer"));
                short targetPokemonIndex = (short) Float.parseFloat(stringMap.get("TargetPokemonIndex"));

                return new PlayerInput.AttackInput(pkmnIndex, moveIndex, targetPlayer, targetPokemonIndex, playerId);
            } else if (stringMap.get("Kind").contentEquals("SwitchPokemonInput")) {
                return new PlayerInput.SwitchPokemonInput((short) Float.parseFloat(stringMap.get("PlayerId")),
                        (short) Float.parseFloat(stringMap.get("PokemonIndex")));
            }

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;

    }

    @Override
    public void battleEnded(int player) {
        sendData("/battleEnded", String.valueOf(player), false);
    }

    @Override
    public short switchPokemon(BattleState state, short oldIndex) {
        try {
            StringWriter writer = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(writer);
            jsonWriter.beginObject();
            jsonWriter.name("oldIndex").value(oldIndex);
            UpdateWriter.writeState(state, jsonWriter, rule);
            jsonWriter.endObject();

            String response = sendData("/SwitchPokemon", writer.toString(), true);
            return Short.valueOf(response);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return -1;
    }

}*/