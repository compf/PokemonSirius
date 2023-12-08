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
/*On switch-in, this Pokemon Transforms into the opposing Pokemon that is facing it. If there is no Pokemon at that position, this Pokemon does not Transform.*/
 public class Imposter extends PokemonBattleEffect{

/*@Override
 void onSwitchIn(pokemon) {
      this.effectState.switchingIn = true;
    }*/
/*@Override
 void onStart(pokemon) {
      if (!this.effectState.switchingIn)
        return;
      const target = pokemon.side.foe.active[pokemon.side.foe.active.length - 1 - pokemon.position];
      if (target) {
        pokemon.transformInto(Pokemon target, this.dex.abilities.get("imposter"));
      }
      this.effectState.switchingIn = false;
    }*/
public Imposter(Pokemon pkmn) {
        super(pkmn);
    }
}