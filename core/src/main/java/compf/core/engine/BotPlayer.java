package compf.core.engine;

public class BotPlayer {
	/* public BotPlayer(int id,String name, Pokemon[] team) {
		super(id,name, team);
	}
	// TODO AI for target selection
    public short chooseTarget(MultiplePokemonBattle battle,boolean isEnemy,byte pkmnId,Move mv) {
    	short bestChoice=0;
    	for(byte pl=0;pl<battle.getPlayers().size();pl++) {
    		if(isEnemy ^ battle.getPlayers().get(pl).isAlly(this)  ) {
    			for(byte pk=0;pk<battle.getPlayers().get(pl).getPokemonCount();pk++) {
    				bestChoice=combine(pl,pk);
    				if(MyObject.checkPerc(50))return bestChoice;
    			}
    		}
    	}
    	return bestChoice;
    }
    public Move chooseMove(int nr) {
        return Arrays.stream(_team[nr].getMoves()).filter((mv)->mv.getPP()>0).max(Comparator.comparingInt(Move::getPower)).orElseThrow();
    }
    public Pokemon chooseNextPokemon(int nr) {
    	super.chooseNextPokemon(nr);
    	int maxHp=0;
    	int max=-1;
       for(int i=nr+1;i<6;i++) {
    	   if(_team[i].getCurrHP()>0 && _team[i].statsSum()>maxHp) {
    		   maxHp=_team[i].statsSum();
    		   max=i;
    	   }
       }
       if(max==-1)return null;
       swap(_team, nr, max);
      Prompt.prompt(_name + " switched to " + _team[nr].toString());
       return _team[nr];

    }*/
}
