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
/*Hits twice. If the first hit breaks the target's substitute, it will take damage for the second hit. In Double Battles, this move attempts to hit the targeted Pokemon and its ally once each. If hitting one of these Pokemon would be prevented by immunity, protection, semi-invulnerability, an Ability, or accuracy, it attempts to hit the other Pokemon twice instead. If this move is redirected, it hits that target twice.*/
 public class Dragon_Darts extends PokemonBattleEffect{

public Dragon_Darts(Pokemon pkmn) {
        super(pkmn);
    }
}