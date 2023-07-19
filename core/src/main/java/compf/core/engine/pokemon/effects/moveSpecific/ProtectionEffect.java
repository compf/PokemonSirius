package compf.core.engine.pokemon.effects.moveSpecific;

import compf.core.engine.BattleAction;
import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.effects.EffectParam;
import compf.core.engine.pokemon.effects.PokemonBattleEffect;
import compf.core.engine.pokemon.moves.DamageInformation;
import compf.core.etc.services.SharedInformation;

public class ProtectionEffect extends PokemonBattleEffect {
    private int _perc = 255;

    public ProtectionEffect(Pokemon pkmn) {
        super(pkmn);
    }

    @Override
    public void attack(EffectParam param) {
        if(param.damageInf().getAttacker()!=getPokemon())return;;
        final int PROTECTION_ID = 182;
        if (_perc>0 && SharedInformation.Instance.getRNG().randomNumber(_perc, this.getClass()) > _perc) {
            this.disable();
        } else {
            if (param.damageInf().getMoveId() == PROTECTION_ID) {
                _perc /= 2;
            }
            else{
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
        DamageInformation inf = param.damageInf();
        if(inf.getDefender()==getPokemon()){
            inf.kill();
            addMessage("Protect prevents damage");
        }


    }

}

