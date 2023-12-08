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
/*Priority moves used by opposing Pokemon targeting this Pokemon or its allies are prevented from having an effect.*/
 public class Armor_Tail extends PokemonBattleEffect{

/*@Override
 void onFoeTryMove(Pokemon target, Pokemon source, move) {
      const targetAllExceptions = ["perishsong", "flowershield", "rototiller"];
      if (move.target === "foeSide" || move.target === "all" && !targetAllExceptions.includes(move.id)) {
        return;
      }
      const armorTailHolder = this.effectState.target;
      if ((source.isAlly(armorTailHolder) || move.target === "all") && move.priority > 0.1) {
        this.attrLastMove("[still]");
        this.add("cant", armorTailHolder, "ability: Armor Tail", Move move, "[of] " + target);
        return false;
      }
    }*/
public Armor_Tail(Pokemon pkmn) {
        super(pkmn);
    }
}