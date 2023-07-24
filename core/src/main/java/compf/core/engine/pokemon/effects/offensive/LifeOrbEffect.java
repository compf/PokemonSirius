package compf.core.engine.pokemon.effects.offensive;

import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.effects.EffectName;
import compf.core.engine.pokemon.effects.EffectParam;
import compf.core.engine.pokemon.effects.PokemonBattleEffect;
import compf.core.engine.pokemon.moves.DamageInformation;

public class LifeOrbEffect extends PokemonBattleEffect {
    public LifeOrbEffect(Pokemon pkmn) {
        super(pkmn);
    }
    private boolean isDirectDamageMove(DamageInformation inf){
        return true; //TODO https://bulbapedia.bulbagarden.net/wiki/Category:Moves_that_deal_direct_damage
    }

    @Override
    public void attack(EffectParam param) {
        if(isMeAttacking(param) && isDirectDamageMove(param.damageInf())){
            param.damageInf().modifyDamage(1.3);

        }
        if(param.damageInf().getDamage()>0){
            getPokemon().modifyCurrHp((int)Math.ceil(getPokemon().getMaxHP()/10.0));
            addMessage(getPokemon().toString() +" lost HP due to "+ EffectName.LifeOrb);
        }
    }
}
