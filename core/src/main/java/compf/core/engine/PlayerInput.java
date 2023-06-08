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

	public static class SwitchPokemonInput extends PlayerInput implements  Interrupt {
		public final short PokemonOldIndex;
		public final short PokemonNewIndex;

		public SwitchPokemonInput(short playerId, short oldIndex,short newIndex) {
			super(playerId);
			PokemonOldIndex = oldIndex;
			PokemonNewIndex=newIndex;
		}

		@Override
		public short forceSwitch(short playerId, short pokemonIndex) {
			return PokemonNewIndex;
		}
	}
}
