package proxy.lab;

import java.util.HashMap;

public interface ICollectionAccess {

	public String read(String k);
	public void write(String k,String v);
	public HashMap<String,String> clone();
}
