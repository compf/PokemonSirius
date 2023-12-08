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
/*undefined*/
 public class Poltergeist extends PokemonBattleEffect{

/*@Override
 void onTry(Pokemon source, target) {
      return !!target.item;
    }*/
/*@Override
 void onTryHit(Pokemon target, Pokemon source, move) {
      this.add("-activate", target, "move: Poltergeist", this.dex.items.get(target.item).name);
    }*/
public Poltergeist(Pokemon pkmn) {
        super(pkmn);
    }
}