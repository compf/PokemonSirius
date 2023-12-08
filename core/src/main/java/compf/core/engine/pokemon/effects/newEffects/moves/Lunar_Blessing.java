package compf.core.engine.pokemon.effects.newEffects.moves;

import compf.core.engine.BattleAction;
    import compf.core.engine.pokemon.PokemonStat;
    import compf.core.engine.pokemon.Pokemon;
    import compf.core.engine.pokemon.effects.EffectParam;
    import compf.core.engine.pokemon.effects.PokemonBattleEffect;
    import compf.core.engine.pokemon.moves.DamageInformation;
    import compf.core.engine.pokemon.moves.Schedule;
    import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
    import compf.core.etc.services.SharedInformation;
/*Each Pokemon on the user's side restores 1/4 of its maximum HP, rounded half up, and has its status condition cured.*/
 public class Lunar_Blessing extends PokemonBattleEffect{

/*@Override
 void onHit(pokemon) {
      const success = !!this.heal(this.modify(pokemon.maxhp, 0.25));
      return pokemon.cureStatus() || success;
    }*/
public Lunar_Blessing(Pokemon pkmn) {
        super(pkmn);
    }
}