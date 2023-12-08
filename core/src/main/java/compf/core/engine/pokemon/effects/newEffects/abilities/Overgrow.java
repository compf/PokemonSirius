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
/*When this Pokemon has 1/3 or less of its maximum HP, rounded down, its offensive stat is multiplied by 1.5 while using a Grass-type attack.*/
 public class Overgrow extends PokemonBattleEffect{

/*@Override
 void onModifyAtk(atk, attacker, defender, move) {
      if (move.type === "Grass" && attacker.hp <= attacker.maxhp / 3) {
        this.debug("Overgrow boost");
        return this.chainModify(1.5);
      }
    }*/
/*@Override
 void onModifySpA(atk, attacker, defender, move) {
      if (move.type === "Grass" && attacker.hp <= attacker.maxhp / 3) {
        this.debug("Overgrow boost");
        return this.chainModify(1.5);
      }
    }*/
public Overgrow(Pokemon pkmn) {
        super(pkmn);
    }
}