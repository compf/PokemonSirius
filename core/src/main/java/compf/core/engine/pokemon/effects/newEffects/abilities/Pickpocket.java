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
/*If this Pokemon has no item and is hit by a contact move, it steals the attacker's item. This effect applies after all hits from a multi-hit move. This effect is prevented if the move had a secondary effect removed by the Sheer Force Ability.*/
 public class Pickpocket extends PokemonBattleEffect{

/*@Override
 void onAfterMoveSecondary(Pokemon target, Pokemon source, move) {
      if (source && source !== target && move?.flags["contact"]) {
        if (target.item || target.switchFlag || target.forceSwitchFlag || source.switchFlag === true) {
          return;
        }
        const yourItem = source.takeItem(target);
        if (!yourItem) {
          return;
        }
        if (!target.setItem(yourItem)) {
          source.item = yourItem.id;
          return;
        }
        this.add("-enditem", source, yourItem, "[silent]", "[from] ability: Pickpocket", "[of] " + source);
        this.add("-item", target, yourItem, "[from] ability: Pickpocket", "[of] " + source);
      }
    }*/
public Pickpocket(Pokemon pkmn) {
        super(pkmn);
    }
}