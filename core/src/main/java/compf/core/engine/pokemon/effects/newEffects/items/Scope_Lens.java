package compf.core.engine.pokemon.effects.newEffects.items;

import compf.core.engine.BattleAction;
    import compf.core.engine.pokemon.PokemonStat;
    import compf.core.engine.pokemon.Pokemon;
    import compf.core.engine.pokemon.effects.EffectParam;
    import compf.core.engine.pokemon.effects.PokemonBattleEffect;
    import compf.core.engine.pokemon.moves.DamageInformation;
    import compf.core.engine.pokemon.moves.Schedule;
    import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
    import compf.core.etc.services.SharedInformation;
/*Holder's critical hit ratio is raised by 1 stage.*/
 public class Scope_Lens extends PokemonBattleEffect{

/*@Override
 void onModifyCritRatio(critRatio) {
      return critRatio + 1;
    }*/
public Scope_Lens(Pokemon pkmn) {
        super(pkmn);
    }
}