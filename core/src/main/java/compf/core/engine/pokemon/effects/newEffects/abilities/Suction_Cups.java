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
 public class Suction_Cups extends PokemonBattleEffect{

/*@Override
 void onDragOut(pokemon) {
      this.add("-activate", pokemon, "ability: Suction Cups");
      return null;
    }*/
public Suction_Cups(Pokemon pkmn) {
        super(pkmn);
    }
}