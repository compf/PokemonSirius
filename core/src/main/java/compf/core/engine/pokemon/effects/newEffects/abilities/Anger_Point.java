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
/*If this Pokemon, but not its substitute, is struck by a critical hit, its Attack is raised by 12 stages.*/
 public class Anger_Point extends PokemonBattleEffect{

/*@Override
 void onHit(Pokemon target, Pokemon source, move) {
      if (!target.hp)
        return;
      if (move?.effectType === "Move" && target.getMoveHitData(move).crit) {
        this.boost({ atk: 12 }, target, target);
      }
    }*/
public Anger_Point(Pokemon pkmn) {
        super(pkmn);
    }
}