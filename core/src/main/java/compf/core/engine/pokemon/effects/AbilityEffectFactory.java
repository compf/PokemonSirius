package compf.core.engine.pokemon.effects;

import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.effects.offensive.ProtosynthesisEffect;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class AbilityEffectFactory {
    //region  A 
            //endregion 
            
            //region  B 
            //endregion 
            
            //region  C 
            //endregion 
            
            //region  D 
            //endregion 
            
            //region  E 
            //endregion 
            
            //region  F 
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
            //endregion 
            
            //region  M 
            //endregion 
            
            //region  N 
            //endregion 
            
            //region  O 
            //endregion 
            
            //region  P
            @Scope(BeanDefinition.SCOPE_PROTOTYPE)
            @Bean(name={EffectName.Protosynthesis})
            public PokemonBattleEffect
            protosynthesis(Pokemon pkmn){
                return new ProtosynthesisEffect(pkmn);
            }
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
