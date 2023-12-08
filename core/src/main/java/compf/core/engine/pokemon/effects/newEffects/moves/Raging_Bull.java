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
/*If this attack does not miss, the effects of Reflect, Light Screen, and Aurora Veil end for the target's side of the field before damage is calculated. If the user's current form is a Paldean Tauros, this move's type changes to match. Fighting type for Combat Breed, Fire type for Blaze Breed, and Water type for Aqua Breed.*/
 public class Raging_Bull extends PokemonBattleEffect{

/*@Override
 void onTryHit(pokemon) {
      pokemon.side.removeSideCondition("reflect");
      pokemon.side.removeSideCondition("lightscreen");
      pokemon.side.removeSideCondition("auroraveil");
    }*/
/*@Override
 void onModifyType(Move move, pokemon) {
      switch (pokemon.species.name) {
        case "Tauros-Paldea-Combat":
          move.type = "Fighting";
          break;
        case "Tauros-Paldea-Blaze":
          move.type = "Fire";
          break;
        case "Tauros-Paldea-Aqua":
          move.type = "Water";
          break;
      }
    }*/
public Raging_Bull(Pokemon pkmn) {
        super(pkmn);
    }
}