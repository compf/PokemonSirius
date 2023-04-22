package compf.core.engine;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.FileReader;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

import compf.core.engine.pokemon.*;
import compf.core.engine.pokemon.moves.*;
import compf.core.engine.pokemon.moves.Move.MoveKind;
import netscape.javascript.JSObject;
/**
 * @author timoc
 * @date 15.06.18
 */
public final class SharedInformation {
	public static final int[] PokemonGenCount = { 151, 251, 386, 493, 650, 722, 808 };
	public static final int TeamSize = 6;
	public static final int MovesPerPokemonCount = 4;

	public static final int PokemonCount = 1020;
	public static final int MovesCount = PokemonCount ;
	private HashMap<Integer,PokedexEntry> nrPokemon = new HashMap<>(PokemonCount);
	private HashMap<String,PokedexEntry> namePokemon = new HashMap<>(PokemonCount);

	private HashMap<Integer,Move> nrMove =  new HashMap<>(MovesCount);
	private HashMap<String,Move> nameMove =  new HashMap<>(MovesCount);

	public static final SharedInformation Instance = new SharedInformation();

	/**
	 * 
	 */
	private SharedInformation() {
		// TODO Auto-generated constructor stub
	}

	public void init() {

		try {

			System.out.println(System.getProperty("user.dir"));
			try(var reader=new FileReader("lib/pokedex.json")){
				JsonObject convertedObject = new Gson().fromJson(reader, JsonObject.class);
				initPokemon(convertedObject);
			}
			try(var reader=new FileReader("lib/moves.json")){
				JsonObject convertedObject = new Gson().fromJson(reader, JsonObject.class);
				initMoves(convertedObject);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new Error(e.getMessage());
		}
	}
	private boolean shallExclude(JsonObject object ){
		return object.has("baseSpecies");
	}
	private void initPokemon(JsonObject fullData) throws SQLException {
		
		for(String name:fullData.keySet())
		 {
			var object=fullData.get(name).getAsJsonObject();
			if(shallExclude(fullData)){
				continue;
			}

			float height = object.get("heightm").getAsFloat();
			float weight = object.get("weightkg").getAsFloat();;
			Type type1 = Type.Empty;
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
			var entry=new PokedexEntry(nr, name, type1, type2, height, weight, hp, att, def, satt, sdef, speed);
			nrPokemon.put(nr,entry );
			namePokemon.put(name,entry);
		}

	}

	private void initMoves(JsonObject fullData) throws SQLException {
		final MoveFactory factory = new MoveFactory();
		for (String name:fullData.keySet()) {
			var object=fullData.get(name).getAsJsonObject();
			Type type = Enum.valueOf(Type.class, object.get("type").getAsString());
			if (type == null)
				type = Type.Normal;
			byte power = object.get("basePower").getAsByte();
			byte pp = object.get("pp").getAsByte();
			String accuracyStr = object.get("accuracy").getAsString();
			byte accuracy;
			if (accuracyStr.contentEquals("true")) {
				accuracy = 100;
			}else{
				accuracy=Byte.valueOf(accuracyStr);
			}
			byte priority = object.get("priority").getAsByte();
			Move.TargetType target = Enum.valueOf(Move.TargetType.class,object.get("target").getAsString());
			if (priority >= 0)
				priority++; // Prevent Zero in priority
			else
				priority--;

			String damageClass = object.get("category").getAsString();
			Move.MoveKind kind = Enum.valueOf(MoveKind.class, damageClass);
			int nr=object.get("num").getAsInt();
			final Move mv = new Move(nr, name, power, pp, accuracy, priority, type, kind, target);
			nrMove.put(nr,factory.create(mv));
			nameMove.put(name,mv);
		}
	}

	public PokedexEntry getPokedexEntry(int nr) {
		return nrPokemon.get(nr );
	}
	public PokedexEntry getPokedexEntry(String name) {
		System.out.println("entry "+name);
		return namePokemon.get(name);
	}

	public Move getMove(int nr) {
		return nrMove.get(nr);
	}
	public Move getMove(String name) {
		return nameMove.get(name);
	}

}
