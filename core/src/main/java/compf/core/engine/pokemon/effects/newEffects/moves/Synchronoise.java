package compf.core.engine.pokemon.effects.newEffects.moves;

import compf.core.engine.BattleAction;
    import compf.core.engine.pokemon.PokemonStat;
    import compf.core.engine.pokemon.Pokemon;
    import compf.core.engine.pokemon.effects.EffectParam;
    import compf.core.engine.pokemon.effects.PokemonBattleEffect;
    import compf.core.engine.pokemon.moves.DamageInformation;
    import compf.core.engine.pokemon.moves.Schedule;
    import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
    import compf.core.etc.services.SharedInformation;
/*The target is immune if it does not share a type with the user.*/
 public class Synchronoise extends PokemonBattleEffect{

/*@Override
 void onTryImmunity(Pokemon target, source) {
      return target.hasType(source.getTypes());
    }*/
public Synchronoise(Pokemon pkmn) {
        super(pkmn);
    }
}