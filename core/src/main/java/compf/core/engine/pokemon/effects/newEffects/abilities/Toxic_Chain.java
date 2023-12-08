package compf.core.engine.pokemon.effects.newEffects.abilities;

import compf.core.engine.BattleAction;
    import compf.core.engine.pokemon.PokemonStat;
    import compf.core.engine.pokemon.Pokemon;
    import compf.core.engine.pokemon.effects.EffectParam;
    import compf.core.engine.pokemon.effects.PokemonBattleEffect;
    import compf.core.engine.pokemon.moves.DamageInformation;
    import compf.core.engine.pokemon.moves.Schedule;
    import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
    import compf.core.etc.services.SharedInformation;
/*This Pokemon's moves have a 30% chance of badly poisoning. This effect comes after a move's inherent secondary effect chance.*/
 public class Toxic_Chain extends PokemonBattleEffect{

/*@Override
 void onSourceDamagingHit(DamageInformation damage, Pokemon target, Pokemon source, move) {
      if (target.hasAbility("shielddust") || target.hasItem("covertcloak"))
        return;
      if (this.randomChance(3, 10)) {
        target.trySetStatus("tox", source);
      }
    }*/
public Toxic_Chain(Pokemon pkmn) {
        super(pkmn);
    }
}