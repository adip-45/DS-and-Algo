
public class Stack {
	
	private LinkedList stack;
	
	public Stack(){
		this.stack = new LinkedList();
	}
	
	public void push(int data) {
		this.stack.push(data);
	}
	
	public int pop() {
		int result = this.stack.getHead().getData();
		this.stack.deleteHead();
		return result;
	}
	
	public int top() {
		return this.stack.getHead().getData();
	}
	
	public boolean isEmpty() {
		if(this.stack == null) 
			return true;
		return false;
	}
}
