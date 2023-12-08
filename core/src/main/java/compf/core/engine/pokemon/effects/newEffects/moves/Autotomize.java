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
/*Raises the user's Speed by 2 stages. If the user's Speed was changed, the user's weight is reduced by 100 kg as long as it remains active. This effect is stackable but cannot reduce the user's weight to less than 0.1 kg.*/
 public class Autotomize extends PokemonBattleEffect{

/*@Override
 void onTryHit(pokemon) {
      const hasContrary = pokemon.hasAbility("contrary");
      if (!hasContrary && pokemon.boosts.spe === 6 || hasContrary && pokemon.boosts.spe === -6) {
        return false;
      }
    }*/
/*@Override
 void onHit(pokemon) {
      if (pokemon.weighthg > 1) {
        pokemon.weighthg = Math.max(1, pokemon.weighthg - 1e3);
        this.add("-start", pokemon, "Autotomize");
      }
    }*/
public Autotomize(Pokemon pkmn) {
        super(pkmn);
    }
}