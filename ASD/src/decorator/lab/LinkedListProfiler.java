package decorator.lab;

import java.util.AbstractList;

public class LinkedListProfiler<E> extends Listprofiler<E> {

	public LinkedListProfiler(AbstractList<E> listToBeDecorated) {
		super(listToBeDecorated);

	}

	@Override
	public E get(int index) {
		return (E) listToBeDecorated.get(index);
	}

	@Override
	public boolean add(E e) {
		long startTime = System.currentTimeMillis();
		boolean result = listToBeDecorated.add(e);

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("LinkiedList add() Time:" + totalTime);

		return result;
	}

	@Override
	public E remove(int index) {
		long startTime = System.currentTimeMillis();
		E result = listToBeDecorated.remove(index);

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("LinkiedList remove() Time:" + totalTime);

		return result;

	}

	@Override
	public boolean contains(Object o) {
		long startTime = System.currentTimeMillis();
		boolean result = listToBeDecorated.contains(o);

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("LinkiedList contains() Time:" + totalTime);

		return result;
	}

	@Override
	public int size() {
		long startTime = System.currentTimeMillis();
		int size = listToBeDecorated.size();
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("LinkiedList Size() Time:" + totalTime);
		return size;
	}

}
