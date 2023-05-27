package compf.core.etc.services.learnset;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import compf.core.engine.pokemon.moves.Move;
import compf.core.etc.MyObject;
import compf.core.etc.services.SharedInformation;

public class DefaultLearnsetService implements LearnsetService {
    private HashMap<String, List<String>> learnsetMap = new HashMap<>();
    private String resourceName;
    @Override
    public Iterable<String> getMoveNames(String id) {
        if(id.endsWith("-Gmax")){
            id=id.replace("-Gmax","");
        }
        var result= learnsetMap.getOrDefault(id,new ArrayList<>());
        return result;
    }
    public void init() throws  IOException{
        try (var reader = new InputStreamReader(SharedInformation.Instance.getResource(resourceName))) {
            JsonObject convertedObject = new Gson().fromJson(reader, JsonObject.class);
            initMoveset(convertedObject);
        }
    }
    String[] ignore={"missingno","gastrodoneast","rockruffdusk","syclar","syclant"};
    private void initMoveset(JsonObject jsonObj){
        for(String pokemonId:jsonObj.keySet()){
            if(MyObject.indexOf(ignore,pokemonId)!=-1)continue;;
            LinkedList<String> moveNames=new LinkedList<>();
            if(jsonObj.get(pokemonId).getAsJsonObject().has("learnset")){
                moveNames.addAll(jsonObj.get(pokemonId).getAsJsonObject().get("learnset").getAsJsonObject().keySet());
            }
            learnsetMap.put(pokemonId, moveNames);
            var entry=SharedInformation.Instance.getPokedexEntryService().get(pokemonId);
            if(entry==null){
               continue;
            }
            learnsetMap.put(String.valueOf(entry.getNr()),moveNames);
            learnsetMap.put(entry.getName(),moveNames);
        }
    }
    public DefaultLearnsetService(String resourceName){
        this.resourceName=resourceName;
    }


}
