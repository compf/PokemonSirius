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
/*If the target uses a Fire-type move this turn, it is prevented from executing and the target loses 1/4 of its maximum HP, rounded half up. This effect does not happen if the Fire-type move is prevented by Primordial Sea.*/
 public class Powder extends PokemonBattleEffect{

/*@Override
 void 1*/
/*@Override
 void onStart(target) {
        this.add("-singleturn", Pokemon target, "Powder");
      }*/
/*@Override
 void -1*/
/*@Override
 void onTryMove(pokemon, Pokemon target, move) {
        if (move.type === "Fire") {
          this.add("-activate", pokemon, "move: Powder");
          this.DamageInformation damage(this.clampIntRange(Math.round(pokemon.maxhp / 4), 1));
          this.attrLastMove("[still]");
          return false;
        }
      }*/
public Powder(Pokemon pkmn) {
        super(pkmn);
    }
}