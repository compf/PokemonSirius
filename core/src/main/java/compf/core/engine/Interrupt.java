package compf.core.engine;

public interface Interrupt {
    /**
     * Forces the client to switch the pokemon
     *
     * @param playerId     The player that must switch the pokemon
     * @param pokemonIndex The index of the Pokemon to be switched
     * @return The index of the replaced pokemon in the team or -1 on errors
     */
    public short forceSwitch(short playerId, short pokemonIndex);
}