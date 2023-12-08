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
/*Power is equal to the base move's Max Move power. If this move is successful, each Pokemon on the user's side has their critical hit ratio raised by 1 stage, even if they have a substitute.*/
 public class G_Max_Chi_Strike extends PokemonBattleEffect{

/*@Override
 void true*/
/*@Override
 void onStart(Pokemon target, Pokemon source, effect) {
        this.effectState.layers = 1;
        if (!["costar", "imposter", "psychup", "transform"].includes(effect?.id)) {
          this.add("-start", target, "move: G-Max Chi Strike");
        }
      }*/
/*@Override
 void onRestart(Pokemon target, Pokemon source, effect) {
        if (this.effectState.layers >= 3)
          return false;
        this.effectState.layers++;
        if (!["costar", "imposter", "psychup", "transform"].includes(effect?.id)) {
          this.add("-start", target, "move: G-Max Chi Strike");
        }
      }*/
/*@Override
 void onModifyCritRatio(critRatio) {
        return critRatio + this.effectState.layers;
      }*/
public G_Max_Chi_Strike(Pokemon pkmn) {
        super(pkmn);
    }
}