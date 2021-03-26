import java.util.*;

public class Bag<T> implements Iterable<T> {
	
	private List<T> bag;
	
	public Bag() {
		this.bag = new ArrayList<T>();
	}
	
	public Iterator<T> iterator() {
		return bag.iterator();
	}
	
	public void add(T item) {
		bag.add(item);
	}
	
	public boolean isEmpty() {
		return bag.size() == 0;
	}


	public int size() {
		return bag.size();
	}
}

