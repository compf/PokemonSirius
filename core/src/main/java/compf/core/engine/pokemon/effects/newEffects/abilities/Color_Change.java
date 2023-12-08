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
/*This Pokemon's type changes to match the type of the last move that hit it, unless that type is already one of its types. This effect applies after all hits from a multi-hit move. This effect is prevented if the move had a secondary effect removed by the Sheer Force Ability.*/
 public class Color_Change extends PokemonBattleEffect{

/*@Override
 void onAfterMoveSecondary(Pokemon target, Pokemon source, move) {
      if (!target.hp)
        return;
      const type = move.type;
      if (target.isActive && move.effectType === "Move" && move.category !== "Status" && type !== "???" && !target.hasType(type)) {
        if (!target.setType(type))
          return false;
        this.add("-start", target, "typechange", type, "[from] ability: Color Change");
        if (target.side.active.length === 2 && target.position === 1) {
          const action = this.queue.willMove(target);
          if (action && action.move.id === "curse") {
            action.targetLoc = -1;
          }
        }
      }
    }*/
public Color_Change(Pokemon pkmn) {
        super(pkmn);
    }
}