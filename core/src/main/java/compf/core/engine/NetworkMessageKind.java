package compf.core.engine;

public enum NetworkMessageKind {
	BattleRules, RequestPlayerInformation, ReplyPlayerInformation, Update, ChoosePokemon, Message, SendPlayerId,

	RequestInputToClient,RequestInputToIO, ReplyInputToServer,ReplyInputFromIO, RequestPokemonSwitch, ReplyPokemonSwitch,None, SwitchPokemon, BattleEnded

	;

	public NetworkMessage createMessage() {
		return createMessage(null);
	}

	public NetworkMessage createMessage(Object obj) {
		return new NetworkMessage(this, obj);
	}
}
