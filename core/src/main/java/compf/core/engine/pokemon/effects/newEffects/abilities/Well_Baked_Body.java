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
/*This Pokemon is immune to Fire-type moves and raises its Defense by 2 stages when hit by a Fire-type move.*/
 public class Well_Baked_Body extends PokemonBattleEffect{

/*@Override
 void onTryHit(Pokemon target, Pokemon source, move) {
      if (target !== source && move.type === "Fire") {
        if (!this.boost({ def: 2 })) {
          this.add("-immune", target, "[from] ability: Well-Baked Body");
        }
        return null;
      }
    }*/
public Well_Baked_Body(Pokemon pkmn) {
        super(pkmn);
    }
}