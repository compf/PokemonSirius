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
/*Causes the target to fall asleep. This move cannot be used successfully unless the user's current form, while considering Transform, is Darkrai.*/
 public class Dark_Void extends PokemonBattleEffect{

/*@Override
 void onTry(Pokemon source, Pokemon target, move) {
      if (source.species.name === "Darkrai" || move.hasBounced) {
        return;
      }
      this.add("-fail", source, "move: Dark Void");
      this.hint("Only a Pokemon whose form is Darkrai can use this move.");
      return null;
    }*/
public Dark_Void(Pokemon pkmn) {
        super(pkmn);
    }
}