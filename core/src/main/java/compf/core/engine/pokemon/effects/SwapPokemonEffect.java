package compf.core.engine.pokemon.effects;

import compf.core.engine.BattleRule;
import compf.core.engine.Interrupt;
import compf.core.engine.Player;
import compf.core.engine.pokemon.Pokemon;
import compf.core.etc.PokemonConstants;

public abstract class SwapPokemonEffect extends PokemonBattleEffect{
    public SwapPokemonEffect(Pokemon pkmn) {
        super(pkmn);
    }

    @Override
    public void init(EffectParam param) {
        int oldIndex=indexOf(getPokemon().getPlayer().getTeam(),getPokemon());
        getInterrupt(param.interrupt()).forceSwitch(param.eventExecutor(),getPokemon().getPlayer(),(short)oldIndex);
    }
    public Interrupt getInterrupt(Interrupt defaultValue){
        return defaultValue;
    }



}
