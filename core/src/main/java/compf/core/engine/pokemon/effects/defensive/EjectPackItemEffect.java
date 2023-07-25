package compf.core.engine.pokemon.effects.defensive;

import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.effects.EffectParam;
import compf.core.engine.pokemon.effects.ItemEffect;
import compf.core.etc.MyObject;

public class EjectPackItemEffect extends ItemEffect {
    public EjectPackItemEffect(Pokemon pkmn) {
        super(pkmn);
    }

    @Override
    public void statsModified(EffectParam param) {
        if(!isMeDefending(param))return;
        var data=(EffectParam.AdditionalStatsModifyingData)param.additionalData();
        if(data.getBy()<0){
            short index= (short)MyObject.indexOf(getPokemon().getPlayer().getTeam(),getPokemon());
            var newIndex=param.interrupt().forceSwitch(getPokemon().getPlayer().getPlayerId(),index);
            if(newIndex==-1)return;
            var dummy=getPokemon().getPlayer().getTeam()[index];
            getPokemon().getPlayer().getTeam()[index]=getPokemon().getPlayer().getTeam()[newIndex];;
            getPokemon().getPlayer().getTeam()[newIndex]=dummy;

        }

    }
}
