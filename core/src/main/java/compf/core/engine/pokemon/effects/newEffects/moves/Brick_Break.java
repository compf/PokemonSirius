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
/*If this attack does not miss, the effects of Reflect, Light Screen, and Aurora Veil end for the target's side of the field before damage is calculated.*/
 public class Brick_Break extends PokemonBattleEffect{

/*@Override
 void onTryHit(pokemon) {
      pokemon.side.removeSideCondition("reflect");
      pokemon.side.removeSideCondition("lightscreen");
      pokemon.side.removeSideCondition("auroraveil");
    }*/
public Brick_Break(Pokemon pkmn) {
        super(pkmn);
    }
}