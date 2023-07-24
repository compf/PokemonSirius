package compf.core.engine.pokemon.effects;

import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.effects.defensive.FocusSashItemEffect;
import compf.core.engine.pokemon.effects.defensive.LeftoverItemEffect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
public  class ItemEffectFactory {


   @Scope("prototype")@Bean(name = {"Focus Slash"}) public PokemonBattleEffect
   focusSlash(Pokemon pkmn){
        return new FocusSashItemEffect(pkmn);
    }
    @Scope("prototype") @Bean(name = {"Leftovers"}) public PokemonBattleEffect
    leftOvers(Pokemon pkmn){
        return new LeftoverItemEffect(pkmn);
    }
}