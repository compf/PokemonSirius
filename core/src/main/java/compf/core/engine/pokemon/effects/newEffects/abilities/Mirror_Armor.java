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
/*When one of this Pokemon's stat stages would be lowered by another Pokemon, that Pokemon's stat stage is lowered instead. This effect does not happen if this Pokemon's stat stage was already -6. If the other Pokemon has a substitute, neither Pokemon has its stat stage lowered.*/
 public class Mirror_Armor extends PokemonBattleEffect{

/*@Override
 void onTryBoost(boost, Pokemon target, Pokemon source, effect) {
      if (!source || target === source || !boost || effect.name === "Mirror Armor")
        return;
      let b;
      for (b in boost) {
        if (boost[b] < 0) {
          if (target.boosts[b] === -6)
            continue;
          const negativeBoost = {};
          negativeBoost[b] = boost[b];
          delete boost[b];
          if (source.hp) {
            this.add("-ability", target, "Mirror Armor");
            this.boost(negativeBoost, source, target, null, true);
          }
        }
      }
    }*/
public Mirror_Armor(Pokemon pkmn) {
        super(pkmn);
    }
}