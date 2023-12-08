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
/*This Pokemon's Speed is raised by 1 stage if hit by a Bug-, Dark-, or Ghost-type attack, or if an opposing Pokemon affected this Pokemon with the Intimidate Ability.*/
 public class Rattled extends PokemonBattleEffect{

/*@Override
 void onDamagingHit(DamageInformation damage, Pokemon target, Pokemon source, move) {
      if (["Dark", "Bug", "Ghost"].includes(move.type)) {
        this.boost({ spe: 1 });
      }
    }*/
/*@Override
 void onAfterBoost(boost, Pokemon target, Pokemon source, effect) {
      if (effect?.name === "Intimidate") {
        this.boost({ spe: 1 });
      }
    }*/
public Rattled(Pokemon pkmn) {
        super(pkmn);
    }
}