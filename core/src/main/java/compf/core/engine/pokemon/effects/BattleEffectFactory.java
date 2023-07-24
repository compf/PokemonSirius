package compf.core.engine.pokemon.effects;

import compf.core.engine.pokemon.Pokemon;
import compf.core.etc.MyObject;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller

public  class BattleEffectFactory {


    private Pokemon pokemon;
    private @Autowired AutowireCapableBeanFactory beanFactory;
    static AnnotationConfigApplicationContext  itemContext = new AnnotationConfigApplicationContext(ItemEffectFactory.class);
    static AnnotationConfigApplicationContext  abilityContext = new AnnotationConfigApplicationContext(AbilityEffectFactory.class);

    public static PokemonBattleEffect createItemEffect(String name,Pokemon pokemon){
        try{
            return (PokemonBattleEffect) itemContext.getBeanFactory().getBean(name,pokemon);
        }catch (NoSuchBeanDefinitionException ex){
            return new StubPokemonEffect(pokemon);
        }

    }
    public static PokemonBattleEffect createAbilityEffect(String name,Pokemon pokemon){
        try{
            return (PokemonBattleEffect) abilityContext.getBeanFactory().getBean(name,pokemon);
        }catch (NoSuchBeanDefinitionException ex){
            return new StubPokemonEffect(pokemon);
        }

    }



}
