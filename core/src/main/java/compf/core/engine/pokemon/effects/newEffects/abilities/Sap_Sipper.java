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
/*This Pokemon is immune to Grass-type moves and raises its Attack by 1 stage when hit by a Grass-type move.*/
 public class Sap_Sipper extends PokemonBattleEffect{

/*@Override
 void onTryHit(Pokemon target, Pokemon source, move) {
      if (target !== source && move.type === "Grass") {
        if (!this.boost({ atk: 1 })) {
          this.add("-immune", target, "[from] ability: Sap Sipper");
        }
        return null;
      }
    }*/
/*@Override
 void onAllyTryHitSide(Pokemon target, Pokemon source, move) {
      if (source === this.effectState.target || !target.isAlly(source))
        return;
      if (move.type === "Grass") {
        this.boost({ atk: 1 }, this.effectState.target);
      }
    }*/
public Sap_Sipper(Pokemon pkmn) {
        super(pkmn);
    }
}