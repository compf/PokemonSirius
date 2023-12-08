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
/*This Pokemon's type changes to match the type of the move it is about to use. This effect comes after all effects that change a move's type. This effect can only happen once per switch-in, and only if this Pokemon is not Terastallized.*/
 public class Libero extends PokemonBattleEffect{

/*@Override
 void onPrepareHit(Pokemon source, Pokemon target, move) {
      if (this.effectState.libero)
        return;
      if (move.hasBounced || move.flags["futuremove"] || move.sourceEffect === "snatch")
        return;
      const type = move.type;
      if (type && type !== "???" && source.getTypes().join() !== type) {
        if (!source.setType(type))
          return;
        this.effectState.libero = true;
        this.add("-start", source, "typechange", type, "[from] ability: Libero");
      }
    }*/
/*@Override
 void onSwitchIn() {
      delete this.effectState.libero;
    }*/
public Libero(Pokemon pkmn) {
        super(pkmn);
    }
}