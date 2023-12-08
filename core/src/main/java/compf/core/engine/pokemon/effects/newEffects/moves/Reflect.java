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
/*For 5 turns, the user and its party members take 0.5x damage from physical attacks, or 0.66x damage if in a Double Battle. Damage is not reduced further with Aurora Veil. Critical hits ignore this effect. It is removed from the user's side if the user or an ally is successfully hit by Brick Break, Psychic Fangs, or Defog. Lasts for 8 turns if the user is holding Light Clay. Fails if the effect is already active on the user's side.*/
 public class Reflect extends PokemonBattleEffect{

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
        if (target !== source && this.effectState.target.hasAlly(target) && this.getCategory(move) === "Physical") {
          if (!target.getMoveHitData(move).crit && !move.infiltrates) {
            this.debug("Reflect weaken");
            if (this.activePerHalf > 1)
              return this.chainModify([2732, 4096]);
            return this.chainModify(0.5);
          }
        }
      }*/
/*@Override
 void onSideStart(side) {
        this.add("-sidestart", side, "Reflect");
      }*/
/*@Override
 void 26*/
/*@Override
 void 1*/
/*@Override
 void onSideEnd(side) {
        this.add("-sideend", side, "Reflect");
      }*/
public Reflect(Pokemon pkmn) {
        super(pkmn);
    }
}