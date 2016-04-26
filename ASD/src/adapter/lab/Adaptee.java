package adapter.lab;

import java.util.Arrays;

public class Adaptee {

	private String[] data;
	private int start, end;
	public Adaptee(){
		this(100);
	}
	public Adaptee(int maxnumber) {
		super();
		end = -1;
		start = 0;
		data = new String[maxnumber];
	}

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
		end++;
		data[end] = str;
		
		
	}
	
	public void remove(int index){
		
		for (int i = index; i <= end; i++) {
			data[i] = data[i+1]; 
		}
		
	}
	
	
	public void print(){
		System.out.println(Arrays.toString(data));
	}
	
	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}
	
	public String get(int index){
		return data[index];
	}

	

	
}
