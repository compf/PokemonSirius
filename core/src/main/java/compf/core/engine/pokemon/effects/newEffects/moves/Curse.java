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
/*If the user is not a Ghost type, lowers the user's Speed by 1 stage and raises the user's Attack and Defense by 1 stage. If the user is a Ghost type, the user loses 1/2 of its maximum HP, rounded down and even if it would cause fainting, in exchange for the target losing 1/4 of its maximum HP, rounded down, at the end of each turn while it is active. If the target uses Baton Pass, the replacement will continue to be affected. Fails if there is no target or if the target is already affected.*/
 public class Curse extends PokemonBattleEffect{

/*@Override
 void onModifyMove(Move move, Pokemon source, target) {
      if (!source.hasType("Ghost")) {
        move.target = move.nonGhostTarget;
      } else if (source.isAlly(target)) {
        move.target = "randomNormal";
      }
    }*/
/*@Override
 void onTryHit(Pokemon target, Pokemon source, move) {
      if (!source.hasType("Ghost")) {
        delete move.volatileStatus;
        delete move.onHit;
        move.self = { boosts: { spe: -1, atk: 1, def: 1 } };
      } else if (move.volatileStatus && target.volatiles["curse"]) {
        return false;
      }
    }*/
/*@Override
 void onHit(Pokemon target, source) {
      this.directDamage(source.maxhp / 2, Pokemon source, source);
    }*/
/*@Override
 void onStart(pokemon, source) {
        this.add("-start", pokemon, "Curse", "[of] " + source);
      }*/
/*@Override
 void 12*/
/*@Override
 void onResidual(pokemon) {
        this.DamageInformation damage(pokemon.baseMaxhp / 4);
      }*/
public Curse(Pokemon pkmn) {
        super(pkmn);
    }
}