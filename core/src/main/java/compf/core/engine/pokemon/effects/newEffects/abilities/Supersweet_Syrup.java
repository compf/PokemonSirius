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
/*undefined*/
 public class Supersweet_Syrup extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon) {
      if (pokemon.syrupTriggered)
        return;
      pokemon.syrupTriggered = true;
      this.add("-ability", pokemon, "Supersweet Syrup");
      let activated = false;
      for (const target of pokemon.adjacentFoes()) {
        if (!activated) {
          this.add("-ability", pokemon, "Supersweet Syrup", "boost");
          activated = true;
        }
        if (target.volatiles["substitute"]) {
          this.add("-immune", target);
        } else {
          this.boost({ evasion: -1 }, Pokemon target, pokemon, null, true);
        }
      }
    }*/
public Supersweet_Syrup(Pokemon pkmn) {
        super(pkmn);
    }
}