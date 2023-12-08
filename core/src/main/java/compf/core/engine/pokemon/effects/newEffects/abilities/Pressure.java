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
/*If this Pokemon is the target of an opposing Pokemon's move, that move loses one additional PP. Imprison, Snatch, and Tera Blast also lose one additional PP when used by an opposing Pokemon, but Sticky Web does not.*/
 public class Pressure extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon) {
      this.add("-ability", pokemon, "Pressure");
    }*/
/*@Override
 void onDeductPP(Pokemon target, source) {
      if (target.isAlly(source))
        return;
      return 1;
    }*/
public Pressure(Pokemon pkmn) {
        super(pkmn);
    }
}