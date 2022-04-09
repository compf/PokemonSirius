package compf.core.engine;

import compf.core.engine.pokemon.PokemonStat;
import compf.core.etc.BufferList;

import java.util.stream.Collectors;

public class DetailedBattleState implements BattleState {
	/**
	 * First version
	 */
	private static final long serialVersionUID = 1L;
	private BufferList<Player> _players;
	public DetailedBattleState(BufferList<Player> bufferList) {
		_players=bufferList;
	}
	@Override
	public int getCurrHp(int playerId, int pkmnIndex) {
		Player  p=findById(playerId);
		if(p!=null) {
			return p.getPokemon(pkmnIndex).getCurrHP();
		}
		return -1;
	}
	private Player findById(int playerId) {
		for(var p:_players) {
			if(p.getPlayerId()==playerId)return p;
		}
		return null;
	}
	@Override
	public int getMaxHP(int playerId, int pkmnIndex) {
		Player  p=findById(playerId);
		if(p!=null) {
			return p.getPokemon(pkmnIndex).getStat(PokemonStat.HP);
		}
		return -1;
	}
	@Override
	public String getPokemonName(int playerId, int pkmnIndex) {
		Player  p=findById(playerId);
		if(p!=null) {
			return p.getPokemon(pkmnIndex).getName();
		}
		return null;
	}
	@Override
	public String getStateConditionString(int playerId, int pkmnIndex) {
		// TODO
		Player  p=findById(playerId);
		if(p!=null) {
			return "";
		}
		return "";
	}
	@Override
	public Iterable<Short> getPlayerIds() {
		return _players.stream().map(Player::getPlayerId).collect(Collectors.toList());
	}
	@Override
	public String getPlayerName(int playerId) {
		Player  p=findById(playerId);
		if(p!=null)return p.getName();
		return null;
	}
}
