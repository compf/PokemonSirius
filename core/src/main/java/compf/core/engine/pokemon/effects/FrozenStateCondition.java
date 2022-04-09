package compf.core.engine.pokemon.effects;

import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.moves.DamageInformation;

public class FrozenStateCondition extends PokemonBattleEffect {

    public FrozenStateCondition(Pokemon pkmn) {
        super(pkmn);
        // TODO Auto-generated constructor stub
    }

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Override
    public void attack(Object... obj){
        DamageInformation inf=(DamageInformation)obj[0];
        addMessage(getPokemon().toString() + " is frozen and cannot attack");
        inf.kill();
    }

}