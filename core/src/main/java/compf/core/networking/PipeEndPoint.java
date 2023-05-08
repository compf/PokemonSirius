package compf.core.networking;

import compf.core.engine.NetworkMessage;

public class PipeEndPoint implements Pipe {
    private Pipe _read, _write;

    @Override
    public boolean write(NetworkMessage obj) {

        return _write.write(obj);
    }

    private volatile boolean isCurrentlyWaitingForData = false;

    @Override
    public boolean isWaitingForData() {
        return isCurrentlyWaitingForData;
    }

    @Override
    public NetworkMessage read() {
        isCurrentlyWaitingForData = true;
        NetworkMessage result = _read.read();
        isCurrentlyWaitingForData = false;
        return result;
    }

    @Override
    public boolean avaliable() {
        return _read.avaliable();
    }

    @Override
    public Pipe waitForConnection() {
        return _read.waitForConnection();
    }

    @Override
    public Pipe connect() {
        return _write.connect();
    }

    public PipeEndPoint(Pipe read, Pipe write) {
        this._read = read;
        this._write = write;
    }
}
