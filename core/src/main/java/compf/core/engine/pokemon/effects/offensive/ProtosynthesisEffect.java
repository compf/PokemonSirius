package compf.core.engine.pokemon.effects.offensive;

import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.PokemonStat;
import compf.core.engine.pokemon.effects.EffectParam;
import compf.core.engine.pokemon.effects.PokemonBattleEffect;
import compf.core.engine.pokemon.effects.weather.HarshSunlightEffect;

public class ProtosynthesisEffect extends PokemonBattleEffect {
    public ProtosynthesisEffect(Pokemon pkmn) {
        super(pkmn);
    }

    @Override
    public void init(EffectParam param) {
        if(param.effectCollection().hasEffect(HarshSunlightEffect.class) ||  param.effectCollection().hasEffect( getPokemon(), BoosterEnergyffect.class )){
            int maxIndex=1;
            int max=0;
            for(int i=1;i<6;i++){
                if(getPokemon().getStat(i)>max){
                    maxIndex=i;
                    max=getPokemon().getStat(i);
                }
            }
            final double factor=maxIndex== PokemonStat.SPEED?1.5:1.3;
            getPokemon().getAllStats()[maxIndex]=(int)(factor*getPokemon().getStat(maxIndex));
        }
    }
}
