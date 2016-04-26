package adapter.lab;

public interface ITargetQueue {
	public void queue(String str);
	public String dequeue();
	public boolean isEmpty();
	public void print();
}
