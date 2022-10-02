package compf.core.networking;

public class PipeEndPoint implements Pipe {
    private Pipe _read, _write;

    @Override
    public boolean write(Object obj) {
        // System.out.println("Writing to "+System.identityHashCode(_write));

        return _write.write(obj);
    }

    private volatile boolean isCurrentlyWaitingForData = false;

    @Override
    public boolean isWaitingForData() {
        return isCurrentlyWaitingForData;
    }

    @Override
    public Object read() {
        isCurrentlyWaitingForData = true;
        Object result = _read.read();
        isCurrentlyWaitingForData = false;
        return result;
    }

    @Override
    public boolean avaliable() {
        return _read.avaliable();
    }

    @Override
    public Pipe waitForConnection() {
        // System.out.println("End point " +System.identityHashCode(this) +" wait for
        // connection");
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
