package compf.core.engine.pokemon.effects;

import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.moves.DamageInformation;

public class FocusSashItemEffect extends ItemEffect {
    public FocusSashItemEffect(Pokemon pkmn) {
        super(pkmn);
    }

    @Override
    public void defend(EffectParam param ) {
        DamageInformation inf =param.damageInf();
        if (getPokemon().getCurrHP() == getPokemon().getStat(0) && inf.getDamage() >= getPokemon().getCurrHP()) {
            inf.modifyDamage(getPokemon().getCurrHP() - 1);
            addMessage("Focus sash works");
            disable();
        }
    }
}
