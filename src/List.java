
public class List {
	private Node head;
	private int size;
	
	
	public List(){
		head = null;
		size = 0;
	}
	public void add(int pos, Node newNode) {
		if (pos<0 || pos>size) throw new IndexOutOfBoundsException();
		
		if (pos == 0){
			newNode.next = head;
			head = newNode;
		}else{
			Node curNode = head;
			for (int i = 1; i < pos; i++) 
				curNode = curNode.next;
			newNode.next = curNode.next;
			curNode.next = newNode;
		}
		size++;
	}
	
	public int remove(int pos) {
		if (pos<0 || pos>=size) throw new IndexOutOfBoundsException();
		int x=0; 
		if (pos == 0){
			Node temp = head;
			head = temp.getNext();
			temp = null;
		}
		else{
			Node curNode = head;
			for (int i = 1; i < pos; i++) 
				curNode = curNode.next;
			x = curNode.next.data;
			curNode.next = curNode.next.next;
		}
		size--;
		return x;
	}
	public int get(int pos) {
		if (pos<0 || pos>=size) throw new IndexOutOfBoundsException();
		Node curNode = head;
		for (int i = 1; i <= pos; i++) 
			curNode = curNode.next;
		return curNode.data;
	}

	public void set(int pos, int x) {
		if (pos<0 || pos>=size) throw new IndexOutOfBoundsException();
		Node curNode = head;
		for (int i = 1; i <= pos; i++) 
			curNode = curNode.next;
		curNode.data = x;
		
	}

	public int size() {
		return size;
	}

	public int find(Node x) {
		Node curNode = head;
		int i = 0;
		while(curNode!=null){
			if(curNode.equals(x)) return i;
			curNode = curNode.next;
			i++;
		}
		return -1;
	}
	
	public String toString(){
		StringBuilder str = new StringBuilder();
		str.append("[");
		Node curNode = head;
		while(curNode!=null){
			str.append(curNode.data +",");
			curNode = curNode.next;
		}
		str.append("]");
		return str.toString();
	}
	
	public boolean equals(Object obj){
		if (!(obj instanceof List)) return false;
		List list2 = (List)obj;
		if (size != list2.size()) return false;
		Node curNode = head;
		int i = 0;
		while(curNode!=null){
			if(!curNode.equals(list2.get(i))) return false;
			curNode = curNode.next;
			i++;
		}
		return true;
	}

}
