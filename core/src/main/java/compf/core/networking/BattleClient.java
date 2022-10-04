package compf.core.networking;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;

//import Main;
import compf.core.engine.*;
import compf.core.engine.pokemon.Pokemon;
import compf.core.etc.BufferList;


public class BattleClient extends BaseServer implements Runnable {
	Pipe pipe;
	private short _playerId;
	BattleState _state;
	IOInterface _io;
	BattleRule _rule;
	Player _player;
	Thread thread;
	public BattleClient( BattleRule rule, String playerName, Pokemon[] team,Pipe pipe,IOInterface io) throws IOException {
		_rule=rule;
		log("Client init");
		pipe.connect();
		this.pipe=pipe;
		NetworkMessage msg=readObject(pipe);
		if(msg.Kind!= NetworkMessageKind.SendPlayerId)throw new IOException("Invalid message");
		_playerId=(short)msg.Data;

		_player=new Player(_playerId,playerName,team);
		System.out.println("Player initialized");
		log("Client " +_player.getName()+ " Receiving player id " +_playerId );
		log("Client " +_player.getName()+ " writing rules "+_playerId   );
		writeObject(pipe,new NetworkMessage(NetworkMessageKind.BattleRules, rule));
		log("Client " +_player.getName()+ " waiting player information "+_playerId   );

		msg=readObject(pipe);
		if(msg.Kind!= NetworkMessageKind.RequestPlayerInformation)throw new IOException("Invalid message "+msg.Kind);
		writeObject(pipe,new NetworkMessage(NetworkMessageKind.ReplyPlayerInformation,_player));
		msg=readObject(pipe);
		log("update");
		if(msg.Kind==NetworkMessageKind.Update) {
			log("Received update");
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
		System.out.println("Player is "+_player);
		return _player;
	}
	public void run() {
		while(true) {
			log("Client waiting "+this._playerId);
			NetworkMessage msg=readObject(pipe);
			log("Client received "+msg.Kind.name()+" " + _playerId);
			switch(msg.Kind) {
			case RequestInput:
				BufferList<PlayerInput> inputs=new BufferList<>(_rule.PokemonPerPlayerOnField);
				for(short i=0;i<_rule.PokemonPerPlayerOnField;i++) {
					var inp=_io.requestPlayerInput(i,_state);
					if(inp==null)continue;
					log("Input from "+inp.PlayerId +" " +_io.getClass());
					inputs.add(inp);
				}
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
