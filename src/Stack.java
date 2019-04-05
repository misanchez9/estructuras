
public class Stack {
	private List list ;
	public Stack () {
		list = new List();
	}
	public void push (Node x) {
		list.add(list.size(), x);
	}
	public int pop() {
		return list.remove(list.size()-1);
	}
	public int peak() {
		return list.get(list.size()-1);
	}
	public int size() {
		return list.size();
	}
	

}
