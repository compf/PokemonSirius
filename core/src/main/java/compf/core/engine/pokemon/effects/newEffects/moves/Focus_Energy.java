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
/*Raises the user's chance for a critical hit by 2 stages. Fails if the user already has the effect. Baton Pass can be used to transfer this effect to an ally.*/
 public class Focus_Energy extends PokemonBattleEffect{

/*@Override
 void onStart(Pokemon target, Pokemon source, effect) {
        if (effect?.id === "zpower") {
          this.add("-start", target, "move: Focus Energy", "[zeffect]");
        } else if (effect && ["costar", "imposter", "psychup", "transform"].includes(effect.id)) {
          this.add("-start", target, "move: Focus Energy", "[silent]");
        } else {
          this.add("-start", target, "move: Focus Energy");
        }
      }*/
/*@Override
 void onModifyCritRatio(critRatio) {
        return critRatio + 2;
      }*/
public Focus_Energy(Pokemon pkmn) {
        super(pkmn);
    }
}