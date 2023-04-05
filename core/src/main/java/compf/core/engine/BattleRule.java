package compf.core.engine;

import java.io.Serializable;
import java.util.Objects;

public class BattleRule implements Serializable {

	@Override
	public int hashCode() {
		return Objects.hash(MaxPokemonInTeamPerPlayer, NumberPlayers, PlayersPerTeam, PokemonPerPlayerOnField);
	}
	public static  final  BattleRule DEFAULT_RULE = new BattleRule(2, 1, 6, 1);
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof BattleRule))
			return false;
		BattleRule other = (BattleRule) obj;
		if (MaxPokemonInTeamPerPlayer != other.MaxPokemonInTeamPerPlayer)
			return false;
		if (NumberPlayers != other.NumberPlayers)
			return false;
		if (PlayersPerTeam != other.PlayersPerTeam)
			return false;
		if (PokemonPerPlayerOnField != other.PokemonPerPlayerOnField)
			return false;
		return true;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -7226253462303207468L;
	public final int NumberPlayers;
	public final int PlayersPerTeam;
	public final int MaxPokemonInTeamPerPlayer;
	public final int PokemonPerPlayerOnField;

	public BattleRule(int numberPlayers, int playersPerTeam, int maxPokemonInTeamPerPlayer,
			int pokemonPerPlayerOnField) {
		NumberPlayers = numberPlayers;
		PlayersPerTeam = playersPerTeam;
		MaxPokemonInTeamPerPlayer = maxPokemonInTeamPerPlayer;
		PokemonPerPlayerOnField = pokemonPerPlayerOnField;
	}

}
