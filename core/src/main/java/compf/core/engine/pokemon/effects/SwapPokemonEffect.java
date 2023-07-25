package compf.core.engine.pokemon.effects;

import compf.core.engine.BattleRule;
import compf.core.engine.Player;
import compf.core.engine.pokemon.Pokemon;
import compf.core.etc.PokemonConstants;

public abstract class SwapPokemonEffect extends PokemonBattleEffect{
    public SwapPokemonEffect(Pokemon pkmn) {
        super(pkmn);
    }
    private boolean isInValidIndex(BattleRule rule, int oldIndex, int newIndex){
        return oldIndex==newIndex || newIndex < rule.PokemonPerPlayerOnField;
    }

    public  abstract int getNewIndex(Player player, int oldIndex);
    @Override
    public void attack(EffectParam param) {
        Player player=param.additionalData().getAffectedPokemon().getPlayer();
        int oldIndex=indexOf(getPokemon().getPlayer().getTeam(),getPokemon());
        if(notPossible(oldIndex,param.rule())){
            return;
        }

        int newIndex;
        do{
            newIndex=getNewIndex(player,oldIndex);
        }while (isInValidIndex(param.rule(),oldIndex,newIndex));

        Pokemon dummy=player.getPokemon(oldIndex);
        player.getTeam()[oldIndex]=player.getTeam()[newIndex];
        player.getTeam()[newIndex]=dummy;

        this.addMessage(player.getPokemon(newIndex)+" replaced "+player.getPokemon(oldIndex));
    }

    private boolean notPossible(int oldIndex, BattleRule rule) {
        boolean isInValid=true;
        for(int i=0;i<rule.MaxPokemonInTeamPerPlayer;i++){
            isInValid=isInValid  && isInValidIndex(rule,oldIndex,i);
        }
        return  isInValid;
    }
}
