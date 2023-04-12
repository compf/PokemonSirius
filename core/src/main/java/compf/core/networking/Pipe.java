package compf.core.networking;

import compf.core.engine.NetworkMessage;

public interface Pipe {
    boolean write(NetworkMessage obj);

    NetworkMessage read();

    Pipe waitForConnection();

    Pipe connect();

    boolean avaliable();

    default boolean isWaitingForData() {
        return false;
    }
}
