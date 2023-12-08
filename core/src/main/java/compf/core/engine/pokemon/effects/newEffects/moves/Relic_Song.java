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
/*Has a 10% chance to cause the target to fall asleep. If this move is successful on at least one target and the user is a Meloetta, it changes to Pirouette Forme if it is currently in Aria Forme, or changes to Aria Forme if it is currently in Pirouette Forme. This forme change does not happen if the Meloetta has the Sheer Force Ability. The Pirouette Forme reverts to Aria Forme when Meloetta is not active.*/
 public class Relic_Song extends PokemonBattleEffect{

/*@Override
 void onHit(Pokemon target, pokemon, move) {
      if (pokemon.baseSpecies.baseSpecies === "Meloetta" && !pokemon.transformed) {
        move.willChangeForme = true;
      }
    }*/
/*@Override
 void onAfterMoveSecondarySelf(pokemon, Pokemon target, move) {
      if (move.willChangeForme) {
        const meloettaForme = pokemon.species.id === "meloettapirouette" ? "" : "-Pirouette";
        pokemon.formeChange("Meloetta" + meloettaForme, this.effect, false, "[msg]");
      }
    }*/
public Relic_Song(Pokemon pkmn) {
        super(pkmn);
    }
}