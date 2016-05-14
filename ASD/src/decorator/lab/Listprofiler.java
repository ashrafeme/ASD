package decorator.lab;

import java.util.AbstractList;

public abstract class Listprofiler<E> extends AbstractList<E> {

	protected AbstractList<E> listToBeDecorated;

	public Listprofiler(AbstractList<E> listToBeDecorated) {
		this.listToBeDecorated = listToBeDecorated;
	}

	
	
	
}
