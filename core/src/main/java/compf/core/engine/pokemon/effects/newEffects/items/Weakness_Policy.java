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
/*If holder is hit super effectively, raises Attack, Sp. Atk by 2 stages. Single use.*/
 public class Weakness_Policy extends PokemonBattleEffect{

/*@Override
 void onDamagingHit(DamageInformation damage, Pokemon target, Pokemon source, move) {
      if (!move.damage && !move.damageCallback && target.getMoveHitData(move).typeMod > 0) {
        target.useItem();
      }
    }*/
public Weakness_Policy(Pokemon pkmn) {
        super(pkmn);
    }
}