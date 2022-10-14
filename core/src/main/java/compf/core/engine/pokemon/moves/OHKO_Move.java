package compf.core.engine.pokemon.moves;

public class OHKO_Move extends Move {
    public OHKO_Move(Move copy) {
        super(copy);
    }

    @Override
    public DamageInformation execute(Schedule.ScheduleItem item) {
        var dmg = new DamageInformation(item.getDefender().getCurrHP(), 1, item.getAttacker(), item.getDefender(),
                this.getNr());
        return dmg;
    }
}
