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
/*This Pokemon's attacks without a chance to make the target flinch gain a 10% chance to make the target flinch.*/
 public class Stench extends PokemonBattleEffect{

/*@Override
 void onModifyMove(move) {
      if (move.category !== "Status") {
        this.debug("Adding Stench flinch");
        if (!move.secondaries)
          move.secondaries = [];
        for (const secondary of move.secondaries) {
          if (secondary.volatileStatus === "flinch")
            return;
        }
        move.secondaries.push({
          chance: 10,
          volatileStatus: "flinch"
        });
      }
    }*/
public Stench(Pokemon pkmn) {
        super(pkmn);
    }
}