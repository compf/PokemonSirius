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
/*The user's type changes to match the original type of the move in its first move slot. Fails if the user cannot change its type, or if the type is one of the user's current types.*/
 public class Conversion extends PokemonBattleEffect{

/*@Override
 void onHit(target) {
      const type = this.dex.moves.get(target.moveSlots[0].id).type;
      if (target.hasType(type) || !target.setType(type))
        return false;
      this.add("-start", Pokemon target, "typechange", type);
    }*/
public Conversion(Pokemon pkmn) {
        super(pkmn);
    }
}