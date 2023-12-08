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
/*The user has 1/16 of its maximum HP, rounded down, restored at the end of each turn while it remains active. If Big Root is held by the user, the HP recovered is 1.3x normal, rounded half down. If the user uses Baton Pass, the replacement will receive the healing effect.*/
 public class Aqua_Ring extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon) {
        this.add("-start", pokemon, "Aqua Ring");
      }*/
/*@Override
 void 6*/
/*@Override
 void onResidual(pokemon) {
        this.heal(pokemon.baseMaxhp / 16);
      }*/
public Aqua_Ring(Pokemon pkmn) {
        super(pkmn);
    }
}