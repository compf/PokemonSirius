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
/*This Pokemon's moves are changed to be Normal type and have their power multiplied by 1.2. This effect comes before other effects that change a move's type.*/
 public class Normalize extends PokemonBattleEffect{

/*@Override
 void onModifyType(Move move, pokemon) {
      const noModifyType = [
        "hiddenpower",
        "judgment",
        "multiattack",
        "naturalgift",
        "revelationdance",
        "struggle",
        "technoblast",
        "terrainpulse",
        "weatherball"
      ];
      if (!(move.isZ && move.category !== "Status") && !noModifyType.includes(move.id) && // TODO: Figure out actual interaction
      !(move.name === "Tera Blast" && pokemon.terastallized)) {
        move.type = "Normal";
        move.typeChangerBoosted = this.effect;
      }
    }*/
/*@Override
 void onBasePower(basePower, pokemon, Pokemon target, move) {
      if (move.typeChangerBoosted === this.effect)
        return this.chainModify([4915, 4096]);
    }*/
public Normalize(Pokemon pkmn) {
        super(pkmn);
    }
}