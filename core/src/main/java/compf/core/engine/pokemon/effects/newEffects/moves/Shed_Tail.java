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
/*The user takes 1/2 of its maximum HP, rounded up, and creates a substitute that has 1/4 of the user's maximum HP, rounded down. The user is replaced with another Pokemon in its party and the selected Pokemon has the substitute transferred to it. Fails if the user would faint, or if there are no unfainted party members.*/
 public class Shed_Tail extends PokemonBattleEffect{

/*@Override
 void onTryHit(source) {
      if (!this.canSwitch(source.side) || source.volatiles["commanded"]) {
        this.add("-fail", source);
        return this.NOT_FAIL;
      }
      if (source.volatiles["substitute"]) {
        this.add("-fail", Pokemon source, "move: Shed Tail");
        return this.NOT_FAIL;
      }
      if (source.hp <= Math.ceil(source.maxhp / 2)) {
        this.add("-fail", source, "move: Shed Tail", "[weak]");
        return this.NOT_FAIL;
      }
    }*/
/*@Override
 void onHit(target) {
      this.directDamage(Math.ceil(target.maxhp / 2));
    }*/
public Shed_Tail(Pokemon pkmn) {
        super(pkmn);
    }
}