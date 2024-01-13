package compf.core.engine;

import compf.core.engine.pokemon.effects.BattleEffectCollection;
import compf.core.engine.pokemon.effects.EffectParam;
import compf.core.engine.pokemon.effects.EffectTime;
import compf.core.etc.services.SharedInformation;

import java.util.HashSet;

public  interface Interrupt {
    /**
     * Forces the client to switch the pokemon
     *
     * @param player     The player that must switch the pokemon
     * @param pokemonIndex The index of the Pokemon to be switched
     * @return The index of the replaced pokemon in the team or -1 on errors
     */
    public  default short forceSwitch( BattleEffectCollection effectCollection, Player player, short pokemonIndex){
        short newIndex;
        HashSet<Short> generatedIds=new HashSet<>();
        do{
            newIndex=getNewPokemonIndex(player.getPlayerId() ,pokemonIndex);
            generatedIds.add(newIndex);
            if(newIndex==-1 || generatedIds.size()>=player.getPokemonCount())return -1;
        }while(!isValidNewIndex(player,pokemonIndex,newIndex));
        swapPokemon(player,pokemonIndex,newIndex);
       effectCollection.pokemonSwitchedIn(new EffectParam(null,this,null,effectCollection, new EffectParam.AdditionalPokemonSwitchedData(newIndex,pokemonIndex,player.getPokemon(pokemonIndex))));
       effectCollection.pokemonSwitchedOut(new EffectParam(null,this,null,effectCollection, new EffectParam.AdditionalPokemonSwitchedData(pokemonIndex,newIndex,player.getPokemon(newIndex))));

        return newIndex;
    }
    public default boolean isValidNewIndex(Player player, short oldIndex, short newIndex){
        return newIndex>=0 &&  player.getPokemon(newIndex)!=null && player.getPokemon(newIndex).getCurrHP()>0 &&  newIndex>oldIndex;
    }
    public abstract short getNewPokemonIndex(short playerId,short pokemonIndex);
    public default void swapPokemon(Player player,int oldIndex,int newIndex){
        var dummy=player.getPokemon(oldIndex);
        player.getTeam()[oldIndex]=player.getPokemon(newIndex);
        player.getTeam()[newIndex]=dummy;

    }
    public static class RandomInterrupt implements Interrupt{
        private Object callerInfo;
        BattleRule rule;
        public RandomInterrupt(Object callerInfo,BattleRule rule){
            this.callerInfo=callerInfo;
            this.rule=rule;
        }

        @Override
        public short getNewPokemonIndex(short playerId, short pokemonIndex) {
            return (short)SharedInformation.Instance.getRNG().randomNumber(rule.MaxPokemonInTeamPerPlayer,callerInfo);
        }
    }
}