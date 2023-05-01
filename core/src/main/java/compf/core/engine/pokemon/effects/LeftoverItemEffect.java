package compf.core.engine.pokemon.effects;

import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.moves.DamageInformation;

public class LeftoverItemEffect extends ItemEffect {
    public LeftoverItemEffect(Pokemon pkmn) {
        super(pkmn);
    }

    @Override
    public void roundBeginning(EffectParam param) {
        getPokemon().modifyCurrHp(1.25);
        addMessage("Leftover healed " + getPokemon());
    }
}
