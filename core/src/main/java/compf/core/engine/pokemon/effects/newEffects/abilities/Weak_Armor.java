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
/*If a physical attack hits this Pokemon, its Defense is lowered by 1 stage and its Speed is raised by 2 stages.*/
 public class Weak_Armor extends PokemonBattleEffect{

/*@Override
 void onDamagingHit(DamageInformation damage, Pokemon target, Pokemon source, move) {
      if (move.category === "Physical") {
        this.boost({ def: -1, spe: 2 }, target, target);
      }
    }*/
public Weak_Armor(Pokemon pkmn) {
        super(pkmn);
    }
}