package adapter.lab;

public class Adapter implements ITargetStack, ITargetQueue {

	Adaptee adaptee;

	public Adapter() {
		super();
		adaptee = new Adaptee();
	}

	@Override
	public void push(String str) {

		adaptee.add(str);

	}

	@Override
	public String pop() {

		int end = adaptee.getEnd();
		String str = adaptee.get(end);
		adaptee.remove(end);
		adaptee.setEnd(--end);
		return str;
	}

	@Override
	public void print() {
		adaptee.print();
	}

	@Override
	public boolean isEmpty() {
		return adaptee.isEmpty();
	}

	@Override
	public void queue(String str) {
		adaptee.add(str);
	}

	@Override
	public String dequeue() {
		int start = adaptee.getStart();
		String str = adaptee.get(start);
		adaptee.remove(start);
		adaptee.setStart(start++);
		return str;
	}

}
