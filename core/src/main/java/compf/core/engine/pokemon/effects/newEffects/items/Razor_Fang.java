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
/*Holder's attacks without a chance to make the target flinch gain a 10% chance to make the target flinch. Evolves Gligar into Gliscor when held and leveled up during the night.*/
 public class Razor_Fang extends PokemonBattleEffect{

/*@Override
 void onModifyMove(move) {
      if (move.category !== "Status") {
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
public Razor_Fang(Pokemon pkmn) {
        super(pkmn);
    }
}