
public class Stack {

	private Array stack;

	public Stack(int size) {
		this.stack = new Array(size);
	}

	public void push(int data) {
		if (stack.isFull()) {
			System.out.println("Stack is Full");
		} else {
			this.stack.push(data);
		}
	}

	public void pop() {
		if (stack.isEmpty()) {
			System.out.println("Stack is Empty");
		} else {
			this.stack.pop();
		}
	}

	public void top() {
		if (stack.isEmpty()) {
			System.out.println("Stack is Empty");
		} else {
			System.out.println(this.stack.top());
		}
	}

	public void print() {
		if (stack.isEmpty()) {
			System.out.println("Stack is Empty");
		} else {
			this.stack.print();
		}

	}

}
