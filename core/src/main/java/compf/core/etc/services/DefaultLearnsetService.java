package compf.core.etc.services;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class DefaultLearnsetService implements LearnsetService {
    private HashMap<String, List<String>> pokemonIdMoves = new HashMap<>();

    @Override
    public Iterable<String> getMoves(String id) {
        // TODO Auto-generated method stub
        return pokemonIdMoves.getOrDefault(id,new ArrayList<>());
    }
    private void initMoveset(JsonObject jsonObj){
        for(String pokemonId:jsonObj.keySet()){
            LinkedList<String> moves=new LinkedList<>();
            if(jsonObj.get(pokemonId).getAsJsonObject().has("learnset")){
                for(String moveId:jsonObj.get(pokemonId).getAsJsonObject().get("learnset").getAsJsonObject().keySet()){
                    moves.add(moveId);
                }
            }
           
            pokemonIdMoves.put(pokemonId, moves);
        }
    }
    public DefaultLearnsetService(String resourceName) throws IOException {
        try (var reader = new InputStreamReader(SharedInformation.Instance.getResource(resourceName))) {
            JsonObject convertedObject = new Gson().fromJson(reader, JsonObject.class);
            initMoveset(convertedObject);
        }
    }

}
