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
/*Every Pokemon in the user's party is cured of its non-volatile status condition. Active Pokemon with the Sap Sipper Ability are not cured, unless they are the user.*/
 public class Aromatherapy extends PokemonBattleEffect{

/*@Override
 void onHit(Pokemon target, Pokemon source, move) {
      this.add("-activate", source, "move: Aromatherapy");
      let success = false;
      const allies = [...target.side.pokemon, ...target.side.allySide?.pokemon || []];
      for (const ally of allies) {
        if (ally !== source && (ally.hasAbility("sapsipper") || ally.volatiles["substitute"] && !move.infiltrates)) {
          continue;
        }
        if (ally.cureStatus())
          success = true;
      }
      return success;
    }*/
public Aromatherapy(Pokemon pkmn) {
        super(pkmn);
    }
}