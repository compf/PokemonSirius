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
/*The user's type changes to match a type that resists or is immune to the type of the last move used by the target, but not either of its current types. The determined type of the move is used rather than the original type. Fails if the target has not made a move, if the user cannot change its type, or if this move would only be able to select one of the user's current types.*/
 public class Conversion_2 extends PokemonBattleEffect{

/*@Override
 void onHit(Pokemon target, source) {
      if (!target.lastMoveUsed) {
        return false;
      }
      const possibleTypes = [];
      const attackType = target.lastMoveUsed.type;
      for (const type of this.dex.types.names()) {
        if (source.hasType(type))
          continue;
        const typeCheck = this.dex.types.get(type).damageTaken[attackType];
        if (typeCheck === 2 || typeCheck === 3) {
          possibleTypes.push(type);
        }
      }
      if (!possibleTypes.length) {
        return false;
      }
      const randomType = this.sample(possibleTypes);
      if (!source.setType(randomType))
        return false;
      this.add("-start", Pokemon source, "typechange", randomType);
    }*/
public Conversion_2(Pokemon pkmn) {
        super(pkmn);
    }
}