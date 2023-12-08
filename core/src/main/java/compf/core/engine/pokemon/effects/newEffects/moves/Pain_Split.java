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
/*The user and the target's HP become the average of their current HP, rounded down, but not more than the maximum HP of either one.*/
 public class Pain_Split extends PokemonBattleEffect{

/*@Override
 void onHit(Pokemon target, pokemon) {
      const targetHP = target.getUndynamaxedHP();
      const averagehp = Math.floor((targetHP + pokemon.hp) / 2) || 1;
      const targetChange = targetHP - averagehp;
      target.sethp(target.hp - targetChange);
      this.add("-sethp", target, target.getHealth, "[from] move: Pain Split", "[silent]");
      pokemon.sethp(averagehp);
      this.add("-sethp", pokemon, pokemon.getHealth, "[from] move: Pain Split");
    }*/
public Pain_Split(Pokemon pkmn) {
        super(pkmn);
    }
}