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
/*The user restores 1/2 of its maximum HP, rounded half up. If the user is not Terastallized, until the end of the turn Flying-type users lose their Flying type and pure Flying-type users become Normal type. Does nothing if the user's HP is full.*/
 public class Roost extends PokemonBattleEffect{

/*@Override
 void 1*/
/*@Override
 void 25*/
/*@Override
 void onStart(target) {
        if (!target.terastallized) {
          this.add("-singleturn", Pokemon target, "move: Roost");
        } else if (target.terastallized === "Flying") {
          this.add("-hint", "If a Flying Terastallized Pokemon uses Roost, it remains Flying-type.");
        }
      }*/
/*@Override
 void -1*/
/*@Override
 void onType(types, pokemon) {
        this.effectState.typeWas = types;
        return types.filter((type) => type !== "Flying");
      }*/
public Roost(Pokemon pkmn) {
        super(pkmn);
    }
}