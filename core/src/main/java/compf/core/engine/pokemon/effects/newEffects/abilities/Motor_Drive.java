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
/*This Pokemon is immune to Electric-type moves and raises its Speed by 1 stage when hit by an Electric-type move.*/
 public class Motor_Drive extends PokemonBattleEffect{

/*@Override
 void onTryHit(Pokemon target, Pokemon source, move) {
      if (target !== source && move.type === "Electric") {
        if (!this.boost({ spe: 1 })) {
          this.add("-immune", target, "[from] ability: Motor Drive");
        }
        return null;
      }
    }*/
public Motor_Drive(Pokemon pkmn) {
        super(pkmn);
    }
}