package compf.core.etc.services;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import compf.core.engine.pokemon.Type;
import compf.core.engine.pokemon.moves.Move;
import compf.core.engine.pokemon.moves.MoveFactory;
import compf.core.engine.pokemon.moves.Move.MoveKind;

public class DefaultMoveService implements MoveService {

    private HashMap<Integer,Move> nrMove =  new HashMap<>();
	private HashMap<String,Move> realNameMove =  new HashMap<>();
	private HashMap<String,String> idRealName=new HashMap<>();
    public DefaultMoveService(String resource) throws IOException{
        try(var reader=new InputStreamReader(SharedInformation.Instance.getResource(resource))){
            JsonObject convertedObject = new Gson().fromJson(reader, JsonObject.class);
            initMoves(convertedObject);
        }
        
    }

	@Override
	public int getCount() {
		return nrMove.size();
	}

    public Move get(int nr) {
		return nrMove.get(nr);
	}
	public Move get(String name) {
		return realNameMove.get(name);
	}
	@Override
	public String getRealName(String id) {
		return idRealName.get(id);
	}
    @Override
    public Iterator<Move> iterator() {
        return nrMove.values().iterator();
    }

	private void initMoves(JsonObject fullData)  {
		final MoveFactory factory = new MoveFactory();
		for (String id:fullData.keySet()) {
			var object=fullData.get(id).getAsJsonObject();
			Type type = Enum.valueOf(Type.class, object.get("type").getAsString());

			int power = object.get("basePower").getAsInt();
			int pp = object.get("pp").getAsInt();
			String accuracyStr = object.get("accuracy").getAsString();
			byte accuracy;
			if (accuracyStr.contentEquals("true")) {
				accuracy = 100;
			}else{
				accuracy=Byte.valueOf(accuracyStr);
			}
			int priority = object.get("priority").getAsInt();
			Move.TargetType target = Enum.valueOf(Move.TargetType.class,object.get("target").getAsString());
			if (priority >= 0)
				priority++; // Prevent Zero in priority
			else
				priority--;

			String damageClass = object.get("category").getAsString();
			Move.MoveKind kind = Enum.valueOf(MoveKind.class, damageClass);
			int nr=object.get("num").getAsInt();
			String realName=object.get("name").getAsString();
			final Move mv = new Move(nr, realName, power, pp, accuracy, priority, type, kind, target);
			nrMove.put(nr,factory.create(mv));
			idRealName.put(id, realName);
			realNameMove.put(realName,mv);
		}
	}
}
