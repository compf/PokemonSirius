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
/*Lowers the target's Speed by 1 stage. Until the target switches out, the effectiveness of Fire-type moves is doubled against it.*/
 public class Tar_Shot extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon) {
        if (pokemon.terastallized)
          return false;
        this.add("-start", pokemon, "Tar Shot");
      }*/
/*@Override
 void -2*/
/*@Override
 void onEffectiveness(typeMod, Pokemon target, type, move) {
        if (move.type !== "Fire")
          return;
        if (!target)
          return;
        if (type !== target.getTypes()[0])
          return;
        return typeMod + 1;
      }*/
public Tar_Shot(Pokemon pkmn) {
        super(pkmn);
    }
}