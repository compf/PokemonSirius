package compf.core.engine.pokemon.effects.moveSpecific;

import compf.core.engine.BattleAction;
import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.effects.EffectParam;
import compf.core.engine.pokemon.effects.PokemonBattleEffect;
import compf.core.engine.pokemon.moves.DamageInformation;
import compf.core.etc.services.SharedInformation;

public class ProtectionEffect extends PokemonBattleEffect {
    private int _perc = 255;
    private boolean _protection_enabled=true;

    public ProtectionEffect(Pokemon pkmn) {
        super(pkmn);
    }

    @Override
    public void attack(EffectParam param) {
        if(!isMeAttacking(param))return;;
        var additionalData=(EffectParam.AdditionalDirectDamageData)param.additionalData();
        final int PROTECTION_ID = 182;
        if (_perc>0 && SharedInformation.Instance.getRNG().randomNumber(_perc, this.getClass()) > _perc) {
           _protection_enabled=false;
        } else {
            if (additionalData.getDamageInformation().getMoveId() == PROTECTION_ID) {
                _perc /= 2;
            }
            else{
                _protection_enabled=false;
             this.disable();
            }

        }
    }

    @Override
    public BattleAction getBattleAction() {
        return null;
    }

    @Override
    public void defend(EffectParam param) {

        if(isMeDefending(param) && _protection_enabled){
            param.additionalData().killFully();
            addMessage("Protect prevents damage");
        }


    }

}

