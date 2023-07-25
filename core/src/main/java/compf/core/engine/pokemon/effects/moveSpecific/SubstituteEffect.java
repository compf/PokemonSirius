package compf.core.engine.pokemon.effects.moveSpecific;

import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.effects.EffectParam;
import compf.core.engine.pokemon.effects.PokemonBattleEffect;
import compf.core.engine.pokemon.moves.DamageInformation;

public class SubstituteEffect extends PokemonBattleEffect {
    public SubstituteEffect(Pokemon pkmn) {
        super(pkmn);
    }

    private int _cap = 45;

    @Override
    public void init() {
        if (getPokemon().getCurrHP() > 45) {
            getPokemon().modifyCurrHp(0.75);
        } else {
            disable();
            ;
        }

    }

    @Override
    public void statsModified(EffectParam param) {
        if(!isMeDefending(param))return;
    }

    @Override
    public void defend(EffectParam param) {
        var additionalData=(EffectParam.AdditionalDirectDamageData)param.additionalData();
        if (additionalData.getDamageInformation().getDamage() <= _cap && _cap > 0) {
            _cap -= additionalData.getDamageInformation().getDamage();
            additionalData.killFully();
            addMessage("Substitute works");
        } else {
            disable();
        }
    }
}
