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
/*undefined*/
 public class Toxic_Debris extends PokemonBattleEffect{

/*@Override
 void onDamagingHit(DamageInformation damage, Pokemon target, Pokemon source, move) {
      const side = source.isAlly(target) ? source.side.foe : source.side;
      const toxicSpikes = side.sideConditions["toxicspikes"];
      if (move.category === "Physical" && (!toxicSpikes || toxicSpikes.layers < 2)) {
        this.add("-activate", target, "ability: Toxic Debris");
        side.addSideCondition("toxicspikes", target);
      }
    }*/
public Toxic_Debris(Pokemon pkmn) {
        super(pkmn);
    }
}