package compf.core.etc.services.pokemon;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import compf.core.engine.pokemon.PokedexEntry;
import compf.core.engine.pokemon.Type;
import compf.core.etc.services.SharedInformation;

public class DefaultPokedexEntryService implements PokedexEntryService {

    public DefaultPokedexEntryService(String resourceName) throws IOException{
    try(var reader=new InputStreamReader(SharedInformation.Instance.getResource(resourceName))){
        JsonObject convertedObject = new Gson().fromJson(reader, JsonObject.class);
        initPokemon(convertedObject);
    }
    }
    @Override
    public PokedexEntry get(int nr) {
		return pokemonMap.get(String.valueOf(nr) );
	}
    @Override
	public PokedexEntry get(String name) {
		return pokemonMap.get(name);
	}

	@Override
	public int getMaxIndex() {
		return maxNr;
	}

    private final HashMap<String,PokedexEntry> pokemonMap = new HashMap<>();
	private int maxNr;
    @Override
    public Iterator<PokedexEntry> iterator() {
       return pokemonMap.values().iterator();
    }
    private boolean shallExclude(JsonObject object ){
		return object.has("baseSpecies");
	}
	private void initPokemon(JsonObject fullData)  {
		
		for(String id:fullData.keySet())
		 {
			var object=fullData.get(id).getAsJsonObject();
			if(shallExclude(fullData)){
				continue;
			}

			float height = object.get("heightm").getAsFloat();
			float weight = object.get("weightkg").getAsFloat();;
			Type type1 ;
			Type type2 = Type.Empty;
			JsonArray typeArray=object.get("types").getAsJsonArray();
			type1=Enum.valueOf(Type.class,typeArray.get(0).getAsString());
			if(typeArray.size()>1){
				type2=Enum.valueOf(Type.class,typeArray.get(1).getAsString());
			}
			int hp, att, def, satt, sdef, speed;
			var baseStats=object.get("baseStats").getAsJsonObject();
			hp = baseStats.get("hp").getAsInt();
			att = baseStats.get("atk").getAsInt();
			def = baseStats.get("def").getAsInt();
			satt = baseStats.get("spa").getAsInt();
			sdef = baseStats.get("spd").getAsInt();
			speed = baseStats.get("spe").getAsInt();
			int nr=object.get("num").getAsInt();
			maxNr=Math.max(nr,maxNr);
			if(nr<=0)continue;;
			String realName=object.get("name").getAsString();

			var entry=new PokedexEntry(nr, realName, type1, type2, height, weight, hp, att, def, satt, sdef, speed);
			pokemonMap.put(String.valueOf(nr),entry);
			pokemonMap.put(realName,entry);
			pokemonMap.put(id,entry);

		}

	}


	@Override
	public int getNr(String key) {
		return  pokemonMap.get(key).getNr();
	}

	@Override
	public String getRealName(String key) {
		return pokemonMap.get(key).getName();
	}


}
