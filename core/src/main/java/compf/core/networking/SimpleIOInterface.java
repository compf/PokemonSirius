package compf.core.networking;

public abstract class SimpleIOInterface implements IOInterface {
    private SimplePipe _pipe=new SimplePipe();

    @Override
    public Pipe getPipe() {
        return _pipe;
    }
}
