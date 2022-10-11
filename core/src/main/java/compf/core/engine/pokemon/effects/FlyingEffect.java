package compf.core.engine.pokemon.effects;

import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.moves.DamageInformation;
import compf.core.engine.pokemon.moves.Schedule;
import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;

public class FlyingEffect extends PokemonBattleEffect {
    private boolean newRound=false;
    private boolean isFlying=true;
    private DamageInformation dmg;
    private ScheduleItem item;
    public FlyingEffect(Pokemon pkmn) {
        super(pkmn);
    }

   

    @Override
    public void roundEnding(Object... obj) {
        newRound=true;
    }
    @Override 
    public void attack(Object... obj) {
        System.out.println("Use attack fly");
        if(!(newRound)){
            System.out.println("Flying killed");
            DamageInformation inf =(DamageInformation)obj[0];
            item=(ScheduleItem)obj[1];
            this.dmg=inf.clone();
            inf.kill();

        }
        else{
            isFlying=false;
            System.out.println("use flying");
            disable();
        }
    	
    }
    @Override
    public void delayedAttack(Object... inf) {
        Schedule schedule=(Schedule)inf[0];
        schedule.addMove(item.getAttackerPos(), item.getDefenderPos(),item.getMove(), 0);
    }
    @Override
    public boolean canAttack() {
    	return  newRound;
    }
    @Override
    public boolean canReceiveCommand() {
      return !isFlying;
    }

    @Override
    public void defend(Object... obj) {
        DamageInformation inf =(DamageInformation)obj[0];
        if(isEnabled()){
            inf.modifyDamage(0);
         addMessage(getPokemon()+ " is flying and thus not vulnerable");
        }
    }
}
