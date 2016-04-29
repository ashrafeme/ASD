package iterator.lab;

import java.util.function.Predicate;



public class NameRepository implements Aggregate {

	private String names[][] = { { "ashraf", "ezzat", "elsayed" }, { "david", "Nyaika" }, { "Yongchao", "Zhang" } };

	public void add(String firstName, String lastName) {

	}

	@Override
	public Iterator getIterator() {

		return new NameIterator();

	}

	private class NameIterator implements Iterator {

		Predicate<String> checkString = (s) -> s.equals("-");
		int index, yindex;

		@Override
		public boolean hasNext() {
			return (index < names.length && yindex < names[index].length);
		}

		@Override
		public Object next() {
			if (hasNext()) {
				yindex++;
				String nextName = names[index][yindex];
				if (yindex == names[index].length)
					index++;
				if (!checkString.test(nextName))
					return nextName;
				else
					return next();
			}
			return null;
		}

	}

}
