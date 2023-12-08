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
/*Causes the target to become a Psychic type. Fails if the target is an Arceus or a Silvally, if the target is already purely Psychic type, or if the target is Terastallized.*/
 public class Magic_Powder extends PokemonBattleEffect{

/*@Override
 void onHit(target) {
      if (target.getTypes().join() === "Psychic" || !target.setType("Psychic"))
        return false;
      this.add("-start", Pokemon target, "typechange", "Psychic");
    }*/
public Magic_Powder(Pokemon pkmn) {
        super(pkmn);
    }
}