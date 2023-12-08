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
/*This Pokemon's moves and their effects ignore certain Abilities of other Pokemon. The Abilities that can be negated are Aroma Veil, Aura Break, Battle Armor, Big Pecks, Bulletproof, Clear Body, Contrary, Damp, Dazzling, Disguise, Dry Skin, Filter, Flash Fire, Flower Gift, Flower Veil, Fluffy, Friend Guard, Fur Coat, Grass Pelt, Heatproof, Heavy Metal, Hyper Cutter, Ice Face, Ice Scales, Immunity, Inner Focus, Insomnia, Keen Eye, Leaf Guard, Levitate, Light Metal, Lightning Rod, Limber, Magic Bounce, Magma Armor, Marvel Scale, Mirror Armor, Motor Drive, Multiscale, Oblivious, Overcoat, Own Tempo, Pastel Veil, Punk Rock, Queenly Majesty, Sand Veil, Sap Sipper, Shell Armor, Shield Dust, Simple, Snow Cloak, Solid Rock, Soundproof, Sticky Hold, Storm Drain, Sturdy, Suction Cups, Sweet Veil, Tangled Feet, Telepathy, Thick Fat, Unaware, Vital Spirit, Volt Absorb, Water Absorb, Water Bubble, Water Veil, White Smoke, Wonder Guard, and Wonder Skin. This affects every other Pokemon on the field, whether or not it is a target of this Pokemon's move, and whether or not their Ability is beneficial to this Pokemon.*/
 public class Teravolt extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon) {
      this.add("-ability", pokemon, "Teravolt");
    }*/
/*@Override
 void onModifyMove(move) {
      move.ignoreAbility = true;
    }*/
public Teravolt(Pokemon pkmn) {
        super(pkmn);
    }
}