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
            param.interrupt().forceSwitch(param.eventExecutor(), getPokemon().getPlayer(),index);

        }

    }
}
