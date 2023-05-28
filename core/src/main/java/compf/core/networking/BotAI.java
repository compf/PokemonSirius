package compf.core.networking;

import compf.core.engine.BattleRoundResult;
import compf.core.engine.BattleState;
import compf.core.engine.Player;
import compf.core.engine.PlayerInput;

public interface BotAI {
     PlayerInput getPlayerInput(short pkmnIndex, Player mePlayer, BattleState state) ;
    default short selectEnemyPlayerId(Player mePlayer, BattleState state){
        for(int pId :state.getPlayerIds()){
            if(pId!=mePlayer.getPlayerId() )return (short)pId;
        }
        return  -1;
    }
    default short selectEnemyPokemonId(short playerId){
        return 0;
    }
    default void update(BattleRoundResult result){}
}
