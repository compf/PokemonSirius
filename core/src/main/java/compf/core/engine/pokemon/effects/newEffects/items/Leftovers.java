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
/*At the end of every turn, holder restores 1/16 of its max HP.*/
 public class Leftovers extends PokemonBattleEffect{

/*@Override
 void onResidual(pokemon) {
      this.heal(pokemon.baseMaxhp / 16);
    }*/
public Leftovers(Pokemon pkmn) {
        super(pkmn);
    }
}