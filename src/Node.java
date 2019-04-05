
public class Node {
	public int data;
    // Variable para enlazar los nodos.
    public Node next;
    /**
     * Constructor que inicializamos el valor de las variables.
     */
    public void Node(){
        this.data = 0;
        this.next = null;
    }
    
    // Métodos get y set para los atributos.
    
    public int getData() {
        return data;
    }

    public void setData(int newData) {
        this.data = newData;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node newNext) {
        this.next = newNext;
    } 
    public boolean equals(Node x) {
    	if(this.data==x.data) 
    		return true;
    		else
    			return false;
    	
    }

}
