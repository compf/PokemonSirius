package compf.core.engine.pokemon.effects;

import compf.core.engine.Interrupt;
import compf.core.engine.Player;
import compf.core.engine.pokemon.Pokemon;
import compf.core.etc.MyObject;
import compf.core.etc.services.SharedInformation;

public class RandomSwapPokemonEffect extends  SwapPokemonEffect{
    public RandomSwapPokemonEffect(Pokemon pkmn) {
        super(pkmn);
    }

    @Override
    public Interrupt getInterrupt(Interrupt defaultValue) {
        return super.getInterrupt(defaultValue);
    }
}
