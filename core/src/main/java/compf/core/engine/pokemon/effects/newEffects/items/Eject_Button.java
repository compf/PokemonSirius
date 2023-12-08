package compf.core.engine.pokemon.effects.newEffects.items;

import compf.core.engine.BattleAction;
    import compf.core.engine.pokemon.PokemonStat;
    import compf.core.engine.pokemon.Pokemon;
    import compf.core.engine.pokemon.effects.EffectParam;
    import compf.core.engine.pokemon.effects.PokemonBattleEffect;
    import compf.core.engine.pokemon.moves.DamageInformation;
    import compf.core.engine.pokemon.moves.Schedule;
    import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
    import compf.core.etc.services.SharedInformation;
/*If holder survives a hit, it immediately switches out to a chosen ally. Single use.*/
 public class Eject_Button extends PokemonBattleEffect{

/*@Override
 void onAfterMoveSecondary(Pokemon target, Pokemon source, move) {
      if (source && source !== target && target.hp && move && move.category !== "Status" && !move.flags["futuremove"]) {
        if (!this.canSwitch(target.side) || target.forceSwitchFlag || target.beingCalledBack || target.isSkyDropped())
          return;
        if (target.volatiles["commanding"] || target.volatiles["commanded"])
          return;
        for (const pokemon of this.getAllActive()) {
          if (pokemon.switchFlag === true)
            return;
        }
        target.switchFlag = true;
        if (target.useItem()) {
          source.switchFlag = false;
        } else {
          target.switchFlag = false;
        }
      }
    }*/
public Eject_Button(Pokemon pkmn) {
        super(pkmn);
    }
}