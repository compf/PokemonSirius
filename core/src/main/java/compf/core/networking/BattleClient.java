package compf.core.networking;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import Main;
import compf.core.engine.*;
import compf.core.engine.pokemon.Pokemon;
import compf.core.etc.BufferList;


public class BattleClient extends BaseServer implements Runnable {
	private static Logger MyLogger=LogManager.getLogger();
	Pipe pipe;
	private short _playerId;
	BattleState _state;
	IOInterface _io;
	BattleRule _rule;
	Player _player;
	Thread thread;
	public BattleClient( BattleRule rule, String playerName, Pokemon[] team,Pipe pipe,IOInterface io) throws IOException {
		_rule=rule;
		MyLogger.debug("Client init");
		pipe.connect();
		this.pipe=pipe;
		NetworkMessage msg=readObject(pipe);
		if(msg.Kind!= NetworkMessageKind.SendPlayerId)throw new IOException("Invalid message");
		_playerId=(short)msg.Data;

		_player=new Player(_playerId,playerName,team);
		System.out.println("Player initialized");
		MyLogger.debug("Client " +_player.getName()+ " Receiving player id " +_playerId );
		MyLogger.debug("Client " +_player.getName()+ " writing rules "+_playerId   );
		writeObject(pipe,new NetworkMessage(NetworkMessageKind.BattleRules, rule));
		MyLogger.debug("Client " +_player.getName()+ " waiting player information "+_playerId   );

		msg=readObject(pipe);
		if(msg.Kind!= NetworkMessageKind.RequestPlayerInformation)throw new IOException("Invalid message "+msg.Kind);
		writeObject(pipe,new NetworkMessage(NetworkMessageKind.ReplyPlayerInformation,_player));
		msg=readObject(pipe);
		MyLogger.debug("Update clients at beginning to inital statz");
		if(msg.Kind==NetworkMessageKind.Update) {
			MyLogger.debug("Received expected update");
			_state=((BattleRoundResult)msg.Data).State;
			
		}
		else{
			throw new InvalidClassException("Invalid state "+msg);
		}
		_io=io;

		this.thread=new Thread(this);
		thread.setName("Client "+_playerId);
		thread.start();
	}
	public Player getPlayer() {
		return _player;
	}
	public void run() {
		while(true) {
			MyLogger.debug("Client waiting "+this._playerId);
			NetworkMessage msg=readObject(pipe);
			MyLogger.debug("Client received "+msg.Kind.name()+" " + _playerId);
			switch(msg.Kind) {
			case RequestInput:
				BufferList<PlayerInput> inputs=new BufferList<>(_rule.PokemonPerPlayerOnField);
					short pokemonIndex=(short)msg.Data;
					var inp=_io.requestPlayerInput(pokemonIndex,_state);
					if(inp==null)continue;
					MyLogger.debug("Input from "+inp.PlayerId +" " +_io.getClass());
					inputs.add(inp);
				writeObject(pipe,NetworkMessageKind.ReplyInput.createMessage(inputs));
				break;
			case Update:
				var roundResult=(BattleRoundResult) msg.Data;
				_state=roundResult.State;
				_io.update(roundResult);
				if(roundResult.State.battleFinished()){
					_io.endBattle();
				}
				break;
				case RequestPokemonSwitch:
						short oldIndex=(short)msg.Data;
				writeObject(pipe, NetworkMessageKind.ReplyPokemonSwitch.createMessage(_io.switchPokemon(_state,oldIndex)));
				
			}
		}
	}
}
