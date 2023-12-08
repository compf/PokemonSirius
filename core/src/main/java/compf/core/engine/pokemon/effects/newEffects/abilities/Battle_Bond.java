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
/*If this Pokemon is a Greninja, its Attack, Special Attack, and Speed are raised by 1 stage if it attacks and knocks out another Pokemon. This effect can only happen once per battle.*/
 public class Battle_Bond extends PokemonBattleEffect{

/*@Override
 void onSourceAfterFaint(length, Pokemon target, Pokemon source, effect) {
      if (effect?.effectType !== "Move")
        return;
      if (source.abilityState.battleBondTriggered)
        return;
      if (source.species.id === "greninjabond" && source.hp && !source.transformed && source.side.foePokemonLeft()) {
        this.boost({ atk: 1, spa: 1, spe: 1 }, source, source, this.effect);
        this.add("-activate", source, "ability: Battle Bond");
        source.abilityState.battleBondTriggered = true;
      }
    }*/
public Battle_Bond(Pokemon pkmn) {
        super(pkmn);
    }
}