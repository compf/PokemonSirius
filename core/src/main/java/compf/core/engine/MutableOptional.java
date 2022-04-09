package compf.core.engine;

import java.util.Optional;
public class MutableOptional<T> {
	private T value=null;
	public boolean isPresent() {
		return value!=null;
	}
	public void set(T val) {
		value=val;
	}
	public T get() {
		return value;
	}
}
