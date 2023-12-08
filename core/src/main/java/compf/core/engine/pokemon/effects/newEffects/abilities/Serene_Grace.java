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
/*This Pokemon's moves have their secondary effect chance doubled. This effect stacks with the Rainbow effect, except for secondary effects that cause the target to flinch.*/
 public class Serene_Grace extends PokemonBattleEffect{

/*@Override
 void onModifyMove(move) {
      if (move.secondaries) {
        this.debug("doubling secondary chance");
        for (const secondary of move.secondaries) {
          if (secondary.chance)
            secondary.chance *= 2;
        }
      }
      if (move.self?.chance)
        move.self.chance *= 2;
    }*/
public Serene_Grace(Pokemon pkmn) {
        super(pkmn);
    }
}