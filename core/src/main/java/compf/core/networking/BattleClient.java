package compf.core.networking;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;

import compf.core.etc.services.SharedInformation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import Main;
import compf.core.engine.*;
import compf.core.engine.pokemon.Pokemon;
import compf.core.etc.BufferList;

public class BattleClient extends BaseServer implements Runnable,SteppableHost {
	private static Logger MyLogger = LogManager.getLogger();
	Pipe pipe;
	private short _playerId;
	BattleState _state;
	IOInterface _io;
	BattleRule _rule;
	Player _player;
	Thread thread;
	protected BattleClient(Player player,BattleRule rule,IOInterface io, Pipe pipe){
		this._player=player;
		this._rule=rule;
		this._io=io;
		this.pipe=pipe;
	}
	public BattleClient(BattleRule rule, String playerName, Pokemon[] team, Pipe pipe, IOInterface io)
			throws IOException {
		_rule = rule;
		MyLogger.debug("Client init");
		pipe.connect();
		this.pipe = pipe;
		NetworkMessage msg = readObject(pipe);
		if (msg.Kind != NetworkMessageKind.SendPlayerId)
			throw new IOException("Invalid message");
		_playerId = (short) msg.Data;

		_player = new Player(_playerId, playerName, team);
		SharedInformation.Instance.getLoggerService().log("Player initialized",BattleClient.class);
		SharedInformation.Instance.getLoggerService().log("Client " + _player.getName() + " Receiving player id " + _playerId,BattleClient.class);
		SharedInformation.Instance.getLoggerService().log("Client " + _player.getName() + " writing rules " + _playerId,BattleClient.class);
		writeObject(pipe, new NetworkMessage(NetworkMessageKind.BattleRules, rule));
		SharedInformation.Instance.getLoggerService().log("Client " + _player.getName() + " waiting player information " + _playerId,BattleClient.class);

		msg = readObject(pipe);
		if (msg.Kind != NetworkMessageKind.RequestPlayerInformation)
			throw new IOException("Invalid message " + msg.Kind);
		writeObject(pipe, new NetworkMessage(NetworkMessageKind.ReplyPlayerInformation, _player));
		msg = readObject(pipe);
		SharedInformation.Instance.getLoggerService().log("Update clients at beginning to inital statz",BattleClient.class);
		if (msg.Kind == NetworkMessageKind.Update) {
			MyLogger.debug("Received expected update");
			_state = ((BattleRoundResult) msg.Data).State;

		} else {
			throw new InvalidClassException("Invalid state " + msg);
		}
		_io = io;

		this.thread = new Thread(this);
		thread.setName("Client " + _playerId);
		thread.start();
	}

	public Player getPlayer() {
		return _player;
	}
	public void step(short id){
		SharedInformation.Instance.getLoggerService().log("Client waiting " + this._playerId,BattleClient.class);
		NetworkMessage msg = readObject(pipe);
		SharedInformation.Instance.getLoggerService().log("Client received " + msg.Kind.name() + " " + _playerId,BattleClient.class);
		switch (msg.Kind) {
			case RequestInputToClient:
				BufferList<PlayerInput> inputs = new BufferList<>(_rule.PokemonPerPlayerOnField);
				short pokemonIndex = (short) msg.Data;
				PlayerInput inp=null;
				do{
					inp=(PlayerInput)_io.sendAndHandle(NetworkMessageKind.RequestInputToIO.createMessage(new Tuple<Short,BattleState>(pokemonIndex,_state))).Data;

				}while (inp==null);

				SharedInformation.Instance.getLoggerService().log("Input from " + inp.PlayerId + " " + _io.getClass(),BattleClient.class);
				inputs.add(inp);
				writeObject(pipe, NetworkMessageKind.ReplyInputToServer.createMessage(inputs));
				break;
			case Update:
				var roundResult = (BattleRoundResult) msg.Data;
				_state = roundResult.State;
				_io.sendAndHandle(NetworkMessageKind.Update.createMessage(roundResult));
				if (roundResult.State.getDefeatedPlayer().isPresent()) {
					_io.sendAndHandle(NetworkMessageKind.BattleEnded.createMessage(roundResult.State.getDefeatedPlayer().get()));
				}
				break;
			case RequestPokemonSwitch:
				short oldIndex = (short) msg.Data;
				writeObject(pipe,
						NetworkMessageKind.ReplyPokemonSwitch.createMessage(_io.sendAndHandle(NetworkMessageKind.RequestPokemonSwitch.createMessage(new Tuple<Short,BattleState>(oldIndex,_state)))));

		}
	}
	public void run() {
		while (true) {
			step((short)0);
		}
	}
}
