package compf.core.engine.pokemon.effects.newEffects.items;

import compf.core.engine.BattleAction;
    import compf.core.engine.pokemon.PokemonStat;
    import compf.core.engine.pokemon.Pokemon;
    import compf.core.engine.pokemon.effects.EffectParam;
    import compf.core.engine.pokemon.effects.PokemonBattleEffect;
    import compf.core.engine.pokemon.moves.DamageInformation;
    import compf.core.engine.pokemon.moves.Schedule;
    import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
    import compf.core.etc.services.SharedInformation;
/*Cannot be given to or taken from a Pokemon, except by Covet/Knock Off/Thief.*/
 public class Mail extends PokemonBattleEffect{

/*@Override
 void onTakeItem(item, source) {
      if (!this.activeMove)
        return false;
      if (this.activeMove.id !== "knockoff" && this.activeMove.id !== "thief" && this.activeMove.id !== "covet")
        return false;
    }*/
public Mail(Pokemon pkmn) {
        super(pkmn);
    }
}