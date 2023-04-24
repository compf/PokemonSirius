package compf.core.engine.pokemon.moves;

import java.io.Serializable;

import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.PokemonTypeHolder;
import compf.core.engine.pokemon.Type;
import compf.core.etc.CallerInformation;
import compf.core.etc.MyObject;
import compf.core.etc.services.SharedInformation;

public class Move implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int _nr;
	private final String _name;
	private final byte _pp;
	private final byte _accuracy;
	private final byte _priority;
	private final byte _power;
	private final Type _type;
	private final MoveKind _kind;
	private final TargetType _target;

	public Type getType() {
		return _type;
	}

	public enum MoveKind {
		Physical, Special, Status
	}

	public enum TargetType {
		adjacentAlly,
		allySide,
		allAdjacent,
		any,
		allies,
		adjacentAllyOrSelf,
		foeSide,
		normal,
		scripted,
		all,
		allyTeam,
		self,
		randomNormal,
		adjacentFoe,
		allAdjacentFoes;
	}

	public DamageInformation execute(Schedule.ScheduleItem item) {
		int dmg = calculateDamage(item.getAttacker(), item.getDefender());
		return new DamageInformation(dmg, getEffectiveness(item.getDefender(), _type), item.getAttacker(),
				item.getDefender(), _nr);
	}

	public void finishedMove(DamageInformation dmg) {

	}

	private static final double S = 2.0, N = 1.0, W = 0.5;
	private static final double[][] _effectiveMatrix = {
			{ N, N, N, N, N, W, N, 0, W, N, N, N, N, N, N, N, N, N },
			{ S, N, W, W, N, S, W, 0, S, N, N, N, N, W, S, N, S, N },
			{ N, S, N, N, N, W, S, N, W, N, N, S, W, N, N, N, N, N },
			{ N, N, N, W, W, W, N, W, 0, N, N, S, N, N, N, N, N, S },
			{ N, N, 0, S, N, S, W, N, S, S, N, W, S, N, N, N, N, N },
			{ N, W, S, N, W, N, S, N, W, S, N, N, N, N, S, N, N, N },
			{ N, W, W, W, N, N, N, W, W, W, N, S, N, S, N, N, S, W },
			{ 0, N, N, N, N, N, N, S, N, N, N, N, N, S, N, N, W, N },
			{ N, N, N, N, N, S, N, N, W, W, W, N, W, N, S, N, N, S },
			{ N, N, N, N, N, W, S, N, S, W, W, S, N, N, S, W, N, N },
			{ N, N, N, N, S, S, N, N, N, S, W, W, N, N, N, W, N, N },
			{ N, N, W, W, S, S, W, N, W, W, S, W, N, N, N, W, N, N },
			{ N, N, S, N, 0, N, N, N, N, N, S, W, W, N, N, W, N, N },
			{ N, S, N, S, N, N, N, N, W, N, N, N, N, W, N, N, 0, N },
			{ N, N, S, N, S, N, N, N, W, W, W, S, N, N, W, S, N, N },
			{ N, N, N, N, N, N, N, N, W, N, N, N, N, N, N, S, N, 0 },
			{ N, W, N, N, N, N, N, S, N, N, N, N, N, S, N, N, W, W },
			{ N, S, N, W, N, N, N, N, W, W, N, N, N, N, N, S, S, N }
	};

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof Move) {
			Move mv = (Move) obj;
			return mv._nr == _nr;
		}
		return false;
	}

	public static double getEffectiveness(PokemonTypeHolder def, Type type) {

		int row = type.getValue() - 1;
		if (def.getType2() == Type.Empty || def.getType2() == null) {
			int col = def.getType1().getValue() - 1;
			return _effectiveMatrix[row][col];
		} else {
			int col1 = def.getType1().getValue() - 1;
			int col2 = def.getType2().getValue() - 1;
			return _effectiveMatrix[row][col1] * _effectiveMatrix[row][col2];
		}
	}

	public void init(Schedule schedule, int attacker, int defender) {
		schedule.addMove(attacker, defender, this, 1);
	}

	public void init(Schedule schedule, int attacker, int defender, int dr) {
		schedule.addMove(attacker, defender, this, dr);
	}

	private int getCriticalHitFactor() {
		return SharedInformation.Instance.getRNG().checkPerc(15,CallerInformation.CriticalHit) ? 2 : 1;
	}

	public int calculateDamage(Pokemon att, Pokemon def) {
		double d1 = (2 * att.getLevel()) / 5 + 2;
		double attValue, defValue;
		if (_kind == MoveKind.Physical) {
			attValue = att.getStat(1) * att.getStatStageFactor(1);
			defValue = def.getStat(2) * def.getStatStageFactor(2);
		} else if (_kind == MoveKind.Special) {
			attValue = att.getStat(3) * att.getStatStageFactor(3);
			defValue = def.getStat(4) * def.getStatStageFactor(4);
		} else
			return 0;
		double d2 = d1 * _power * (attValue / defValue) / 50 + 2;
		double d3 = d2 * (getCriticalHitFactor()) * (0.85 +SharedInformation.Instance.getRNG().randomNumber(16,CallerInformation.MoveStrengthVariation) / 100.0);
		double d4 = d3 * getEffectiveness(def, _type)
				* (att.getType1() == _type || att.getType2() == _type ? 1.5 : 1.0);
		return (int) d4;
	}

	public Move(int nr, String name, byte power, byte pp, byte accuracy, byte priority, Type type, MoveKind kind,
			TargetType target) {
		_nr = nr;
		_name = name;
		_pp = pp;
		_accuracy = accuracy;
		_priority = priority;
		_power = power;
		_type = type;
		_kind = kind;
		_target = target;

	}

	public Move(final Move copy) {
		this(copy._nr, copy._name, copy._power, copy._pp, copy._accuracy, copy._priority, copy._type, copy._kind,
				copy._target);
	}

	public int getNr() {
		return _nr;
	}

	public TargetType getTarget() {
		return _target;
	}

	public String getName() {
		return _name;
	}

	public int getPP() {
		return _pp;
	}

	public int getPower() {
		return _power;
	}

	public byte getPriority() {
		// TODO Auto-generated method stub
		return _priority;
	}

	public int getAccuracy() {
		// TODO Auto-generated method stub
		return _accuracy;
	}

}
