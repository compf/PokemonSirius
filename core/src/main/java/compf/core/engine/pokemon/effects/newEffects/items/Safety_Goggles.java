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
/*Holder is immune to powder moves and damage from Sandstorm or Hail.*/
 public class Safety_Goggles extends PokemonBattleEffect{

/*@Override
 void onImmunity(type, pokemon) {
      if (type === "sandstorm" || type === "hail" || type === "powder")
        return false;
    }*/
/*@Override
 void onTryHit(pokemon, Pokemon source, move) {
      if (move.flags["powder"] && pokemon !== source && this.dex.getImmunity("powder", pokemon)) {
        this.add("-activate", pokemon, "item: Safety Goggles", move.name);
        return null;
      }
    }*/
public Safety_Goggles(Pokemon pkmn) {
        super(pkmn);
    }
}