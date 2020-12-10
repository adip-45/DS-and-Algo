
public class Stack {

	private Array stack;

	public Stack(int size) {
		this.stack = new Array(size);
	}

	// Push a value in Stack
	public void push(int data) {
		if (stack.isFull()) {
			System.out.println("Stack is Full");
		} else {
			this.stack.push(data);
		}
	}

	// Pop value from Stack
	public void pop() {
		if (stack.isEmpty()) {
			System.out.println("Stack is Empty");
		} else {
			System.out.println(this.stack.pop());
		}
	}

	// Get top of Stack
	public void top() {
		if (stack.isEmpty()) {
			System.out.println("Stack is Empty");
		} else {
			System.out.println(this.stack.top());
		}
	}

	// Print Stack
	public void print() {
		if (stack.isEmpty()) {
			System.out.println("Stack is Empty");
		} else {
			this.stack.print();
		}

	}

}
