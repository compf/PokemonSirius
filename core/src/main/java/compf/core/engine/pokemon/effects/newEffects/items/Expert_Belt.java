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
/*Holder's attacks that are super effective against the target do 1.2x damage.*/
 public class Expert_Belt extends PokemonBattleEffect{

/*@Override
 void onModifyDamage(DamageInformation damage, Pokemon source, Pokemon target, move) {
      if (move && target.getMoveHitData(move).typeMod > 0) {
        return this.chainModify([4915, 4096]);
      }
    }*/
public Expert_Belt(Pokemon pkmn) {
        super(pkmn);
    }
}