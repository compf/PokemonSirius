package compf.core.engine.pokemon.moves;

public class StatModifyingMove extends Move {
    public static final int ENEMY = +1, ME = -1;
    private int _who, _stat, _by;

    public StatModifyingMove(Move copy, int who, int stat, int by) {
        super(copy);
        _who = who;
        _stat = stat;
        _by = by;
    }

    @Override
    public DamageInformation execute(Schedule.ScheduleItem item) {
        int target;
        if (_who == ME) {
            target = item.getAttackerPos();
        } else {
            target = item.getDefenderPos();
        }
        item._battle.getPokemon(target).changeStatStage(_stat, _by);
        return super.execute(item);
    }
}
