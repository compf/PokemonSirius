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
/**
 * @author timoc
 * @date 15.06.18
 */
public final class SharedInformation {
	public static final int[] PokemonGenCount = { 151, 251, 386, 493, 650, 722, 808 };
	public static final int TeamSize = 6;
	public static final int MovesPerPokemonCount = 4;
	private static final String WIN_PATH = "jdbc:sqlite:veekun-pokedex.sqlite";
	private static String PATH = WIN_PATH;
	public static final int PokemonCount = 1020;
	public static final int MovesCount = PokemonCount - 100;
	private HashMap<Integer,PokedexEntry> pokemon = new HashMap<>(PokemonCount);
	private Move[] moves = new Move[MovesCount];
	public static final SharedInformation Instance = new SharedInformation();

	/**
	 * 
	 */
	private SharedInformation() {
		// TODO Auto-generated constructor stub
	}

	public void init() {

		try {

			Class.forName("org.sqlite.JDBC");
			final String sqlString = "jdbc:sqlite:lib/veekun-pokedex.sqlite";
			Connection conn = DriverManager.getConnection(sqlString);
			System.out.println(System.getProperty("user.dir"));
			try(var reader=new FileReader("lib/pokedex.json")){
				JsonObject convertedObject = new Gson().fromJson(reader, JsonObject.class);
				initPokemon(convertedObject);
			}

			initMoves(conn);
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
			// reader.beforeFirst();
			boolean firstType = true;
			Type type1 = Type.Empty;
			Type type2 = Type.Empty;
			JsonArray typeArray=object.get("types").getAsJsonArray();
			type1=Enum.valueOf(Type.class,typeArray.get(0).getAsString());
			if(typeArray.size()>1){
				type2=Enum.valueOf(Type.class,typeArray.get(1).getAsString());
			}
			// reader.beforeFirst();
			int hp, att, def, satt, sdef, speed;
			var baseStats=object.get("baseStats").getAsJsonObject();
			hp = baseStats.get("hp").getAsInt();
			att = baseStats.get("atk").getAsInt();
			def = baseStats.get("def").getAsInt();
			satt = baseStats.get("spa").getAsInt();
			sdef = baseStats.get("spd").getAsInt();
			speed = baseStats.get("spe").getAsInt();
			int nr=object.get("num").getAsInt();
			pokemon.put(nr, new PokedexEntry(nr, name, type1, type2, height, weight, hp, att, def, satt, sdef, speed));
		}

	}

	private void initMoves(Connection conn) throws SQLException {
		final MoveFactory factory = new MoveFactory();
		PreparedStatement statement = conn.prepareStatement("SELECT * FROM moves WHERE ?=id");
		for (int i = 1; i < MovesCount; i++) {
			statement.setInt(1, i);
			var reader = statement.executeQuery();
			reader.next();
			String name = reader.getString(2);
			name = Character.toUpperCase(name.charAt(0)) + name.substring(1);
			Type type = Type.parse(reader.getInt(4));
			if (type == null)
				type = Type.Normal;
			byte power = reader.getByte(5);
			byte pp = reader.getByte(6);
			byte accuracy = reader.getByte(7);
			if (accuracy == 0) {
				accuracy = 127;
			}
			byte priority = reader.getByte(8);
			byte target = reader.getByte(9);
			if (priority >= 0)
				priority++; // Prevent Zero in priority
			else
				priority--;

			int damageClass = reader.getInt(10);
			Move.MoveKind kind = null;
			if (damageClass == 1)
				kind = Move.MoveKind.Status;
			else if (damageClass == 2)
				kind = Move.MoveKind.Physical;
			else
				kind = Move.MoveKind.Special;
			final Move mv = new Move(i, name, power, pp, accuracy, priority, type, kind, Move.TargetType.find(target));
			moves[i - 1] = factory.create(mv);
			reader.close();
		}
	}

	public PokedexEntry getPokedexEntry(int nr) {
		return pokemon.get(nr );
	}

	public Move getMove(int nr) {
		if (nr == 0)
			return null;
		return moves[nr - 1];
	}

}
