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
/*Has a higher chance for a critical hit. If the user is an Ogerpon holding a mask, this move's type changes to match. Water type for Wellspring Mask, Fire type for Hearthflame Mask, and Rock type for Cornerstone Mask.*/
 public class Ivy_Cudgel extends PokemonBattleEffect{

/*@Override
 void onPrepareHit(Pokemon target, Pokemon source, move) {
      if (move.type !== "Grass") {
        this.attrLastMove("[anim] Ivy Cudgel " + move.type);
      }
    }*/
/*@Override
 void onModifyType(Move move, pokemon) {
      switch (pokemon.species.name) {
        case "Ogerpon-Wellspring":
        case "Ogerpon-Wellspring-Tera":
          move.type = "Water";
          break;
        case "Ogerpon-Hearthflame":
        case "Ogerpon-Hearthflame-Tera":
          move.type = "Fire";
          break;
        case "Ogerpon-Cornerstone":
        case "Ogerpon-Cornerstone-Tera":
          move.type = "Rock";
          break;
      }
    }*/
public Ivy_Cudgel(Pokemon pkmn) {
        super(pkmn);
    }
}