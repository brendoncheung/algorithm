import java.util.*;

public class Queue<T> implements Iterator<T> {
	
	private List<T> data;
	
	public Queue() {
		this.data = new ArrayList<T>();
	}
	
	public void enqueue(T item) {
		data.add(item);
	}
	
	public T dequeue() {
		return data.remove(0);
	}
	
	public Iterator<T> iterator() {
		return data.iterator();		
	}
}
