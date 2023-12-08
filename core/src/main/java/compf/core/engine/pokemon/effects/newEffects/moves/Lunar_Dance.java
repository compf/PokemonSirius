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
/*The user faints, and if the Pokemon brought out to replace it does not have full HP or PP, or has a non-volatile status condition, its HP and PP are fully restored along with having any non-volatile status condition cured. The replacement is sent out at the end of the turn, and the healing happens before hazards take effect. This effect continues until a Pokemon that meets any of these conditions switches in at the user's position or gets swapped into the position with Ally Switch. Fails if the user is the last unfainted Pokemon in its party.*/
 public class Lunar_Dance extends PokemonBattleEffect{

/*@Override
 void onTryHit(source) {
      if (!this.canSwitch(source.side)) {
        this.attrLastMove("[still]");
        this.add("-fail", source);
        return this.NOT_FAIL;
      }
    }*/
/*@Override
 void onSwap(target) {
        if (!target.fainted && (target.hp < target.maxhp || target.status || target.moveSlots.some((moveSlot) => moveSlot.pp < moveSlot.maxpp))) {
          target.heal(target.maxhp);
          target.clearStatus();
          for (const moveSlot of target.moveSlots) {
            moveSlot.pp = moveSlot.maxpp;
          }
          this.add("-heal", Pokemon target, target.getHealth, "[from] move: Lunar Dance");
          target.side.removeSlotCondition(target, "lunardance");
        }
      }*/
public Lunar_Dance(Pokemon pkmn) {
        super(pkmn);
    }
}