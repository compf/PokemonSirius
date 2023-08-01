package compf.core.engine.pokemon.effects.weather;

import compf.core.engine.Player;
import compf.core.engine.PokemonBattle;
import compf.core.engine.pokemon.effects.GlobalBattleEffect;
import compf.core.engine.pokemon.moves.Move;

public class HarshSunlightEffect extends GlobalBattleEffect {

    public HarshSunlightEffect(Move.TargetType type, Player player, int pokemonPos) {
        super(type, player, pokemonPos);
    }
}
