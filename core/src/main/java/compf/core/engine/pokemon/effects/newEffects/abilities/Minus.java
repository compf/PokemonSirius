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
/*If an active ally has this Ability or the Plus Ability, this Pokemon's Special Attack is multiplied by 1.5.*/
 public class Minus extends PokemonBattleEffect{

/*@Override
 void onModifySpA(spa, pokemon) {
      for (const allyActive of pokemon.allies()) {
        if (allyActive.hasAbility(["minus", "plus"])) {
          return this.chainModify(1.5);
        }
      }
    }*/
public Minus(Pokemon pkmn) {
        super(pkmn);
    }
}