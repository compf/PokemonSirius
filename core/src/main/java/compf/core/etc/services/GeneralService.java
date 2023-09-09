package compf.core.etc.services;

public interface GeneralService<T> extends Iterable<T> {
    int getMaxIndex();
    T get(int index);
    T get(String name);
}
