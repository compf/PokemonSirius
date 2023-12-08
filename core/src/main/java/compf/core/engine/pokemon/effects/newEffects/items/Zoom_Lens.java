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
/*The accuracy of attacks by the holder is 1.2x if it moves after its target.*/
 public class Zoom_Lens extends PokemonBattleEffect{

/*@Override
 void onSourceModifyAccuracy(accuracy, target) {
      if (typeof accuracy === "number" && !this.queue.willMove(target)) {
        this.debug("Zoom Lens boosting accuracy");
        return this.chainModify([4915, 4096]);
      }
    }*/
public Zoom_Lens(Pokemon pkmn) {
        super(pkmn);
    }
}