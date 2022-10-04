package compf.core.engine.pokemon.moves;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

import compf.core.engine.*;
import compf.core.engine.pokemon.Pokemon;
import compf.core.etc.MyObject;

public class Schedule {
    public void add(ScheduleItem item) {
        this._internList.add(item);
    }

    public ScheduleItem find(int uid) {
        return _internList.stream().filter((obj)->obj._uid==uid).findFirst().orElseThrow();
    }

    public static class ScheduleItem implements Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		PokemonBattle _battle;
		int _attacker;
		int _defender;
		byte _priority;
		int _round;
		int _id;
		 int _uid;

		DamageInformation _dmg;
		boolean _executed = false;
		
		public DamageInformation execute() {
			var att=_battle.getPokemon(_attacker);
			var def = _battle.getPokemon(_defender);

			DamageInformation dmgInf;
			var move=SharedInformation.Instance.getMove(_id);
			int accuracy=(int)(move.getAccuracy()*att.getStatStageFactor(6)*def.getStatStageFactor(7));
			if(att.getMoveIndex(move)==-1){
			    MyObject.nop();
            }
			if (MyObject.checkPerc(accuracy)) {
				dmgInf = move.execute(this);
				att.changeMovePP(att.getMoveIndex(move), -1);
				_dmg = dmgInf;
			} else {
				dmgInf = new DamageInformation(att,_id);
				

				_dmg = dmgInf;
			}
			return dmgInf;
		}

		public Pokemon getAttacker() {
			return _battle.getPokemon(_attacker);
		}

		public Pokemon getDefender() {
			return _battle.getPokemon(_defender);
		}
		public Move getMove() {
			return SharedInformation.Instance.getMove(_id);
		}
		public int getAttackerPos() {return _attacker;}
		public int getDefenderPos() {return _defender;}
		static StringBuilder builder = new StringBuilder();

		private ScheduleItem(PokemonBattle battle) {
			_battle=battle;

			_uid=battle.getUID();
		}

		@Override
		public String toString() {
			builder.setLength(0);
			builder.append('\n');
			builder.append(_battle.getPokemon(_attacker).toString());
			builder.append( " used ");
			builder.append( SharedInformation.Instance.getMove(_id).getName());
			builder.append( " on ");
			builder.append( getDefender().toString());
				builder.append(	 " which made " + _dmg.getDamage() + " damage");
			builder.append('\n');
			// builder.append("Updated Stats " + getDefender().getName()+"
			// "+getDefender().getCurrHP() );
			return builder.toString();
		}

		

		public static ScheduleItem deserialize(ByteBuffer buffer,PokemonBattle battle) {
			ScheduleItem item=new ScheduleItem(battle);
			item._attacker=buffer.get();
			item._defender=buffer.get();
			item._priority=buffer.get();
			item._round=buffer.getInt();
			item._id=buffer.getInt();
			item._uid=buffer.getInt();
			return item;
		}

		public int getDamage() {
			// TODO Auto-generated method stub
			return _dmg.getDamage();
		}

     

        public int getUID() {
		    return _uid;
        }

		public int getID() {
			return _id;
		}
	}
	
	public Schedule(PokemonBattle battle) {
		_battle = battle;
	}
	public void clear(int att){
    	for(var item:_internList){
    		if(item._attacker==att){
    			item._executed=true;
			}
		}
	}
	private PokemonBattle _battle;
	private ArrayList<ScheduleItem> _internList = new ArrayList<>();
	private static ScheduleItemComparator _comp = new ScheduleItemComparator();
	public final MutableOptional<Boolean> otherSideState=new MutableOptional<>();
	public ScheduleItem getNext() {

		var resultOptional = _internList.stream().filter((obj) -> !obj._executed && obj._round == _currRound)
				.sorted(_comp).findFirst();
		var result = resultOptional.orElseThrow();
		result._executed = true;
		return result;
	}

	public ScheduleItem getJustAdded() {
		return _internList.get(_internList.size() - 1);
	}

	public boolean any() {
		return _internList.stream().filter((obj) -> !obj._executed && obj._round == _currRound).count() > 0;
	}

	public void incrementRound() {
		_currRound++;
	}

	public void addMove(int attacker, int defender, int mvIndex, int deltaRound) {
		var scheduleItem = new ScheduleItem(_battle);
		var mv=SharedInformation.Instance.getMove(mvIndex);
		scheduleItem._attacker = attacker;
		scheduleItem._defender = defender;
		scheduleItem._id = mvIndex;

		scheduleItem._priority = mv.getPriority();
        if(scheduleItem.getAttacker().getStat(5)<scheduleItem.getDefender().getStat(5)
                ||scheduleItem.getAttacker().getStat(5)==scheduleItem.getDefender().getStat(5) && MyObject.RNG.nextBoolean() ){
            scheduleItem._priority=(byte)(-scheduleItem._priority);
        }
        else if((scheduleItem.getAttacker().getStat(5)>scheduleItem.getDefender().getStat(5))
                ||scheduleItem.getAttacker().getStat(5)==scheduleItem.getDefender().getStat(5) && MyObject.RNG.nextBoolean()){
            scheduleItem._priority*=2;
        }

		scheduleItem._round = _currRound + deltaRound;
		scheduleItem._defender = defender;
		_internList.add(scheduleItem);
	}

	private int _currRound;

	private static class ScheduleItemComparator implements Comparator<ScheduleItem> {
//Note: this comparator imposes orderings that are inconsistent with equals."
		@Override
		public int compare(ScheduleItem o1, ScheduleItem o2) {

		    if(o1._priority>o2._priority)return 1;
		    else if(o1._priority<o2._priority)return -1;
		    else{
                var att1=o1._battle.getPokemon(o1._attacker);

                var att2=o2._battle.getPokemon(o2._attacker);
               if(att1.getStat(5)>att2.getStat(5))return +1;
               else if(att1.getStat(5)<att2.getStat(5))return -1;
               else {
                   int rndVal=MyObject.RNG.nextInt(1);
                   if(rndVal==0)return -1;
                   else return +1;
               }

            }



		}

	}

	public boolean isBalanched() {
		return !otherSideState.isPresent() || otherSideState.isPresent() && otherSideState.get();
	}

	public boolean allPlayersGaveInput(int maxNumber) {
		long scheduleSize=_internList.stream().filter((item)->item._round==_currRound+1).map(x->x._attacker).collect(Collectors.toSet()).stream().count();
		for(var s:_internList){
			System.out.println("Schedule " +s._round +" "+ s._attacker+ " " +scheduleSize);
		}
		return scheduleSize==maxNumber;
	}

	
}
