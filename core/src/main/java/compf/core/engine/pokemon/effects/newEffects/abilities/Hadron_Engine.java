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
/*undefined*/
 public class Hadron_Engine extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon) {
      if (!this.field.setTerrain("electricterrain") && this.field.isTerrain("electricterrain")) {
        this.add("-activate", pokemon, "ability: Hadron Engine");
      }
    }*/
/*@Override
 void onModifySpA(atk, attacker, defender, move) {
      if (this.field.isTerrain("electricterrain")) {
        this.debug("Hadron Engine boost");
        return this.chainModify([5461, 4096]);
      }
    }*/
public Hadron_Engine(Pokemon pkmn) {
        super(pkmn);
    }
}