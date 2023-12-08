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
/*Deals damage two turns after this move is used. At the end of that turn, the damage is calculated at that time and dealt to the Pokemon at the position the target had when the move was used. If the user is no longer active at the time, damage is calculated based on the user's natural Special Attack stat, types, and level, with no boosts from its held item or Ability. Fails if this move or Doom Desire is already in effect for the target's position.*/
 public class Future_Sight extends PokemonBattleEffect{

/*@Override
 void onTry(Pokemon source, target) {
      if (!target.side.addSlotCondition(Pokemon target, "futuremove"))
        return false;
      Object.assign(target.side.slotConditions[target.position]["futuremove"], {
        duration: 3,
        move: "futuresight",
        source,
        moveData: {
          id: "futuresight",
          name: "Future Sight",
          accuracy: 100,
          basePower: 120,
          category: "Special",
          priority: 0,
          flags: { allyanim: 1, futuremove: 1 },
          ignoreImmunity: false,
          effectType: "Move",
          type: "Psychic"
        }
      });
      this.add("-start", source, "move: Future Sight");
      return this.NOT_FAIL;
    }*/
public Future_Sight(Pokemon pkmn) {
        super(pkmn);
    }
}