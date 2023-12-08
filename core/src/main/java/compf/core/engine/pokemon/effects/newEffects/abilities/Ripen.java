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
/*When this Pokemon eats certain Berries, the effects are doubled. Berries that restore HP or PP have the amount doubled, Berries that raise stat stages have the amount doubled, Berries that halve damage taken quarter it instead, and a Jaboca Berry or Rowap Berry has the attacker lose 1/4 of its maximum HP, rounded down.*/
 public class Ripen extends PokemonBattleEffect{

/*@Override
 void onTryHeal(DamageInformation damage, Pokemon target, Pokemon source, effect) {
      if (!effect)
        return;
      if (effect.name === "Berry Juice" || effect.name === "Leftovers") {
        this.add("-activate", target, "ability: Ripen");
      }
      if (effect.isBerry)
        return this.chainModify(2);
    }*/
/*@Override
 void onChangeBoost(boost, Pokemon target, Pokemon source, effect) {
      if (effect && effect.isBerry) {
        let b;
        for (b in boost) {
          boost[b] *= 2;
        }
      }
    }*/
/*@Override
 void onSourceModifyDamage(DamageInformation damage, Pokemon source, Pokemon target, move) {
      if (target.abilityState.berryWeaken) {
        target.abilityState.berryWeaken = false;
        return this.chainModify(0.5);
      }
    }*/
/*@Override
 void onTryEatItem(item, pokemon) {
      this.add("-activate", pokemon, "ability: Ripen");
    }*/
/*@Override
 void onEatItem(item, pokemon) {
      const weakenBerries = [
        "Babiri Berry",
        "Charti Berry",
        "Chilan Berry",
        "Chople Berry",
        "Coba Berry",
        "Colbur Berry",
        "Haban Berry",
        "Kasib Berry",
        "Kebia Berry",
        "Occa Berry",
        "Passho Berry",
        "Payapa Berry",
        "Rindo Berry",
        "Roseli Berry",
        "Shuca Berry",
        "Tanga Berry",
        "Wacan Berry",
        "Yache Berry"
      ];
      pokemon.abilityState.berryWeaken = weakenBerries.includes(item.name);
    }*/
public Ripen(Pokemon pkmn) {
        super(pkmn);
    }
}