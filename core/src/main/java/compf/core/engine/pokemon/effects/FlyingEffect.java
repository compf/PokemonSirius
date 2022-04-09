package compf.core.engine.pokemon.effects;

import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.moves.DamageInformation;

public class FlyingEffect extends PokemonBattleEffect {
    private boolean flagFirstRound=true;
    private boolean flagSecondRound=false;
    private DamageInformation inf;
    public FlyingEffect(Pokemon pkmn) {
        super(pkmn);
    }

   

    @Override
    public void roundEnding(Object... obj) {
        if(flagFirstRound){
            flagFirstRound=false;
            flagSecondRound=true;
        }
    }
    @Override 
    public void attack(Object... obj) {
    	 DamageInformation inf =(DamageInformation)obj[0];
    	 this.inf=inf.clone();
    	 if(flagFirstRound) {
    		 inf.kill();
    	 }
    	 else if(flagSecondRound) {
    		 obj[0]=this.inf;
    		 disable();
    	 }
    }
    @Override
    public boolean canAttack() {
    	return flagFirstRound | flagSecondRound;
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
