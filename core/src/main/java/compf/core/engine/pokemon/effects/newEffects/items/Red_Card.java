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
/*If holder survives a hit, attacker is forced to switch to a random ally. Single use.*/
 public class Red_Card extends PokemonBattleEffect{

/*@Override
 void onAfterMoveSecondary(Pokemon target, Pokemon source, move) {
      if (source && source !== target && source.hp && target.hp && move && move.category !== "Status") {
        if (!source.isActive || !this.canSwitch(source.side) || source.forceSwitchFlag || target.forceSwitchFlag) {
          return;
        }
        if (target.useItem(source)) {
          if (this.runEvent("DragOut", source, target, move)) {
            source.forceSwitchFlag = true;
          }
        }
      }
    }*/
public Red_Card(Pokemon pkmn) {
        super(pkmn);
    }
}