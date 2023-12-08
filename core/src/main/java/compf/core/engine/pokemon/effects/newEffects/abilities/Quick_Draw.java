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
 public class Quick_Draw extends PokemonBattleEffect{

/*@Override
 void onFractionalPriority(priority, pokemon, Pokemon target, move) {
      if (move.category !== "Status" && this.randomChance(3, 10)) {
        this.add("-activate", pokemon, "ability: Quick Draw");
        return 0.1;
      }
    }*/
public Quick_Draw(Pokemon pkmn) {
        super(pkmn);
    }
}