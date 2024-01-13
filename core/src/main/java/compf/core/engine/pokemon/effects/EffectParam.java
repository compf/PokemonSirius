package compf.core.engine.pokemon.effects;

import compf.core.engine.BattleRule;
import compf.core.engine.Interrupt;
import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.moves.DamageInformation;
import compf.core.engine.pokemon.moves.Schedule;
import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;

//@TODO make this an interface to the battle class
public record EffectParam(Schedule schedule, Interrupt interrupt, BattleRule rule,
                          BattleEffectCollection effectCollection, AdditionalData additionalData) {
    public interface AdditionalData {

    public Pokemon getCausingPokemon();
    public  Pokemon getAffectedPokemon();
    void killFully();

    }
    public static class AdditionalStatsModifyingData implements  AdditionalData{
        private Pokemon _causingPokemon;
        private int _stat,_by;

        public AdditionalStatsModifyingData(Pokemon _causingPokemon, Pokemon _affectedPokemon,int stat,int by) {
            this._causingPokemon = _causingPokemon;
            this._affectedPokemon = _affectedPokemon;
            _stat=stat;
            _by=by;
        }

        @Override
        public void killFully() {
            _by=0;
        }

        private Pokemon _affectedPokemon;
           public Pokemon getCausingPokemon(){
                return _causingPokemon;
            }

        @Override
        public Pokemon getAffectedPokemon() {
            return _affectedPokemon;
        }
        public int getStat(){
               return _stat;
        }
        public int getBy(){
               return _by;
        }
    }
    public static class AdditionalIndirectDamageData implements  AdditionalData{
        private Pokemon _causingPokemon;
        private double _factor;

        public AdditionalIndirectDamageData(Pokemon _causingPokemon, Pokemon _affectedPokemon,double factor) {
            this._causingPokemon = _causingPokemon;
            this._affectedPokemon = _affectedPokemon;
            _factor=factor;
        }

        @Override
        public void killFully() {
            _factor=1;
        }

        private Pokemon _affectedPokemon;
        public Pokemon getCausingPokemon(){
            return _causingPokemon;
        }

        @Override
        public Pokemon getAffectedPokemon() {
            return _affectedPokemon;
        }
        public double getFactor(){
            return _factor;
        }
    }

    public static class AdditionalDirectDamageData implements AdditionalData {
        public AdditionalDirectDamageData(DamageInformation damageInf, ScheduleItem scheduleItem) {
            this._damageInf = damageInf;
            this._scheduleItem = scheduleItem;
        }

        DamageInformation _damageInf;
        ScheduleItem _scheduleItem;

        public DamageInformation getDamageInformation() {
            return _damageInf;
        }

        @Override
        public void killFully() {
            _damageInf.kill();
        }

        public ScheduleItem getScheduleItem() {
            return _scheduleItem;
        }

        @Override
        public Pokemon getAffectedPokemon() {
            return _damageInf.getDefender();
        }

        @Override
        public Pokemon getCausingPokemon() {
            return _damageInf.getAttacker();
        }
    }

    public static class AdditionalPokemonSwitchedData implements  AdditionalData{
        private Pokemon affected;
        private int from,to;
        public AdditionalPokemonSwitchedData(int from,int to,Pokemon pokemon) {
            affected=pokemon;
            this.from=from;
            this.to=to;
        }
        public int getFrom(){
            return from;
        }

        public int getTo() {
            return to;
        }

        @Override
        public Pokemon getCausingPokemon() {
            return affected;
        }

        @Override
        public Pokemon getAffectedPokemon() {
            return affected;
        }

        @Override
        public void killFully() {

        }
    }
    public static class AdditionalBattleEffectAddedData implements AdditionalData{
        private BattleEffect addedEffect;
        public BattleEffect getAddedEffect() {
            return addedEffect;
        }
        public Pokemon getCausingPokemon(){
           return null;
        }
        public Pokemon getAffectedPokemon(){
            if(addedEffect instanceof PokemonBattleEffect){
                return ((PokemonBattleEffect)addedEffect).getPokemon();
            }
            return null;
        }
        public AdditionalBattleEffectAddedData(BattleEffect addedEffect) {
            this.addedEffect=addedEffect;
        }
        @Override
        public void killFully() {
            addedEffect.disable();
            
        }
    }
}
