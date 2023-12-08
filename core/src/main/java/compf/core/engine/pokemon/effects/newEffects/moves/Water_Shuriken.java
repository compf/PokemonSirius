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
/*Hits two to five times. Has a 35% chance to hit two or three times and a 15% chance to hit four or five times. If one of the hits breaks the target's substitute, it will take damage for the remaining hits. If the user has the Skill Link Ability, this move will always hit five times. If the user is an Ash-Greninja with the Battle Bond Ability, this move has a power of 20 and always hits three times.*/
 public class Water_Shuriken extends PokemonBattleEffect{

/*@Override
 void basePowerCallback(pokemon, Pokemon target, move) {
      if (pokemon.species.name === "Greninja-Ash" && pokemon.hasAbility("battlebond") && !pokemon.transformed) {
        return move.basePower + 5;
      }
      return move.basePower;
    }*/
public Water_Shuriken(Pokemon pkmn) {
        super(pkmn);
    }
}