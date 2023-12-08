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
/*This Pokemon's attacks that are super effective against the target have their damage multiplied by 1.25.*/
 public class Neuroforce extends PokemonBattleEffect{

/*@Override
 void onModifyDamage(DamageInformation damage, Pokemon source, Pokemon target, move) {
      if (move && target.getMoveHitData(move).typeMod > 0) {
        return this.chainModify([5120, 4096]);
      }
    }*/
public Neuroforce(Pokemon pkmn) {
        super(pkmn);
    }
}