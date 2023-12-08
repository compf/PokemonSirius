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
/*Causes Normal-type moves to become Electric type this turn. The effect happens after other effects that change a move's type.*/
 public class Ion_Deluge extends PokemonBattleEffect{

/*@Override
 void 1*/
/*@Override
 void onFieldStart(Pokemon target, Pokemon source, sourceEffect) {
        this.add("-fieldactivate", "move: Ion Deluge");
        this.hint(`Normal-type moves become Electric-type after using ${sourceEffect}.`);
      }*/
/*@Override
 void -2*/
/*@Override
 void onModifyType(move) {
        if (move.type === "Normal") {
          move.type = "Electric";
          this.debug(move.name + "'s type changed to Electric");
        }
      }*/
public Ion_Deluge(Pokemon pkmn) {
        super(pkmn);
    }
}