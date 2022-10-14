package compf.core.etc;

import java.io.Serializable;
import java.util.*;

public class BufferList<T> implements List<T>, Serializable {

	private static final long serialVersionUID = -563315742032842168L;
	private final ArrayList<T> _intern;
	private int _max;

	public BufferList(int max) {
		_intern = new ArrayList<>(max);
		_max = max;

	}

	@Override
	public Iterator<T> iterator() {
		return _intern.iterator();
	}

	@Override
	public int size() {
		return _intern.size();
	}

	@Override
	public boolean isEmpty() {
		return _intern.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return _intern.contains(o);
	}

	@Override
	public Object[] toArray() {

		return _intern.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {

		return _intern.toArray(a);
	}

	@Override
	public synchronized boolean add(T e) {
		if (size() < _max) {
			return _intern.add(e);
		} else {
			throw new IllegalStateException("Cannot add more items than max");
		}
	}

	@Override
	public boolean remove(Object o) {
		return _intern.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return _intern.containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		return _intern.addAll(c);
	}

	@Override
	public boolean addAll(int index, Collection<? extends T> c) {
		return _intern.addAll(index, c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return _intern.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return _intern.retainAll(c);
	}

	@Override
	public void clear() {
		_intern.clear();
	}

	@Override
	public T get(int index) {
		return _intern.get(index);
	}

	@Override
	public T set(int index, T element) {
		return _intern.set(index, element);
	}

	@Override
	public void add(int index, T element) {
		_intern.add(index, element);
	}

	@Override
	public T remove(int index) {
		return _intern.remove(index);
	}

	@Override
	public int indexOf(Object o) {
		return _intern.indexOf(o);
	}

	@Override
	public int lastIndexOf(Object o) {
		return _intern.lastIndexOf(o);
	}

	@Override
	public ListIterator<T> listIterator() {
		return _intern.listIterator();
	}

	@Override
	public ListIterator<T> listIterator(int index) {
		return _intern.listIterator(index);
	}

	@Override
	public List<T> subList(int fromIndex, int toIndex) {
		return _intern.subList(fromIndex, toIndex);
	}

	/**
	 * Return true if the list is full
	 */
	public boolean isFull() {
		return size() >= _max;
	}

}
