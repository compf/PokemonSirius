package compf.core.networking;

public interface Pipe {
    boolean write(Object obj);
    Object read();
    Pipe waitForConnection();
    Pipe connect();
    boolean avaliable();
}
