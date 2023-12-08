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
/*If this Pokemon is at full HP, it survives one hit with at least 1 HP. OHKO moves fail when used against this Pokemon.*/
 public class Sturdy extends PokemonBattleEffect{

/*@Override
 void onTryHit(pokemon, Pokemon target, move) {
      if (move.ohko) {
        this.add("-immune", pokemon, "[from] ability: Sturdy");
        return null;
      }
    }*/
/*@Override
 void onDamage(DamageInformation damage, Pokemon target, Pokemon source, effect) {
      if (target.hp === target.maxhp && damage >= target.hp && effect && effect.effectType === "Move") {
        this.add("-ability", target, "Sturdy");
        return target.hp - 1;
      }
    }*/
public Sturdy(Pokemon pkmn) {
        super(pkmn);
    }
}