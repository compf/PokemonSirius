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
/*Until the end of the turn, all single-target attacks from the opposing side are redirected to the user. Such attacks are redirected to the user before they can be reflected by Magic Coat or the Magic Bounce Ability, or drawn in by the Lightning Rod or Storm Drain Abilities. Fails if it is not a Double Battle or Battle Royal. This effect is ignored while the user is under the effect of Sky Drop.*/
 public class Rage_Powder extends PokemonBattleEffect{

/*@Override
 void onTry(source) {
      return this.activePerHalf > 1;
    }*/
/*@Override
 void 1*/
/*@Override
 void onStart(pokemon) {
        this.add("-singleturn", pokemon, "move: Rage Powder");
      }*/
/*@Override
 void 1*/
/*@Override
 void onFoeRedirectTarget(Pokemon target, Pokemon source, source2, move) {
        const ragePowderUser = this.effectState.target;
        if (ragePowderUser.isSkyDropped())
          return;
        if (source.runStatusImmunity("powder") && this.validTarget(ragePowderUser, source, move.target)) {
          if (move.smartTarget)
            move.smartTarget = false;
          this.debug("Rage Powder redirected target of move");
          return ragePowderUser;
        }
      }*/
public Rage_Powder(Pokemon pkmn) {
        super(pkmn);
    }
}