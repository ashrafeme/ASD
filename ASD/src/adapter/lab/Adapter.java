package adapter.lab;


public class Adapter implements ITargetStack,ITargetQueue {

	Adaptee adaptee;
	public Adapter() {
		super();
		adaptee = new Adaptee();
	}

	@Override
	public void push(String str) {
		// TODO Auto-generated method stub
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
	public void print(){
		adaptee.print();
		}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return adaptee.isEmpty();
	}

	@Override
	public void queue(String str) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public String dequeue() {
		// TODO Auto-generated method stub
		return null;
	}

}
