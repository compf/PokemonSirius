package compf.core.networking;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import compf.core.engine.*;
import compf.core.etc.BufferList;
import compf.core.etc.MyObject;

public class BattleServer extends BaseServer {

	private short _globalId = 0;
	private HashMap<Short, Pipe> pipes = new HashMap<>();
	private HashMap<Short, Thread> _threads = new HashMap<>();
	private HashMap<Short, Boolean> _isPlaying = new HashMap<>();
	private HashMap<Short, BattleRule> _rules = new HashMap<>();
	private HashMap<Short, PokemonBattle> _battles = new HashMap<>();
	private HashMap<Short, Player> _players = new HashMap<>();
	private ArrayList<Short> _playerIds = new ArrayList<>();

	public BattleServer()  {
	}

	public void waitForConnection(Pipe pipe)  {

			System.out.println("Server wait for connection");
			Pipe socket=pipe.waitForConnection();
		System.out.println("Server connected");

		short playerId = _globalId++;
			Thread thread = new Thread(() -> this.run(playerId));
			thread.setName("Server "+playerId);
			pipes.put(playerId, pipe);
			_playerIds.add(playerId);
			_threads.put(playerId, thread);
		System.out.println("Server is running "+playerId);
		System.out.println("Server sending player id "+playerId);
		writeObject(pipes.get(playerId), new NetworkMessage(NetworkMessageKind.SendPlayerId, playerId));
			NetworkMessage msg=readObject(pipe);
			if(msg.Kind==NetworkMessageKind.BattleRules){
				_rules.put(playerId,(BattleRule) msg.Data);
				processBattleRule(playerId);
			}
			thread.start();




	}
	public  class Interrupt{
		/**
		 * Forces the client to switch the pokemon
		 * @param playerId The player that must switch the pokemon
		 * @param pokemonIndex The index of the Pokemon to be switched
		 * @return The index of the replaced pokemon in the team or -1 on errors
		 */
		public short forceSwitch(short playerId,short pokemonIndex) {
			writeObject(pipes.get(playerId), NetworkMessageKind.RequestPokemonSwitch.createMessage(pokemonIndex));
			NetworkMessage msg=readObject(pipes.get(playerId));
			if(msg.Kind==NetworkMessageKind.ReplyPokemonSwitch) {
				return (short) msg.Data;
			}
			return -1;
		}
	}
	private void processBattleRule(short playerId){
		var result = _rules.entrySet().stream().filter((ent) -> !_isPlaying.getOrDefault(ent.getKey(), false))
				.collect(Collectors.groupingBy((entry) -> entry.getValue())).entrySet().stream()
				.filter((entry) -> entry.getValue().size() >= entry.getKey().NumberPlayers).toArray();

		for (var res : result) {
			var r = (HashMap.Entry<BattleRule, List<HashMap.Entry<Short, BattleRule>>>) res;
			var rl = (BattleRule) r.getKey();
			var ids = (Object[]) r.getValue().stream().map((entry) -> entry.getKey()).toArray();
			PokemonBattle battle = new PokemonBattle(rl);
			System.out.println("Num players" + rl.NumberPlayers);
			for (Object obj : ids) {
				System.out.println("putting battle "+obj +" playerID "+playerId);
				_battles.putIfAbsent((short)obj,battle);

				writeObject(pipes.get(obj),
						new NetworkMessage(NetworkMessageKind.RequestPlayerInformation, null));
			}
		}
	}
	public  void run(short playerId) {


		var input = pipes.get(playerId);

		var output = pipes.get(playerId);
		while (true) {
			System.out.println("Server waiting for data from  " +playerId);;
			NetworkMessage msg = readObject(input);
			System.out.println("Server reveived "+msg.Kind +" from "+playerId);;
			MyObject.nop();
			System.out.println(msg.Kind.name()+" " + playerId);
			switch (msg.Kind) {

			case ReplyPlayerInformation: {

				var pl = (Player) msg.Data;
				_players.put(playerId, pl);
				var battle = _battles.get(playerId);
				battle.getPlayers().add(pl);

				System.out.println("Size "+battle.getPlayers().size());
				if (battle.getPlayers().isFull()) {
					System.out.println("full "+playerId);

						System.out.println("Player id "+playerId);
						var outp = pipes.get(playerId);
						writeObject(outp,
								NetworkMessageKind.Update.createMessage(new BattleRoundResult(null,new DetailedBattleState(battle.getPlayers()),null)));
						writeObject(outp,NetworkMessageKind.RequestInput.createMessage());


				}
			}
			break;
			case ReplyInput: {
				Interrupt interrupt=new Interrupt();
				BufferList<PlayerInput> inputs = (BufferList<PlayerInput>) msg.Data;
				for (var inp : inputs) {
					System.out.println("deb "+inp.PlayerId);
					var battle = _battles.get(inp.PlayerId);
					battle.addInput(inp);
					var rule=_rules.get(inp.PlayerId);
					// TODO what if pokemon field is vacant?
					if(battle.allPlayerGaveInput(rule.NumberPlayers*rule.PokemonPerPlayerOnField)) {
						battle.incrementRound();
						var state=battle.executeSchedule(interrupt);
						System.out.println("All submitted");
						var out_msg=NetworkMessageKind.Update.createMessage(state);
						var inp_msg=NetworkMessageKind.RequestInput.createMessage();

							writeObject(input,out_msg);
							writeObject(input,inp_msg);

						
					
					}
				}
				

			}

			}
		}
	}
}
