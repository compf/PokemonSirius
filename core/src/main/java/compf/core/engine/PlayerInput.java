package compf.core.engine;

import java.io.Serializable;

public abstract class PlayerInput implements Serializable {
	public final short PlayerId;

	public PlayerInput(short playerId) {
		PlayerId = playerId;
	}

	public static class AttackInput extends PlayerInput {

		public final short PokemonIndex, MoveIndex, TargetPlayer, TargetPokemonIndex;

		public AttackInput(short pokemonIndex, short moveIndex, short targetPlayer, short targetPokemon,
				short playerId) {
			super(playerId);
			PokemonIndex = pokemonIndex;
			MoveIndex = moveIndex;
			TargetPlayer = targetPlayer;
			TargetPokemonIndex = targetPokemon;

		}

	}

	public static class SwitchPokemonInput {
		public final int PokemonIndex;

		public SwitchPokemonInput(int playerId, int pokemonIndex) {
			PokemonIndex = pokemonIndex;
		}
	}
}
