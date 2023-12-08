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
/*This Pokemon is immune to Ground-type moves and restores 1/4 of its maximum HP, rounded down, when hit by a Ground-type move.*/
 public class Earth_Eater extends PokemonBattleEffect{

/*@Override
 void onTryHit(Pokemon target, Pokemon source, move) {
      if (target !== source && move.type === "Ground") {
        if (!this.heal(target.baseMaxhp / 4)) {
          this.add("-immune", target, "[from] ability: Earth Eater");
        }
        return null;
      }
    }*/
public Earth_Eater(Pokemon pkmn) {
        super(pkmn);
    }
}