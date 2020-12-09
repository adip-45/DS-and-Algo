
public class Stack {

	Array stack;
	int len, pointer;

	public Stack(int size) {
		this.stack = new Array(size);
		this.len = size;
		this.pointer = 0;
	}

	public void push(int data) {
		if (isFull()) {
			System.out.println("Stack is Full");
		} else {
			this.stack.push(data, this.pointer);
			this.pointer++;
		}
	}

	public void pop() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
		} else {
			this.stack.pop(this.pointer);
			this.pointer--;
		}
	}

	public void top() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
		} else {
			System.out.println(this.stack.top());
		}
	}

	public void print() {
		this.stack.print();
	}

	private boolean isEmpty() {

		boolean status = false;

		if (this.pointer == 0) {
			status = true;
		}
		return status;
	}

	private boolean isFull() {

		boolean status = false;

		if (this.pointer >= this.len) {
			status = true;
		}
		return status;
	}

}
