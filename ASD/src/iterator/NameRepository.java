package iterator;

public class NameRepository implements Aggregate {
	private String names[] = { "Rob", "Jon", "Jul", "Lor", "Pat", "Ken" };

	@Override
	public Iterator getIterator() {
		
		return new NameIterator();
		
	}
	
	private class NameIterator implements Iterator{

		int index;
		@Override
		public boolean hasNext() {
			return (index < names.length);
		}
		@Override
		public Object next() {
			if(hasNext()) return names[index++];
			return null;
		}
		
	}
}