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
/*Deals damage to the target equal to the target's maximum HP. Ignores accuracy and evasiveness modifiers. This attack's accuracy is equal to (user's level - target's level + X)%, where X is 30 if the user is an Ice type and 20 otherwise, and fails if the target is at a higher level. Ice-type Pokemon and Pokemon with the Sturdy Ability are immune.*/
 public class Sheer_Cold extends PokemonBattleEffect{

public Sheer_Cold(Pokemon pkmn) {
        super(pkmn);
    }
}