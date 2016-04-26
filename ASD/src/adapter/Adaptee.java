package adapter;

public class Adaptee {

	private String[] data;
	private int start, end;

	public String startString() {
		return data[start];
	}

	public String endString() {
		return data[end];
	}

	public boolean isEmpty() {
		return end == -1;
	}
	
	public void add(String str){
		data[end++] = str;
	}

}
