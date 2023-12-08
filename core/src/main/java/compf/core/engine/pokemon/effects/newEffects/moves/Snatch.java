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
/*If another Pokemon uses certain non-damaging moves this turn, the user steals that move to use itself. If multiple Pokemon use one of those moves this turn, the applicable moves are all stolen by the first Pokemon in turn order that used this move this turn. This effect is ignored while the user is under the effect of Sky Drop.*/
 public class Snatch extends PokemonBattleEffect{

/*@Override
 void 1*/
/*@Override
 void onStart(pokemon) {
        this.add("-singleturn", pokemon, "Snatch");
      }*/
/*@Override
 void -1*/
/*@Override
 void onAnyPrepareHit(Pokemon source, Pokemon target, move) {
        const snatchUser = this.effectState.source;
        if (snatchUser.isSkyDropped())
          return;
        if (!move || move.isZ || move.isMax || !move.flags["snatch"] || move.sourceEffect === "snatch") {
          return;
        }
        snatchUser.removeVolatile("snatch");
        this.add("-activate", snatchUser, "move: Snatch", "[of] " + source);
        this.actions.useMove(move.id, snatchUser);
        return null;
      }*/
public Snatch(Pokemon pkmn) {
        super(pkmn);
    }
}