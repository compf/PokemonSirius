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
/*The target is cured if it has a non-volatile status condition. If the target was cured, the user restores 1/2 of its maximum HP, rounded down.*/
 public class Purify extends PokemonBattleEffect{

/*@Override
 void onHit(Pokemon target, source) {
      if (!target.cureStatus()) {
        this.add("-fail", source);
        this.attrLastMove("[still]");
        return this.NOT_FAIL;
      }
      this.heal(Math.ceil(source.maxhp * 0.5), source);
    }*/
public Purify(Pokemon pkmn) {
        super(pkmn);
    }
}