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
/*If this Pokemon is poisoned, it restores 1/8 of its maximum HP, rounded down, at the end of each turn instead of losing HP.*/
 public class Poison_Heal extends PokemonBattleEffect{

/*@Override
 void onDamage(DamageInformation damage, Pokemon target, Pokemon source, effect) {
      if (effect.id === "psn" || effect.id === "tox") {
        this.heal(target.baseMaxhp / 8);
        return false;
      }
    }*/
public Poison_Heal(Pokemon pkmn) {
        super(pkmn);
    }
}