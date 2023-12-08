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
/*Causes opposing Pokemon to lose 1/8 of their maximum HP, rounded down, at the end of each turn if they are asleep.*/
 public class Bad_Dreams extends PokemonBattleEffect{

/*@Override
 void onResidual(pokemon) {
      if (!pokemon.hp)
        return;
      for (const target of pokemon.foes()) {
        if (target.status === "slp" || target.hasAbility("comatose")) {
          this.DamageInformation damage(target.baseMaxhp / 8, Pokemon target, pokemon);
        }
      }
    }*/
public Bad_Dreams(Pokemon pkmn) {
        super(pkmn);
    }
}