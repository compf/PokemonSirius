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
/*Causes the user's types to become the same as the current types of the target. If the target's current types include typeless and a non-added type, typeless is ignored. If the target's current types include typeless and an added type from Forest's Curse or Trick-or-Treat, typeless is copied as the Normal type instead. Fails if the user is an Arceus or a Silvally, if the user is Terastallized, or if the target's current type is typeless alone.*/
 public class Reflect_Type extends PokemonBattleEffect{

/*@Override
 void onHit(Pokemon target, source) {
      if (source.species && (source.species.num === 493 || source.species.num === 773))
        return false;
      if (source.terastallized)
        return false;
      const oldApparentType = source.apparentType;
      let newBaseTypes = target.getTypes(true).filter((type) => type !== "???");
      if (!newBaseTypes.length) {
        if (target.addedType) {
          newBaseTypes = ["Normal"];
        } else {
          return false;
        }
      }
      this.add("-start", Pokemon source, "typechange", "[from] move: Reflect Type", "[of] " + target);
      source.setType(newBaseTypes);
      source.addedType = target.addedType;
      source.knownType = target.isAlly(source) && target.knownType;
      if (!source.knownType)
        source.apparentType = oldApparentType;
    }*/
public Reflect_Type(Pokemon pkmn) {
        super(pkmn);
    }
}