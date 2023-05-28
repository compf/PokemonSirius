package compf.core.networking;

import compf.core.engine.BattleState;
import compf.core.engine.Player;
import compf.core.engine.PlayerInput;
import compf.core.engine.pokemon.Nature;
import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.moves.Move;
import compf.core.etc.PokemonConstants;
import compf.core.etc.services.SharedInformation;

public class HeuristicBasedAI implements  BotAI{
    @Override
    public PlayerInput getPlayerInput(short pkmnIndex, Player mePlayer, BattleState state) {
        short bestEnemyId=-1;
        short bestEnemyPokemonIndex=-1;
        int bestMoveIndex=-1;
        int bestValue=-100;
        for(short enemyId:state.getPlayerIds()){
            if(state.isEnemy(mePlayer.getPlayerId(), enemyId)){
                for(short enemyPokemonId=0;enemyPokemonId < PokemonConstants.DEFAULT_TEAM_SIZE;enemyPokemonId++){
                    if(state.getPokemonName(enemyId,enemyPokemonId)==null)break;
                    for(int moveIndex=0;moveIndex<PokemonConstants.MAX_MOVES_COUNT_POKEMON; moveIndex++){
                        int moveRating=rateMove(pkmnIndex,mePlayer,state,enemyId,enemyPokemonId,moveIndex);
                        if(moveRating>bestValue){
                            bestMoveIndex=moveIndex;
                            bestEnemyId=enemyId;
                            bestEnemyPokemonIndex=enemyPokemonId;
                            bestValue=moveRating;
                        }
                    }
                }
            }
        }
        return new PlayerInput.AttackInput(pkmnIndex,(short)bestMoveIndex,bestEnemyId,bestEnemyPokemonIndex,mePlayer.getPlayerId());
    }
    private int rateMove(short pkmnIndex, Player mePlayer, BattleState state,short enemyId,short enemyPokemonId,int moveIndex){
        int result=0;

        final Pokemon mePokemon=mePlayer.getPokemon(pkmnIndex);
        final Move move=mePokemon.getMoves()[moveIndex];
        final int enemyPokemonNr=state.getPokemonNr(enemyId,enemyPokemonId);

        double effectiveness=Move.getEffectiveness(SharedInformation.Instance.getPokedexEntryService().get(enemyPokemonNr), move.getType());
        if(effectiveness==4.0){
            result+=20;
        }
        else if(effectiveness==2.0)
        {
            result+=10;
        }
        if(move.getPriority()>0){
            result+=10;
        }
        if(move.getAccuracy()<=80){
            result-=10;
        }
        var bestDefended=new Pokemon(enemyPokemonNr,state.getPokemonLevel(enemyId,enemyPokemonId),PokemonConstants.ALL_IVS_HIGH,new int[]{0,0,252,0,252,0}, Nature.ATT_ATT,new Move[]{null,null,null,null});
        double damage=move.calculateDamage(mePokemon,bestDefended);
        double percentage=damage/bestDefended.getMaxHP();
        final double MAX_POINTS_THEORETICAL_DAMAGE=20;
        result=result+(int)(MAX_POINTS_THEORETICAL_DAMAGE*percentage);
        return result;

    }
}
