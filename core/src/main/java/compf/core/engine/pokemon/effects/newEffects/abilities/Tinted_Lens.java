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
/*undefined*/
 public class Tinted_Lens extends PokemonBattleEffect{

/*@Override
 void onModifyDamage(DamageInformation damage, Pokemon source, Pokemon target, move) {
      if (target.getMoveHitData(move).typeMod < 0) {
        this.debug("Tinted Lens boost");
        return this.chainModify(2);
      }
    }*/
public Tinted_Lens(Pokemon pkmn) {
        super(pkmn);
    }
}