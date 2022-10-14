package compf.core.engine.pokemon;

public enum Type {
	Empty(0),
	Normal(1),
	Fight(2),
	Flying(3),
	Poison(4),
	Ground(5),
	Rock(6),
	Bug(7),
	Ghost(8),
	Steel(9),
	Fire(10),
	Water(11),
	Grass(12),
	Electric(13),
	Psychic(14),
	Ice(15),
	Dragon(16),
	Dark(17),
	Fairy(18);

	final int _value;

	Type(int val) {
		_value = val;
	}

	public int getValue() {
		return _value;
	}

	public static Type parse(int val) {
		for (Type type : Type.values()) {
			if (type.getValue() == val)
				return type;
		}
		return null;
	}

}
