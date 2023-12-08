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
/*This Pokemon is immune to powder moves, damage from Sandstorm, and the effects of Rage Powder and the Effect Spore Ability.*/
 public class Overcoat extends PokemonBattleEffect{

/*@Override
 void onImmunity(type, pokemon) {
      if (type === "sandstorm" || type === "hail" || type === "powder")
        return false;
    }*/
/*@Override
 void onTryHit(Pokemon target, Pokemon source, move) {
      if (move.flags["powder"] && target !== source && this.dex.getImmunity("powder", target)) {
        this.add("-immune", target, "[from] ability: Overcoat");
        return null;
      }
    }*/
public Overcoat(Pokemon pkmn) {
        super(pkmn);
    }
}