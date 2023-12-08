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
/*Lowers the user's Defense by 1 stage. This move cannot be used successfully unless the user's current form, while considering Transform, is Hoopa Unbound. If this move is successful, it breaks through the target's Baneful Bunker, Detect, King's Shield, Protect, or Spiky Shield for this turn, allowing other Pokemon to attack the target normally. If the target's side is protected by Crafty Shield, Mat Block, Quick Guard, or Wide Guard, that protection is also broken for this turn and other Pokemon may attack the target's side normally.*/
 public class Hyperspace_Fury extends PokemonBattleEffect{

/*@Override
 void onTry(source) {
      if (source.species.name === "Hoopa-Unbound") {
        return;
      }
      this.hint("Only a Pokemon whose form is Hoopa Unbound can use this move.");
      if (source.species.name === "Hoopa") {
        this.attrLastMove("[still]");
        this.add("-fail", Pokemon source, "move: Hyperspace Fury", "[forme]");
        return null;
      }
      this.attrLastMove("[still]");
      this.add("-fail", source, "move: Hyperspace Fury");
      return null;
    }*/
public Hyperspace_Fury(Pokemon pkmn) {
        super(pkmn);
    }
}