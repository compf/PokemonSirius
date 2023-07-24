package compf.core.engine.pokemon.effects;

import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.effects.defensive.*;
import compf.core.engine.pokemon.effects.offensive.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Component
public class ItemEffectFactory {
//region  A 
    //endregion

    //region  B
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    @Bean(name={EffectName.BoosterEnergy})
    public PokemonBattleEffect
    boosterEnergy(Pokemon pkmn){
        return new BoosterEnergyffect(pkmn);
    }

    //endregion

    //region  C
    //endregion

    //region  D
    //endregion

    //region  E
    //endregion

    //region  F
    @Scope("prototype")
    @Bean(name = {EffectName.FocusSlash})
    public PokemonBattleEffect
    focusSlash(Pokemon pkmn) {
        return new FocusSashItemEffect(pkmn);
    }
    //endregion

    //region  G
    //endregion

    //region  H
    //endregion

    //region  I
    //endregion

    //region  J
    //endregion

    //region  K
    //endregion

    //region  L
    @Scope("prototype")
    @Bean(name = {EffectName.Leftovers})
    public PokemonBattleEffect
    leftOvers(Pokemon pkmn) {
        return new LeftoverItemEffect(pkmn);
    }
    @Scope("prototype")
    @Bean(name = {EffectName.LifeOrb})
    public PokemonBattleEffect
    lifeOrb(Pokemon pkmn) {
        return new LifeOrbEffect(pkmn);
    }
    //endregion

    //region  M
    //endregion

    //region  N
    //endregion

    //region  O
    //endregion

    //region  P

    //endregion

    //region  Q
    //endregion

    //region  R
    //endregion

    //region  S
    //endregion

    //region  T
    //endregion

    //region  U
    //endregion

    //region  V
    //endregion

    //region  W
    //endregion

    //region  X
    //endregion

    //region  Y
    //endregion

    //region  Z
    //endregion


}