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
/*Each turn, if holder is a Poison type, restores 1/16 max HP; loses 1/8 if not.*/
 public class Black_Sludge extends PokemonBattleEffect{

/*@Override
 void onResidual(pokemon) {
      if (pokemon.hasType("Poison")) {
        this.heal(pokemon.baseMaxhp / 16);
      } else {
        this.DamageInformation damage(pokemon.baseMaxhp / 8);
      }
    }*/
public Black_Sludge(Pokemon pkmn) {
        super(pkmn);
    }
}