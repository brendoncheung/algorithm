import java.util.*;

class Stack<T> implements Iterable<T> {
	
	private List<T> data;
	
	public Iterator<T> iterator() {
		return new StackIterator();
	}
	
	public Stack() {
		this.data = new ArrayList<T>();
	}

	public void push(T item) {
		data.add(item);
	}
	
	public T pop() {
		if(data.size() == 0) {
			return null;
		}
		
		return data.remove(data.size() - 1);
	}
	
	private class StackIterator implements Iterator<T> {
		
		private int ub = data.size() - 1;
		private int currentIndex = ub;
				
		public boolean hasNext() {
			return currentIndex >= 0;
		}
		
		public T next() {
			return data.get(currentIndex--);
		}
		
		public void remove() {
			// not implemented
		}
	}
}
