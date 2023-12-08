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
/*For 5 turns, the user and its party members take 0.5x damage from physical and special attacks, or 0.66x damage if in a Double Battle; does not reduce damage further with Reflect or Light Screen. Critical hits ignore this protection. It is removed from the user's side if the user or an ally is successfully hit by Brick Break, Psychic Fangs, or Defog. Brick Break and Psychic Fangs remove the effect before damage is calculated. Lasts for 8 turns if the user is holding Light Clay. Fails unless the weather is Hail.*/
 public class Aurora_Veil extends PokemonBattleEffect{

/*@Override
 void onTry() {
      return this.field.isWeather(["hail", "snow"]);
    }*/
/*@Override
 void 5*/
/*@Override
 void durationCallback(Pokemon target, Pokemon source, effect) {
        if (source?.hasItem("lightclay")) {
          return 8;
        }
        return 5;
      }*/
/*@Override
 void onAnyModifyDamage(DamageInformation damage, Pokemon source, Pokemon target, move) {
        if (target !== source && this.effectState.target.hasAlly(target)) {
          if (target.side.getSideCondition("reflect") && this.getCategory(move) === "Physical" || target.side.getSideCondition("lightscreen") && this.getCategory(move) === "Special") {
            return;
          }
          if (!target.getMoveHitData(move).crit && !move.infiltrates) {
            this.debug("Aurora Veil weaken");
            if (this.activePerHalf > 1)
              return this.chainModify([2732, 4096]);
            return this.chainModify(0.5);
          }
        }
      }*/
/*@Override
 void onSideStart(side) {
        this.add("-sidestart", side, "move: Aurora Veil");
      }*/
/*@Override
 void 26*/
/*@Override
 void 10*/
/*@Override
 void onSideEnd(side) {
        this.add("-sideend", side, "move: Aurora Veil");
      }*/
public Aurora_Veil(Pokemon pkmn) {
        super(pkmn);
    }
}