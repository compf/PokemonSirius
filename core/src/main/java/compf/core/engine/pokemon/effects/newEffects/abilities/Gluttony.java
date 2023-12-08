package compf.core.engine.pokemon.effects.newEffects.abilities;

import compf.core.engine.BattleAction;
    import compf.core.engine.pokemon.PokemonStat;
    import compf.core.engine.pokemon.Pokemon;
    import compf.core.engine.pokemon.effects.EffectParam;
    import compf.core.engine.pokemon.effects.PokemonBattleEffect;
    import compf.core.engine.pokemon.moves.DamageInformation;
    import compf.core.engine.pokemon.moves.Schedule;
    import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
    import compf.core.etc.services.SharedInformation;
/*When this Pokemon is holding a Berry that usually activates with 1/4 or less of its maximum HP, it is eaten at 1/2 or less of its maximum HP instead.*/
 public class Gluttony extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon) {
      pokemon.abilityState.gluttony = true;
    }*/
/*@Override
 void onDamage(item, pokemon) {
      pokemon.abilityState.gluttony = true;
    }*/
public Gluttony(Pokemon pkmn) {
        super(pkmn);
    }
}