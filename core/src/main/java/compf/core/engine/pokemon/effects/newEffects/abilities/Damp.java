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
/*While this Pokemon is active, Explosion, Mind Blown, Misty Explosion, Self-Destruct, and the Aftermath Ability are prevented from having an effect.*/
 public class Damp extends PokemonBattleEffect{

/*@Override
 void onAnyTryMove(Pokemon target, Pokemon source, effect) {
      if (["explosion", "mindblown", "mistyexplosion", "selfdestruct"].includes(effect.id)) {
        this.attrLastMove("[still]");
        this.add("cant", this.effectState.target, "ability: Damp", effect, "[of] " + target);
        return false;
      }
    }*/
/*@Override
 void onAnyDamage(DamageInformation damage, Pokemon target, Pokemon source, effect) {
      if (effect && effect.name === "Aftermath") {
        return false;
      }
    }*/
public Damp(Pokemon pkmn) {
        super(pkmn);
    }
}