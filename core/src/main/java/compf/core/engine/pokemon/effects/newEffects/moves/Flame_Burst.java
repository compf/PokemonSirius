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
/*If this move is successful, the target's ally loses 1/16 of its maximum HP, rounded down, unless it has the Magic Guard Ability.*/
 public class Flame_Burst extends PokemonBattleEffect{

/*@Override
 void onHit(Pokemon target, Pokemon source, move) {
      for (const ally of target.adjacentAllies()) {
        this.DamageInformation damage(ally.baseMaxhp / 16, ally, source, this.dex.conditions.get("Flame Burst"));
      }
    }*/
/*@Override
 void onAfterSubDamage(DamageInformation damage, Pokemon target, Pokemon source, move) {
      for (const ally of target.adjacentAllies()) {
        this.damage(ally.baseMaxhp / 16, ally, source, this.dex.conditions.get("Flame Burst"));
      }
    }*/
public Flame_Burst(Pokemon pkmn) {
        super(pkmn);
    }
}