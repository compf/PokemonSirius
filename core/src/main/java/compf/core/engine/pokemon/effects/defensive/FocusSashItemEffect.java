package compf.core.engine.pokemon.effects.defensive;

import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.effects.EffectParam;
import compf.core.engine.pokemon.effects.ItemEffect;
import compf.core.engine.pokemon.moves.DamageInformation;

public class FocusSashItemEffect extends ItemEffect {
    public FocusSashItemEffect(Pokemon pkmn) {
        super(pkmn);
    }

    @Override
    public void defend(EffectParam param ) {
        DamageInformation inf =((EffectParam.AdditionalDirectDamageData)param.additionalData()).getDamageInformation();
        if (getPokemon().getCurrHP() == getPokemon().getStat(0) && inf.getDamage() >= getPokemon().getCurrHP()) {
            inf.modifyDamage(getPokemon().getCurrHP() - 1);
            addMessage("Focus sash works");
            disable();
        }
    }
}
