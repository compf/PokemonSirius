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
/*Lowers the target's Attack and Special Attack by 1 stage. If this move is successful, the user switches out even if it is trapped and is replaced immediately by a selected party member. The user does not switch out if the target's Attack and Special Attack stat stages were both unchanged, or if there are no unfainted party members.*/
 public class Parting_Shot extends PokemonBattleEffect{

/*@Override
 void onHit(Pokemon target, Pokemon source, move) {
      const success = this.boost({ atk: -1, spa: -1 }, target, source);
      if (!success && !target.hasAbility("mirrorarmor")) {
        delete move.selfSwitch;
      }
    }*/
public Parting_Shot(Pokemon pkmn) {
        super(pkmn);
    }
}