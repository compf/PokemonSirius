package compf.core.engine.pokemon.effects;

import compf.core.engine.BattleRule;
import compf.core.engine.Interrupt;
import compf.core.engine.pokemon.moves.DamageInformation;
import compf.core.engine.pokemon.moves.Schedule;
import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;

public record EffectParam(DamageInformation damageInf, ScheduleItem scheduleItem, Schedule schedule, Interrupt interrupt,BattleRule rule) {
 

}
