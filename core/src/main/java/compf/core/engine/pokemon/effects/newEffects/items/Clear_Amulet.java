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
/*Prevents other Pokemon from lowering the holder's stat stages.*/
 public class Clear_Amulet extends PokemonBattleEffect{

/*@Override
 void onTryBoost(boost, Pokemon target, Pokemon source, effect) {
      if (source && target === source)
        return;
      let showMsg = false;
      let i;
      for (i in boost) {
        if (boost[i] < 0) {
          delete boost[i];
          showMsg = true;
        }
      }
      if (showMsg && !effect.secondaries && effect.id !== "octolock") {
        this.add("-fail", target, "unboost", "[from] item: Clear Amulet", "[of] " + target);
      }
    }*/
public Clear_Amulet(Pokemon pkmn) {
        super(pkmn);
    }
}