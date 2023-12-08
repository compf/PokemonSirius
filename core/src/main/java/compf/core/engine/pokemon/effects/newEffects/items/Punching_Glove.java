package compf.core.engine.pokemon.effects.newEffects.items;

import compf.core.engine.BattleAction;
    import compf.core.engine.pokemon.PokemonStat;
    import compf.core.engine.pokemon.Pokemon;
    import compf.core.engine.pokemon.effects.EffectParam;
    import compf.core.engine.pokemon.effects.PokemonBattleEffect;
    import compf.core.engine.pokemon.moves.DamageInformation;
    import compf.core.engine.pokemon.moves.Schedule;
    import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
    import compf.core.etc.services.SharedInformation;
/*Holder's punch-based attacks have 1.1x power and do not make contact.*/
 public class Punching_Glove extends PokemonBattleEffect{

/*@Override
 void onBasePower(basePower, attacker, defender, move) {
      if (move.flags["punch"]) {
        this.debug("Punching Glove boost");
        return this.chainModify([4506, 4096]);
      }
    }*/
/*@Override
 void onModifyMove(move) {
      if (move.flags["punch"])
        delete move.flags["contact"];
    }*/
public Punching_Glove(Pokemon pkmn) {
        super(pkmn);
    }
}