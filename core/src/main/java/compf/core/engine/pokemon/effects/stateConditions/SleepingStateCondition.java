package compf.core.engine.pokemon.effects.stateConditions;

import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.effects.EffectParam;
import compf.core.engine.pokemon.effects.PokemonBattleEffect;
import compf.core.engine.pokemon.effects.stateConditions.StateConditionsMarkers.NonVolatileStatusMarker;
import compf.core.engine.pokemon.moves.DamageInformation;
import compf.core.etc.services.SharedInformation;

public class SleepingStateCondition extends PokemonBattleEffect implements NonVolatileStatusMarker {
    int _rounds;

    public SleepingStateCondition(Pokemon pkmn) {
        super(pkmn);
        _rounds = SharedInformation.Instance.getRNG().randomNumber(2, 6,this.getClass());

    }

    @Override
    public void attack(EffectParam param) {
        if(!isMeAttacking(param))return;
        if (_rounds > 0) {
            _rounds--;
            addMessage(getPokemon() + " sleeps");
           param.additionalData().killFully();;
        }

    }
}
