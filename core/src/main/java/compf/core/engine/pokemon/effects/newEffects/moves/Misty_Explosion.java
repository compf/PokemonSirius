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
/*If the current terrain is Misty Terrain and the user is grounded, this move's power is multiplied by 1.5. The user faints after using this move, even if this move fails for having no target. This move is prevented from executing if any active Pokemon has the Damp Ability.*/
 public class Misty_Explosion extends PokemonBattleEffect{

/*@Override
 void onBasePower(basePower, source) {
      if (this.field.isTerrain("mistyterrain") && source.isGrounded()) {
        this.debug("misty terrain boost");
        return this.chainModify(1.5);
      }
    }*/
public Misty_Explosion(Pokemon pkmn) {
        super(pkmn);
    }
}