
public class Stack {

	private LinkedList stack;

	public Stack() {
		this.stack = new LinkedList();
	}

	// Push a value in Stack
	public void push(int data) {
		stack.push(data);
	}

	// Pop value from Stack
	public void pop() {

		int result = stack.dequeue();

		if (result == -1) {
			System.out.println("Empty Stack");
		} else {
			System.out.println(result);
		}
	}

	// Get top of Stack
	public void top() {
		int result = stack.front();;

		if (result == -1) {
			System.out.println("Empty Stack");
		} else {
			System.out.println(result);
		}
		
	}

	// Print Stack
	public void print() {
		stack.print();
	}
}
