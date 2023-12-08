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
/*This Pokemon's moves have their power multiplied by 1+(X*0.1), where X is the total number of times any Pokemon has fainted on the user's side when this Ability became active, and X cannot be greater than 5.*/
 public class Supreme_Overlord extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon) {
      if (pokemon.side.totalFainted) {
        this.add("-activate", pokemon, "ability: Supreme Overlord");
        const fallen = Math.min(pokemon.side.totalFainted, 5);
        this.add("-start", pokemon, `fallen${fallen}`, "[silent]");
        this.effectState.fallen = fallen;
      }
    }*/
/*@Override
 void onEnd(pokemon) {
      this.add("-end", pokemon, `fallen${this.effectState.fallen}`, "[silent]");
    }*/
/*@Override
 void onBasePower(basePower, attacker, defender, move) {
      if (this.effectState.fallen) {
        const powMod = [4096, 4506, 4915, 5325, 5734, 6144];
        this.debug(`Supreme Overlord boost: ${powMod[this.effectState.fallen]}/4096`);
        return this.chainModify([powMod[this.effectState.fallen], 4096]);
      }
    }*/
public Supreme_Overlord(Pokemon pkmn) {
        super(pkmn);
    }
}