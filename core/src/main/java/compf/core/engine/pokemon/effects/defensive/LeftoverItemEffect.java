package compf.core.engine.pokemon.effects.defensive;

import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.effects.EffectParam;
import compf.core.engine.pokemon.effects.ItemEffect;
import compf.core.engine.pokemon.moves.DamageInformation;

public class LeftoverItemEffect extends ItemEffect {
    public LeftoverItemEffect(Pokemon pkmn) {
        super(pkmn);
    }

    @Override
    public void roundBeginning(EffectParam param) {
        int hpBefore=getPokemon().getCurrHP();
        getPokemon().modifyCurrHp(1.25);
        int hpAfter=getPokemon().getCurrHP();
        addMessage("Leftover healed " + getPokemon());
        _additionalData=hpBefore+" "+hpAfter;
    }
}
