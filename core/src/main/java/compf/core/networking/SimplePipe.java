package compf.core.networking;

import compf.core.engine.NetworkMessage;

public class SimplePipe implements Pipe {
    private NetworkMessage lastMessage;
    @Override
    public boolean write(NetworkMessage obj) {
        lastMessage=obj;
        return true;
    }

    @Override
    public NetworkMessage read() {
        return lastMessage;
    }

    @Override
    public Pipe waitForConnection() {
        return this;
    }

    @Override
    public Pipe connect() {
        return this;
    }

    @Override
    public boolean avaliable() {
        return lastMessage!=null;
    }
    
}
