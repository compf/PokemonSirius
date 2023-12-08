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
/*All active Pokemon consume their held Berries. This effect is not prevented by substitutes, the Klutz or Unnerve Abilities, or the effects of Embargo or Magic Room. Fails if no active Pokemon is holding a Berry.*/
 public class Teatime extends PokemonBattleEffect{

/*@Override
 void onHitField(Pokemon target, Pokemon source, move) {
      const targets = [];
      for (const pokemon of this.getAllActive()) {
        if (this.runEvent("Invulnerability", pokemon, source, move) === false) {
          this.add("-miss", source, pokemon);
        } else if (this.runEvent("TryHit", pokemon, source, move) && pokemon.getItem().isBerry) {
          targets.push(pokemon);
        }
      }
      this.add("-fieldactivate", "move: Teatime");
      if (!targets.length) {
        this.add("-fail", source, "move: Teatime");
        this.attrLastMove("[still]");
        return this.NOT_FAIL;
      }
      for (const pokemon of targets) {
        pokemon.eatItem(true);
      }
    }*/
public Teatime(Pokemon pkmn) {
        super(pkmn);
    }
}