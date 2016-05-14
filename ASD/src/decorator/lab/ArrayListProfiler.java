package decorator.lab;

import java.util.AbstractList;

public class ArrayListProfiler<E> extends Listprofiler<E> {

	public ArrayListProfiler(AbstractList<E> listToBeDecorated) {
		super(listToBeDecorated);
		// TODO Auto-generated constructor stub
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
		System.out.println("ArrayList add() Time:" + totalTime);

		return result;
	}

	@Override
	public E remove(int index) {
		long startTime = System.currentTimeMillis();
		E result = listToBeDecorated.remove(index);

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("ArrayList remove() Time:" + totalTime);

		return result;

	}

	@Override
	public boolean contains(Object o) {
		long startTime = System.currentTimeMillis();
		boolean result = listToBeDecorated.contains(o);

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("ArrayList contains() Time:" + totalTime);

		return result;
	}

	@Override
	public int size() {
		long startTime = System.currentTimeMillis();
		int size = listToBeDecorated.size();
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("ArrayList Size() Time:" + totalTime);
		return size;
	}
}
