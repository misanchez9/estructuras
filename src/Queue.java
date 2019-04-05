
public class Queue {
	
	private List list;
	
	public Queue() {
		list=new List();
	}
	public void enqueue(Node x) {
		list.add(list.size(), x);
	}
	public int dequeue() {
		return list.remove(0);
	}
	public int peak() {
		return list.get(0);
	}
	public int size() {
		return list.size();
	}

}
