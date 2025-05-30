package compf.core.engine.pokemon.moves;

import java.io.Serial;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

import compf.core.engine.*;
import compf.core.engine.pokemon.Pokemon;
import compf.core.etc.CallerInformation;
import compf.core.etc.MyObject;
import compf.core.etc.services.SharedInformation;;

public class Schedule {
	public void add(ScheduleItem item) {
		this._internList.add(item);
	}

	public ScheduleItem find(int uid) {
		return _internList.stream().filter((obj) -> obj._uid == uid).findFirst().orElseThrow();
	}

	public static class ScheduleItem implements Serializable {
		/**
		 * 
		 */
		@Serial
		private static final long serialVersionUID = 1L;
		PokemonBattle _battle;
		int _attacker;
		int _defender;
		int _priority;
		int _round;
		int _id;
		int _uid;
		Move _move;

		DamageInformation _dmg;
		boolean _executed = false;

		public DamageInformation execute() {
			var att = _battle.getPokemon(_attacker);
			var def = _battle.getPokemon(_defender);

			DamageInformation dmgInf;
			var move = _move;
			int accuracy = (int) (move.getAccuracy() * att.getStatStageFactor(6) * def.getStatStageFactor(7));
			if (att.getMoveIndex(move) == -1) {
				return new DamageInformation(0,1,att,def,0);
			}
			if (SharedInformation.Instance.getRNG().checkPerc(accuracy, CallerInformation.Accuracy)) {
				dmgInf = move.execute(this);
				att.changeMovePP(att.getMoveIndex(move), -1);
				_dmg = dmgInf;
			} else {
				dmgInf = new DamageInformation(att, _id);

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
			return _move;
		}

		public int getAttackerPos() {
			return _attacker;
		}

		public int getDefenderPos() {
			return _defender;
		}

		static StringBuilder builder = new StringBuilder();

		private ScheduleItem(PokemonBattle battle) {
			_battle = battle;

			_uid = battle.getUID();
		}

		@Override
		public String toString() {
			builder.setLength(0);
			builder.append('\n');
			builder.append(_battle.getPokemon(_attacker).toString());
			builder.append(" used ");
			builder.append(SharedInformation.Instance.getMoveService().get(_id).getName());
			builder.append(" in round ").append(this._round).append(" on ");
			builder.append(getDefender().toString());
			if (_dmg != null)
				builder.append(" which made ").append(_dmg.getDamage()).append(" damage");
			builder.append('\n');
			// builder.append("Updated Stats " + getDefender().getName()+"
			// "+getDefender().getCurrHP() );
			return builder.toString();
		}

		public static ScheduleItem deserialize(ByteBuffer buffer, PokemonBattle battle) {
			ScheduleItem item = new ScheduleItem(battle);
			item._attacker = buffer.get();
			item._defender = buffer.get();
			item._priority = buffer.get();
			item._round = buffer.getInt();
			item._id = buffer.getInt();
			item._uid = buffer.getInt();
			return item;
		}

		public int getDamage() {
			// TODO Auto-generated method stub
			return _dmg.getDamage();
		}

		public int getUID() {
			return _uid;
		}

		public int getRound() {
			return _round;
		}

		public int getID() {
			return _id;
		}
	}

	public Schedule(PokemonBattle battle) {
		_battle = battle;
	}

	public void clear(int att) {
		for (var item : _internList) {
			if (item._attacker == att) {
				item._executed = true;
			}
		}
	}

	private PokemonBattle _battle;
	private ArrayList<ScheduleItem> _internList = new ArrayList<>();
	private static ScheduleItemComparator _comp = new ScheduleItemComparator();
	public final MutableOptional<Boolean> otherSideState = new MutableOptional<>();

	public ScheduleItem getNext() {

		var resultOptional = _internList.stream().filter((obj) -> !obj._executed && obj._round == _currRound)
				.min(_comp);
		var result = resultOptional.orElseThrow();
		result._executed = true;

		for (var s : _internList) {
			SharedInformation.Instance.getLoggerService().log(s.toString(),Schedule.class);
		}
		return result;
	}

	public ScheduleItem getJustAdded() {
		return _internList.get(_internList.size() - 1);
	}

	public boolean any() {
		return _internList.stream().anyMatch((obj) -> !obj._executed && obj._round == _currRound);
	}

	public void incrementRound() {
		_currRound++;
	}

	public void addMove(int attacker, int defender, Move mv, int deltaRound) {
		var scheduleItem = new ScheduleItem(_battle);
		scheduleItem._attacker = attacker;
		scheduleItem._defender = defender;
		scheduleItem._id = mv.getNr();
		scheduleItem._move = mv;

		scheduleItem._priority = mv.getPriority();

		scheduleItem._round = _currRound + deltaRound;
		scheduleItem._defender = defender;
		_internList.add(scheduleItem);
	}

	private int _currRound;

	public int getCurrRound() {
		return _currRound;
	}

	public static class ScheduleItemComparator implements Comparator<ScheduleItem> {
		// Note: this comparator imposes orderings that are inconsistent with equals."
		@Override
		public int compare(ScheduleItem o1, ScheduleItem o2) {

			if (o1._priority > o2._priority)
				return -1;
			else if (o1._priority < o2._priority)
				return +1;
			else {
				var att1 = o1._battle.getPokemon(o1._attacker);

				var att2 = o2._battle.getPokemon(o2._attacker);
				if (att1.getStat(5) > att2.getStat(5))
					return -1;
				else if (att1.getStat(5) < att2.getStat(5))
					return +1;
				else {
					// will not return 0 because there must be  an order
					boolean tie = SharedInformation.Instance.getRNG().checkPerc(50,ScheduleItemComparator.class);
					if (tie)
						return -1;
					else
						return +1;
				}

			}

		}

	}

	public boolean isBalanched() {
		return !otherSideState.isPresent() || otherSideState.isPresent() && otherSideState.get();
	}

	public boolean allPlayersGaveInput(int maxNumber) {
		long scheduleSize = _internList.stream().filter((item) -> item._round == _currRound + 1).map(x -> x._attacker)
				.collect(Collectors.toSet()).size();
		return scheduleSize >= maxNumber;
	}

}
