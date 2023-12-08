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
/*Until the end of the next turn, the user's attacks will be critical hits.*/
 public class Laser_Focus extends PokemonBattleEffect{

/*@Override
 void 2*/
/*@Override
 void onStart(pokemon, Pokemon source, effect) {
        if (effect && ["costar", "imposter", "psychup", "transform"].includes(effect.id)) {
          this.add("-start", pokemon, "move: Laser Focus", "[silent]");
        } else {
          this.add("-start", pokemon, "move: Laser Focus");
        }
      }*/
/*@Override
 void onRestart(pokemon) {
        this.effectState.duration = 2;
        this.add("-start", pokemon, "move: Laser Focus");
      }*/
/*@Override
 void onModifyCritRatio(critRatio) {
        return 5;
      }*/
/*@Override
 void onEnd(pokemon) {
        this.add("-end", pokemon, "move: Laser Focus", "[silent]");
      }*/
public Laser_Focus(Pokemon pkmn) {
        super(pkmn);
    }
}