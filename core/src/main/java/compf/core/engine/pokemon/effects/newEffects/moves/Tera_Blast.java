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
/*If the user is Terastallized, this move becomes a physical attack if the user's Attack is greater than its Special Attack, including stat stage changes, and this move's type becomes the same as the user's Tera Type.*/
 public class Tera_Blast extends PokemonBattleEffect{

/*@Override
 void onPrepareHit(Pokemon target, Pokemon source, move) {
      if (source.terastallized) {
        this.attrLastMove("[anim] Tera Blast " + source.teraType);
      }
    }*/
/*@Override
 void onModifyType(Move move, pokemon, target) {
      if (pokemon.terastallized) {
        move.type = pokemon.teraType;
      }
    }*/
/*@Override
 void onModifyMove(Move move, pokemon) {
      if (pokemon.terastallized && pokemon.getStat("atk", false, true) > pokemon.getStat("spa", false, true)) {
        move.category = "Physical";
      }
    }*/
public Tera_Blast(Pokemon pkmn) {
        super(pkmn);
    }
}