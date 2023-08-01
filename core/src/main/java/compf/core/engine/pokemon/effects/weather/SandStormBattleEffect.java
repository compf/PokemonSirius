package compf.core.engine.pokemon.effects.weather;

import compf.core.engine.Player;
import compf.core.engine.PokemonBattle;
import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.Type;
import compf.core.engine.pokemon.effects.EffectParam;
import compf.core.engine.pokemon.effects.GlobalBattleEffect;
import compf.core.engine.pokemon.moves.DamageInformation;
import compf.core.engine.pokemon.moves.Move;

public class SandStormBattleEffect extends GlobalBattleEffect {


    public SandStormBattleEffect(Move.TargetType type, Player player, int pokemonPos) {
        super(type, player, pokemonPos);
    }

    @Override
    public void roundEnding(EffectParam param) {
        var pkmn = getCurrPokemon();
        if (!(pkmn.isType(Type.Ground) || pkmn.isType(Type.Rock) || pkmn.isType(Type.Steel))) {
            pkmn.modifyCurrHp(0.875);
            addMessage(pkmn.toString() + " was damaged by sandstorm");

        }

    }
}
