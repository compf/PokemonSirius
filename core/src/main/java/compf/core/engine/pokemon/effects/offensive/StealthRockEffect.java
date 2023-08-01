package compf.core.engine.pokemon.effects.offensive;

import compf.core.engine.Player;
import compf.core.engine.pokemon.Type;
import compf.core.engine.pokemon.effects.EffectParam;
import compf.core.engine.pokemon.effects.GlobalBattleEffect;
import compf.core.engine.pokemon.moves.Move;

public class StealthRockEffect extends GlobalBattleEffect {
    public StealthRockEffect(Move.TargetType type, Player player, int pokemonPos) {
        super(type, player, pokemonPos);
    }

    @Override
    public void pokemonSwitchedIn(EffectParam param) {
        double factor=(1.0/8.0)*Move.getEffectiveness(getCurrPokemon(),Type.Rock);
        dealIndirectDamage(param,getCurrPokemon(),getCurrPokemon(),1-factor);



        }
    }

