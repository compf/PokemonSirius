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
/*When this Pokemon is hit by an attack, the Speed of all other Pokemon on the field is lowered by 1 stage.*/
 public class Cotton_Down extends PokemonBattleEffect{

/*@Override
 void onDamagingHit(DamageInformation damage, Pokemon target, Pokemon source, move) {
      let activated = false;
      for (const pokemon of this.getAllActive()) {
        if (pokemon === target || pokemon.fainted)
          continue;
        if (!activated) {
          this.add("-ability", target, "Cotton Down");
          activated = true;
        }
        this.boost({ spe: -1 }, pokemon, target, null, true);
      }
    }*/
public Cotton_Down(Pokemon pkmn) {
        super(pkmn);
    }
}