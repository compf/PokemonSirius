package compf.core.engine;

import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.moves.Move;

public class HumanPlayer {
    /*public HumanPlayer(int id,String name,Pokemon[] pkmn){
        super(id,name,pkmn);
    }
    @Override
    public Pokemon chooseNextPokemon(int original){
        int index;
        super.chooseNextPokemon(original);
		Pokemon nextPokemon = null;
		do {
			index = Prompt.prompt("Please choose a pokemon", (p, i) -> p.toString(), _team);
			
			nextPokemon = _team[index] != null && _team[index].getCurrHP() > 0 ? _team[index] : null;
			if(index<=original) {
				nextPokemon=null;
			}
		} while (nextPokemon == null);
        swap(_team, original, index);
        return nextPokemon;
        
    }
    @Override
    public Move chooseMove(int nr){
        int input = Prompt.prompt("Please select a move", (mv, index) -> {
			return mv.getName() + "[" + _team[nr].getMovePP(index)+"]";
		},_team[nr].getMoves());
		if (input < 4) {
			Move mv = _team[nr].getMoves()[input];

			return mv;
		}

		else {
			throw new IllegalStateException();
		}
    }
    
    @Override
    public short chooseTarget(MultiplePokemonBattle battle,boolean isEnemy,byte pkmnId,Move mv) {
    	byte b1,b2;
    	while(true) {
    		 b1=battle.promptPlayer(this,isEnemy);
        	 b2=(byte)Prompt.prompt("Select pokemon from player or other value to choose another player",(pk,i)->pk.toString(),(i,pk)->i<pk.getPlayer().getPokemonCount(),battle.getPlayers().get(b1).getTeam());
        	if(b2!=-1)break;
    	}
    	
    	return combine(b1,b2);
    }*/
}