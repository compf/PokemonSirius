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
/*This Pokemon's Attack is raised 1 stage after it is damaged by a Fire-type move. This Pokemon cannot be burned. Gaining this Ability while burned cures it.*/
 public class Thermal_Exchange extends PokemonBattleEffect{

/*@Override
 void onDamagingHit(DamageInformation damage, Pokemon target, Pokemon source, move) {
      if (move.type === "Fire") {
        this.boost({ atk: 1 });
      }
    }*/
/*@Override
 void onUpdate(pokemon) {
      if (pokemon.status === "brn") {
        this.add("-activate", pokemon, "ability: Thermal Exchange");
        pokemon.cureStatus();
      }
    }*/
/*@Override
 void onSetStatus(status, Pokemon target, Pokemon source, effect) {
      if (status.id !== "brn")
        return;
      if (effect?.status) {
        this.add("-immune", target, "[from] ability: Thermal Exchange");
      }
      return false;
    }*/
public Thermal_Exchange(Pokemon pkmn) {
        super(pkmn);
    }
}