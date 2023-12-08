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
/*If the holder's stat stages are lowered, it switches to a chosen ally. Single use.*/
 public class Eject_Pack extends PokemonBattleEffect{

/*@Override
 void onAfterBoost(boost, Pokemon target, Pokemon source, effect) {
      if (this.activeMove?.id === "partingshot")
        return;
      let eject = false;
      let i;
      for (i in boost) {
        if (boost[i] < 0) {
          eject = true;
        }
      }
      if (eject) {
        if (target.hp) {
          if (!this.canSwitch(target.side))
            return;
          if (target.volatiles["commanding"] || target.volatiles["commanded"])
            return;
          for (const pokemon of this.getAllActive()) {
            if (pokemon.switchFlag === true)
              return;
          }
          if (target.useItem())
            target.switchFlag = true;
        }
      }
    }*/
public Eject_Pack(Pokemon pkmn) {
        super(pkmn);
    }
}