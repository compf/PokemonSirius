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
/*Causes the Grass type to be added to the target, effectively making it have two or three types. Fails if the target is already a Grass type. If Trick-or-Treat adds a type to the target, it replaces the type added by this move and vice versa.*/
 public class Forest_s_Curse extends PokemonBattleEffect{

/*@Override
 void onHit(target) {
      if (target.hasType("Grass"))
        return false;
      if (!target.addType("Grass"))
        return false;
      this.add("-start", Pokemon target, "typeadd", "Grass", "[from] move: Forest's Curse");
    }*/
public Forest_s_Curse(Pokemon pkmn) {
        super(pkmn);
    }
}