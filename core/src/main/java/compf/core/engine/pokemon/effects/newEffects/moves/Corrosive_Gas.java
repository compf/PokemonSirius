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
/*The target loses its held item. This move cannot cause Pokemon with the Sticky Hold Ability to lose their held item or cause a Kyogre, a Groudon, a Giratina, an Arceus, a Genesect, a Silvally, a Zacian, or a Zamazenta to lose their Blue Orb, Red Orb, Griseous Orb, Plate, Drive, Memory, Rusted Sword, or Rusted Shield respectively. Items lost to this move cannot be regained with Recycle or the Harvest Ability.*/
 public class Corrosive_Gas extends PokemonBattleEffect{

/*@Override
 void onHit(Pokemon target, source) {
      const item = target.takeItem(source);
      if (item) {
        this.add("-enditem", target, item.name, "[from] move: Corrosive Gas", "[of] " + source);
      } else {
        this.add("-fail", target, "move: Corrosive Gas");
      }
    }*/
public Corrosive_Gas(Pokemon pkmn) {
        super(pkmn);
    }
}