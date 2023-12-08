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
 public class Sharpness extends PokemonBattleEffect{

/*@Override
 void onBasePower(basePower, attacker, defender, move) {
      if (move.flags["slicing"]) {
        this.debug("Shapness boost");
        return this.chainModify(1.5);
      }
    }*/
public Sharpness(Pokemon pkmn) {
        super(pkmn);
    }
}