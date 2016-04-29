package iterator.lab;

public class IteratorClient {

	public static void main(String[] args) {

		NameRepository orepo = new NameRepository();
		Iterator loop = orepo.getIterator();
		while (loop.hasNext()) {
			System.out.println(loop.next());
		}
	}

}
