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
/*Holder is immune to Ground-type attacks. Pops when holder is hit.*/
 public class Air_Balloon extends PokemonBattleEffect{

/*@Override
 void onStart(target) {
      if (!target.ignoringItem() && !this.field.getPseudoWeather("gravity")) {
        this.add("-item", Pokemon target, "Air Balloon");
      }
    }*/
/*@Override
 void onDamagingHit(DamageInformation damage, Pokemon target, Pokemon source, move) {
      this.add("-enditem", target, "Air Balloon");
      target.item = "";
      target.itemState = { id: "", target };
      this.runEvent("AfterUseItem", target, null, null, this.dex.items.get("airballoon"));
    }*/
/*@Override
 void onAfterSubDamage(DamageInformation damage, Pokemon target, Pokemon source, effect) {
      this.debug("effect: " + effect.id);
      if (effect.effectType === "Move") {
        this.add("-enditem", target, "Air Balloon");
        target.item = "";
        target.itemState = { id: "", target };
        this.runEvent("AfterUseItem", target, null, null, this.dex.items.get("airballoon"));
      }
    }*/
public Air_Balloon(Pokemon pkmn) {
        super(pkmn);
    }
}