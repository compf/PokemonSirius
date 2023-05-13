package compf.core.networking;

import compf.core.engine.BattleState;
import compf.core.engine.Player;
import compf.core.engine.PlayerInput;

public class RandomBotAI implements  BotAI{
    @Override
    public PlayerInput getPlayerInput(short pkmnIndex, Player mePlayer, BattleState state) {
        short enemyPlayerId=selectEnemyPlayerId(mePlayer,state);
        short move = (short) compf.core.etc.services.SharedInformation.Instance.getRNG().randomNumber(0, mePlayer.getPokemon(pkmnIndex).getValidMovesCount(),BotInterface.class);
        return new PlayerInput.AttackInput(pkmnIndex, move, enemyPlayerId, selectEnemyPokemonId(enemyPlayerId), mePlayer.getPlayerId());
    }
}
