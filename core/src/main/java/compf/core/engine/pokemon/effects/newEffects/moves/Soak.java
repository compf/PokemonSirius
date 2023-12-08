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
/*Causes the target to become a Water type. Fails if the target is an Arceus or a Silvally, if the target is already purely Water type, or if the target is Terastallized.*/
 public class Soak extends PokemonBattleEffect{

/*@Override
 void onHit(target) {
      if (target.getTypes().join() === "Water" || !target.setType("Water")) {
        this.add("-fail", target);
        return null;
      }
      this.add("-start", Pokemon target, "typechange", "Water");
    }*/
public Soak(Pokemon pkmn) {
        super(pkmn);
    }
}