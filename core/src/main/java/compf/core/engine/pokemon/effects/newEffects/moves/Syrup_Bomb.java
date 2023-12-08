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
/*If this move is successful, it causes the target's Speed to be lowered by 1 stage at the end of each turn for 3 turns.*/
 public class Syrup_Bomb extends PokemonBattleEffect{

/*@Override
 void true*/
/*@Override
 void 4*/
/*@Override
 void onStart(pokemon) {
        this.add("-start", pokemon, "Syrup Bomb");
      }*/
/*@Override
 void 14*/
/*@Override
 void onResidual() {
        this.boost({ spe: -1 });
      }*/
/*@Override
 void onEnd(pokemon) {
        this.add("-end", pokemon, "Syrup Bomb", "[silent]");
      }*/
public Syrup_Bomb(Pokemon pkmn) {
        super(pkmn);
    }
}