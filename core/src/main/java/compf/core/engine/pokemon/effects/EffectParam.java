package compf.core.engine.pokemon.effects;

import compf.core.engine.pokemon.moves.DamageInformation;
import compf.core.engine.pokemon.moves.Schedule;
import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;

public record EffectParam(DamageInformation damageInf,ScheduleItem scheduleItem,Schedule schedule) {
 

}
