package compf.core.engine.pokemon.effects.newEffects.items;

import compf.core.engine.BattleAction;
    import compf.core.engine.pokemon.PokemonStat;
    import compf.core.engine.pokemon.Pokemon;
    import compf.core.engine.pokemon.effects.EffectParam;
    import compf.core.engine.pokemon.effects.PokemonBattleEffect;
    import compf.core.engine.pokemon.moves.DamageInformation;
    import compf.core.engine.pokemon.moves.Schedule;
    import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
    import compf.core.etc.services.SharedInformation;
/*Each turn, holder has a 20% chance to move first in its priority bracket.*/
 public class Quick_Claw extends PokemonBattleEffect{

/*@Override
 void onFractionalPriority(priority, pokemon, Pokemon target, move) {
      if (move.category === "Status" && pokemon.hasAbility("myceliummight"))
        return;
      if (priority <= 0 && this.randomChance(1, 5)) {
        this.add("-activate", pokemon, "item: Quick Claw");
        return 0.1;
      }
    }*/
public Quick_Claw(Pokemon pkmn) {
        super(pkmn);
    }
}