package compf.core.engine.pokemon.moves;

import java.io.Serial;
import java.io.Serializable;
import java.util.LinkedList;

import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.effects.BattleEffectCollection;
import compf.core.etc.services.SharedInformation;;
public class DamageInformation implements Serializable, Cloneable {
	/**
	 * 
	 */
	@Serial
	private static final long serialVersionUID = 1L;
	private int _dmg, _moveId;
	private double _effectiveness;
	private boolean _isEnabled=true;
	private Pokemon _attacker, _defender;
	private LinkedList<String> _messages = new LinkedList<>();
	private BattleEffectCollection _effects = new BattleEffectCollection();
	private boolean _successful = true;

	public DamageInformation(int damage, double effectiveness, Pokemon attacker, Pokemon defender, int moveid) {
		_dmg = damage;
		_effectiveness = effectiveness;
		_attacker = attacker;
		_defender = defender;
		_moveId = moveid;

	}

	public DamageInformation() {
		_dmg = 0;
	}

	public void kill() {
		_dmg = 0;
		_effects.clear();
		 _isEnabled = false;

	}

	public BattleEffectCollection getEffects() {
		return _effects;
	}

	public LinkedList<String> getMessages() {
		return _messages;
	}

	public DamageInformation clone() {
		try {
			return (DamageInformation) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	// unsuccessful move
	public DamageInformation(Pokemon attacker, int mId) {
		this();
		_attacker = attacker;
		_moveId = mId;
		_successful = false;

	}

	public int getMoveId(){
		return _moveId;
	}
	public int getDamage() {
		return _dmg;
	}

	public void modifyDamage(double factor) {
		_dmg = (int) (_dmg * factor);
	}

	public void modifyDamage(int to) {
		_dmg = to;
	}

	public Pokemon getAttacker() {
		return _attacker;

	}

	public Pokemon getDefender() {
		return _defender;
	}

	@Override
	public String toString() {
		if (!_successful) {
			return "this move was not sucessful";
		}
		StringBuilder builder = new StringBuilder();
		builder.setLength(0);
		builder.append('\n');
		builder.append(_attacker.toString());
		builder.append(" used ");
		builder.append(SharedInformation.Instance.getMoveService().get(_moveId).getName());
		builder.append(" on ");
		builder.append(_defender.toString());
		builder.append(" which made ").append(getDamage()).append(" damage");
		builder.append('\n');
		// builder.append("Updated Stats " + getDefender().getName()+"
		// "+getDefender().getCurrHP() );
		return builder.toString();
	}

    public boolean isEnabled() {
		return  _isEnabled;
    }
}
