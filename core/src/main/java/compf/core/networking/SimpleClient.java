package compf.core.networking;

import java.io.IOException;

import compf.core.engine.BattleRule;
import compf.core.engine.SharedInformation;
import compf.core.engine.pokemon.Pokemon;
import compf.core.etc.MyObject;


public class SimpleClient {

	static BattleServer server;
	static BattleClient client;

	public static void main(String[] args) {
		/*SharedInformation.Instance.init();
		if (args[0].contentEquals("server")) {
			int port = Integer.parseInt(args[1]);
			try {
				server = new BattleServer(port);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (args[0].contentEquals("client")) {
			String host = args[1];
			int port = Integer.parseInt(args[2]);
			BattleRule rule = new BattleRule(Integer.parseInt(args[3]), Integer.parseInt(args[4]),
					Integer.parseInt(args[5]), Integer.parseInt(args[6]));
			;
			String name = args[7];
			try {
				client = new BattleClient(host, port, rule, name, createRandomTeam());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
	}

	public static Pokemon[] createRandomTeam() {
		var team = new Pokemon[6];
		for (int i = 0; i < 6; i++) {
			team[i] = new Pokemon(SharedInformation.Instance
					.getPokedexEntry(1 + MyObject.RNG.nextInt(SharedInformation.PokemonCount - 1)));
		}
		return team;
	}

}
